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
// source: google/cloud/aiplatform/v1beta1/batch_prediction_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class BatchPredictionJobProto {
  private BatchPredictionJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/aiplatform/v1beta1/batch_"
          + "prediction_job.proto\022\037google.cloud.aipla"
          + "tform.v1beta1\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\0326googl"
          + "e/cloud/aiplatform/v1beta1/completion_st"
          + "ats.proto\0325google/cloud/aiplatform/v1bet"
          + "a1/encryption_spec.proto\0321google/cloud/a"
          + "iplatform/v1beta1/explanation.proto\032(goo"
          + "gle/cloud/aiplatform/v1beta1/io.proto\032/g"
          + "oogle/cloud/aiplatform/v1beta1/job_state"
          + ".proto\0327google/cloud/aiplatform/v1beta1/"
          + "machine_resources.proto\032Dgoogle/cloud/ai"
          + "platform/v1beta1/manual_batch_tuning_par"
          + "ameters.proto\0326google/cloud/aiplatform/v"
          + "1beta1/model_monitoring.proto\032\034google/pr"
          + "otobuf/struct.proto\032\037google/protobuf/tim"
          + "estamp.proto\032\027google/rpc/status.proto\032\034g"
          + "oogle/api/annotations.proto\"\353\020\n\022BatchPre"
          + "dictionJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display"
          + "_name\030\002 \001(\tB\003\340A\002\0226\n\005model\030\003 \001(\tB\'\340A\002\372A!\n"
          + "\037aiplatform.googleapis.com/Model\022Z\n\014inpu"
          + "t_config\030\004 \001(\0132?.google.cloud.aiplatform"
          + ".v1beta1.BatchPredictionJob.InputConfigB"
          + "\003\340A\002\0220\n\020model_parameters\030\005 \001(\0132\026.google."
          + "protobuf.Value\022\\\n\routput_config\030\006 \001(\0132@."
          + "google.cloud.aiplatform.v1beta1.BatchPre"
          + "dictionJob.OutputConfigB\003\340A\002\022U\n\023dedicate"
          + "d_resources\030\007 \001(\01328.google.cloud.aiplatf"
          + "orm.v1beta1.BatchDedicatedResources\022i\n\036m"
          + "anual_batch_tuning_parameters\030\010 \001(\0132<.go"
          + "ogle.cloud.aiplatform.v1beta1.ManualBatc"
          + "hTuningParametersB\003\340A\005\022\034\n\024generate_expla"
          + "nation\030\027 \001(\010\022J\n\020explanation_spec\030\031 \001(\01320"
          + ".google.cloud.aiplatform.v1beta1.Explana"
          + "tionSpec\022X\n\013output_info\030\t \001(\0132>.google.c"
          + "loud.aiplatform.v1beta1.BatchPredictionJ"
          + "ob.OutputInfoB\003\340A\003\022=\n\005state\030\n \001(\0162).goog"
          + "le.cloud.aiplatform.v1beta1.JobStateB\003\340A"
          + "\003\022&\n\005error\030\013 \001(\0132\022.google.rpc.StatusB\003\340A"
          + "\003\0221\n\020partial_failures\030\014 \003(\0132\022.google.rpc"
          + ".StatusB\003\340A\003\022S\n\022resources_consumed\030\r \001(\013"
          + "22.google.cloud.aiplatform.v1beta1.Resou"
          + "rcesConsumedB\003\340A\003\022O\n\020completion_stats\030\016 "
          + "\001(\01320.google.cloud.aiplatform.v1beta1.Co"
          + "mpletionStatsB\003\340A\003\0224\n\013create_time\030\017 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\0223\n\nstar"
          + "t_time\030\020 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\0221\n\010end_time\030\021 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003\0224\n\013update_time\030\022 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\022O\n\006labels"
          + "\030\023 \003(\0132?.google.cloud.aiplatform.v1beta1"
          + ".BatchPredictionJob.LabelsEntry\022H\n\017encry"
          + "ption_spec\030\030 \001(\0132/.google.cloud.aiplatfo"
          + "rm.v1beta1.EncryptionSpec\032\304\001\n\013InputConfi"
          + "g\022@\n\ngcs_source\030\002 \001(\0132*.google.cloud.aip"
          + "latform.v1beta1.GcsSourceH\000\022J\n\017bigquery_"
          + "source\030\003 \001(\0132/.google.cloud.aiplatform.v"
          + "1beta1.BigQuerySourceH\000\022\035\n\020instances_for"
          + "mat\030\001 \001(\tB\003\340A\002B\010\n\006source\032\340\001\n\014OutputConfi"
          + "g\022J\n\017gcs_destination\030\002 \001(\0132/.google.clou"
          + "d.aiplatform.v1beta1.GcsDestinationH\000\022T\n"
          + "\024bigquery_destination\030\003 \001(\01324.google.clo"
          + "ud.aiplatform.v1beta1.BigQueryDestinatio"
          + "nH\000\022\037\n\022predictions_format\030\001 \001(\tB\003\340A\002B\r\n\013"
          + "destination\032l\n\nOutputInfo\022#\n\024gcs_output_"
          + "directory\030\001 \001(\tB\003\340A\003H\000\022&\n\027bigquery_outpu"
          + "t_dataset\030\002 \001(\tB\003\340A\003H\000B\021\n\017output_locatio"
          + "n\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001:\206\001\352A\202\001\n,aiplatform.googleapis.c"
          + "om/BatchPredictionJob\022Rprojects/{project"
          + "}/locations/{location}/batchPredictionJo"
          + "bs/{batch_prediction_job}B\213\001\n#com.google"
          + ".cloud.aiplatform.v1beta1B\027BatchPredicti"
          + "onJobProtoP\001ZIgoogle.golang.org/genproto"
          + "/googleapis/cloud/aiplatform/v1beta1;aip"
          + "latformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.CompletionStatsProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelMonitoringProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Model",
              "InputConfig",
              "ModelParameters",
              "OutputConfig",
              "DedicatedResources",
              "ManualBatchTuningParameters",
              "GenerateExplanation",
              "ExplanationSpec",
              "OutputInfo",
              "State",
              "Error",
              "PartialFailures",
              "ResourcesConsumed",
              "CompletionStats",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Labels",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_InputConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_InputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "BigquerySource", "InstancesFormat", "Source",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "BigqueryDestination", "PredictionsFormat", "Destination",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputInfo_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_OutputInfo_descriptor,
            new java.lang.String[] {
              "GcsOutputDirectory", "BigqueryOutputDataset", "OutputLocation",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchPredictionJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.CompletionStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ManualBatchTuningParametersProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelMonitoringProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
