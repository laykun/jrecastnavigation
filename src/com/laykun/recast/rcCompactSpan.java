/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public class rcCompactSpan {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected rcCompactSpan(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(rcCompactSpan obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RecastJNI.delete_rcCompactSpan(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setY(int value) {
    RecastJNI.rcCompactSpan_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return RecastJNI.rcCompactSpan_y_get(swigCPtr, this);
  }

  public void setReg(int value) {
    RecastJNI.rcCompactSpan_reg_set(swigCPtr, this, value);
  }

  public int getReg() {
    return RecastJNI.rcCompactSpan_reg_get(swigCPtr, this);
  }

  public void setCon(long value) {
    RecastJNI.rcCompactSpan_con_set(swigCPtr, this, value);
  }

  public long getCon() {
    return RecastJNI.rcCompactSpan_con_get(swigCPtr, this);
  }

  public void setH(long value) {
    RecastJNI.rcCompactSpan_h_set(swigCPtr, this, value);
  }

  public long getH() {
    return RecastJNI.rcCompactSpan_h_get(swigCPtr, this);
  }

  public rcCompactSpan() {
    this(RecastJNI.new_rcCompactSpan(), true);
  }

}
