package com.propelauth.client.generated;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Value;
import lombok.NonNull;
import lombok.Builder;
import com.propelauth.client.common.JsonValue;
import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "error_type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PropertyParseError.property_missing.class, name = "property_missing"),
    @JsonSubTypes.Type(value = PropertyParseError.invalid_type.class, name = "invalid_type"),
    @JsonSubTypes.Type(value = PropertyParseError.invalid_date_structure.class, name = "invalid_date_structure"),
    @JsonSubTypes.Type(value = PropertyParseError.invalid_date_time_structure.class, name = "invalid_date_time_structure"),
    @JsonSubTypes.Type(value = PropertyParseError.invalid_enum_value.class, name = "invalid_enum_value")
})
public abstract class PropertyParseError {

    @Builder
    @Getter
    public static class property_missing extends PropertyParseError {
        @NonNull @JsonProperty("output_field") private final String outputField;
        @NonNull @JsonProperty("path") private final String path;
        

        @JsonCreator
        public property_missing(@NonNull @JsonProperty("output_field") String outputField, @NonNull @JsonProperty("path") String path) {
            this.outputField = outputField;
            this.path = path;
        }
    }
    @Builder
    @Getter
    public static class invalid_type extends PropertyParseError {
        @NonNull @JsonProperty("output_field") private final String outputField;
        @NonNull @JsonProperty("path") private final String path;
        @NonNull @JsonProperty("expected_type") private final String expectedType;
        @NonNull @JsonProperty("actual_value") private final JsonValue actualValue;
        @JsonProperty("example") private final String example;
        

        @JsonCreator
        public invalid_type(@NonNull @JsonProperty("output_field") String outputField, @NonNull @JsonProperty("path") String path, @NonNull @JsonProperty("expected_type") String expectedType, @NonNull @JsonProperty("actual_value") JsonValue actualValue, @JsonProperty("example") String example) {
            this.outputField = outputField;
            this.path = path;
            this.expectedType = expectedType;
            this.actualValue = actualValue;
            this.example = example;
        }
    }
    @Builder
    @Getter
    public static class invalid_date_structure extends PropertyParseError {
        @NonNull @JsonProperty("output_field") private final String outputField;
        @NonNull @JsonProperty("path") private final String path;
        @NonNull @JsonProperty("value") private final String value;
        @NonNull @JsonProperty("expected_format") private final String expectedFormat;
        @NonNull @JsonProperty("example") private final String example;
        

        @JsonCreator
        public invalid_date_structure(@NonNull @JsonProperty("output_field") String outputField, @NonNull @JsonProperty("path") String path, @NonNull @JsonProperty("value") String value, @NonNull @JsonProperty("expected_format") String expectedFormat, @NonNull @JsonProperty("example") String example) {
            this.outputField = outputField;
            this.path = path;
            this.value = value;
            this.expectedFormat = expectedFormat;
            this.example = example;
        }
    }
    @Builder
    @Getter
    public static class invalid_date_time_structure extends PropertyParseError {
        @NonNull @JsonProperty("output_field") private final String outputField;
        @NonNull @JsonProperty("path") private final String path;
        @NonNull @JsonProperty("value") private final String value;
        @NonNull @JsonProperty("expected_format") private final String expectedFormat;
        @NonNull @JsonProperty("example") private final String example;
        

        @JsonCreator
        public invalid_date_time_structure(@NonNull @JsonProperty("output_field") String outputField, @NonNull @JsonProperty("path") String path, @NonNull @JsonProperty("value") String value, @NonNull @JsonProperty("expected_format") String expectedFormat, @NonNull @JsonProperty("example") String example) {
            this.outputField = outputField;
            this.path = path;
            this.value = value;
            this.expectedFormat = expectedFormat;
            this.example = example;
        }
    }
    @Builder
    @Getter
    public static class invalid_enum_value extends PropertyParseError {
        @NonNull @JsonProperty("output_field") private final String outputField;
        @NonNull @JsonProperty("path") private final String path;
        @NonNull @JsonProperty("value") private final String value;
        @NonNull @JsonProperty("allowed_values") private final java.util.List<String> allowedValues;
        

        @JsonCreator
        public invalid_enum_value(@NonNull @JsonProperty("output_field") String outputField, @NonNull @JsonProperty("path") String path, @NonNull @JsonProperty("value") String value, @NonNull @JsonProperty("allowed_values") java.util.List<String> allowedValues) {
            this.outputField = outputField;
            this.path = path;
            this.value = value;
            this.allowedValues = allowedValues;
        }
    }
}