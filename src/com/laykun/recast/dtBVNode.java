/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public class dtBVNode {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected dtBVNode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dtBVNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RecastJNI.delete_dtBVNode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBmin(SWIGTYPE_p_unsigned_short value) {
    RecastJNI.dtBVNode_bmin_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_short getBmin() {
    long cPtr = RecastJNI.dtBVNode_bmin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public void setBmax(SWIGTYPE_p_unsigned_short value) {
    RecastJNI.dtBVNode_bmax_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_short getBmax() {
    long cPtr = RecastJNI.dtBVNode_bmax_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public void setI(int value) {
    RecastJNI.dtBVNode_i_set(swigCPtr, this, value);
  }

  public int getI() {
    return RecastJNI.dtBVNode_i_get(swigCPtr, this);
  }

  public dtBVNode() {
    this(RecastJNI.new_dtBVNode(), true);
  }

}
