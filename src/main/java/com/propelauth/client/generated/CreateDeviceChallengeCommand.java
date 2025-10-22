package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class CreateDeviceChallengeCommand {
    @JsonProperty("userAgent") String userAgent;
    @JsonProperty("ipAddress") String ipAddress;
}