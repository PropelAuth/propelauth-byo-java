package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.propelauth.client.common.JsonValue;
import java.util.List;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class ValidateAndRefreshSessionResponse {
    @NonNull @JsonProperty("sessionId") String sessionId;
    @NonNull @JsonProperty("userId") String userId;
    @NonNull @JsonProperty("createdAt") Long createdAt;
    @NonNull @JsonProperty("expiresAt") Long expiresAt;
    @JsonProperty("tags") List<String> tags;
    @JsonProperty("metadata") JsonValue metadata;
    @NonNull @JsonProperty("hasDeviceRegistered") Boolean hasDeviceRegistered;
    @JsonProperty("newSessionToken") String newSessionToken;
}