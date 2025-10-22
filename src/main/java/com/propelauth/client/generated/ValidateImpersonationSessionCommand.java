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
public class ValidateImpersonationSessionCommand {
    @NonNull @JsonProperty("impersonationToken") String impersonationToken;
    @NonNull @JsonProperty("userAgent") String userAgent;
    @NonNull @JsonProperty("ipAddress") String ipAddress;
}