/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public final class rcBuildContoursFlags {
  public final static rcBuildContoursFlags RC_CONTOUR_TESS_WALL_EDGES = new rcBuildContoursFlags("RC_CONTOUR_TESS_WALL_EDGES", RecastJNI.RC_CONTOUR_TESS_WALL_EDGES_get());
  public final static rcBuildContoursFlags RC_CONTOUR_TESS_AREA_EDGES = new rcBuildContoursFlags("RC_CONTOUR_TESS_AREA_EDGES", RecastJNI.RC_CONTOUR_TESS_AREA_EDGES_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static rcBuildContoursFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + rcBuildContoursFlags.class + " with value " + swigValue);
  }

  private rcBuildContoursFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private rcBuildContoursFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private rcBuildContoursFlags(String swigName, rcBuildContoursFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static rcBuildContoursFlags[] swigValues = { RC_CONTOUR_TESS_WALL_EDGES, RC_CONTOUR_TESS_AREA_EDGES };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

