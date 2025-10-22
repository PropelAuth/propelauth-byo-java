package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.propelauth.client.common.JsonValue;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class ScimUserMappingFieldDefinition {
    @NonNull @JsonProperty("outputField") String outputField;
    @NonNull @JsonProperty("inputPath") String inputPath;
    @NonNull @JsonProperty("fallbackInputPaths") List<String> fallbackInputPaths;
    @NonNull @JsonProperty("propertyType") PropertyType propertyType;
    @NonNull @JsonProperty("displayName") String displayName;
    @JsonProperty("description") String description;
    @NonNull @JsonProperty("warnIfMissing") Boolean warnIfMissing;
    @JsonProperty("defaultValue") JsonValue defaultValue;
}