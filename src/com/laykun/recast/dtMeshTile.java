/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public class dtMeshTile {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected dtMeshTile(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dtMeshTile obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RecastJNI.delete_dtMeshTile(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSalt(long value) {
    RecastJNI.dtMeshTile_salt_set(swigCPtr, this, value);
  }

  public long getSalt() {
    return RecastJNI.dtMeshTile_salt_get(swigCPtr, this);
  }

  public void setLinksFreeList(long value) {
    RecastJNI.dtMeshTile_linksFreeList_set(swigCPtr, this, value);
  }

  public long getLinksFreeList() {
    return RecastJNI.dtMeshTile_linksFreeList_get(swigCPtr, this);
  }

  public void setHeader(dtMeshHeader value) {
    RecastJNI.dtMeshTile_header_set(swigCPtr, this, dtMeshHeader.getCPtr(value), value);
  }

  public dtMeshHeader getHeader() {
    long cPtr = RecastJNI.dtMeshTile_header_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dtMeshHeader(cPtr, false);
  }

  public void setPolys(dtPoly value) {
    RecastJNI.dtMeshTile_polys_set(swigCPtr, this, dtPoly.getCPtr(value), value);
  }

  public dtPoly getPolys() {
    long cPtr = RecastJNI.dtMeshTile_polys_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dtPoly(cPtr, false);
  }

  public void setVerts(SWIGTYPE_p_float value) {
    RecastJNI.dtMeshTile_verts_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getVerts() {
    long cPtr = RecastJNI.dtMeshTile_verts_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setLinks(dtLink value) {
    RecastJNI.dtMeshTile_links_set(swigCPtr, this, dtLink.getCPtr(value), value);
  }

  public dtLink getLinks() {
    long cPtr = RecastJNI.dtMeshTile_links_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dtLink(cPtr, false);
  }

  public void setDetailMeshes(dtPolyDetail value) {
    RecastJNI.dtMeshTile_detailMeshes_set(swigCPtr, this, dtPolyDetail.getCPtr(value), value);
  }

  public dtPolyDetail getDetailMeshes() {
    long cPtr = RecastJNI.dtMeshTile_detailMeshes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dtPolyDetail(cPtr, false);
  }

  public void setDetailVerts(SWIGTYPE_p_float value) {
    RecastJNI.dtMeshTile_detailVerts_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getDetailVerts() {
    long cPtr = RecastJNI.dtMeshTile_detailVerts_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setDetailTris(SWIGTYPE_p_unsigned_char value) {
    RecastJNI.dtMeshTile_detailTris_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getDetailTris() {
    long cPtr = RecastJNI.dtMeshTile_detailTris_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setBvTree(dtBVNode value) {
    RecastJNI.dtMeshTile_bvTree_set(swigCPtr, this, dtBVNode.getCPtr(value), value);
  }

  public dtBVNode getBvTree() {
    long cPtr = RecastJNI.dtMeshTile_bvTree_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dtBVNode(cPtr, false);
  }

  public void setOffMeshCons(dtOffMeshConnection value) {
    RecastJNI.dtMeshTile_offMeshCons_set(swigCPtr, this, dtOffMeshConnection.getCPtr(value), value);
  }

  public dtOffMeshConnection getOffMeshCons() {
    long cPtr = RecastJNI.dtMeshTile_offMeshCons_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dtOffMeshConnection(cPtr, false);
  }

  public void setData(SWIGTYPE_p_unsigned_char value) {
    RecastJNI.dtMeshTile_data_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getData() {
    long cPtr = RecastJNI.dtMeshTile_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setDataSize(int value) {
    RecastJNI.dtMeshTile_dataSize_set(swigCPtr, this, value);
  }

  public int getDataSize() {
    return RecastJNI.dtMeshTile_dataSize_get(swigCPtr, this);
  }

  public void setFlags(int value) {
    RecastJNI.dtMeshTile_flags_set(swigCPtr, this, value);
  }

  public int getFlags() {
    return RecastJNI.dtMeshTile_flags_get(swigCPtr, this);
  }

  public void setNext(dtMeshTile value) {
    RecastJNI.dtMeshTile_next_set(swigCPtr, this, dtMeshTile.getCPtr(value), value);
  }

  public dtMeshTile getNext() {
    long cPtr = RecastJNI.dtMeshTile_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dtMeshTile(cPtr, false);
  }

  public dtMeshTile() {
    this(RecastJNI.new_dtMeshTile(), true);
  }

}
