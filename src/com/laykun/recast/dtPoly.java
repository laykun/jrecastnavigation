/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public class dtPoly {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected dtPoly(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dtPoly obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RecastJNI.delete_dtPoly(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFirstLink(long value) {
    RecastJNI.dtPoly_firstLink_set(swigCPtr, this, value);
  }

  public long getFirstLink() {
    return RecastJNI.dtPoly_firstLink_get(swigCPtr, this);
  }

  public void setVerts(SWIGTYPE_p_unsigned_short value) {
    RecastJNI.dtPoly_verts_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_short getVerts() {
    long cPtr = RecastJNI.dtPoly_verts_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public void setNeis(SWIGTYPE_p_unsigned_short value) {
    RecastJNI.dtPoly_neis_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_short getNeis() {
    long cPtr = RecastJNI.dtPoly_neis_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public void setFlags(int value) {
    RecastJNI.dtPoly_flags_set(swigCPtr, this, value);
  }

  public int getFlags() {
    return RecastJNI.dtPoly_flags_get(swigCPtr, this);
  }

  public void setVertCount(short value) {
    RecastJNI.dtPoly_vertCount_set(swigCPtr, this, value);
  }

  public short getVertCount() {
    return RecastJNI.dtPoly_vertCount_get(swigCPtr, this);
  }

  public void setAreaAndtype(short value) {
    RecastJNI.dtPoly_areaAndtype_set(swigCPtr, this, value);
  }

  public short getAreaAndtype() {
    return RecastJNI.dtPoly_areaAndtype_get(swigCPtr, this);
  }

  public void setArea(short a) {
    RecastJNI.dtPoly_setArea(swigCPtr, this, a);
  }

  public void setType(short t) {
    RecastJNI.dtPoly_setType(swigCPtr, this, t);
  }

  public short getArea() {
    return RecastJNI.dtPoly_getArea(swigCPtr, this);
  }

  public short getType() {
    return RecastJNI.dtPoly_getType(swigCPtr, this);
  }

  public dtPoly() {
    this(RecastJNI.new_dtPoly(), true);
  }

}
