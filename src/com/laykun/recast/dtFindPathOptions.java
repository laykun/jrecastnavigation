/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public final class dtFindPathOptions {
  public final static dtFindPathOptions DT_FINDPATH_LOW_QUALITY_FAR = new dtFindPathOptions("DT_FINDPATH_LOW_QUALITY_FAR", RecastJNI.DT_FINDPATH_LOW_QUALITY_FAR_get());
  public final static dtFindPathOptions DT_FINDPATH_ANY_ANGLE = new dtFindPathOptions("DT_FINDPATH_ANY_ANGLE", RecastJNI.DT_FINDPATH_ANY_ANGLE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static dtFindPathOptions swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + dtFindPathOptions.class + " with value " + swigValue);
  }

  private dtFindPathOptions(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private dtFindPathOptions(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private dtFindPathOptions(String swigName, dtFindPathOptions swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static dtFindPathOptions[] swigValues = { DT_FINDPATH_LOW_QUALITY_FAR, DT_FINDPATH_ANY_ANGLE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
