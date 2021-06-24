// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_tables.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLTablesProto {
  private AutoMLTablesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/cloud/aiplatform/v1/schema/trai" +
      "ningjob/definition/automl_tables.proto\0228" +
      "google.cloud.aiplatform.v1.schema.traini" +
      "ngjob.definition\032agoogle/cloud/aiplatfor" +
      "m/v1/schema/trainingjob/definition/expor" +
      "t_evaluated_data_items_config.proto\032\034goo" +
      "gle/api/annotations.proto\"\316\001\n\014AutoMlTabl" +
      "es\022\\\n\006inputs\030\001 \001(\0132L.google.cloud.aiplat" +
      "form.v1.schema.trainingjob.definition.Au" +
      "toMlTablesInputs\022`\n\010metadata\030\002 \001(\0132N.goo" +
      "gle.cloud.aiplatform.v1.schema.trainingj" +
      "ob.definition.AutoMlTablesMetadata\"\324\021\n\022A" +
      "utoMlTablesInputs\022-\n#optimization_object" +
      "ive_recall_value\030\005 \001(\002H\000\0220\n&optimization" +
      "_objective_precision_value\030\006 \001(\002H\000\022\027\n\017pr" +
      "ediction_type\030\001 \001(\t\022\025\n\rtarget_column\030\002 \001" +
      "(\t\022t\n\017transformations\030\003 \003(\0132[.google.clo" +
      "ud.aiplatform.v1.schema.trainingjob.defi" +
      "nition.AutoMlTablesInputs.Transformation" +
      "\022\036\n\026optimization_objective\030\004 \001(\t\022%\n\035trai" +
      "n_budget_milli_node_hours\030\007 \001(\003\022\036\n\026disab" +
      "le_early_stopping\030\010 \001(\010\022\032\n\022weight_column" +
      "_name\030\t \001(\t\022\204\001\n\"export_evaluated_data_it" +
      "ems_config\030\n \001(\0132X.google.cloud.aiplatfo" +
      "rm.v1.schema.trainingjob.definition.Expo" +
      "rtEvaluatedDataItemsConfig\032\200\r\n\016Transform" +
      "ation\022~\n\004auto\030\001 \001(\0132n.google.cloud.aipla" +
      "tform.v1.schema.trainingjob.definition.A" +
      "utoMlTablesInputs.Transformation.AutoTra" +
      "nsformationH\000\022\204\001\n\007numeric\030\002 \001(\0132q.google" +
      ".cloud.aiplatform.v1.schema.trainingjob." +
      "definition.AutoMlTablesInputs.Transforma" +
      "tion.NumericTransformationH\000\022\214\001\n\013categor" +
      "ical\030\003 \001(\0132u.google.cloud.aiplatform.v1." +
      "schema.trainingjob.definition.AutoMlTabl" +
      "esInputs.Transformation.CategoricalTrans" +
      "formationH\000\022\210\001\n\ttimestamp\030\004 \001(\0132s.google" +
      ".cloud.aiplatform.v1.schema.trainingjob." +
      "definition.AutoMlTablesInputs.Transforma" +
      "tion.TimestampTransformationH\000\022~\n\004text\030\005" +
      " \001(\0132n.google.cloud.aiplatform.v1.schema" +
      ".trainingjob.definition.AutoMlTablesInpu" +
      "ts.Transformation.TextTransformationH\000\022\222" +
      "\001\n\020repeated_numeric\030\006 \001(\0132v.google.cloud" +
      ".aiplatform.v1.schema.trainingjob.defini" +
      "tion.AutoMlTablesInputs.Transformation.N" +
      "umericArrayTransformationH\000\022\232\001\n\024repeated" +
      "_categorical\030\007 \001(\0132z.google.cloud.aiplat" +
      "form.v1.schema.trainingjob.definition.Au" +
      "toMlTablesInputs.Transformation.Categori" +
      "calArrayTransformationH\000\022\214\001\n\rrepeated_te" +
      "xt\030\010 \001(\0132s.google.cloud.aiplatform.v1.sc" +
      "hema.trainingjob.definition.AutoMlTables" +
      "Inputs.Transformation.TextArrayTransform" +
      "ationH\000\032)\n\022AutoTransformation\022\023\n\013column_" +
      "name\030\001 \001(\t\032L\n\025NumericTransformation\022\023\n\013c" +
      "olumn_name\030\001 \001(\t\022\036\n\026invalid_values_allow" +
      "ed\030\002 \001(\010\0320\n\031CategoricalTransformation\022\023\n" +
      "\013column_name\030\001 \001(\t\032c\n\027TimestampTransform" +
      "ation\022\023\n\013column_name\030\001 \001(\t\022\023\n\013time_forma" +
      "t\030\002 \001(\t\022\036\n\026invalid_values_allowed\030\003 \001(\010\032" +
      ")\n\022TextTransformation\022\023\n\013column_name\030\001 \001" +
      "(\t\032Q\n\032NumericArrayTransformation\022\023\n\013colu" +
      "mn_name\030\001 \001(\t\022\036\n\026invalid_values_allowed\030" +
      "\002 \001(\010\0325\n\036CategoricalArrayTransformation\022" +
      "\023\n\013column_name\030\001 \001(\t\032.\n\027TextArrayTransfo" +
      "rmation\022\023\n\013column_name\030\001 \001(\tB\027\n\025transfor" +
      "mation_detailB*\n(additional_optimization" +
      "_objective_config\";\n\024AutoMlTablesMetadat" +
      "a\022#\n\033train_cost_milli_node_hours\030\001 \001(\003B\356" +
      "\002\n<com.google.cloud.aiplatform.v1.schema" +
      ".trainingjob.definitionB\021AutoMLTablesPro" +
      "toP\001Zbgoogle.golang.org/genproto/googlea" +
      "pis/cloud/aiplatform/v1/schema/trainingj" +
      "ob/definition;definition\252\0028Google.Cloud." +
      "AIPlatform.V1.Schema.TrainingJob.Definit" +
      "ion\312\0028Google\\Cloud\\AIPlatform\\V1\\Schema\\" +
      "TrainingJob\\Definition\352\002>Google::Cloud::" +
      "AIPlatform::V1::Schema::TrainingJob::Def" +
      "initionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_descriptor,
        new java.lang.String[] { "Inputs", "Metadata", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor,
        new java.lang.String[] { "OptimizationObjectiveRecallValue", "OptimizationObjectivePrecisionValue", "PredictionType", "TargetColumn", "Transformations", "OptimizationObjective", "TrainBudgetMilliNodeHours", "DisableEarlyStopping", "WeightColumnName", "ExportEvaluatedDataItemsConfig", "AdditionalOptimizationObjectiveConfig", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor,
        new java.lang.String[] { "Auto", "Numeric", "Categorical", "Timestamp", "Text", "RepeatedNumeric", "RepeatedCategorical", "RepeatedText", "TransformationDetail", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_descriptor,
        new java.lang.String[] { "ColumnName", "InvalidValuesAllowed", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_descriptor,
        new java.lang.String[] { "ColumnName", "TimeFormat", "InvalidValuesAllowed", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_descriptor,
        new java.lang.String[] { "ColumnName", "InvalidValuesAllowed", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor,
        new java.lang.String[] { "TrainCostMilliNodeHours", });
    com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
