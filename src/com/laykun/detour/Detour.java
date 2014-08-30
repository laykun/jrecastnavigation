/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.Detour;

public class Detour {
  public static SWIGTYPE_p_float new_float_array(int nelements) {
    long cPtr = DetourJNI.new_float_array(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public static void delete_float_array(SWIGTYPE_p_float ary) {
    DetourJNI.delete_float_array(SWIGTYPE_p_float.getCPtr(ary));
  }

  public static float float_array_getitem(SWIGTYPE_p_float ary, int index) {
    return DetourJNI.float_array_getitem(SWIGTYPE_p_float.getCPtr(ary), index);
  }

  public static void float_array_setitem(SWIGTYPE_p_float ary, int index, float value) {
    DetourJNI.float_array_setitem(SWIGTYPE_p_float.getCPtr(ary), index, value);
  }

  public static SWIGTYPE_p_double new_double_array(int nelements) {
    long cPtr = DetourJNI.new_double_array(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static void delete_double_array(SWIGTYPE_p_double ary) {
    DetourJNI.delete_double_array(SWIGTYPE_p_double.getCPtr(ary));
  }

  public static double double_array_getitem(SWIGTYPE_p_double ary, int index) {
    return DetourJNI.double_array_getitem(SWIGTYPE_p_double.getCPtr(ary), index);
  }

  public static void double_array_setitem(SWIGTYPE_p_double ary, int index, double value) {
    DetourJNI.double_array_setitem(SWIGTYPE_p_double.getCPtr(ary), index, value);
  }

  public static SWIGTYPE_p_int new_int_array(int nelements) {
    long cPtr = DetourJNI.new_int_array(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public static void delete_int_array(SWIGTYPE_p_int ary) {
    DetourJNI.delete_int_array(SWIGTYPE_p_int.getCPtr(ary));
  }

  public static int int_array_getitem(SWIGTYPE_p_int ary, int index) {
    return DetourJNI.int_array_getitem(SWIGTYPE_p_int.getCPtr(ary), index);
  }

  public static void int_array_setitem(SWIGTYPE_p_int ary, int index, int value) {
    DetourJNI.int_array_setitem(SWIGTYPE_p_int.getCPtr(ary), index, value);
  }

  public static String new_char_array(int nelements) {
    return DetourJNI.new_char_array(nelements);
  }

  public static void delete_char_array(String ary) {
    DetourJNI.delete_char_array(ary);
  }

  public static char char_array_getitem(String ary, int index) {
    return DetourJNI.char_array_getitem(ary, index);
  }

  public static void char_array_setitem(String ary, int index, char value) {
    DetourJNI.char_array_setitem(ary, index, value);
  }

  public static SWIGTYPE_p_unsigned_char new_unsigned_char_array(int nelements) {
    long cPtr = DetourJNI.new_unsigned_char_array(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public static void delete_unsigned_char_array(SWIGTYPE_p_unsigned_char ary) {
    DetourJNI.delete_unsigned_char_array(SWIGTYPE_p_unsigned_char.getCPtr(ary));
  }

  public static short unsigned_char_array_getitem(SWIGTYPE_p_unsigned_char ary, int index) {
    return DetourJNI.unsigned_char_array_getitem(SWIGTYPE_p_unsigned_char.getCPtr(ary), index);
  }

  public static void unsigned_char_array_setitem(SWIGTYPE_p_unsigned_char ary, int index, short value) {
    DetourJNI.unsigned_char_array_setitem(SWIGTYPE_p_unsigned_char.getCPtr(ary), index, value);
  }

  public static int getDT_VERTS_PER_POLYGON() {
    return DetourJNI.DT_VERTS_PER_POLYGON_get();
  }

  public static int getDT_NAVMESH_MAGIC() {
    return DetourJNI.DT_NAVMESH_MAGIC_get();
  }

  public static int getDT_NAVMESH_VERSION() {
    return DetourJNI.DT_NAVMESH_VERSION_get();
  }

  public static int getDT_NAVMESH_STATE_MAGIC() {
    return DetourJNI.DT_NAVMESH_STATE_MAGIC_get();
  }

  public static int getDT_NAVMESH_STATE_VERSION() {
    return DetourJNI.DT_NAVMESH_STATE_VERSION_get();
  }

  public static int getDT_EXT_LINK() {
    return DetourJNI.DT_EXT_LINK_get();
  }

  public static long getDT_NULL_LINK() {
    return DetourJNI.DT_NULL_LINK_get();
  }

  public static long getDT_OFFMESH_CON_BIDIR() {
    return DetourJNI.DT_OFFMESH_CON_BIDIR_get();
  }

  public static int getDT_MAX_AREAS() {
    return DetourJNI.DT_MAX_AREAS_get();
  }

  public static float getDT_RAY_CAST_LIMIT_PROPORTIONS() {
    return DetourJNI.DT_RAY_CAST_LIMIT_PROPORTIONS_get();
  }

  public static dtNavMesh dtAllocNavMesh() {
    long cPtr = DetourJNI.dtAllocNavMesh();
    return (cPtr == 0) ? null : new dtNavMesh(cPtr, false);
  }

  public static void dtFreeNavMesh(dtNavMesh navmesh) {
    DetourJNI.dtFreeNavMesh(dtNavMesh.getCPtr(navmesh), navmesh);
  }

  public static boolean dtCreateNavMeshData(dtNavMeshCreateParams params, SWIGTYPE_p_p_unsigned_char outData, SWIGTYPE_p_int outDataSize) {
    return DetourJNI.dtCreateNavMeshData(dtNavMeshCreateParams.getCPtr(params), params, SWIGTYPE_p_p_unsigned_char.getCPtr(outData), SWIGTYPE_p_int.getCPtr(outDataSize));
  }

  public static boolean dtNavMeshHeaderSwapEndian(SWIGTYPE_p_unsigned_char data, int dataSize) {
    return DetourJNI.dtNavMeshHeaderSwapEndian(SWIGTYPE_p_unsigned_char.getCPtr(data), dataSize);
  }

  public static boolean dtNavMeshDataSwapEndian(SWIGTYPE_p_unsigned_char data, int dataSize) {
    return DetourJNI.dtNavMeshDataSwapEndian(SWIGTYPE_p_unsigned_char.getCPtr(data), dataSize);
  }

  public static dtNavMeshQuery dtAllocNavMeshQuery() {
    long cPtr = DetourJNI.dtAllocNavMeshQuery();
    return (cPtr == 0) ? null : new dtNavMeshQuery(cPtr, false);
  }

  public static void dtFreeNavMeshQuery(dtNavMeshQuery query) {
    DetourJNI.dtFreeNavMeshQuery(dtNavMeshQuery.getCPtr(query), query);
  }

}
