/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/feature.proto

package com.google.cloud.aiplatform.v1beta1;

public interface FeatureOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Feature)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Name of the Feature.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}/features/{feature}`
   * The last part feature is assigned by the client. The feature can be up to
   * 64 characters long and can consist only of ASCII Latin letters A-Z and a-z,
   * underscore(_), and ASCII digits 0-9 starting with a letter. The value will
   * be unique given an entity type.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. Name of the Feature.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}/features/{feature}`
   * The last part feature is assigned by the client. The feature can be up to
   * 64 characters long and can consist only of ASCII Latin letters A-Z and a-z,
   * underscore(_), and ASCII digits 0-9 starting with a letter. The value will
   * be unique given an entity type.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Description of the Feature.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the Feature.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Type of Feature value.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Feature.ValueType value_type = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for valueType.
   */
  int getValueTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Type of Feature value.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Feature.ValueType value_type = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The valueType.
   */
  com.google.cloud.aiplatform.v1beta1.Feature.ValueType getValueType();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your Features.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one Feature (System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your Features.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one Feature (System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your Features.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one Feature (System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your Features.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one Feature (System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your Features.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one Feature (System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Used to perform a consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 7;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Used to perform a consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 7;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. The custom monitoring configuration for this Feature, if not set, use the
   * monitoring_config defined for the EntityType this Feature belongs to.
   * If this is populated with
   * [FeaturestoreMonitoringConfig.disabled][] = true, snapshot analysis
   * monitoring is disabled; if
   * [FeaturestoreMonitoringConfig.monitoring_interval][] specified, snapshot
   * analysis monitoring is enabled. Otherwise, snapshot analysis monitoring
   * config is same as the EntityType's this Feature belongs to.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig monitoring_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the monitoringConfig field is set.
   */
  boolean hasMonitoringConfig();
  /**
   *
   *
   * <pre>
   * Optional. The custom monitoring configuration for this Feature, if not set, use the
   * monitoring_config defined for the EntityType this Feature belongs to.
   * If this is populated with
   * [FeaturestoreMonitoringConfig.disabled][] = true, snapshot analysis
   * monitoring is disabled; if
   * [FeaturestoreMonitoringConfig.monitoring_interval][] specified, snapshot
   * analysis monitoring is enabled. Otherwise, snapshot analysis monitoring
   * config is same as the EntityType's this Feature belongs to.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig monitoring_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The monitoringConfig.
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig getMonitoringConfig();
  /**
   *
   *
   * <pre>
   * Optional. The custom monitoring configuration for this Feature, if not set, use the
   * monitoring_config defined for the EntityType this Feature belongs to.
   * If this is populated with
   * [FeaturestoreMonitoringConfig.disabled][] = true, snapshot analysis
   * monitoring is disabled; if
   * [FeaturestoreMonitoringConfig.monitoring_interval][] specified, snapshot
   * analysis monitoring is enabled. Otherwise, snapshot analysis monitoring
   * config is same as the EntityType's this Feature belongs to.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig monitoring_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfigOrBuilder
      getMonitoringConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A list of historical [Snapshot
   * Analysis][google.cloud.aiplatform.master.FeaturestoreMonitoringConfig.SnapshotAnalysis]
   * stats requested by user, sorted by [FeatureStatsAnomaly.start_time][google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly.start_time]
   * descending.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly monitoring_stats = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly> getMonitoringStatsList();
  /**
   *
   *
   * <pre>
   * Output only. A list of historical [Snapshot
   * Analysis][google.cloud.aiplatform.master.FeaturestoreMonitoringConfig.SnapshotAnalysis]
   * stats requested by user, sorted by [FeatureStatsAnomaly.start_time][google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly.start_time]
   * descending.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly monitoring_stats = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly getMonitoringStats(int index);
  /**
   *
   *
   * <pre>
   * Output only. A list of historical [Snapshot
   * Analysis][google.cloud.aiplatform.master.FeaturestoreMonitoringConfig.SnapshotAnalysis]
   * stats requested by user, sorted by [FeatureStatsAnomaly.start_time][google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly.start_time]
   * descending.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly monitoring_stats = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getMonitoringStatsCount();
  /**
   *
   *
   * <pre>
   * Output only. A list of historical [Snapshot
   * Analysis][google.cloud.aiplatform.master.FeaturestoreMonitoringConfig.SnapshotAnalysis]
   * stats requested by user, sorted by [FeatureStatsAnomaly.start_time][google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly.start_time]
   * descending.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly monitoring_stats = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureStatsAnomalyOrBuilder>
      getMonitoringStatsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A list of historical [Snapshot
   * Analysis][google.cloud.aiplatform.master.FeaturestoreMonitoringConfig.SnapshotAnalysis]
   * stats requested by user, sorted by [FeatureStatsAnomaly.start_time][google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly.start_time]
   * descending.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.FeatureStatsAnomaly monitoring_stats = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureStatsAnomalyOrBuilder getMonitoringStatsOrBuilder(
      int index);
}
