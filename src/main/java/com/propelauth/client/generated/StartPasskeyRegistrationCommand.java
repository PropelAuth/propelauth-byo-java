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
public class StartPasskeyRegistrationCommand {
    @NonNull @JsonProperty("userId") String userId;
    @NonNull @JsonProperty("emailOrUsername") String emailOrUsername;
    @JsonProperty("userDisplayName") String userDisplayName;
    @JsonProperty("passkeyDisplayName") String passkeyDisplayName;
    @JsonProperty("additionalAllowedOrigin") String additionalAllowedOrigin;
}