/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.detour;

public class dtNavMeshQuery {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected dtNavMeshQuery(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dtNavMeshQuery obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        DetourJNI.delete_dtNavMeshQuery(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public dtNavMeshQuery() {
    this(DetourJNI.new_dtNavMeshQuery(), true);
  }

  public SWIGTYPE_p_dtStatus init(dtNavMesh nav, int maxNodes) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_init(swigCPtr, this, dtNavMesh.getCPtr(nav), nav, maxNodes), true);
  }

  public SWIGTYPE_p_dtStatus findPath(long startRef, long endRef, SWIGTYPE_p_float startPos, SWIGTYPE_p_float endPos, dtQueryFilter filter, SWIGTYPE_p_unsigned_int path, SWIGTYPE_p_int pathCount, int maxPath) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_findPath(swigCPtr, this, startRef, endRef, SWIGTYPE_p_float.getCPtr(startPos), SWIGTYPE_p_float.getCPtr(endPos), dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_unsigned_int.getCPtr(path), SWIGTYPE_p_int.getCPtr(pathCount), maxPath), true);
  }

  public SWIGTYPE_p_dtStatus findStraightPath(SWIGTYPE_p_float startPos, SWIGTYPE_p_float endPos, SWIGTYPE_p_unsigned_int path, int pathSize, SWIGTYPE_p_float straightPath, SWIGTYPE_p_unsigned_char straightPathFlags, SWIGTYPE_p_unsigned_int straightPathRefs, SWIGTYPE_p_int straightPathCount, int maxStraightPath, int options) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_findStraightPath__SWIG_0(swigCPtr, this, SWIGTYPE_p_float.getCPtr(startPos), SWIGTYPE_p_float.getCPtr(endPos), SWIGTYPE_p_unsigned_int.getCPtr(path), pathSize, SWIGTYPE_p_float.getCPtr(straightPath), SWIGTYPE_p_unsigned_char.getCPtr(straightPathFlags), SWIGTYPE_p_unsigned_int.getCPtr(straightPathRefs), SWIGTYPE_p_int.getCPtr(straightPathCount), maxStraightPath, options), true);
  }

  public SWIGTYPE_p_dtStatus findStraightPath(SWIGTYPE_p_float startPos, SWIGTYPE_p_float endPos, SWIGTYPE_p_unsigned_int path, int pathSize, SWIGTYPE_p_float straightPath, SWIGTYPE_p_unsigned_char straightPathFlags, SWIGTYPE_p_unsigned_int straightPathRefs, SWIGTYPE_p_int straightPathCount, int maxStraightPath) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_findStraightPath__SWIG_1(swigCPtr, this, SWIGTYPE_p_float.getCPtr(startPos), SWIGTYPE_p_float.getCPtr(endPos), SWIGTYPE_p_unsigned_int.getCPtr(path), pathSize, SWIGTYPE_p_float.getCPtr(straightPath), SWIGTYPE_p_unsigned_char.getCPtr(straightPathFlags), SWIGTYPE_p_unsigned_int.getCPtr(straightPathRefs), SWIGTYPE_p_int.getCPtr(straightPathCount), maxStraightPath), true);
  }

  public SWIGTYPE_p_dtStatus initSlicedFindPath(long startRef, long endRef, SWIGTYPE_p_float startPos, SWIGTYPE_p_float endPos, dtQueryFilter filter, long options) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_initSlicedFindPath__SWIG_0(swigCPtr, this, startRef, endRef, SWIGTYPE_p_float.getCPtr(startPos), SWIGTYPE_p_float.getCPtr(endPos), dtQueryFilter.getCPtr(filter), filter, options), true);
  }

  public SWIGTYPE_p_dtStatus initSlicedFindPath(long startRef, long endRef, SWIGTYPE_p_float startPos, SWIGTYPE_p_float endPos, dtQueryFilter filter) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_initSlicedFindPath__SWIG_1(swigCPtr, this, startRef, endRef, SWIGTYPE_p_float.getCPtr(startPos), SWIGTYPE_p_float.getCPtr(endPos), dtQueryFilter.getCPtr(filter), filter), true);
  }

  public SWIGTYPE_p_dtStatus updateSlicedFindPath(int maxIter, SWIGTYPE_p_int doneIters) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_updateSlicedFindPath(swigCPtr, this, maxIter, SWIGTYPE_p_int.getCPtr(doneIters)), true);
  }

  public SWIGTYPE_p_dtStatus finalizeSlicedFindPath(SWIGTYPE_p_unsigned_int path, SWIGTYPE_p_int pathCount, int maxPath) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_finalizeSlicedFindPath(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(path), SWIGTYPE_p_int.getCPtr(pathCount), maxPath), true);
  }

  public SWIGTYPE_p_dtStatus finalizeSlicedFindPathPartial(SWIGTYPE_p_unsigned_int existing, int existingSize, SWIGTYPE_p_unsigned_int path, SWIGTYPE_p_int pathCount, int maxPath) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_finalizeSlicedFindPathPartial(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(existing), existingSize, SWIGTYPE_p_unsigned_int.getCPtr(path), SWIGTYPE_p_int.getCPtr(pathCount), maxPath), true);
  }

  public SWIGTYPE_p_dtStatus findPolysAroundCircle(long startRef, SWIGTYPE_p_float centerPos, float radius, dtQueryFilter filter, SWIGTYPE_p_unsigned_int resultRef, SWIGTYPE_p_unsigned_int resultParent, SWIGTYPE_p_float resultCost, SWIGTYPE_p_int resultCount, int maxResult) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_findPolysAroundCircle(swigCPtr, this, startRef, SWIGTYPE_p_float.getCPtr(centerPos), radius, dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_unsigned_int.getCPtr(resultRef), SWIGTYPE_p_unsigned_int.getCPtr(resultParent), SWIGTYPE_p_float.getCPtr(resultCost), SWIGTYPE_p_int.getCPtr(resultCount), maxResult), true);
  }

  public SWIGTYPE_p_dtStatus findPolysAroundShape(long startRef, SWIGTYPE_p_float verts, int nverts, dtQueryFilter filter, SWIGTYPE_p_unsigned_int resultRef, SWIGTYPE_p_unsigned_int resultParent, SWIGTYPE_p_float resultCost, SWIGTYPE_p_int resultCount, int maxResult) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_findPolysAroundShape(swigCPtr, this, startRef, SWIGTYPE_p_float.getCPtr(verts), nverts, dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_unsigned_int.getCPtr(resultRef), SWIGTYPE_p_unsigned_int.getCPtr(resultParent), SWIGTYPE_p_float.getCPtr(resultCost), SWIGTYPE_p_int.getCPtr(resultCount), maxResult), true);
  }

  public SWIGTYPE_p_dtStatus findNearestPoly(SWIGTYPE_p_float center, SWIGTYPE_p_float extents, dtQueryFilter filter, SWIGTYPE_p_unsigned_int nearestRef, SWIGTYPE_p_float nearestPt) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_findNearestPoly(swigCPtr, this, SWIGTYPE_p_float.getCPtr(center), SWIGTYPE_p_float.getCPtr(extents), dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_unsigned_int.getCPtr(nearestRef), SWIGTYPE_p_float.getCPtr(nearestPt)), true);
  }

  public SWIGTYPE_p_dtStatus queryPolygons(SWIGTYPE_p_float center, SWIGTYPE_p_float extents, dtQueryFilter filter, SWIGTYPE_p_unsigned_int polys, SWIGTYPE_p_int polyCount, int maxPolys) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_queryPolygons(swigCPtr, this, SWIGTYPE_p_float.getCPtr(center), SWIGTYPE_p_float.getCPtr(extents), dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_unsigned_int.getCPtr(polys), SWIGTYPE_p_int.getCPtr(polyCount), maxPolys), true);
  }

  public SWIGTYPE_p_dtStatus findLocalNeighbourhood(long startRef, SWIGTYPE_p_float centerPos, float radius, dtQueryFilter filter, SWIGTYPE_p_unsigned_int resultRef, SWIGTYPE_p_unsigned_int resultParent, SWIGTYPE_p_int resultCount, int maxResult) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_findLocalNeighbourhood(swigCPtr, this, startRef, SWIGTYPE_p_float.getCPtr(centerPos), radius, dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_unsigned_int.getCPtr(resultRef), SWIGTYPE_p_unsigned_int.getCPtr(resultParent), SWIGTYPE_p_int.getCPtr(resultCount), maxResult), true);
  }

  public SWIGTYPE_p_dtStatus moveAlongSurface(long startRef, SWIGTYPE_p_float startPos, SWIGTYPE_p_float endPos, dtQueryFilter filter, SWIGTYPE_p_float resultPos, SWIGTYPE_p_unsigned_int visited, SWIGTYPE_p_int visitedCount, int maxVisitedSize) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_moveAlongSurface(swigCPtr, this, startRef, SWIGTYPE_p_float.getCPtr(startPos), SWIGTYPE_p_float.getCPtr(endPos), dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_float.getCPtr(resultPos), SWIGTYPE_p_unsigned_int.getCPtr(visited), SWIGTYPE_p_int.getCPtr(visitedCount), maxVisitedSize), true);
  }

  public SWIGTYPE_p_dtStatus raycast(long startRef, SWIGTYPE_p_float startPos, SWIGTYPE_p_float endPos, dtQueryFilter filter, SWIGTYPE_p_float t, SWIGTYPE_p_float hitNormal, SWIGTYPE_p_unsigned_int path, SWIGTYPE_p_int pathCount, int maxPath) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_raycast__SWIG_0(swigCPtr, this, startRef, SWIGTYPE_p_float.getCPtr(startPos), SWIGTYPE_p_float.getCPtr(endPos), dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_float.getCPtr(t), SWIGTYPE_p_float.getCPtr(hitNormal), SWIGTYPE_p_unsigned_int.getCPtr(path), SWIGTYPE_p_int.getCPtr(pathCount), maxPath), true);
  }

  public SWIGTYPE_p_dtStatus raycast(long startRef, SWIGTYPE_p_float startPos, SWIGTYPE_p_float endPos, dtQueryFilter filter, long options, dtRaycastHit hit, long prevRef) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_raycast__SWIG_1(swigCPtr, this, startRef, SWIGTYPE_p_float.getCPtr(startPos), SWIGTYPE_p_float.getCPtr(endPos), dtQueryFilter.getCPtr(filter), filter, options, dtRaycastHit.getCPtr(hit), hit, prevRef), true);
  }

  public SWIGTYPE_p_dtStatus raycast(long startRef, SWIGTYPE_p_float startPos, SWIGTYPE_p_float endPos, dtQueryFilter filter, long options, dtRaycastHit hit) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_raycast__SWIG_2(swigCPtr, this, startRef, SWIGTYPE_p_float.getCPtr(startPos), SWIGTYPE_p_float.getCPtr(endPos), dtQueryFilter.getCPtr(filter), filter, options, dtRaycastHit.getCPtr(hit), hit), true);
  }

  public SWIGTYPE_p_dtStatus findDistanceToWall(long startRef, SWIGTYPE_p_float centerPos, float maxRadius, dtQueryFilter filter, SWIGTYPE_p_float hitDist, SWIGTYPE_p_float hitPos, SWIGTYPE_p_float hitNormal) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_findDistanceToWall(swigCPtr, this, startRef, SWIGTYPE_p_float.getCPtr(centerPos), maxRadius, dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_float.getCPtr(hitDist), SWIGTYPE_p_float.getCPtr(hitPos), SWIGTYPE_p_float.getCPtr(hitNormal)), true);
  }

  public SWIGTYPE_p_dtStatus getPolyWallSegments(long ref, dtQueryFilter filter, SWIGTYPE_p_float segmentVerts, SWIGTYPE_p_unsigned_int segmentRefs, SWIGTYPE_p_int segmentCount, int maxSegments) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_getPolyWallSegments(swigCPtr, this, ref, dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_float.getCPtr(segmentVerts), SWIGTYPE_p_unsigned_int.getCPtr(segmentRefs), SWIGTYPE_p_int.getCPtr(segmentCount), maxSegments), true);
  }

  public SWIGTYPE_p_dtStatus findRandomPoint(dtQueryFilter filter, SWIGTYPE_p_f___float frand, SWIGTYPE_p_unsigned_int randomRef, SWIGTYPE_p_float randomPt) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_findRandomPoint(swigCPtr, this, dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_f___float.getCPtr(frand), SWIGTYPE_p_unsigned_int.getCPtr(randomRef), SWIGTYPE_p_float.getCPtr(randomPt)), true);
  }

  public SWIGTYPE_p_dtStatus findRandomPointAroundCircle(long startRef, SWIGTYPE_p_float centerPos, float maxRadius, dtQueryFilter filter, SWIGTYPE_p_f___float frand, SWIGTYPE_p_unsigned_int randomRef, SWIGTYPE_p_float randomPt) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_findRandomPointAroundCircle(swigCPtr, this, startRef, SWIGTYPE_p_float.getCPtr(centerPos), maxRadius, dtQueryFilter.getCPtr(filter), filter, SWIGTYPE_p_f___float.getCPtr(frand), SWIGTYPE_p_unsigned_int.getCPtr(randomRef), SWIGTYPE_p_float.getCPtr(randomPt)), true);
  }

  public SWIGTYPE_p_dtStatus closestPointOnPoly(long ref, SWIGTYPE_p_float pos, SWIGTYPE_p_float closest, SWIGTYPE_p_bool posOverPoly) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_closestPointOnPoly(swigCPtr, this, ref, SWIGTYPE_p_float.getCPtr(pos), SWIGTYPE_p_float.getCPtr(closest), SWIGTYPE_p_bool.getCPtr(posOverPoly)), true);
  }

  public SWIGTYPE_p_dtStatus closestPointOnPolyBoundary(long ref, SWIGTYPE_p_float pos, SWIGTYPE_p_float closest) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_closestPointOnPolyBoundary(swigCPtr, this, ref, SWIGTYPE_p_float.getCPtr(pos), SWIGTYPE_p_float.getCPtr(closest)), true);
  }

  public SWIGTYPE_p_dtStatus getPolyHeight(long ref, SWIGTYPE_p_float pos, SWIGTYPE_p_float height) {
    return new SWIGTYPE_p_dtStatus(DetourJNI.dtNavMeshQuery_getPolyHeight(swigCPtr, this, ref, SWIGTYPE_p_float.getCPtr(pos), SWIGTYPE_p_float.getCPtr(height)), true);
  }

  public boolean isValidPolyRef(long ref, dtQueryFilter filter) {
    return DetourJNI.dtNavMeshQuery_isValidPolyRef(swigCPtr, this, ref, dtQueryFilter.getCPtr(filter), filter);
  }

  public boolean isInClosedList(long ref) {
    return DetourJNI.dtNavMeshQuery_isInClosedList(swigCPtr, this, ref);
  }

  public SWIGTYPE_p_dtNodePool getNodePool() {
    long cPtr = DetourJNI.dtNavMeshQuery_getNodePool(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_dtNodePool(cPtr, false);
  }

  public dtNavMesh getAttachedNavMesh() {
    long cPtr = DetourJNI.dtNavMeshQuery_getAttachedNavMesh(swigCPtr, this);
    return (cPtr == 0) ? null : new dtNavMesh(cPtr, false);
  }

}
