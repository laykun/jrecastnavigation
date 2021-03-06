/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public class dtNavMesh {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected dtNavMesh(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dtNavMesh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RecastJNI.delete_dtNavMesh(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public dtNavMesh() {
    this(RecastJNI.new_dtNavMesh(), true);
  }

  public long init(dtNavMeshParams params) {
    return RecastJNI.dtNavMesh_init__SWIG_0(swigCPtr, this, dtNavMeshParams.getCPtr(params), params);
  }

  public long init(SWIGTYPE_p_unsigned_char data, int dataSize, int flags) {
    return RecastJNI.dtNavMesh_init__SWIG_1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), dataSize, flags);
  }

  public dtNavMeshParams getParams() {
    long cPtr = RecastJNI.dtNavMesh_getParams(swigCPtr, this);
    return (cPtr == 0) ? null : new dtNavMeshParams(cPtr, false);
  }

  public long addTile(SWIGTYPE_p_unsigned_char data, int dataSize, int flags, long lastRef, SWIGTYPE_p_unsigned_int result) {
    return RecastJNI.dtNavMesh_addTile(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), dataSize, flags, lastRef, SWIGTYPE_p_unsigned_int.getCPtr(result));
  }

  public long removeTile(long ref, SWIGTYPE_p_p_unsigned_char data, SWIGTYPE_p_int dataSize) {
    return RecastJNI.dtNavMesh_removeTile(swigCPtr, this, ref, SWIGTYPE_p_p_unsigned_char.getCPtr(data), SWIGTYPE_p_int.getCPtr(dataSize));
  }

  public void calcTileLoc(SWIGTYPE_p_float pos, SWIGTYPE_p_int tx, SWIGTYPE_p_int ty) {
    RecastJNI.dtNavMesh_calcTileLoc(swigCPtr, this, SWIGTYPE_p_float.getCPtr(pos), SWIGTYPE_p_int.getCPtr(tx), SWIGTYPE_p_int.getCPtr(ty));
  }

  public dtMeshTile getTileAt(int x, int y, int layer) {
    long cPtr = RecastJNI.dtNavMesh_getTileAt(swigCPtr, this, x, y, layer);
    return (cPtr == 0) ? null : new dtMeshTile(cPtr, false);
  }

  public int getTilesAt(int x, int y, SWIGTYPE_p_p_dtMeshTile tiles, int maxTiles) {
    return RecastJNI.dtNavMesh_getTilesAt(swigCPtr, this, x, y, SWIGTYPE_p_p_dtMeshTile.getCPtr(tiles), maxTiles);
  }

  public long getTileRefAt(int x, int y, int layer) {
    return RecastJNI.dtNavMesh_getTileRefAt(swigCPtr, this, x, y, layer);
  }

  public long getTileRef(dtMeshTile tile) {
    return RecastJNI.dtNavMesh_getTileRef(swigCPtr, this, dtMeshTile.getCPtr(tile), tile);
  }

  public dtMeshTile getTileByRef(long ref) {
    long cPtr = RecastJNI.dtNavMesh_getTileByRef(swigCPtr, this, ref);
    return (cPtr == 0) ? null : new dtMeshTile(cPtr, false);
  }

  public int getMaxTiles() {
    return RecastJNI.dtNavMesh_getMaxTiles(swigCPtr, this);
  }

  public dtMeshTile getTile(int i) {
    long cPtr = RecastJNI.dtNavMesh_getTile(swigCPtr, this, i);
    return (cPtr == 0) ? null : new dtMeshTile(cPtr, false);
  }

  public long getTileAndPolyByRef(long ref, SWIGTYPE_p_p_dtMeshTile tile, SWIGTYPE_p_p_dtPoly poly) {
    return RecastJNI.dtNavMesh_getTileAndPolyByRef(swigCPtr, this, ref, SWIGTYPE_p_p_dtMeshTile.getCPtr(tile), SWIGTYPE_p_p_dtPoly.getCPtr(poly));
  }

  public void getTileAndPolyByRefUnsafe(long ref, SWIGTYPE_p_p_dtMeshTile tile, SWIGTYPE_p_p_dtPoly poly) {
    RecastJNI.dtNavMesh_getTileAndPolyByRefUnsafe(swigCPtr, this, ref, SWIGTYPE_p_p_dtMeshTile.getCPtr(tile), SWIGTYPE_p_p_dtPoly.getCPtr(poly));
  }

  public boolean isValidPolyRef(long ref) {
    return RecastJNI.dtNavMesh_isValidPolyRef(swigCPtr, this, ref);
  }

  public long getPolyRefBase(dtMeshTile tile) {
    return RecastJNI.dtNavMesh_getPolyRefBase(swigCPtr, this, dtMeshTile.getCPtr(tile), tile);
  }

  public long getOffMeshConnectionPolyEndPoints(long prevRef, long polyRef, SWIGTYPE_p_float startPos, SWIGTYPE_p_float endPos) {
    return RecastJNI.dtNavMesh_getOffMeshConnectionPolyEndPoints(swigCPtr, this, prevRef, polyRef, SWIGTYPE_p_float.getCPtr(startPos), SWIGTYPE_p_float.getCPtr(endPos));
  }

  public dtOffMeshConnection getOffMeshConnectionByRef(long ref) {
    long cPtr = RecastJNI.dtNavMesh_getOffMeshConnectionByRef(swigCPtr, this, ref);
    return (cPtr == 0) ? null : new dtOffMeshConnection(cPtr, false);
  }

  public long setPolyFlags(long ref, int flags) {
    return RecastJNI.dtNavMesh_setPolyFlags(swigCPtr, this, ref, flags);
  }

  public long getPolyFlags(long ref, SWIGTYPE_p_unsigned_short resultFlags) {
    return RecastJNI.dtNavMesh_getPolyFlags(swigCPtr, this, ref, SWIGTYPE_p_unsigned_short.getCPtr(resultFlags));
  }

  public long setPolyArea(long ref, short area) {
    return RecastJNI.dtNavMesh_setPolyArea(swigCPtr, this, ref, area);
  }

  public long getPolyArea(long ref, SWIGTYPE_p_unsigned_char resultArea) {
    return RecastJNI.dtNavMesh_getPolyArea(swigCPtr, this, ref, SWIGTYPE_p_unsigned_char.getCPtr(resultArea));
  }

  public int getTileStateSize(dtMeshTile tile) {
    return RecastJNI.dtNavMesh_getTileStateSize(swigCPtr, this, dtMeshTile.getCPtr(tile), tile);
  }

  public long storeTileState(dtMeshTile tile, SWIGTYPE_p_unsigned_char data, int maxDataSize) {
    return RecastJNI.dtNavMesh_storeTileState(swigCPtr, this, dtMeshTile.getCPtr(tile), tile, SWIGTYPE_p_unsigned_char.getCPtr(data), maxDataSize);
  }

  public long restoreTileState(dtMeshTile tile, SWIGTYPE_p_unsigned_char data, int maxDataSize) {
    return RecastJNI.dtNavMesh_restoreTileState(swigCPtr, this, dtMeshTile.getCPtr(tile), tile, SWIGTYPE_p_unsigned_char.getCPtr(data), maxDataSize);
  }

  public long encodePolyId(long salt, long it, long ip) {
    return RecastJNI.dtNavMesh_encodePolyId(swigCPtr, this, salt, it, ip);
  }

  public void decodePolyId(long ref, SWIGTYPE_p_unsigned_int salt, SWIGTYPE_p_unsigned_int it, SWIGTYPE_p_unsigned_int ip) {
    RecastJNI.dtNavMesh_decodePolyId(swigCPtr, this, ref, SWIGTYPE_p_unsigned_int.getCPtr(salt), SWIGTYPE_p_unsigned_int.getCPtr(it), SWIGTYPE_p_unsigned_int.getCPtr(ip));
  }

  public long decodePolyIdSalt(long ref) {
    return RecastJNI.dtNavMesh_decodePolyIdSalt(swigCPtr, this, ref);
  }

  public long decodePolyIdTile(long ref) {
    return RecastJNI.dtNavMesh_decodePolyIdTile(swigCPtr, this, ref);
  }

  public long decodePolyIdPoly(long ref) {
    return RecastJNI.dtNavMesh_decodePolyIdPoly(swigCPtr, this, ref);
  }

}
