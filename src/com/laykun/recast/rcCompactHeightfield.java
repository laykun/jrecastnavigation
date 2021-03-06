/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public class rcCompactHeightfield {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected rcCompactHeightfield(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(rcCompactHeightfield obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RecastJNI.delete_rcCompactHeightfield(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setWidth(int value) {
    RecastJNI.rcCompactHeightfield_width_set(swigCPtr, this, value);
  }

  public int getWidth() {
    return RecastJNI.rcCompactHeightfield_width_get(swigCPtr, this);
  }

  public void setHeight(int value) {
    RecastJNI.rcCompactHeightfield_height_set(swigCPtr, this, value);
  }

  public int getHeight() {
    return RecastJNI.rcCompactHeightfield_height_get(swigCPtr, this);
  }

  public void setSpanCount(int value) {
    RecastJNI.rcCompactHeightfield_spanCount_set(swigCPtr, this, value);
  }

  public int getSpanCount() {
    return RecastJNI.rcCompactHeightfield_spanCount_get(swigCPtr, this);
  }

  public void setWalkableHeight(int value) {
    RecastJNI.rcCompactHeightfield_walkableHeight_set(swigCPtr, this, value);
  }

  public int getWalkableHeight() {
    return RecastJNI.rcCompactHeightfield_walkableHeight_get(swigCPtr, this);
  }

  public void setWalkableClimb(int value) {
    RecastJNI.rcCompactHeightfield_walkableClimb_set(swigCPtr, this, value);
  }

  public int getWalkableClimb() {
    return RecastJNI.rcCompactHeightfield_walkableClimb_get(swigCPtr, this);
  }

  public void setBorderSize(int value) {
    RecastJNI.rcCompactHeightfield_borderSize_set(swigCPtr, this, value);
  }

  public int getBorderSize() {
    return RecastJNI.rcCompactHeightfield_borderSize_get(swigCPtr, this);
  }

  public void setMaxDistance(int value) {
    RecastJNI.rcCompactHeightfield_maxDistance_set(swigCPtr, this, value);
  }

  public int getMaxDistance() {
    return RecastJNI.rcCompactHeightfield_maxDistance_get(swigCPtr, this);
  }

  public void setMaxRegions(int value) {
    RecastJNI.rcCompactHeightfield_maxRegions_set(swigCPtr, this, value);
  }

  public int getMaxRegions() {
    return RecastJNI.rcCompactHeightfield_maxRegions_get(swigCPtr, this);
  }

  public void setBmin(SWIGTYPE_p_float value) {
    RecastJNI.rcCompactHeightfield_bmin_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getBmin() {
    long cPtr = RecastJNI.rcCompactHeightfield_bmin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setBmax(SWIGTYPE_p_float value) {
    RecastJNI.rcCompactHeightfield_bmax_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getBmax() {
    long cPtr = RecastJNI.rcCompactHeightfield_bmax_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setCs(float value) {
    RecastJNI.rcCompactHeightfield_cs_set(swigCPtr, this, value);
  }

  public float getCs() {
    return RecastJNI.rcCompactHeightfield_cs_get(swigCPtr, this);
  }

  public void setCh(float value) {
    RecastJNI.rcCompactHeightfield_ch_set(swigCPtr, this, value);
  }

  public float getCh() {
    return RecastJNI.rcCompactHeightfield_ch_get(swigCPtr, this);
  }

  public void setCells(rcCompactCell value) {
    RecastJNI.rcCompactHeightfield_cells_set(swigCPtr, this, rcCompactCell.getCPtr(value), value);
  }

  public rcCompactCell getCells() {
    long cPtr = RecastJNI.rcCompactHeightfield_cells_get(swigCPtr, this);
    return (cPtr == 0) ? null : new rcCompactCell(cPtr, false);
  }

  public void setSpans(rcCompactSpan value) {
    RecastJNI.rcCompactHeightfield_spans_set(swigCPtr, this, rcCompactSpan.getCPtr(value), value);
  }

  public rcCompactSpan getSpans() {
    long cPtr = RecastJNI.rcCompactHeightfield_spans_get(swigCPtr, this);
    return (cPtr == 0) ? null : new rcCompactSpan(cPtr, false);
  }

  public void setDist(SWIGTYPE_p_unsigned_short value) {
    RecastJNI.rcCompactHeightfield_dist_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_short getDist() {
    long cPtr = RecastJNI.rcCompactHeightfield_dist_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public void setAreas(SWIGTYPE_p_unsigned_char value) {
    RecastJNI.rcCompactHeightfield_areas_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getAreas() {
    long cPtr = RecastJNI.rcCompactHeightfield_areas_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public rcCompactHeightfield() {
    this(RecastJNI.new_rcCompactHeightfield(), true);
  }

}
