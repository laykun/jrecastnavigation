/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.laykun.recast;

public class RecastJNI {
  public final static native int RC_CONTOUR_REG_MASK_get();
  public final static native int RC_MESH_NULL_IDX_get();
  public final static native short RC_NULL_AREA_get();
  public final static native short RC_WALKABLE_AREA_get();
  public final static native int RC_NOT_CONNECTED_get();
  public final static native long new_rcContext__SWIG_0(boolean jarg1);
  public final static native long new_rcContext__SWIG_1();
  public final static native void delete_rcContext(long jarg1);
  public final static native void rcContext_enableLog(long jarg1, rcContext jarg1_, boolean jarg2);
  public final static native void rcContext_resetLog(long jarg1, rcContext jarg1_);
  public final static native void rcContext_log(long jarg1, rcContext jarg1_, int jarg2, String jarg3);
  public final static native void rcContext_enableTimer(long jarg1, rcContext jarg1_, boolean jarg2);
  public final static native void rcContext_resetTimers(long jarg1, rcContext jarg1_);
  public final static native void rcContext_startTimer(long jarg1, rcContext jarg1_, int jarg2);
  public final static native void rcContext_stopTimer(long jarg1, rcContext jarg1_, int jarg2);
  public final static native int rcContext_getAccumulatedTime(long jarg1, rcContext jarg1_, int jarg2);
  public final static native int RC_CONTOUR_TESS_WALL_EDGES_get();
  public final static native int RC_CONTOUR_TESS_AREA_EDGES_get();
  public final static native int RC_LOG_PROGRESS_get();
  public final static native void rcConfig_width_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_width_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_height_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_height_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_tileSize_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_tileSize_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_borderSize_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_borderSize_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_cs_set(long jarg1, rcConfig jarg1_, float jarg2);
  public final static native float rcConfig_cs_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_ch_set(long jarg1, rcConfig jarg1_, float jarg2);
  public final static native float rcConfig_ch_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_bmin_set(long jarg1, rcConfig jarg1_, long jarg2);
  public final static native long rcConfig_bmin_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_bmax_set(long jarg1, rcConfig jarg1_, long jarg2);
  public final static native long rcConfig_bmax_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_walkableSlopeAngle_set(long jarg1, rcConfig jarg1_, float jarg2);
  public final static native float rcConfig_walkableSlopeAngle_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_walkableHeight_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_walkableHeight_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_walkableClimb_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_walkableClimb_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_walkableRadius_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_walkableRadius_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_maxEdgeLen_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_maxEdgeLen_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_maxSimplificationError_set(long jarg1, rcConfig jarg1_, float jarg2);
  public final static native float rcConfig_maxSimplificationError_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_minRegionArea_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_minRegionArea_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_mergeRegionArea_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_mergeRegionArea_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_maxVertsPerPoly_set(long jarg1, rcConfig jarg1_, int jarg2);
  public final static native int rcConfig_maxVertsPerPoly_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_detailSampleDist_set(long jarg1, rcConfig jarg1_, float jarg2);
  public final static native float rcConfig_detailSampleDist_get(long jarg1, rcConfig jarg1_);
  public final static native void rcConfig_detailSampleMaxError_set(long jarg1, rcConfig jarg1_, float jarg2);
  public final static native float rcConfig_detailSampleMaxError_get(long jarg1, rcConfig jarg1_);
  public final static native long new_rcConfig();
  public final static native void delete_rcConfig(long jarg1);
  public final static native void rcSpan_smin_set(long jarg1, rcSpan jarg1_, long jarg2);
  public final static native long rcSpan_smin_get(long jarg1, rcSpan jarg1_);
  public final static native void rcSpan_smax_set(long jarg1, rcSpan jarg1_, long jarg2);
  public final static native long rcSpan_smax_get(long jarg1, rcSpan jarg1_);
  public final static native void rcSpan_area_set(long jarg1, rcSpan jarg1_, long jarg2);
  public final static native long rcSpan_area_get(long jarg1, rcSpan jarg1_);
  public final static native void rcSpan_next_set(long jarg1, rcSpan jarg1_, long jarg2, rcSpan jarg2_);
  public final static native long rcSpan_next_get(long jarg1, rcSpan jarg1_);
  public final static native long new_rcSpan();
  public final static native void delete_rcSpan(long jarg1);
  public final static native void rcSpanPool_next_set(long jarg1, rcSpanPool jarg1_, long jarg2, rcSpanPool jarg2_);
  public final static native long rcSpanPool_next_get(long jarg1, rcSpanPool jarg1_);
  public final static native void rcSpanPool_items_set(long jarg1, rcSpanPool jarg1_, long jarg2, rcSpan jarg2_);
  public final static native long rcSpanPool_items_get(long jarg1, rcSpanPool jarg1_);
  public final static native long new_rcSpanPool();
  public final static native void delete_rcSpanPool(long jarg1);
  public final static native void rcHeightfield_width_set(long jarg1, rcHeightfield jarg1_, int jarg2);
  public final static native int rcHeightfield_width_get(long jarg1, rcHeightfield jarg1_);
  public final static native void rcHeightfield_height_set(long jarg1, rcHeightfield jarg1_, int jarg2);
  public final static native int rcHeightfield_height_get(long jarg1, rcHeightfield jarg1_);
  public final static native void rcHeightfield_bmin_set(long jarg1, rcHeightfield jarg1_, long jarg2);
  public final static native long rcHeightfield_bmin_get(long jarg1, rcHeightfield jarg1_);
  public final static native void rcHeightfield_bmax_set(long jarg1, rcHeightfield jarg1_, long jarg2);
  public final static native long rcHeightfield_bmax_get(long jarg1, rcHeightfield jarg1_);
  public final static native void rcHeightfield_cs_set(long jarg1, rcHeightfield jarg1_, float jarg2);
  public final static native float rcHeightfield_cs_get(long jarg1, rcHeightfield jarg1_);
  public final static native void rcHeightfield_ch_set(long jarg1, rcHeightfield jarg1_, float jarg2);
  public final static native float rcHeightfield_ch_get(long jarg1, rcHeightfield jarg1_);
  public final static native void rcHeightfield_spans_set(long jarg1, rcHeightfield jarg1_, long jarg2);
  public final static native long rcHeightfield_spans_get(long jarg1, rcHeightfield jarg1_);
  public final static native void rcHeightfield_pools_set(long jarg1, rcHeightfield jarg1_, long jarg2, rcSpanPool jarg2_);
  public final static native long rcHeightfield_pools_get(long jarg1, rcHeightfield jarg1_);
  public final static native void rcHeightfield_freelist_set(long jarg1, rcHeightfield jarg1_, long jarg2, rcSpan jarg2_);
  public final static native long rcHeightfield_freelist_get(long jarg1, rcHeightfield jarg1_);
  public final static native long new_rcHeightfield();
  public final static native void delete_rcHeightfield(long jarg1);
  public final static native void rcCompactCell_index_set(long jarg1, rcCompactCell jarg1_, long jarg2);
  public final static native long rcCompactCell_index_get(long jarg1, rcCompactCell jarg1_);
  public final static native void rcCompactCell_count_set(long jarg1, rcCompactCell jarg1_, long jarg2);
  public final static native long rcCompactCell_count_get(long jarg1, rcCompactCell jarg1_);
  public final static native long new_rcCompactCell();
  public final static native void delete_rcCompactCell(long jarg1);
  public final static native void rcCompactSpan_y_set(long jarg1, rcCompactSpan jarg1_, int jarg2);
  public final static native int rcCompactSpan_y_get(long jarg1, rcCompactSpan jarg1_);
  public final static native void rcCompactSpan_reg_set(long jarg1, rcCompactSpan jarg1_, int jarg2);
  public final static native int rcCompactSpan_reg_get(long jarg1, rcCompactSpan jarg1_);
  public final static native void rcCompactSpan_con_set(long jarg1, rcCompactSpan jarg1_, long jarg2);
  public final static native long rcCompactSpan_con_get(long jarg1, rcCompactSpan jarg1_);
  public final static native void rcCompactSpan_h_set(long jarg1, rcCompactSpan jarg1_, long jarg2);
  public final static native long rcCompactSpan_h_get(long jarg1, rcCompactSpan jarg1_);
  public final static native long new_rcCompactSpan();
  public final static native void delete_rcCompactSpan(long jarg1);
  public final static native void rcCompactHeightfield_width_set(long jarg1, rcCompactHeightfield jarg1_, int jarg2);
  public final static native int rcCompactHeightfield_width_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_height_set(long jarg1, rcCompactHeightfield jarg1_, int jarg2);
  public final static native int rcCompactHeightfield_height_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_spanCount_set(long jarg1, rcCompactHeightfield jarg1_, int jarg2);
  public final static native int rcCompactHeightfield_spanCount_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_walkableHeight_set(long jarg1, rcCompactHeightfield jarg1_, int jarg2);
  public final static native int rcCompactHeightfield_walkableHeight_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_walkableClimb_set(long jarg1, rcCompactHeightfield jarg1_, int jarg2);
  public final static native int rcCompactHeightfield_walkableClimb_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_borderSize_set(long jarg1, rcCompactHeightfield jarg1_, int jarg2);
  public final static native int rcCompactHeightfield_borderSize_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_maxDistance_set(long jarg1, rcCompactHeightfield jarg1_, int jarg2);
  public final static native int rcCompactHeightfield_maxDistance_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_maxRegions_set(long jarg1, rcCompactHeightfield jarg1_, int jarg2);
  public final static native int rcCompactHeightfield_maxRegions_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_bmin_set(long jarg1, rcCompactHeightfield jarg1_, long jarg2);
  public final static native long rcCompactHeightfield_bmin_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_bmax_set(long jarg1, rcCompactHeightfield jarg1_, long jarg2);
  public final static native long rcCompactHeightfield_bmax_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_cs_set(long jarg1, rcCompactHeightfield jarg1_, float jarg2);
  public final static native float rcCompactHeightfield_cs_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_ch_set(long jarg1, rcCompactHeightfield jarg1_, float jarg2);
  public final static native float rcCompactHeightfield_ch_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_cells_set(long jarg1, rcCompactHeightfield jarg1_, long jarg2, rcCompactCell jarg2_);
  public final static native long rcCompactHeightfield_cells_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_spans_set(long jarg1, rcCompactHeightfield jarg1_, long jarg2, rcCompactSpan jarg2_);
  public final static native long rcCompactHeightfield_spans_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_dist_set(long jarg1, rcCompactHeightfield jarg1_, long jarg2);
  public final static native long rcCompactHeightfield_dist_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native void rcCompactHeightfield_areas_set(long jarg1, rcCompactHeightfield jarg1_, long jarg2);
  public final static native long rcCompactHeightfield_areas_get(long jarg1, rcCompactHeightfield jarg1_);
  public final static native long new_rcCompactHeightfield();
  public final static native void delete_rcCompactHeightfield(long jarg1);
  public final static native void rcHeightfieldLayer_bmin_set(long jarg1, rcHeightfieldLayer jarg1_, long jarg2);
  public final static native long rcHeightfieldLayer_bmin_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_bmax_set(long jarg1, rcHeightfieldLayer jarg1_, long jarg2);
  public final static native long rcHeightfieldLayer_bmax_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_cs_set(long jarg1, rcHeightfieldLayer jarg1_, float jarg2);
  public final static native float rcHeightfieldLayer_cs_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_ch_set(long jarg1, rcHeightfieldLayer jarg1_, float jarg2);
  public final static native float rcHeightfieldLayer_ch_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_width_set(long jarg1, rcHeightfieldLayer jarg1_, int jarg2);
  public final static native int rcHeightfieldLayer_width_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_height_set(long jarg1, rcHeightfieldLayer jarg1_, int jarg2);
  public final static native int rcHeightfieldLayer_height_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_minx_set(long jarg1, rcHeightfieldLayer jarg1_, int jarg2);
  public final static native int rcHeightfieldLayer_minx_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_maxx_set(long jarg1, rcHeightfieldLayer jarg1_, int jarg2);
  public final static native int rcHeightfieldLayer_maxx_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_miny_set(long jarg1, rcHeightfieldLayer jarg1_, int jarg2);
  public final static native int rcHeightfieldLayer_miny_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_maxy_set(long jarg1, rcHeightfieldLayer jarg1_, int jarg2);
  public final static native int rcHeightfieldLayer_maxy_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_hmin_set(long jarg1, rcHeightfieldLayer jarg1_, int jarg2);
  public final static native int rcHeightfieldLayer_hmin_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_hmax_set(long jarg1, rcHeightfieldLayer jarg1_, int jarg2);
  public final static native int rcHeightfieldLayer_hmax_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_heights_set(long jarg1, rcHeightfieldLayer jarg1_, long jarg2);
  public final static native long rcHeightfieldLayer_heights_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_areas_set(long jarg1, rcHeightfieldLayer jarg1_, long jarg2);
  public final static native long rcHeightfieldLayer_areas_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native void rcHeightfieldLayer_cons_set(long jarg1, rcHeightfieldLayer jarg1_, long jarg2);
  public final static native long rcHeightfieldLayer_cons_get(long jarg1, rcHeightfieldLayer jarg1_);
  public final static native long new_rcHeightfieldLayer();
  public final static native void delete_rcHeightfieldLayer(long jarg1);
  public final static native void rcHeightfieldLayerSet_layers_set(long jarg1, rcHeightfieldLayerSet jarg1_, long jarg2, rcHeightfieldLayer jarg2_);
  public final static native long rcHeightfieldLayerSet_layers_get(long jarg1, rcHeightfieldLayerSet jarg1_);
  public final static native void rcHeightfieldLayerSet_nlayers_set(long jarg1, rcHeightfieldLayerSet jarg1_, int jarg2);
  public final static native int rcHeightfieldLayerSet_nlayers_get(long jarg1, rcHeightfieldLayerSet jarg1_);
  public final static native long new_rcHeightfieldLayerSet();
  public final static native void delete_rcHeightfieldLayerSet(long jarg1);
  public final static native void rcContour_verts_set(long jarg1, rcContour jarg1_, long jarg2);
  public final static native long rcContour_verts_get(long jarg1, rcContour jarg1_);
  public final static native void rcContour_nverts_set(long jarg1, rcContour jarg1_, int jarg2);
  public final static native int rcContour_nverts_get(long jarg1, rcContour jarg1_);
  public final static native void rcContour_rverts_set(long jarg1, rcContour jarg1_, long jarg2);
  public final static native long rcContour_rverts_get(long jarg1, rcContour jarg1_);
  public final static native void rcContour_nrverts_set(long jarg1, rcContour jarg1_, int jarg2);
  public final static native int rcContour_nrverts_get(long jarg1, rcContour jarg1_);
  public final static native void rcContour_reg_set(long jarg1, rcContour jarg1_, int jarg2);
  public final static native int rcContour_reg_get(long jarg1, rcContour jarg1_);
  public final static native void rcContour_area_set(long jarg1, rcContour jarg1_, short jarg2);
  public final static native short rcContour_area_get(long jarg1, rcContour jarg1_);
  public final static native long new_rcContour();
  public final static native void delete_rcContour(long jarg1);
  public final static native void rcContourSet_conts_set(long jarg1, rcContourSet jarg1_, long jarg2, rcContour jarg2_);
  public final static native long rcContourSet_conts_get(long jarg1, rcContourSet jarg1_);
  public final static native void rcContourSet_nconts_set(long jarg1, rcContourSet jarg1_, int jarg2);
  public final static native int rcContourSet_nconts_get(long jarg1, rcContourSet jarg1_);
  public final static native void rcContourSet_bmin_set(long jarg1, rcContourSet jarg1_, long jarg2);
  public final static native long rcContourSet_bmin_get(long jarg1, rcContourSet jarg1_);
  public final static native void rcContourSet_bmax_set(long jarg1, rcContourSet jarg1_, long jarg2);
  public final static native long rcContourSet_bmax_get(long jarg1, rcContourSet jarg1_);
  public final static native void rcContourSet_cs_set(long jarg1, rcContourSet jarg1_, float jarg2);
  public final static native float rcContourSet_cs_get(long jarg1, rcContourSet jarg1_);
  public final static native void rcContourSet_ch_set(long jarg1, rcContourSet jarg1_, float jarg2);
  public final static native float rcContourSet_ch_get(long jarg1, rcContourSet jarg1_);
  public final static native void rcContourSet_width_set(long jarg1, rcContourSet jarg1_, int jarg2);
  public final static native int rcContourSet_width_get(long jarg1, rcContourSet jarg1_);
  public final static native void rcContourSet_height_set(long jarg1, rcContourSet jarg1_, int jarg2);
  public final static native int rcContourSet_height_get(long jarg1, rcContourSet jarg1_);
  public final static native void rcContourSet_borderSize_set(long jarg1, rcContourSet jarg1_, int jarg2);
  public final static native int rcContourSet_borderSize_get(long jarg1, rcContourSet jarg1_);
  public final static native long new_rcContourSet();
  public final static native void delete_rcContourSet(long jarg1);
  public final static native void rcPolyMesh_verts_set(long jarg1, rcPolyMesh jarg1_, long jarg2);
  public final static native long rcPolyMesh_verts_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_polys_set(long jarg1, rcPolyMesh jarg1_, long jarg2);
  public final static native long rcPolyMesh_polys_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_regs_set(long jarg1, rcPolyMesh jarg1_, long jarg2);
  public final static native long rcPolyMesh_regs_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_flags_set(long jarg1, rcPolyMesh jarg1_, long jarg2);
  public final static native long rcPolyMesh_flags_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_areas_set(long jarg1, rcPolyMesh jarg1_, long jarg2);
  public final static native long rcPolyMesh_areas_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_nverts_set(long jarg1, rcPolyMesh jarg1_, int jarg2);
  public final static native int rcPolyMesh_nverts_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_npolys_set(long jarg1, rcPolyMesh jarg1_, int jarg2);
  public final static native int rcPolyMesh_npolys_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_maxpolys_set(long jarg1, rcPolyMesh jarg1_, int jarg2);
  public final static native int rcPolyMesh_maxpolys_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_nvp_set(long jarg1, rcPolyMesh jarg1_, int jarg2);
  public final static native int rcPolyMesh_nvp_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_bmin_set(long jarg1, rcPolyMesh jarg1_, long jarg2);
  public final static native long rcPolyMesh_bmin_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_bmax_set(long jarg1, rcPolyMesh jarg1_, long jarg2);
  public final static native long rcPolyMesh_bmax_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_cs_set(long jarg1, rcPolyMesh jarg1_, float jarg2);
  public final static native float rcPolyMesh_cs_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_ch_set(long jarg1, rcPolyMesh jarg1_, float jarg2);
  public final static native float rcPolyMesh_ch_get(long jarg1, rcPolyMesh jarg1_);
  public final static native void rcPolyMesh_borderSize_set(long jarg1, rcPolyMesh jarg1_, int jarg2);
  public final static native int rcPolyMesh_borderSize_get(long jarg1, rcPolyMesh jarg1_);
  public final static native long new_rcPolyMesh();
  public final static native void delete_rcPolyMesh(long jarg1);
  public final static native void rcPolyMeshDetail_meshes_set(long jarg1, rcPolyMeshDetail jarg1_, long jarg2);
  public final static native long rcPolyMeshDetail_meshes_get(long jarg1, rcPolyMeshDetail jarg1_);
  public final static native void rcPolyMeshDetail_verts_set(long jarg1, rcPolyMeshDetail jarg1_, long jarg2);
  public final static native long rcPolyMeshDetail_verts_get(long jarg1, rcPolyMeshDetail jarg1_);
  public final static native void rcPolyMeshDetail_tris_set(long jarg1, rcPolyMeshDetail jarg1_, long jarg2);
  public final static native long rcPolyMeshDetail_tris_get(long jarg1, rcPolyMeshDetail jarg1_);
  public final static native void rcPolyMeshDetail_nmeshes_set(long jarg1, rcPolyMeshDetail jarg1_, int jarg2);
  public final static native int rcPolyMeshDetail_nmeshes_get(long jarg1, rcPolyMeshDetail jarg1_);
  public final static native void rcPolyMeshDetail_nverts_set(long jarg1, rcPolyMeshDetail jarg1_, int jarg2);
  public final static native int rcPolyMeshDetail_nverts_get(long jarg1, rcPolyMeshDetail jarg1_);
  public final static native void rcPolyMeshDetail_ntris_set(long jarg1, rcPolyMeshDetail jarg1_, int jarg2);
  public final static native int rcPolyMeshDetail_ntris_get(long jarg1, rcPolyMeshDetail jarg1_);
  public final static native long new_rcPolyMeshDetail();
  public final static native void delete_rcPolyMeshDetail(long jarg1);
  public final static native boolean rcBuildHeightfieldLayers(long jarg1, rcContext jarg1_, long jarg2, rcCompactHeightfield jarg2_, int jarg3, int jarg4, long jarg5, rcHeightfieldLayerSet jarg5_);
  public final static native boolean rcBuildContours__SWIG_0(long jarg1, rcContext jarg1_, long jarg2, rcCompactHeightfield jarg2_, float jarg3, int jarg4, long jarg5, rcContourSet jarg5_, int jarg6);
  public final static native boolean rcBuildContours__SWIG_1(long jarg1, rcContext jarg1_, long jarg2, rcCompactHeightfield jarg2_, float jarg3, int jarg4, long jarg5, rcContourSet jarg5_);
  public final static native boolean rcBuildPolyMesh(long jarg1, rcContext jarg1_, long jarg2, rcContourSet jarg2_, int jarg3, long jarg4, rcPolyMesh jarg4_);
  public final static native boolean rcMergePolyMeshes(long jarg1, rcContext jarg1_, long jarg2, int jarg3, long jarg4, rcPolyMesh jarg4_);
  public final static native boolean rcBuildPolyMeshDetail(long jarg1, rcContext jarg1_, long jarg2, rcPolyMesh jarg2_, long jarg3, rcCompactHeightfield jarg3_, float jarg4, float jarg5, long jarg6, rcPolyMeshDetail jarg6_);
  public final static native boolean rcCopyPolyMesh(long jarg1, rcContext jarg1_, long jarg2, rcPolyMesh jarg2_, long jarg3, rcPolyMesh jarg3_);
  public final static native boolean rcMergePolyMeshDetails(long jarg1, rcContext jarg1_, long jarg2, int jarg3, long jarg4, rcPolyMeshDetail jarg4_);
  public final static native void rcCalcBounds(long jarg1, int jarg2, long jarg3, long jarg4);
  public final static native void rcCalcGridSize(long jarg1, long jarg2, float jarg3, long jarg4, long jarg5);
  public final static native boolean rcCreateHeightfield(long jarg1, rcContext jarg1_, long jarg2, rcHeightfield jarg2_, int jarg3, int jarg4, long jarg5, long jarg6, float jarg7, float jarg8);
  public final static native void rcMarkWalkableTriangles(long jarg1, rcContext jarg1_, float jarg2, long jarg3, int jarg4, long jarg5, int jarg6, long jarg7);
  public final static native void rcClearUnwalkableTriangles(long jarg1, rcContext jarg1_, float jarg2, long jarg3, int jarg4, long jarg5, int jarg6, long jarg7);
  public final static native void rcAddSpan(long jarg1, rcContext jarg1_, long jarg2, rcHeightfield jarg2_, int jarg3, int jarg4, int jarg5, int jarg6, short jarg7, int jarg8);
  public final static native void rcRasterizeTriangle__SWIG_0(long jarg1, rcContext jarg1_, long jarg2, long jarg3, long jarg4, short jarg5, long jarg6, rcHeightfield jarg6_, int jarg7);
  public final static native void rcRasterizeTriangle__SWIG_1(long jarg1, rcContext jarg1_, long jarg2, long jarg3, long jarg4, short jarg5, long jarg6, rcHeightfield jarg6_);
  public final static native void rcRasterizeTriangles__SWIG_0(long jarg1, rcContext jarg1_, long jarg2, int jarg3, long jarg4, long jarg5, int jarg6, long jarg7, rcHeightfield jarg7_, int jarg8);
  public final static native void rcRasterizeTriangles__SWIG_1(long jarg1, rcContext jarg1_, long jarg2, int jarg3, long jarg4, long jarg5, int jarg6, long jarg7, rcHeightfield jarg7_);
  public final static native void rcRasterizeTriangles__SWIG_2(long jarg1, rcContext jarg1_, long jarg2, int jarg3, long jarg4, long jarg5, int jarg6, long jarg7, rcHeightfield jarg7_, int jarg8);
  public final static native void rcRasterizeTriangles__SWIG_3(long jarg1, rcContext jarg1_, long jarg2, int jarg3, long jarg4, long jarg5, int jarg6, long jarg7, rcHeightfield jarg7_);
  public final static native void rcRasterizeTriangles__SWIG_4(long jarg1, rcContext jarg1_, long jarg2, long jarg3, int jarg4, long jarg5, rcHeightfield jarg5_, int jarg6);
  public final static native void rcRasterizeTriangles__SWIG_5(long jarg1, rcContext jarg1_, long jarg2, long jarg3, int jarg4, long jarg5, rcHeightfield jarg5_);
  public final static native void rcFilterLowHangingWalkableObstacles(long jarg1, rcContext jarg1_, int jarg2, long jarg3, rcHeightfield jarg3_);
  public final static native void rcFilterLedgeSpans(long jarg1, rcContext jarg1_, int jarg2, int jarg3, long jarg4, rcHeightfield jarg4_);
  public final static native void rcFilterWalkableLowHeightSpans(long jarg1, rcContext jarg1_, int jarg2, long jarg3, rcHeightfield jarg3_);
  public final static native int rcGetHeightFieldSpanCount(long jarg1, rcContext jarg1_, long jarg2, rcHeightfield jarg2_);
  public final static native boolean rcBuildCompactHeightfield(long jarg1, rcContext jarg1_, int jarg2, int jarg3, long jarg4, rcHeightfield jarg4_, long jarg5, rcCompactHeightfield jarg5_);
  public final static native boolean rcErodeWalkableArea(long jarg1, rcContext jarg1_, int jarg2, long jarg3, rcCompactHeightfield jarg3_);
  public final static native boolean rcMedianFilterWalkableArea(long jarg1, rcContext jarg1_, long jarg2, rcCompactHeightfield jarg2_);
  public final static native void rcMarkBoxArea(long jarg1, rcContext jarg1_, long jarg2, long jarg3, short jarg4, long jarg5, rcCompactHeightfield jarg5_);
  public final static native void rcMarkConvexPolyArea(long jarg1, rcContext jarg1_, long jarg2, int jarg3, float jarg4, float jarg5, short jarg6, long jarg7, rcCompactHeightfield jarg7_);
  public final static native int rcOffsetPoly(long jarg1, int jarg2, float jarg3, long jarg4, int jarg5);
  public final static native void rcMarkCylinderArea(long jarg1, rcContext jarg1_, long jarg2, float jarg3, float jarg4, short jarg5, long jarg6, rcCompactHeightfield jarg6_);
  public final static native boolean rcBuildDistanceField(long jarg1, rcContext jarg1_, long jarg2, rcCompactHeightfield jarg2_);
  public final static native boolean rcBuildRegions(long jarg1, rcContext jarg1_, long jarg2, rcCompactHeightfield jarg2_, int jarg3, int jarg4, int jarg5);
  public final static native boolean rcBuildLayerRegions(long jarg1, rcContext jarg1_, long jarg2, rcCompactHeightfield jarg2_, int jarg3, int jarg4);
  public final static native boolean rcBuildRegionsMonotone(long jarg1, rcContext jarg1_, long jarg2, rcCompactHeightfield jarg2_, int jarg3, int jarg4, int jarg5);
  public final static native long rcAllocHeightfield();
  public final static native void rcFreeHeightField(long jarg1, rcHeightfield jarg1_);
  public final static native long rcAllocCompactHeightfield();
  public final static native void rcFreeCompactHeightfield(long jarg1, rcCompactHeightfield jarg1_);
  public final static native long rcAllocHeightfieldLayerSet();
  public final static native void rcFreeHeightfieldLayerSet(long jarg1, rcHeightfieldLayerSet jarg1_);
  public final static native long rcAllocContourSet();
  public final static native void rcFreeContourSet(long jarg1, rcContourSet jarg1_);
  public final static native long rcAllocPolyMesh();
  public final static native void rcFreePolyMesh(long jarg1, rcPolyMesh jarg1_);
  public final static native long rcAllocPolyMeshDetail();
  public final static native void rcFreePolyMeshDetail(long jarg1, rcPolyMeshDetail jarg1_);
}