/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.Detour;

public class dtOffMeshConnection {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected dtOffMeshConnection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dtOffMeshConnection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        DetourJNI.delete_dtOffMeshConnection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPos(SWIGTYPE_p_float value) {
    DetourJNI.dtOffMeshConnection_pos_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getPos() {
    long cPtr = DetourJNI.dtOffMeshConnection_pos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setRad(float value) {
    DetourJNI.dtOffMeshConnection_rad_set(swigCPtr, this, value);
  }

  public float getRad() {
    return DetourJNI.dtOffMeshConnection_rad_get(swigCPtr, this);
  }

  public void setPoly(int value) {
    DetourJNI.dtOffMeshConnection_poly_set(swigCPtr, this, value);
  }

  public int getPoly() {
    return DetourJNI.dtOffMeshConnection_poly_get(swigCPtr, this);
  }

  public void setFlags(short value) {
    DetourJNI.dtOffMeshConnection_flags_set(swigCPtr, this, value);
  }

  public short getFlags() {
    return DetourJNI.dtOffMeshConnection_flags_get(swigCPtr, this);
  }

  public void setSide(short value) {
    DetourJNI.dtOffMeshConnection_side_set(swigCPtr, this, value);
  }

  public short getSide() {
    return DetourJNI.dtOffMeshConnection_side_get(swigCPtr, this);
  }

  public void setUserId(long value) {
    DetourJNI.dtOffMeshConnection_userId_set(swigCPtr, this, value);
  }

  public long getUserId() {
    return DetourJNI.dtOffMeshConnection_userId_get(swigCPtr, this);
  }

  public dtOffMeshConnection() {
    this(DetourJNI.new_dtOffMeshConnection(), true);
  }

}
