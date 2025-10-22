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
public class ValidateSessionErrorNewDeviceChallengeRequiredDetails {
    @NonNull @JsonProperty("deviceChallenge") String deviceChallenge;
    @NonNull @JsonProperty("expiresAt") Long expiresAt;
}