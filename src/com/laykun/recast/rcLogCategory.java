/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public final class rcLogCategory {
  public final static rcLogCategory RC_LOG_PROGRESS = new rcLogCategory("RC_LOG_PROGRESS", RecastJNI.RC_LOG_PROGRESS_get());
  public final static rcLogCategory RC_LOG_WARNING = new rcLogCategory("RC_LOG_WARNING");
  public final static rcLogCategory RC_LOG_ERROR = new rcLogCategory("RC_LOG_ERROR");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static rcLogCategory swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + rcLogCategory.class + " with value " + swigValue);
  }

  private rcLogCategory(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private rcLogCategory(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private rcLogCategory(String swigName, rcLogCategory swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static rcLogCategory[] swigValues = { RC_LOG_PROGRESS, RC_LOG_WARNING, RC_LOG_ERROR };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

