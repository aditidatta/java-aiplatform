// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/data_item.proto

package com.google.cloud.aiplatform.v1beta1;

public final class DataItemProto {
  private DataItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DataItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DataItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DataItem_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DataItem_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/aiplatform/v1beta1/data_i" +
      "tem.proto\022\037google.cloud.aiplatform.v1bet" +
      "a1\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032\034google/protobuf/" +
      "struct.proto\032\037google/protobuf/timestamp." +
      "proto\032\034google/api/annotations.proto\"\300\003\n\010" +
      "DataItem\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_ti" +
      "me\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A" +
      "\003\0224\n\013update_time\030\006 \001(\0132\032.google.protobuf" +
      ".TimestampB\003\340A\003\022J\n\006labels\030\003 \003(\01325.google" +
      ".cloud.aiplatform.v1beta1.DataItem.Label" +
      "sEntryB\003\340A\001\022,\n\007payload\030\004 \001(\0132\026.google.pr" +
      "otobuf.ValueB\003\340A\002\022\021\n\004etag\030\007 \001(\tB\003\340A\001\032-\n\013" +
      "LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:" +
      "\0028\001:y\352Av\n\"aiplatform.googleapis.com/Data" +
      "Item\022Pprojects/{project}/locations/{loca" +
      "tion}/datasets/{dataset}/dataItems/{data" +
      "_item}B\201\001\n#com.google.cloud.aiplatform.v" +
      "1beta1B\rDataItemProtoP\001ZIgoogle.golang.o" +
      "rg/genproto/googleapis/cloud/aiplatform/" +
      "v1beta1;aiplatformb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_DataItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DataItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DataItem_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Labels", "Payload", "Etag", });
    internal_static_google_cloud_aiplatform_v1beta1_DataItem_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_DataItem_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DataItem_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DataItem_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
