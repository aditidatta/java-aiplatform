// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/specialist_pool_service.proto

package com.google.cloud.aiplatform.v1;

public interface DeleteSpecialistPoolRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.DeleteSpecialistPoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the SpecialistPool to delete. Format:
   * `projects/{project}/locations/{location}/specialistPools/{specialist_pool}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the SpecialistPool to delete. Format:
   * `projects/{project}/locations/{location}/specialistPools/{specialist_pool}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If set to true, any specialist managers in this SpecialistPool will also be
   * deleted. (Otherwise, the request will only work if the SpecialistPool has
   * no specialist managers.)
   * </pre>
   *
   * <code>bool force = 2;</code>
   * @return The force.
   */
  boolean getForce();
}
