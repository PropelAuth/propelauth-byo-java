package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.propelauth.client.common.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class FinishPasskeyAuthenticationCommand {
    @NonNull @JsonProperty("userId") String userId;
    @NonNull @JsonProperty("publicKey") JsonValue publicKey;
    @JsonProperty("additionalAllowedOrigin") String additionalAllowedOrigin;
}