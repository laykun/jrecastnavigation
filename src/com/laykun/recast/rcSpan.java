/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public class rcSpan {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected rcSpan(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(rcSpan obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RecastJNI.delete_rcSpan(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSmin(long value) {
    RecastJNI.rcSpan_smin_set(swigCPtr, this, value);
  }

  public long getSmin() {
    return RecastJNI.rcSpan_smin_get(swigCPtr, this);
  }

  public void setSmax(long value) {
    RecastJNI.rcSpan_smax_set(swigCPtr, this, value);
  }

  public long getSmax() {
    return RecastJNI.rcSpan_smax_get(swigCPtr, this);
  }

  public void setArea(long value) {
    RecastJNI.rcSpan_area_set(swigCPtr, this, value);
  }

  public long getArea() {
    return RecastJNI.rcSpan_area_get(swigCPtr, this);
  }

  public void setNext(rcSpan value) {
    RecastJNI.rcSpan_next_set(swigCPtr, this, rcSpan.getCPtr(value), value);
  }

  public rcSpan getNext() {
    long cPtr = RecastJNI.rcSpan_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new rcSpan(cPtr, false);
  }

  public rcSpan() {
    this(RecastJNI.new_rcSpan(), true);
  }

}
