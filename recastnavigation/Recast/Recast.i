%module Recast
%{
#include "Recast.h"
#include "RecastAlloc.h"
#include "RecastAssert.h"
%}

%include carrays.i
%array_functions( float, float_array )
%array_functions( double, double_array )
%array_functions( int, int_array )
%array_functions( char, char_array )
%array_functions( unsigned char, unsigned_char_array )
%array_functions( unsigned int, unsigned_int_array )

//CONSTS
/// Applied to the region id field of contour vertices in order to extract the region id.
/// The region id field of a vertex may have several flags applied to it.  So the
/// fields value can't be used directly.
/// @see rcContour::verts, rcContour::rverts
static const int RC_CONTOUR_REG_MASK = 0xffff;

/// An value which indicates an invalid index within a mesh.
/// @note This does not necessarily indicate an error.
/// @see rcPolyMesh::polys
static const unsigned short RC_MESH_NULL_IDX = 0xffff;

/// Represents the null area.
/// When a data element is given this value it is considered to no longer be 
/// assigned to a usable area.  (E.g. It is unwalkable.)
static const unsigned char RC_NULL_AREA = 0;

/// The default area id used to indicate a walkable polygon. 
/// This is also the maximum allowed area id, and the only non-null area id 
/// recognized by some steps in the build process. 
static const unsigned char RC_WALKABLE_AREA = 63;

/// The value returned by #rcGetCon if the specified direction is not connected
/// to another span. (Has no neighbor.)
static const int RC_NOT_CONNECTED = 0x3f;

//CLASSES
//rcContext rcContext();
class rcContext
{
public:

	/// Contructor.
	///  @param[in]		state	TRUE if the logging and performance timers should be enabled.  [Default: true]
	inline rcContext(bool state = true) : m_logEnabled(state), m_timerEnabled(state) {}
	virtual ~rcContext() {}

	/// Enables or disables logging.
	///  @param[in]		state	TRUE if logging should be enabled.
	inline void enableLog(bool state) { m_logEnabled = state; }

	/// Clears all log entries.
	inline void resetLog() { if (m_logEnabled) doResetLog(); }

	/// Logs a message.
	///  @param[in]		category	The category of the message.
	///  @param[in]		format		The message.
	void log(const rcLogCategory category, const char* format, ...);

	/// Enables or disables the performance timers.
	///  @param[in]		state	TRUE if timers should be enabled.
	inline void enableTimer(bool state) { m_timerEnabled = state; }

	/// Clears all peformance timers. (Resets all to unused.)
	inline void resetTimers() { if (m_timerEnabled) doResetTimers(); }

	/// Starts the specified performance timer.
	///  @param	label	The category of timer.
	inline void startTimer(const rcTimerLabel label) { if (m_timerEnabled) doStartTimer(label); }

	/// Stops the specified performance timer.
	///  @param	label	The category of the timer.
	inline void stopTimer(const rcTimerLabel label) { if (m_timerEnabled) doStopTimer(label); }

	/// Returns the total accumulated time of the specified performance timer.
	///  @param	label	The category of the timer.
	///  @return The accumulated time of the timer, or -1 if timers are disabled or the timer has never been started.
	inline int getAccumulatedTime(const rcTimerLabel label) const { return m_timerEnabled ? doGetAccumulatedTime(label) : -1; }

protected:

	/// Clears all log entries.
	virtual void doResetLog() {}

	/// Logs a message.
	///  @param[in]		category	The category of the message.
	///  @param[in]		msg			The formatted message.
	///  @param[in]		len			The length of the formatted message.
	virtual void doLog(const rcLogCategory /*category*/, const char* /*msg*/, const int /*len*/) {}

	/// Clears all timers. (Resets all to unused.)
	virtual void doResetTimers() {}

	/// Starts the specified performance timer.
	///  @param[in]		label	The category of timer.
	virtual void doStartTimer(const rcTimerLabel /*label*/) {}

	/// Stops the specified performance timer.
	///  @param[in]		label	The category of the timer.
	virtual void doStopTimer(const rcTimerLabel /*label*/) {}

	/// Returns the total accumulated time of the specified performance timer.
	///  @param[in]		label	The category of the timer.
	///  @return The accumulated time of the timer, or -1 if timers are disabled or the timer has never been started.
	virtual int doGetAccumulatedTime(const rcTimerLabel /*label*/) const { return -1; }
	
	/// True if logging is enabled.
	bool m_logEnabled;

	/// True if the performance timers are enabled.
	bool m_timerEnabled;
};


//ENUMS

/// Contour build flags.
/// @see rcBuildContours
enum rcBuildContoursFlags
{
	RC_CONTOUR_TESS_WALL_EDGES = 0x01,	///< Tessellate solid (impassable) edges during contour simplification.
	RC_CONTOUR_TESS_AREA_EDGES = 0x02,	///< Tessellate edges between areas during contour simplification.
};

enum rcLogCategory
{
	RC_LOG_PROGRESS = 1,	///< A progress log entry.
	RC_LOG_WARNING,			///< A warning log entry.
	RC_LOG_ERROR,			///< An error log entry.
};

enum rcTimerLabel
{
	/// The user defined total time of the build.
	RC_TIMER_TOTAL,
	/// A user defined build time.
	RC_TIMER_TEMP,
	/// The time to rasterize the triangles. (See: #rcRasterizeTriangle)
	RC_TIMER_RASTERIZE_TRIANGLES,
	/// The time to build the compact heightfield. (See: #rcBuildCompactHeightfield)
	RC_TIMER_BUILD_COMPACTHEIGHTFIELD,
	/// The total time to build the contours. (See: #rcBuildContours)
	RC_TIMER_BUILD_CONTOURS,
	/// The time to trace the boundaries of the contours. (See: #rcBuildContours)
	RC_TIMER_BUILD_CONTOURS_TRACE,
	/// The time to simplify the contours. (See: #rcBuildContours)
	RC_TIMER_BUILD_CONTOURS_SIMPLIFY,
	/// The time to filter ledge spans. (See: #rcFilterLedgeSpans)
	RC_TIMER_FILTER_BORDER,
	/// The time to filter low height spans. (See: #rcFilterWalkableLowHeightSpans)
	RC_TIMER_FILTER_WALKABLE,
	/// The time to apply the median filter. (See: #rcMedianFilterWalkableArea)
	RC_TIMER_MEDIAN_AREA,
	/// The time to filter low obstacles. (See: #rcFilterLowHangingWalkableObstacles)
	RC_TIMER_FILTER_LOW_OBSTACLES,
	/// The time to build the polygon mesh. (See: #rcBuildPolyMesh)
	RC_TIMER_BUILD_POLYMESH,
	/// The time to merge polygon meshes. (See: #rcMergePolyMeshes)
	RC_TIMER_MERGE_POLYMESH,
	/// The time to erode the walkable area. (See: #rcErodeWalkableArea)
	RC_TIMER_ERODE_AREA,
	/// The time to mark a box area. (See: #rcMarkBoxArea)
	RC_TIMER_MARK_BOX_AREA,
	/// The time to mark a cylinder area. (See: #rcMarkCylinderArea)
	RC_TIMER_MARK_CYLINDER_AREA,
	/// The time to mark a convex polygon area. (See: #rcMarkConvexPolyArea)
	RC_TIMER_MARK_CONVEXPOLY_AREA,
	/// The total time to build the distance field. (See: #rcBuildDistanceField)
	RC_TIMER_BUILD_DISTANCEFIELD,
	/// The time to build the distances of the distance field. (See: #rcBuildDistanceField)
	RC_TIMER_BUILD_DISTANCEFIELD_DIST,
	/// The time to blur the distance field. (See: #rcBuildDistanceField)
	RC_TIMER_BUILD_DISTANCEFIELD_BLUR,
	/// The total time to build the regions. (See: #rcBuildRegions, #rcBuildRegionsMonotone)
	RC_TIMER_BUILD_REGIONS,
	/// The total time to apply the watershed algorithm. (See: #rcBuildRegions)
	RC_TIMER_BUILD_REGIONS_WATERSHED,
	/// The time to expand regions while applying the watershed algorithm. (See: #rcBuildRegions)
	RC_TIMER_BUILD_REGIONS_EXPAND,
	/// The time to flood regions while applying the watershed algorithm. (See: #rcBuildRegions)
	RC_TIMER_BUILD_REGIONS_FLOOD,
	/// The time to filter out small regions. (See: #rcBuildRegions, #rcBuildRegionsMonotone)
	RC_TIMER_BUILD_REGIONS_FILTER,
	/// The time to build heightfield layers. (See: #rcBuildHeightfieldLayers)
	RC_TIMER_BUILD_LAYERS, 
	/// The time to build the polygon mesh detail. (See: #rcBuildPolyMeshDetail)
	RC_TIMER_BUILD_POLYMESHDETAIL,
	/// The time to merge polygon mesh details. (See: #rcMergePolyMeshDetails)
	RC_TIMER_MERGE_POLYMESHDETAIL,
	/// The maximum number of timers.  (Used for iterating timers.)
	RC_MAX_TIMERS
};

//STRUCTS
struct rcConfig
{
	/// The width of the field along the x-axis. [Limit: >= 0] [Units: vx]
	int width;

	/// The height of the field along the z-axis. [Limit: >= 0] [Units: vx]
	int height;
	
	/// The width/height size of tile's on the xz-plane. [Limit: >= 0] [Units: vx]
	int tileSize;
	
	/// The size of the non-navigable border around the heightfield. [Limit: >=0] [Units: vx]
	int borderSize;

	/// The xz-plane cell size to use for fields. [Limit: > 0] [Units: wu] 
	float cs;

	/// The y-axis cell size to use for fields. [Limit: > 0] [Units: wu]
	float ch;

	/// The minimum bounds of the field's AABB. [(x, y, z)] [Units: wu]
	float bmin[3]; 

	/// The maximum bounds of the field's AABB. [(x, y, z)] [Units: wu]
	float bmax[3];

	/// The maximum slope that is considered walkable. [Limits: 0 <= value < 90] [Units: Degrees] 
	float walkableSlopeAngle;

	/// Minimum floor to 'ceiling' height that will still allow the floor area to 
	/// be considered walkable. [Limit: >= 3] [Units: vx] 
	int walkableHeight;
	
	/// Maximum ledge height that is considered to still be traversable. [Limit: >=0] [Units: vx] 
	int walkableClimb;
	
	/// The distance to erode/shrink the walkable area of the heightfield away from 
	/// obstructions.  [Limit: >=0] [Units: vx] 
	int walkableRadius;
	
	/// The maximum allowed length for contour edges along the border of the mesh. [Limit: >=0] [Units: vx] 
	int maxEdgeLen;
	
	/// The maximum distance a simplfied contour's border edges should deviate 
	/// the original raw contour. [Limit: >=0] [Units: vx]
	float maxSimplificationError;
	
	/// The minimum number of cells allowed to form isolated island areas. [Limit: >=0] [Units: vx] 
	int minRegionArea;
	
	/// Any regions with a span count smaller than this value will, if possible, 
	/// be merged with larger regions. [Limit: >=0] [Units: vx] 
	int mergeRegionArea;
	
	/// The maximum number of vertices allowed for polygons generated during the 
	/// contour to polygon conversion process. [Limit: >= 3] 
	int maxVertsPerPoly;
	
	/// Sets the sampling distance to use when generating the detail mesh.
	/// (For height detail only.) [Limits: 0 or >= 0.9] [Units: wu] 
	float detailSampleDist;
	
	/// The maximum distance the detail mesh surface should deviate from heightfield
	/// data. (For height detail only.) [Limit: >=0] [Units: wu] 
	float detailSampleMaxError;
};

/// Represents a span in a heightfield.
/// @see rcHeightfield
struct rcSpan
{
	unsigned int smin : 13;			///< The lower limit of the span. [Limit: < #smax]
	unsigned int smax : 13;			///< The upper limit of the span. [Limit: <= #RC_SPAN_MAX_HEIGHT]
	unsigned int area : 6;			///< The area id assigned to the span.
	rcSpan* next;					///< The next span higher up in column.
};

/// A memory pool used for quick allocation of spans within a heightfield.
/// @see rcHeightfield
struct rcSpanPool
{
	rcSpanPool* next;					///< The next span pool.
	rcSpan items[RC_SPANS_PER_POOL];	///< Array of spans in the pool.
};

/// A dynamic heightfield representing obstructed space.
/// @ingroup recast
struct rcHeightfield
{
	int width;			///< The width of the heightfield. (Along the x-axis in cell units.)
	int height;			///< The height of the heightfield. (Along the z-axis in cell units.)
	float bmin[3];  	///< The minimum bounds in world space. [(x, y, z)]
	float bmax[3];		///< The maximum bounds in world space. [(x, y, z)]
	float cs;			///< The size of each cell. (On the xz-plane.)
	float ch;			///< The height of each cell. (The minimum increment along the y-axis.)
	rcSpan** spans;		///< Heightfield of spans (width*height).
	rcSpanPool* pools;	///< Linked list of span pools.
	rcSpan* freelist;	///< The next free span.
};

/// Provides information on the content of a cell column in a compact heightfield. 
struct rcCompactCell
{
	unsigned int index : 24;	///< Index to the first span in the column.
	unsigned int count : 8;		///< Number of spans in the column.
};

/// Represents a span of unobstructed space within a compact heightfield.
struct rcCompactSpan
{
	unsigned short y;			///< The lower extent of the span. (Measured from the heightfield's base.)
	unsigned short reg;			///< The id of the region the span belongs to. (Or zero if not in a region.)
	unsigned int con : 24;		///< Packed neighbor connection data.
	unsigned int h : 8;			///< The height of the span.  (Measured from #y.)
};

/// A compact, static heightfield representing unobstructed space.
/// @ingroup recast
struct rcCompactHeightfield
{
	int width;					///< The width of the heightfield. (Along the x-axis in cell units.)
	int height;					///< The height of the heightfield. (Along the z-axis in cell units.)
	int spanCount;				///< The number of spans in the heightfield.
	int walkableHeight;			///< The walkable height used during the build of the field.  (See: rcConfig::walkableHeight)
	int walkableClimb;			///< The walkable climb used during the build of the field. (See: rcConfig::walkableClimb)
	int borderSize;				///< The AABB border size used during the build of the field. (See: rcConfig::borderSize)
	unsigned short maxDistance;	///< The maximum distance value of any span within the field. 
	unsigned short maxRegions;	///< The maximum region id of any span within the field. 
	float bmin[3];				///< The minimum bounds in world space. [(x, y, z)]
	float bmax[3];				///< The maximum bounds in world space. [(x, y, z)]
	float cs;					///< The size of each cell. (On the xz-plane.)
	float ch;					///< The height of each cell. (The minimum increment along the y-axis.)
	rcCompactCell* cells;		///< Array of cells. [Size: #width*#height]
	rcCompactSpan* spans;		///< Array of spans. [Size: #spanCount]
	unsigned short* dist;		///< Array containing border distance data. [Size: #spanCount]
	unsigned char* areas;		///< Array containing area id data. [Size: #spanCount]
};

/// Represents a heightfield layer within a layer set.
/// @see rcHeightfieldLayerSet
struct rcHeightfieldLayer
{
	float bmin[3];				///< The minimum bounds in world space. [(x, y, z)]
	float bmax[3];				///< The maximum bounds in world space. [(x, y, z)]
	float cs;					///< The size of each cell. (On the xz-plane.)
	float ch;					///< The height of each cell. (The minimum increment along the y-axis.)
	int width;					///< The width of the heightfield. (Along the x-axis in cell units.)
	int height;					///< The height of the heightfield. (Along the z-axis in cell units.)
	int minx;					///< The minimum x-bounds of usable data.
	int maxx;					///< The maximum x-bounds of usable data.
	int miny;					///< The minimum y-bounds of usable data. (Along the z-axis.)
	int maxy;					///< The maximum y-bounds of usable data. (Along the z-axis.)
	int hmin;					///< The minimum height bounds of usable data. (Along the y-axis.)
	int hmax;					///< The maximum height bounds of usable data. (Along the y-axis.)
	unsigned char* heights;		///< The heightfield. [Size: width * height]
	unsigned char* areas;		///< Area ids. [Size: Same as #heights]
	unsigned char* cons;		///< Packed neighbor connection information. [Size: Same as #heights]
};

/// Represents a set of heightfield layers.
/// @ingroup recast
/// @see rcAllocHeightfieldLayerSet, rcFreeHeightfieldLayerSet 
struct rcHeightfieldLayerSet
{
	rcHeightfieldLayer* layers;			///< The layers in the set. [Size: #nlayers]
	int nlayers;						///< The number of layers in the set.
};

/// Represents a simple, non-overlapping contour in field space.
struct rcContour
{
	int* verts;			///< Simplified contour vertex and connection data. [Size: 4 * #nverts]
	int nverts;			///< The number of vertices in the simplified contour. 
	int* rverts;		///< Raw contour vertex and connection data. [Size: 4 * #nrverts]
	int nrverts;		///< The number of vertices in the raw contour. 
	unsigned short reg;	///< The region id of the contour.
	unsigned char area;	///< The area id of the contour.
};

/// Represents a group of related contours.
/// @ingroup recast
struct rcContourSet
{
	rcContour* conts;	///< An array of the contours in the set. [Size: #nconts]
	int nconts;			///< The number of contours in the set.
	float bmin[3];  	///< The minimum bounds in world space. [(x, y, z)]
	float bmax[3];		///< The maximum bounds in world space. [(x, y, z)]
	float cs;			///< The size of each cell. (On the xz-plane.)
	float ch;			///< The height of each cell. (The minimum increment along the y-axis.)
	int width;			///< The width of the set. (Along the x-axis in cell units.) 
	int height;			///< The height of the set. (Along the z-axis in cell units.) 
	int borderSize;		///< The AABB border size used to generate the source data from which the contours were derived.
};

/// Represents a polygon mesh suitable for use in building a navigation mesh. 
/// @ingroup recast
struct rcPolyMesh
{
	unsigned short* verts;	///< The mesh vertices. [Form: (x, y, z) * #nverts]
	unsigned short* polys;	///< Polygon and neighbor data. [Length: #maxpolys * 2 * #nvp]
	unsigned short* regs;	///< The region id assigned to each polygon. [Length: #maxpolys]
	unsigned short* flags;	///< The user defined flags for each polygon. [Length: #maxpolys]
	unsigned char* areas;	///< The area id assigned to each polygon. [Length: #maxpolys]
	int nverts;				///< The number of vertices.
	int npolys;				///< The number of polygons.
	int maxpolys;			///< The number of allocated polygons.
	int nvp;				///< The maximum number of vertices per polygon.
	float bmin[3];			///< The minimum bounds in world space. [(x, y, z)]
	float bmax[3];			///< The maximum bounds in world space. [(x, y, z)]
	float cs;				///< The size of each cell. (On the xz-plane.)
	float ch;				///< The height of each cell. (The minimum increment along the y-axis.)
	int borderSize;			///< The AABB border size used to generate the source data from which the mesh was derived.
};

/// Contains triangle meshes that represent detailed height data associated 
/// with the polygons in its associated polygon mesh object.
/// @ingroup recast
struct rcPolyMeshDetail
{
	unsigned int* meshes;	///< The sub-mesh data. [Size: 4*#nmeshes] 
	float* verts;			///< The mesh vertices. [Size: 3*#nverts] 
	unsigned char* tris;	///< The mesh triangles. [Size: 4*#ntris] 
	int nmeshes;			///< The number of sub-meshes defined by #meshes.
	int nverts;				///< The number of vertices in #verts.
	int ntris;				///< The number of triangles in #tris.
};

bool rcBuildHeightfieldLayers(rcContext* ctx, rcCompactHeightfield& chf, 
							  const int borderSize, const int walkableHeight,
							  rcHeightfieldLayerSet& lset);
bool rcBuildContours(rcContext* ctx, rcCompactHeightfield& chf,
					 const float maxError, const int maxEdgeLen,
					 rcContourSet& cset, const int flags = RC_CONTOUR_TESS_WALL_EDGES);
bool rcBuildPolyMesh(rcContext* ctx, rcContourSet& cset, const int nvp, rcPolyMesh& mesh);
bool rcMergePolyMeshes(rcContext* ctx, rcPolyMesh** meshes, const int nmeshes, rcPolyMesh& mesh);
bool rcBuildPolyMeshDetail(rcContext* ctx, const rcPolyMesh& mesh, const rcCompactHeightfield& chf,
						   const float sampleDist, const float sampleMaxError,
						   rcPolyMeshDetail& dmesh);
bool rcCopyPolyMesh(rcContext* ctx, const rcPolyMesh& src, rcPolyMesh& dst);
bool rcMergePolyMeshDetails(rcContext* ctx, rcPolyMeshDetail** meshes, const int nmeshes, rcPolyMeshDetail& mesh);

void rcCalcBounds(const float* verts, int nv, float* bmin, float* bmax);
void rcCalcGridSize(const float* bmin, const float* bmax, float cs, int* w, int* h);
bool rcCreateHeightfield(rcContext* ctx, rcHeightfield& hf, int width, int height,
						 const float* bmin, const float* bmax,
						 float cs, float ch);
void rcMarkWalkableTriangles(rcContext* ctx, const float walkableSlopeAngle, const float* verts, int nv,
							 const int* tris, int nt, unsigned char* areas);
void rcClearUnwalkableTriangles(rcContext* ctx, const float walkableSlopeAngle, const float* verts, int nv,
								const int* tris, int nt, unsigned char* areas); 
void rcAddSpan(rcContext* ctx, rcHeightfield& hf, const int x, const int y,
			   const unsigned short smin, const unsigned short smax,
			   const unsigned char area, const int flagMergeThr);
void rcRasterizeTriangle(rcContext* ctx, const float* v0, const float* v1, const float* v2,
						 const unsigned char area, rcHeightfield& solid,
						 const int flagMergeThr = 1);
void rcRasterizeTriangles(rcContext* ctx, const float* verts, const int nv,
						  const int* tris, const unsigned char* areas, const int nt,
						  rcHeightfield& solid, const int flagMergeThr = 1);
void rcRasterizeTriangles(rcContext* ctx, const float* verts, const int nv,
						  const unsigned short* tris, const unsigned char* areas, const int nt,
						  rcHeightfield& solid, const int flagMergeThr = 1);
void rcRasterizeTriangles(rcContext* ctx, const float* verts, const unsigned char* areas, const int nt,
						  rcHeightfield& solid, const int flagMergeThr = 1);
void rcFilterLowHangingWalkableObstacles(rcContext* ctx, const int walkableClimb, rcHeightfield& solid);
void rcFilterLedgeSpans(rcContext* ctx, const int walkableHeight,
						const int walkableClimb, rcHeightfield& solid);
void rcFilterWalkableLowHeightSpans(rcContext* ctx, int walkableHeight, rcHeightfield& solid);
int rcGetHeightFieldSpanCount(rcContext* ctx, rcHeightfield& hf);
bool rcBuildCompactHeightfield(rcContext* ctx, const int walkableHeight, const int walkableClimb,
							   rcHeightfield& hf, rcCompactHeightfield& chf);
bool rcErodeWalkableArea(rcContext* ctx, int radius, rcCompactHeightfield& chf);
bool rcMedianFilterWalkableArea(rcContext* ctx, rcCompactHeightfield& chf);
void rcMarkBoxArea(rcContext* ctx, const float* bmin, const float* bmax, unsigned char areaId,
				   rcCompactHeightfield& chf);
void rcMarkConvexPolyArea(rcContext* ctx, const float* verts, const int nverts,
						  const float hmin, const float hmax, unsigned char areaId,
						  rcCompactHeightfield& chf);
int rcOffsetPoly(const float* verts, const int nverts, const float offset,
				 float* outVerts, const int maxOutVerts);
void rcMarkCylinderArea(rcContext* ctx, const float* pos,
						const float r, const float h, unsigned char areaId,
						rcCompactHeightfield& chf);
bool rcBuildDistanceField(rcContext* ctx, rcCompactHeightfield& chf);
bool rcBuildRegions(rcContext* ctx, rcCompactHeightfield& chf,
					const int borderSize, const int minRegionArea, const int mergeRegionArea);
bool rcBuildLayerRegions(rcContext* ctx, rcCompactHeightfield& chf,
						 const int borderSize, const int minRegionArea);
bool rcBuildRegionsMonotone(rcContext* ctx, rcCompactHeightfield& chf,
							const int borderSize, const int minRegionArea, const int mergeRegionArea);
rcHeightfield* rcAllocHeightfield();
void rcFreeHeightField(rcHeightfield* hf);
rcCompactHeightfield* rcAllocCompactHeightfield();
void rcFreeCompactHeightfield(rcCompactHeightfield* chf);
rcHeightfieldLayerSet* rcAllocHeightfieldLayerSet();
void rcFreeHeightfieldLayerSet(rcHeightfieldLayerSet* lset);
rcContourSet* rcAllocContourSet();
void rcFreeContourSet(rcContourSet* cset);
rcPolyMesh* rcAllocPolyMesh();
void rcFreePolyMesh(rcPolyMesh* pmesh);
rcPolyMeshDetail* rcAllocPolyMeshDetail();
void rcFreePolyMeshDetail(rcPolyMeshDetail* dmesh);
