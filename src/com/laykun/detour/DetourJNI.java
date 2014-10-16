/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.detour;

public class DetourJNI {
  public final static native long new_float_array(int jarg1);
  public final static native void delete_float_array(long jarg1);
  public final static native float float_array_getitem(long jarg1, int jarg2);
  public final static native void float_array_setitem(long jarg1, int jarg2, float jarg3);
  public final static native long new_double_array(int jarg1);
  public final static native void delete_double_array(long jarg1);
  public final static native double double_array_getitem(long jarg1, int jarg2);
  public final static native void double_array_setitem(long jarg1, int jarg2, double jarg3);
  public final static native long new_int_array(int jarg1);
  public final static native void delete_int_array(long jarg1);
  public final static native int int_array_getitem(long jarg1, int jarg2);
  public final static native void int_array_setitem(long jarg1, int jarg2, int jarg3);
  public final static native String new_char_array(int jarg1);
  public final static native void delete_char_array(String jarg1);
  public final static native char char_array_getitem(String jarg1, int jarg2);
  public final static native void char_array_setitem(String jarg1, int jarg2, char jarg3);
  public final static native long new_unsigned_char_array(int jarg1);
  public final static native void delete_unsigned_char_array(long jarg1);
  public final static native short unsigned_char_array_getitem(long jarg1, int jarg2);
  public final static native void unsigned_char_array_setitem(long jarg1, int jarg2, short jarg3);
  public final static native int DT_VERTS_PER_POLYGON_get();
  public final static native int DT_NAVMESH_MAGIC_get();
  public final static native int DT_NAVMESH_VERSION_get();
  public final static native int DT_NAVMESH_STATE_MAGIC_get();
  public final static native int DT_NAVMESH_STATE_VERSION_get();
  public final static native int DT_EXT_LINK_get();
  public final static native long DT_NULL_LINK_get();
  public final static native long DT_OFFMESH_CON_BIDIR_get();
  public final static native int DT_MAX_AREAS_get();
  public final static native int DT_TILE_FREE_DATA_get();
  public final static native int DT_STRAIGHTPATH_START_get();
  public final static native int DT_STRAIGHTPATH_END_get();
  public final static native int DT_STRAIGHTPATH_OFFMESH_CONNECTION_get();
  public final static native int DT_STRAIGHTPATH_AREA_CROSSINGS_get();
  public final static native int DT_STRAIGHTPATH_ALL_CROSSINGS_get();
  public final static native int DT_FINDPATH_LOW_QUALITY_FAR_get();
  public final static native int DT_FINDPATH_ANY_ANGLE_get();
  public final static native int DT_RAYCAST_USE_COSTS_get();
  public final static native float DT_RAY_CAST_LIMIT_PROPORTIONS_get();
  public final static native int DT_POLYTYPE_GROUND_get();
  public final static native int DT_POLYTYPE_OFFMESH_CONNECTION_get();
  public final static native void dtPoly_firstLink_set(long jarg1, dtPoly jarg1_, long jarg2);
  public final static native long dtPoly_firstLink_get(long jarg1, dtPoly jarg1_);
  public final static native void dtPoly_verts_set(long jarg1, dtPoly jarg1_, long jarg2);
  public final static native long dtPoly_verts_get(long jarg1, dtPoly jarg1_);
  public final static native void dtPoly_neis_set(long jarg1, dtPoly jarg1_, long jarg2);
  public final static native long dtPoly_neis_get(long jarg1, dtPoly jarg1_);
  public final static native void dtPoly_flags_set(long jarg1, dtPoly jarg1_, int jarg2);
  public final static native int dtPoly_flags_get(long jarg1, dtPoly jarg1_);
  public final static native void dtPoly_vertCount_set(long jarg1, dtPoly jarg1_, short jarg2);
  public final static native short dtPoly_vertCount_get(long jarg1, dtPoly jarg1_);
  public final static native void dtPoly_areaAndtype_set(long jarg1, dtPoly jarg1_, short jarg2);
  public final static native short dtPoly_areaAndtype_get(long jarg1, dtPoly jarg1_);
  public final static native void dtPoly_setArea(long jarg1, dtPoly jarg1_, short jarg2);
  public final static native void dtPoly_setType(long jarg1, dtPoly jarg1_, short jarg2);
  public final static native short dtPoly_getArea(long jarg1, dtPoly jarg1_);
  public final static native short dtPoly_getType(long jarg1, dtPoly jarg1_);
  public final static native long new_dtPoly();
  public final static native void delete_dtPoly(long jarg1);
  public final static native void dtPolyDetail_vertBase_set(long jarg1, dtPolyDetail jarg1_, long jarg2);
  public final static native long dtPolyDetail_vertBase_get(long jarg1, dtPolyDetail jarg1_);
  public final static native void dtPolyDetail_triBase_set(long jarg1, dtPolyDetail jarg1_, long jarg2);
  public final static native long dtPolyDetail_triBase_get(long jarg1, dtPolyDetail jarg1_);
  public final static native void dtPolyDetail_vertCount_set(long jarg1, dtPolyDetail jarg1_, short jarg2);
  public final static native short dtPolyDetail_vertCount_get(long jarg1, dtPolyDetail jarg1_);
  public final static native void dtPolyDetail_triCount_set(long jarg1, dtPolyDetail jarg1_, short jarg2);
  public final static native short dtPolyDetail_triCount_get(long jarg1, dtPolyDetail jarg1_);
  public final static native long new_dtPolyDetail();
  public final static native void delete_dtPolyDetail(long jarg1);
  public final static native void dtLink_ref_set(long jarg1, dtLink jarg1_, long jarg2);
  public final static native long dtLink_ref_get(long jarg1, dtLink jarg1_);
  public final static native void dtLink_next_set(long jarg1, dtLink jarg1_, long jarg2);
  public final static native long dtLink_next_get(long jarg1, dtLink jarg1_);
  public final static native void dtLink_edge_set(long jarg1, dtLink jarg1_, short jarg2);
  public final static native short dtLink_edge_get(long jarg1, dtLink jarg1_);
  public final static native void dtLink_side_set(long jarg1, dtLink jarg1_, short jarg2);
  public final static native short dtLink_side_get(long jarg1, dtLink jarg1_);
  public final static native void dtLink_bmin_set(long jarg1, dtLink jarg1_, short jarg2);
  public final static native short dtLink_bmin_get(long jarg1, dtLink jarg1_);
  public final static native void dtLink_bmax_set(long jarg1, dtLink jarg1_, short jarg2);
  public final static native short dtLink_bmax_get(long jarg1, dtLink jarg1_);
  public final static native long new_dtLink();
  public final static native void delete_dtLink(long jarg1);
  public final static native void dtBVNode_bmin_set(long jarg1, dtBVNode jarg1_, long jarg2);
  public final static native long dtBVNode_bmin_get(long jarg1, dtBVNode jarg1_);
  public final static native void dtBVNode_bmax_set(long jarg1, dtBVNode jarg1_, long jarg2);
  public final static native long dtBVNode_bmax_get(long jarg1, dtBVNode jarg1_);
  public final static native void dtBVNode_i_set(long jarg1, dtBVNode jarg1_, int jarg2);
  public final static native int dtBVNode_i_get(long jarg1, dtBVNode jarg1_);
  public final static native long new_dtBVNode();
  public final static native void delete_dtBVNode(long jarg1);
  public final static native void dtOffMeshConnection_pos_set(long jarg1, dtOffMeshConnection jarg1_, long jarg2);
  public final static native long dtOffMeshConnection_pos_get(long jarg1, dtOffMeshConnection jarg1_);
  public final static native void dtOffMeshConnection_rad_set(long jarg1, dtOffMeshConnection jarg1_, float jarg2);
  public final static native float dtOffMeshConnection_rad_get(long jarg1, dtOffMeshConnection jarg1_);
  public final static native void dtOffMeshConnection_poly_set(long jarg1, dtOffMeshConnection jarg1_, int jarg2);
  public final static native int dtOffMeshConnection_poly_get(long jarg1, dtOffMeshConnection jarg1_);
  public final static native void dtOffMeshConnection_flags_set(long jarg1, dtOffMeshConnection jarg1_, short jarg2);
  public final static native short dtOffMeshConnection_flags_get(long jarg1, dtOffMeshConnection jarg1_);
  public final static native void dtOffMeshConnection_side_set(long jarg1, dtOffMeshConnection jarg1_, short jarg2);
  public final static native short dtOffMeshConnection_side_get(long jarg1, dtOffMeshConnection jarg1_);
  public final static native void dtOffMeshConnection_userId_set(long jarg1, dtOffMeshConnection jarg1_, long jarg2);
  public final static native long dtOffMeshConnection_userId_get(long jarg1, dtOffMeshConnection jarg1_);
  public final static native long new_dtOffMeshConnection();
  public final static native void delete_dtOffMeshConnection(long jarg1);
  public final static native void dtMeshHeader_magic_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_magic_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_version_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_version_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_x_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_x_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_y_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_y_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_layer_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_layer_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_userId_set(long jarg1, dtMeshHeader jarg1_, long jarg2);
  public final static native long dtMeshHeader_userId_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_polyCount_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_polyCount_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_vertCount_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_vertCount_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_maxLinkCount_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_maxLinkCount_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_detailMeshCount_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_detailMeshCount_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_detailVertCount_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_detailVertCount_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_detailTriCount_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_detailTriCount_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_bvNodeCount_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_bvNodeCount_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_offMeshConCount_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_offMeshConCount_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_offMeshBase_set(long jarg1, dtMeshHeader jarg1_, int jarg2);
  public final static native int dtMeshHeader_offMeshBase_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_walkableHeight_set(long jarg1, dtMeshHeader jarg1_, float jarg2);
  public final static native float dtMeshHeader_walkableHeight_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_walkableRadius_set(long jarg1, dtMeshHeader jarg1_, float jarg2);
  public final static native float dtMeshHeader_walkableRadius_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_walkableClimb_set(long jarg1, dtMeshHeader jarg1_, float jarg2);
  public final static native float dtMeshHeader_walkableClimb_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_bmin_set(long jarg1, dtMeshHeader jarg1_, long jarg2);
  public final static native long dtMeshHeader_bmin_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_bmax_set(long jarg1, dtMeshHeader jarg1_, long jarg2);
  public final static native long dtMeshHeader_bmax_get(long jarg1, dtMeshHeader jarg1_);
  public final static native void dtMeshHeader_bvQuantFactor_set(long jarg1, dtMeshHeader jarg1_, float jarg2);
  public final static native float dtMeshHeader_bvQuantFactor_get(long jarg1, dtMeshHeader jarg1_);
  public final static native long new_dtMeshHeader();
  public final static native void delete_dtMeshHeader(long jarg1);
  public final static native void dtMeshTile_salt_set(long jarg1, dtMeshTile jarg1_, long jarg2);
  public final static native long dtMeshTile_salt_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_linksFreeList_set(long jarg1, dtMeshTile jarg1_, long jarg2);
  public final static native long dtMeshTile_linksFreeList_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_header_set(long jarg1, dtMeshTile jarg1_, long jarg2, dtMeshHeader jarg2_);
  public final static native long dtMeshTile_header_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_polys_set(long jarg1, dtMeshTile jarg1_, long jarg2, dtPoly jarg2_);
  public final static native long dtMeshTile_polys_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_verts_set(long jarg1, dtMeshTile jarg1_, long jarg2);
  public final static native long dtMeshTile_verts_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_links_set(long jarg1, dtMeshTile jarg1_, long jarg2, dtLink jarg2_);
  public final static native long dtMeshTile_links_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_detailMeshes_set(long jarg1, dtMeshTile jarg1_, long jarg2, dtPolyDetail jarg2_);
  public final static native long dtMeshTile_detailMeshes_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_detailVerts_set(long jarg1, dtMeshTile jarg1_, long jarg2);
  public final static native long dtMeshTile_detailVerts_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_detailTris_set(long jarg1, dtMeshTile jarg1_, long jarg2);
  public final static native long dtMeshTile_detailTris_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_bvTree_set(long jarg1, dtMeshTile jarg1_, long jarg2, dtBVNode jarg2_);
  public final static native long dtMeshTile_bvTree_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_offMeshCons_set(long jarg1, dtMeshTile jarg1_, long jarg2, dtOffMeshConnection jarg2_);
  public final static native long dtMeshTile_offMeshCons_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_data_set(long jarg1, dtMeshTile jarg1_, long jarg2);
  public final static native long dtMeshTile_data_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_dataSize_set(long jarg1, dtMeshTile jarg1_, int jarg2);
  public final static native int dtMeshTile_dataSize_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_flags_set(long jarg1, dtMeshTile jarg1_, int jarg2);
  public final static native int dtMeshTile_flags_get(long jarg1, dtMeshTile jarg1_);
  public final static native void dtMeshTile_next_set(long jarg1, dtMeshTile jarg1_, long jarg2, dtMeshTile jarg2_);
  public final static native long dtMeshTile_next_get(long jarg1, dtMeshTile jarg1_);
  public final static native long new_dtMeshTile();
  public final static native void delete_dtMeshTile(long jarg1);
  public final static native void dtNavMeshParams_orig_set(long jarg1, dtNavMeshParams jarg1_, long jarg2);
  public final static native long dtNavMeshParams_orig_get(long jarg1, dtNavMeshParams jarg1_);
  public final static native void dtNavMeshParams_tileWidth_set(long jarg1, dtNavMeshParams jarg1_, float jarg2);
  public final static native float dtNavMeshParams_tileWidth_get(long jarg1, dtNavMeshParams jarg1_);
  public final static native void dtNavMeshParams_tileHeight_set(long jarg1, dtNavMeshParams jarg1_, float jarg2);
  public final static native float dtNavMeshParams_tileHeight_get(long jarg1, dtNavMeshParams jarg1_);
  public final static native void dtNavMeshParams_maxTiles_set(long jarg1, dtNavMeshParams jarg1_, int jarg2);
  public final static native int dtNavMeshParams_maxTiles_get(long jarg1, dtNavMeshParams jarg1_);
  public final static native void dtNavMeshParams_maxPolys_set(long jarg1, dtNavMeshParams jarg1_, int jarg2);
  public final static native int dtNavMeshParams_maxPolys_get(long jarg1, dtNavMeshParams jarg1_);
  public final static native long new_dtNavMeshParams();
  public final static native void delete_dtNavMeshParams(long jarg1);
  public final static native long new_dtNavMesh();
  public final static native void delete_dtNavMesh(long jarg1);
  public final static native long dtNavMesh_init__SWIG_0(long jarg1, dtNavMesh jarg1_, long jarg2, dtNavMeshParams jarg2_);
  public final static native long dtNavMesh_init__SWIG_1(long jarg1, dtNavMesh jarg1_, long jarg2, int jarg3, int jarg4);
  public final static native long dtNavMesh_getParams(long jarg1, dtNavMesh jarg1_);
  public final static native long dtNavMesh_addTile(long jarg1, dtNavMesh jarg1_, long jarg2, int jarg3, int jarg4, long jarg5, long jarg6);
  public final static native long dtNavMesh_removeTile(long jarg1, dtNavMesh jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native void dtNavMesh_calcTileLoc(long jarg1, dtNavMesh jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native long dtNavMesh_getTileAt(long jarg1, dtNavMesh jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int dtNavMesh_getTilesAt(long jarg1, dtNavMesh jarg1_, int jarg2, int jarg3, long jarg4, int jarg5);
  public final static native long dtNavMesh_getTileRefAt(long jarg1, dtNavMesh jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native long dtNavMesh_getTileRef(long jarg1, dtNavMesh jarg1_, long jarg2, dtMeshTile jarg2_);
  public final static native long dtNavMesh_getTileByRef(long jarg1, dtNavMesh jarg1_, long jarg2);
  public final static native int dtNavMesh_getMaxTiles(long jarg1, dtNavMesh jarg1_);
  public final static native long dtNavMesh_getTile(long jarg1, dtNavMesh jarg1_, int jarg2);
  public final static native long dtNavMesh_getTileAndPolyByRef(long jarg1, dtNavMesh jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native void dtNavMesh_getTileAndPolyByRefUnsafe(long jarg1, dtNavMesh jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native boolean dtNavMesh_isValidPolyRef(long jarg1, dtNavMesh jarg1_, long jarg2);
  public final static native long dtNavMesh_getPolyRefBase(long jarg1, dtNavMesh jarg1_, long jarg2, dtMeshTile jarg2_);
  public final static native long dtNavMesh_getOffMeshConnectionPolyEndPoints(long jarg1, dtNavMesh jarg1_, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long dtNavMesh_getOffMeshConnectionByRef(long jarg1, dtNavMesh jarg1_, long jarg2);
  public final static native long dtNavMesh_setPolyFlags(long jarg1, dtNavMesh jarg1_, long jarg2, int jarg3);
  public final static native long dtNavMesh_getPolyFlags(long jarg1, dtNavMesh jarg1_, long jarg2, long jarg3);
  public final static native long dtNavMesh_setPolyArea(long jarg1, dtNavMesh jarg1_, long jarg2, short jarg3);
  public final static native long dtNavMesh_getPolyArea(long jarg1, dtNavMesh jarg1_, long jarg2, long jarg3);
  public final static native int dtNavMesh_getTileStateSize(long jarg1, dtNavMesh jarg1_, long jarg2, dtMeshTile jarg2_);
  public final static native long dtNavMesh_storeTileState(long jarg1, dtNavMesh jarg1_, long jarg2, dtMeshTile jarg2_, long jarg3, int jarg4);
  public final static native long dtNavMesh_restoreTileState(long jarg1, dtNavMesh jarg1_, long jarg2, dtMeshTile jarg2_, long jarg3, int jarg4);
  public final static native long dtNavMesh_encodePolyId(long jarg1, dtNavMesh jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native void dtNavMesh_decodePolyId(long jarg1, dtNavMesh jarg1_, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long dtNavMesh_decodePolyIdSalt(long jarg1, dtNavMesh jarg1_, long jarg2);
  public final static native long dtNavMesh_decodePolyIdTile(long jarg1, dtNavMesh jarg1_, long jarg2);
  public final static native long dtNavMesh_decodePolyIdPoly(long jarg1, dtNavMesh jarg1_, long jarg2);
  public final static native long dtAllocNavMesh();
  public final static native void dtFreeNavMesh(long jarg1, dtNavMesh jarg1_);
  public final static native void dtNavMeshCreateParams_verts_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_verts_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_vertCount_set(long jarg1, dtNavMeshCreateParams jarg1_, int jarg2);
  public final static native int dtNavMeshCreateParams_vertCount_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_polys_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_polys_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_polyFlags_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_polyFlags_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_polyAreas_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_polyAreas_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_polyCount_set(long jarg1, dtNavMeshCreateParams jarg1_, int jarg2);
  public final static native int dtNavMeshCreateParams_polyCount_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_nvp_set(long jarg1, dtNavMeshCreateParams jarg1_, int jarg2);
  public final static native int dtNavMeshCreateParams_nvp_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_detailMeshes_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_detailMeshes_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_detailVerts_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_detailVerts_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_detailVertsCount_set(long jarg1, dtNavMeshCreateParams jarg1_, int jarg2);
  public final static native int dtNavMeshCreateParams_detailVertsCount_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_detailTris_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_detailTris_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_detailTriCount_set(long jarg1, dtNavMeshCreateParams jarg1_, int jarg2);
  public final static native int dtNavMeshCreateParams_detailTriCount_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_offMeshConVerts_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_offMeshConVerts_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_offMeshConRad_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_offMeshConRad_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_offMeshConFlags_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_offMeshConFlags_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_offMeshConAreas_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_offMeshConAreas_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_offMeshConDir_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_offMeshConDir_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_offMeshConUserID_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_offMeshConUserID_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_offMeshConCount_set(long jarg1, dtNavMeshCreateParams jarg1_, int jarg2);
  public final static native int dtNavMeshCreateParams_offMeshConCount_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_userId_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_userId_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_tileX_set(long jarg1, dtNavMeshCreateParams jarg1_, int jarg2);
  public final static native int dtNavMeshCreateParams_tileX_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_tileY_set(long jarg1, dtNavMeshCreateParams jarg1_, int jarg2);
  public final static native int dtNavMeshCreateParams_tileY_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_tileLayer_set(long jarg1, dtNavMeshCreateParams jarg1_, int jarg2);
  public final static native int dtNavMeshCreateParams_tileLayer_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_bmin_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_bmin_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_bmax_set(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2);
  public final static native long dtNavMeshCreateParams_bmax_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_walkableHeight_set(long jarg1, dtNavMeshCreateParams jarg1_, float jarg2);
  public final static native float dtNavMeshCreateParams_walkableHeight_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_walkableRadius_set(long jarg1, dtNavMeshCreateParams jarg1_, float jarg2);
  public final static native float dtNavMeshCreateParams_walkableRadius_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_walkableClimb_set(long jarg1, dtNavMeshCreateParams jarg1_, float jarg2);
  public final static native float dtNavMeshCreateParams_walkableClimb_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_cs_set(long jarg1, dtNavMeshCreateParams jarg1_, float jarg2);
  public final static native float dtNavMeshCreateParams_cs_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_ch_set(long jarg1, dtNavMeshCreateParams jarg1_, float jarg2);
  public final static native float dtNavMeshCreateParams_ch_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native void dtNavMeshCreateParams_buildBvTree_set(long jarg1, dtNavMeshCreateParams jarg1_, boolean jarg2);
  public final static native boolean dtNavMeshCreateParams_buildBvTree_get(long jarg1, dtNavMeshCreateParams jarg1_);
  public final static native long new_dtNavMeshCreateParams();
  public final static native void delete_dtNavMeshCreateParams(long jarg1);
  public final static native boolean dtCreateNavMeshData(long jarg1, dtNavMeshCreateParams jarg1_, long jarg2, long jarg3);
  public final static native boolean dtNavMeshHeaderSwapEndian(long jarg1, int jarg2);
  public final static native boolean dtNavMeshDataSwapEndian(long jarg1, int jarg2);
  public final static native long new_dtQueryFilter();
  public final static native boolean dtQueryFilter_passFilter(long jarg1, dtQueryFilter jarg1_, long jarg2, long jarg3, dtMeshTile jarg3_, long jarg4, dtPoly jarg4_);
  public final static native float dtQueryFilter_getCost(long jarg1, dtQueryFilter jarg1_, long jarg2, long jarg3, long jarg4, long jarg5, dtMeshTile jarg5_, long jarg6, dtPoly jarg6_, long jarg7, long jarg8, dtMeshTile jarg8_, long jarg9, dtPoly jarg9_, long jarg10, long jarg11, dtMeshTile jarg11_, long jarg12, dtPoly jarg12_);
  public final static native float dtQueryFilter_getAreaCost(long jarg1, dtQueryFilter jarg1_, int jarg2);
  public final static native void dtQueryFilter_setAreaCost(long jarg1, dtQueryFilter jarg1_, int jarg2, float jarg3);
  public final static native int dtQueryFilter_getIncludeFlags(long jarg1, dtQueryFilter jarg1_);
  public final static native void dtQueryFilter_setIncludeFlags(long jarg1, dtQueryFilter jarg1_, int jarg2);
  public final static native int dtQueryFilter_getExcludeFlags(long jarg1, dtQueryFilter jarg1_);
  public final static native void dtQueryFilter_setExcludeFlags(long jarg1, dtQueryFilter jarg1_, int jarg2);
  public final static native void delete_dtQueryFilter(long jarg1);
  public final static native void dtRaycastHit_t_set(long jarg1, dtRaycastHit jarg1_, float jarg2);
  public final static native float dtRaycastHit_t_get(long jarg1, dtRaycastHit jarg1_);
  public final static native void dtRaycastHit_hitNormal_set(long jarg1, dtRaycastHit jarg1_, long jarg2);
  public final static native long dtRaycastHit_hitNormal_get(long jarg1, dtRaycastHit jarg1_);
  public final static native void dtRaycastHit_path_set(long jarg1, dtRaycastHit jarg1_, long jarg2);
  public final static native long dtRaycastHit_path_get(long jarg1, dtRaycastHit jarg1_);
  public final static native void dtRaycastHit_pathCount_set(long jarg1, dtRaycastHit jarg1_, int jarg2);
  public final static native int dtRaycastHit_pathCount_get(long jarg1, dtRaycastHit jarg1_);
  public final static native void dtRaycastHit_maxPath_set(long jarg1, dtRaycastHit jarg1_, int jarg2);
  public final static native int dtRaycastHit_maxPath_get(long jarg1, dtRaycastHit jarg1_);
  public final static native void dtRaycastHit_pathCost_set(long jarg1, dtRaycastHit jarg1_, float jarg2);
  public final static native float dtRaycastHit_pathCost_get(long jarg1, dtRaycastHit jarg1_);
  public final static native long new_dtRaycastHit();
  public final static native void delete_dtRaycastHit(long jarg1);
  public final static native long new_dtNavMeshQuery();
  public final static native void delete_dtNavMeshQuery(long jarg1);
  public final static native long dtNavMeshQuery_init(long jarg1, dtNavMeshQuery jarg1_, long jarg2, dtNavMesh jarg2_, int jarg3);
  public final static native long dtNavMeshQuery_findPath(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, dtQueryFilter jarg6_, long jarg7, long jarg8, int jarg9);
  public final static native long dtNavMeshQuery_findStraightPath__SWIG_0(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, int jarg5, long jarg6, long jarg7, long jarg8, long jarg9, int jarg10, int jarg11);
  public final static native long dtNavMeshQuery_findStraightPath__SWIG_1(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, int jarg5, long jarg6, long jarg7, long jarg8, long jarg9, int jarg10);
  public final static native long dtNavMeshQuery_initSlicedFindPath__SWIG_0(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, dtQueryFilter jarg6_, long jarg7);
  public final static native long dtNavMeshQuery_initSlicedFindPath__SWIG_1(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, dtQueryFilter jarg6_);
  public final static native long dtNavMeshQuery_updateSlicedFindPath(long jarg1, dtNavMeshQuery jarg1_, int jarg2, long jarg3);
  public final static native long dtNavMeshQuery_finalizeSlicedFindPath(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, int jarg4);
  public final static native long dtNavMeshQuery_finalizeSlicedFindPathPartial(long jarg1, dtNavMeshQuery jarg1_, long jarg2, int jarg3, long jarg4, long jarg5, int jarg6);
  public final static native long dtNavMeshQuery_findPolysAroundCircle(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, float jarg4, long jarg5, dtQueryFilter jarg5_, long jarg6, long jarg7, long jarg8, long jarg9, int jarg10);
  public final static native long dtNavMeshQuery_findPolysAroundShape(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, int jarg4, long jarg5, dtQueryFilter jarg5_, long jarg6, long jarg7, long jarg8, long jarg9, int jarg10);
  public final static native long dtNavMeshQuery_findNearestPoly(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, dtQueryFilter jarg4_, long jarg5, long jarg6);
  public final static native long dtNavMeshQuery_queryPolygons(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, dtQueryFilter jarg4_, long jarg5, long jarg6, int jarg7);
  public final static native long dtNavMeshQuery_findLocalNeighbourhood(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, float jarg4, long jarg5, dtQueryFilter jarg5_, long jarg6, long jarg7, long jarg8, int jarg9);
  public final static native long dtNavMeshQuery_moveAlongSurface(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, long jarg5, dtQueryFilter jarg5_, long jarg6, long jarg7, long jarg8, int jarg9);
  public final static native long dtNavMeshQuery_raycast__SWIG_0(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, long jarg5, dtQueryFilter jarg5_, long jarg6, long jarg7, long jarg8, long jarg9, int jarg10);
  public final static native long dtNavMeshQuery_raycast__SWIG_1(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, long jarg5, dtQueryFilter jarg5_, long jarg6, long jarg7, dtRaycastHit jarg7_, long jarg8);
  public final static native long dtNavMeshQuery_raycast__SWIG_2(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, long jarg5, dtQueryFilter jarg5_, long jarg6, long jarg7, dtRaycastHit jarg7_);
  public final static native long dtNavMeshQuery_findDistanceToWall(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, float jarg4, long jarg5, dtQueryFilter jarg5_, long jarg6, long jarg7, long jarg8);
  public final static native long dtNavMeshQuery_getPolyWallSegments(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, dtQueryFilter jarg3_, long jarg4, long jarg5, long jarg6, int jarg7);
  public final static native long dtNavMeshQuery_findRandomPoint(long jarg1, dtNavMeshQuery jarg1_, long jarg2, dtQueryFilter jarg2_, long jarg3, long jarg4, long jarg5);
  public final static native long dtNavMeshQuery_findRandomPointAroundCircle(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, float jarg4, long jarg5, dtQueryFilter jarg5_, long jarg6, long jarg7, long jarg8);
  public final static native long dtNavMeshQuery_closestPointOnPoly(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long dtNavMeshQuery_closestPointOnPolyBoundary(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native long dtNavMeshQuery_getPolyHeight(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native boolean dtNavMeshQuery_isValidPolyRef(long jarg1, dtNavMeshQuery jarg1_, long jarg2, long jarg3, dtQueryFilter jarg3_);
  public final static native boolean dtNavMeshQuery_isInClosedList(long jarg1, dtNavMeshQuery jarg1_, long jarg2);
  public final static native long dtNavMeshQuery_getNodePool(long jarg1, dtNavMeshQuery jarg1_);
  public final static native long dtNavMeshQuery_getAttachedNavMesh(long jarg1, dtNavMeshQuery jarg1_);
  public final static native long dtAllocNavMeshQuery();
  public final static native void dtFreeNavMeshQuery(long jarg1, dtNavMeshQuery jarg1_);
}
