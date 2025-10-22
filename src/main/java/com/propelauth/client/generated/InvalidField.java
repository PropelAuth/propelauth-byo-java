package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class InvalidField {
    @NonNull @JsonProperty("field") String field;
    @NonNull @JsonProperty("code") String code;
    @NonNull @JsonProperty("message") String message;
}