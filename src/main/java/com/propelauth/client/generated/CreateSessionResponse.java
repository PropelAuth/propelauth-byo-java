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
public class CreateSessionResponse {
    @NonNull @JsonProperty("sessionId") String sessionId;
    @NonNull @JsonProperty("sessionToken") String sessionToken;
    @NonNull @JsonProperty("expiresAt") Long expiresAt;
    @JsonProperty("newDeviceDetected") Boolean newDeviceDetected;
}