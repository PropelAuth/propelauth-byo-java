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
public class ValidateImpersonationSessionResponse {
    @NonNull @JsonProperty("impersonationSessionId") String impersonationSessionId;
    @NonNull @JsonProperty("employeeEmail") String employeeEmail;
    @NonNull @JsonProperty("targetUserId") String targetUserId;
    @NonNull @JsonProperty("createdAt") Long createdAt;
    @NonNull @JsonProperty("expiresAt") Long expiresAt;
    @JsonProperty("metadata") Object metadata;
}