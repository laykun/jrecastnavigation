/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.Detour;

public class dtMeshHeader {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected dtMeshHeader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dtMeshHeader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        DetourJNI.delete_dtMeshHeader(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMagic(int value) {
    DetourJNI.dtMeshHeader_magic_set(swigCPtr, this, value);
  }

  public int getMagic() {
    return DetourJNI.dtMeshHeader_magic_get(swigCPtr, this);
  }

  public void setVersion(int value) {
    DetourJNI.dtMeshHeader_version_set(swigCPtr, this, value);
  }

  public int getVersion() {
    return DetourJNI.dtMeshHeader_version_get(swigCPtr, this);
  }

  public void setX(int value) {
    DetourJNI.dtMeshHeader_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return DetourJNI.dtMeshHeader_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    DetourJNI.dtMeshHeader_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return DetourJNI.dtMeshHeader_y_get(swigCPtr, this);
  }

  public void setLayer(int value) {
    DetourJNI.dtMeshHeader_layer_set(swigCPtr, this, value);
  }

  public int getLayer() {
    return DetourJNI.dtMeshHeader_layer_get(swigCPtr, this);
  }

  public void setUserId(long value) {
    DetourJNI.dtMeshHeader_userId_set(swigCPtr, this, value);
  }

  public long getUserId() {
    return DetourJNI.dtMeshHeader_userId_get(swigCPtr, this);
  }

  public void setPolyCount(int value) {
    DetourJNI.dtMeshHeader_polyCount_set(swigCPtr, this, value);
  }

  public int getPolyCount() {
    return DetourJNI.dtMeshHeader_polyCount_get(swigCPtr, this);
  }

  public void setVertCount(int value) {
    DetourJNI.dtMeshHeader_vertCount_set(swigCPtr, this, value);
  }

  public int getVertCount() {
    return DetourJNI.dtMeshHeader_vertCount_get(swigCPtr, this);
  }

  public void setMaxLinkCount(int value) {
    DetourJNI.dtMeshHeader_maxLinkCount_set(swigCPtr, this, value);
  }

  public int getMaxLinkCount() {
    return DetourJNI.dtMeshHeader_maxLinkCount_get(swigCPtr, this);
  }

  public void setDetailMeshCount(int value) {
    DetourJNI.dtMeshHeader_detailMeshCount_set(swigCPtr, this, value);
  }

  public int getDetailMeshCount() {
    return DetourJNI.dtMeshHeader_detailMeshCount_get(swigCPtr, this);
  }

  public void setDetailVertCount(int value) {
    DetourJNI.dtMeshHeader_detailVertCount_set(swigCPtr, this, value);
  }

  public int getDetailVertCount() {
    return DetourJNI.dtMeshHeader_detailVertCount_get(swigCPtr, this);
  }

  public void setDetailTriCount(int value) {
    DetourJNI.dtMeshHeader_detailTriCount_set(swigCPtr, this, value);
  }

  public int getDetailTriCount() {
    return DetourJNI.dtMeshHeader_detailTriCount_get(swigCPtr, this);
  }

  public void setBvNodeCount(int value) {
    DetourJNI.dtMeshHeader_bvNodeCount_set(swigCPtr, this, value);
  }

  public int getBvNodeCount() {
    return DetourJNI.dtMeshHeader_bvNodeCount_get(swigCPtr, this);
  }

  public void setOffMeshConCount(int value) {
    DetourJNI.dtMeshHeader_offMeshConCount_set(swigCPtr, this, value);
  }

  public int getOffMeshConCount() {
    return DetourJNI.dtMeshHeader_offMeshConCount_get(swigCPtr, this);
  }

  public void setOffMeshBase(int value) {
    DetourJNI.dtMeshHeader_offMeshBase_set(swigCPtr, this, value);
  }

  public int getOffMeshBase() {
    return DetourJNI.dtMeshHeader_offMeshBase_get(swigCPtr, this);
  }

  public void setWalkableHeight(float value) {
    DetourJNI.dtMeshHeader_walkableHeight_set(swigCPtr, this, value);
  }

  public float getWalkableHeight() {
    return DetourJNI.dtMeshHeader_walkableHeight_get(swigCPtr, this);
  }

  public void setWalkableRadius(float value) {
    DetourJNI.dtMeshHeader_walkableRadius_set(swigCPtr, this, value);
  }

  public float getWalkableRadius() {
    return DetourJNI.dtMeshHeader_walkableRadius_get(swigCPtr, this);
  }

  public void setWalkableClimb(float value) {
    DetourJNI.dtMeshHeader_walkableClimb_set(swigCPtr, this, value);
  }

  public float getWalkableClimb() {
    return DetourJNI.dtMeshHeader_walkableClimb_get(swigCPtr, this);
  }

  public void setBmin(SWIGTYPE_p_float value) {
    DetourJNI.dtMeshHeader_bmin_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getBmin() {
    long cPtr = DetourJNI.dtMeshHeader_bmin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setBmax(SWIGTYPE_p_float value) {
    DetourJNI.dtMeshHeader_bmax_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getBmax() {
    long cPtr = DetourJNI.dtMeshHeader_bmax_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setBvQuantFactor(float value) {
    DetourJNI.dtMeshHeader_bvQuantFactor_set(swigCPtr, this, value);
  }

  public float getBvQuantFactor() {
    return DetourJNI.dtMeshHeader_bvQuantFactor_get(swigCPtr, this);
  }

  public dtMeshHeader() {
    this(DetourJNI.new_dtMeshHeader(), true);
  }

}