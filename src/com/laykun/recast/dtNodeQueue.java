/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public class dtNodeQueue {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected dtNodeQueue(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dtNodeQueue obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RecastJNI.delete_dtNodeQueue(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public dtNodeQueue(int n) {
    this(RecastJNI.new_dtNodeQueue(n), true);
  }

  public void clear() {
    RecastJNI.dtNodeQueue_clear(swigCPtr, this);
  }

  public dtNode top() {
    long cPtr = RecastJNI.dtNodeQueue_top(swigCPtr, this);
    return (cPtr == 0) ? null : new dtNode(cPtr, false);
  }

  public dtNode pop() {
    long cPtr = RecastJNI.dtNodeQueue_pop(swigCPtr, this);
    return (cPtr == 0) ? null : new dtNode(cPtr, false);
  }

  public void push(dtNode node) {
    RecastJNI.dtNodeQueue_push(swigCPtr, this, dtNode.getCPtr(node), node);
  }

  public void modify(dtNode node) {
    RecastJNI.dtNodeQueue_modify(swigCPtr, this, dtNode.getCPtr(node), node);
  }

  public boolean empty() {
    return RecastJNI.dtNodeQueue_empty(swigCPtr, this);
  }

  public int getMemUsed() {
    return RecastJNI.dtNodeQueue_getMemUsed(swigCPtr, this);
  }

  public int getCapacity() {
    return RecastJNI.dtNodeQueue_getCapacity(swigCPtr, this);
  }

}
