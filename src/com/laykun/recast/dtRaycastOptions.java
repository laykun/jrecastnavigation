/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public final class dtRaycastOptions {
  public final static dtRaycastOptions DT_RAYCAST_USE_COSTS = new dtRaycastOptions("DT_RAYCAST_USE_COSTS", RecastJNI.DT_RAYCAST_USE_COSTS_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static dtRaycastOptions swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + dtRaycastOptions.class + " with value " + swigValue);
  }

  private dtRaycastOptions(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private dtRaycastOptions(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private dtRaycastOptions(String swigName, dtRaycastOptions swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static dtRaycastOptions[] swigValues = { DT_RAYCAST_USE_COSTS };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
