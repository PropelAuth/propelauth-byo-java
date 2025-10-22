package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.propelauth.client.common.JsonValue;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class StartPasskeyRegistrationResponse {
    @NonNull @JsonProperty("registrationOptions") JsonValue registrationOptions;
}