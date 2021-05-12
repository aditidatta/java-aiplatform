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
// source: google/cloud/aiplatform/v1beta1/pipeline_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class PipelineServiceProto {
  private PipelineServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CancelTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CancelTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetPipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetPipelineJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeletePipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeletePipelineJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CancelPipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CancelPipelineJobRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/pipeli"
          + "ne_service.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\0322google/cloud/aiplatform/v1beta1/pi"
          + "peline_job.proto\0327google/cloud/aiplatfor"
          + "m/v1beta1/training_pipeline.proto\032#googl"
          + "e/longrunning/operations.proto\032\033google/p"
          + "rotobuf/empty.proto\032 google/protobuf/fie"
          + "ld_mask.proto\"\255\001\n\035CreateTrainingPipeline"
          + "Request\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locatio"
          + "ns.googleapis.com/Location\022Q\n\021training_p"
          + "ipeline\030\002 \001(\01321.google.cloud.aiplatform."
          + "v1beta1.TrainingPipelineB\003\340A\002\"^\n\032GetTrai"
          + "ningPipelineRequest\022@\n\004name\030\001 \001(\tB2\340A\002\372A"
          + ",\n*aiplatform.googleapis.com/TrainingPip"
          + "eline\"\277\001\n\034ListTrainingPipelinesRequest\0229"
          + "\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.google"
          + "apis.com/Location\022\016\n\006filter\030\002 \001(\t\022\021\n\tpag"
          + "e_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\022-\n\tread"
          + "_mask\030\005 \001(\0132\032.google.protobuf.FieldMask\""
          + "\207\001\n\035ListTrainingPipelinesResponse\022M\n\022tra"
          + "ining_pipelines\030\001 \003(\01321.google.cloud.aip"
          + "latform.v1beta1.TrainingPipeline\022\027\n\017next"
          + "_page_token\030\002 \001(\t\"a\n\035DeleteTrainingPipel"
          + "ineRequest\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*aiplat"
          + "form.googleapis.com/TrainingPipeline\"a\n\035"
          + "CancelTrainingPipelineRequest\022@\n\004name\030\001 "
          + "\001(\tB2\340A\002\372A,\n*aiplatform.googleapis.com/T"
          + "rainingPipeline\"\267\001\n\030CreatePipelineJobReq"
          + "uest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations."
          + "googleapis.com/Location\022G\n\014pipeline_job\030"
          + "\002 \001(\0132,.google.cloud.aiplatform.v1beta1."
          + "PipelineJobB\003\340A\002\022\027\n\017pipeline_job_id\030\003 \001("
          + "\t\"T\n\025GetPipelineJobRequest\022;\n\004name\030\001 \001(\t"
          + "B-\340A\002\372A\'\n%aiplatform.googleapis.com/Pipe"
          + "lineJob\"\213\001\n\027ListPipelineJobsRequest\0229\n\006p"
          + "arent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapi"
          + "s.com/Location\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_s"
          + "ize\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"x\n\030ListPip"
          + "elineJobsResponse\022C\n\rpipeline_jobs\030\001 \003(\013"
          + "2,.google.cloud.aiplatform.v1beta1.Pipel"
          + "ineJob\022\027\n\017next_page_token\030\002 \001(\t\"W\n\030Delet"
          + "ePipelineJobRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372A"
          + "\'\n%aiplatform.googleapis.com/PipelineJob"
          + "\"W\n\030CancelPipelineJobRequest\022;\n\004name\030\001 \001"
          + "(\tB-\340A\002\372A\'\n%aiplatform.googleapis.com/Pi"
          + "pelineJob2\376\021\n\017PipelineService\022\375\001\n\026Create"
          + "TrainingPipeline\022>.google.cloud.aiplatfo"
          + "rm.v1beta1.CreateTrainingPipelineRequest"
          + "\0321.google.cloud.aiplatform.v1beta1.Train"
          + "ingPipeline\"p\202\323\344\223\002O\":/v1beta1/{parent=pr"
          + "ojects/*/locations/*}/trainingPipelines:"
          + "\021training_pipeline\332A\030parent,training_pip"
          + "eline\022\320\001\n\023GetTrainingPipeline\022;.google.c"
          + "loud.aiplatform.v1beta1.GetTrainingPipel"
          + "ineRequest\0321.google.cloud.aiplatform.v1b"
          + "eta1.TrainingPipeline\"I\202\323\344\223\002<\022:/v1beta1/"
          + "{name=projects/*/locations/*/trainingPip"
          + "elines/*}\332A\004name\022\343\001\n\025ListTrainingPipelin"
          + "es\022=.google.cloud.aiplatform.v1beta1.Lis"
          + "tTrainingPipelinesRequest\032>.google.cloud"
          + ".aiplatform.v1beta1.ListTrainingPipeline"
          + "sResponse\"K\202\323\344\223\002<\022:/v1beta1/{parent=proj"
          + "ects/*/locations/*}/trainingPipelines\332A\006"
          + "parent\022\365\001\n\026DeleteTrainingPipeline\022>.goog"
          + "le.cloud.aiplatform.v1beta1.DeleteTraini"
          + "ngPipelineRequest\032\035.google.longrunning.O"
          + "peration\"|\202\323\344\223\002<*:/v1beta1/{name=project"
          + "s/*/locations/*/trainingPipelines/*}\332A\004n"
          + "ame\312A0\n\025google.protobuf.Empty\022\027DeleteOpe"
          + "rationMetadata\022\305\001\n\026CancelTrainingPipelin"
          + "e\022>.google.cloud.aiplatform.v1beta1.Canc"
          + "elTrainingPipelineRequest\032\026.google.proto"
          + "buf.Empty\"S\202\323\344\223\002F\"A/v1beta1/{name=projec"
          + "ts/*/locations/*/trainingPipelines/*}:ca"
          + "ncel:\001*\332A\004name\022\357\001\n\021CreatePipelineJob\0229.g"
          + "oogle.cloud.aiplatform.v1beta1.CreatePip"
          + "elineJobRequest\032,.google.cloud.aiplatfor"
          + "m.v1beta1.PipelineJob\"q\202\323\344\223\002E\"5/v1beta1/"
          + "{parent=projects/*/locations/*}/pipeline"
          + "Jobs:\014pipeline_job\332A#parent,pipeline_job"
          + ",pipeline_job_id\022\274\001\n\016GetPipelineJob\0226.go"
          + "ogle.cloud.aiplatform.v1beta1.GetPipelin"
          + "eJobRequest\032,.google.cloud.aiplatform.v1"
          + "beta1.PipelineJob\"D\202\323\344\223\0027\0225/v1beta1/{nam"
          + "e=projects/*/locations/*/pipelineJobs/*}"
          + "\332A\004name\022\317\001\n\020ListPipelineJobs\0228.google.cl"
          + "oud.aiplatform.v1beta1.ListPipelineJobsR"
          + "equest\0329.google.cloud.aiplatform.v1beta1"
          + ".ListPipelineJobsResponse\"F\202\323\344\223\0027\0225/v1be"
          + "ta1/{parent=projects/*/locations/*}/pipe"
          + "lineJobs\332A\006parent\022\346\001\n\021DeletePipelineJob\022"
          + "9.google.cloud.aiplatform.v1beta1.Delete"
          + "PipelineJobRequest\032\035.google.longrunning."
          + "Operation\"w\202\323\344\223\0027*5/v1beta1/{name=projec"
          + "ts/*/locations/*/pipelineJobs/*}\332A\004name\312"
          + "A0\n\025google.protobuf.Empty\022\027DeleteOperati"
          + "onMetadata\022\266\001\n\021CancelPipelineJob\0229.googl"
          + "e.cloud.aiplatform.v1beta1.CancelPipelin"
          + "eJobRequest\032\026.google.protobuf.Empty\"N\202\323\344"
          + "\223\002A\"</v1beta1/{name=projects/*/locations"
          + "/*/pipelineJobs/*}:cancel:\001*\332A\004name\032M\312A\031"
          + "aiplatform.googleapis.com\322A.https://www."
          + "googleapis.com/auth/cloud-platformB\210\001\n#c"
          + "om.google.cloud.aiplatform.v1beta1B\024Pipe"
          + "lineServiceProtoP\001ZIgoogle.golang.org/ge"
          + "nproto/googleapis/cloud/aiplatform/v1bet"
          + "a1;aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.Pipeline.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.TrainingPipelineProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TrainingPipeline",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_GetTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListTrainingPipelinesResponse_descriptor,
            new java.lang.String[] {
              "TrainingPipelines", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CancelTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_CancelTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CancelTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreatePipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PipelineJob", "PipelineJobId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetPipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_GetPipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetPipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListPipelineJobsResponse_descriptor,
            new java.lang.String[] {
              "PipelineJobs", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeletePipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_DeletePipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeletePipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CancelPipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_CancelPipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CancelPipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.Pipeline.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.TrainingPipelineProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
