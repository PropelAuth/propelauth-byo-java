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
public class ImpersonationSessionInfo {
    @NonNull @JsonProperty("impersonationSessionId") String impersonationSessionId;
    @NonNull @JsonProperty("employeeEmail") String employeeEmail;
    @NonNull @JsonProperty("targetUserId") String targetUserId;
    @JsonProperty("metadata") JsonValue metadata;
    @NonNull @JsonProperty("createdAt") Long createdAt;
    @NonNull @JsonProperty("expiresAt") Long expiresAt;
}