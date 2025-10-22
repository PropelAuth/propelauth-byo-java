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
public class CreateImpersonationSessionResponse {
    @NonNull @JsonProperty("sessionId") String sessionId;
    @NonNull @JsonProperty("impersonationSessionToken") String impersonationSessionToken;
    @NonNull @JsonProperty("expiresAt") Long expiresAt;
}