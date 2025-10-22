package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class ValidateAndRefreshSessionCommand {
    @JsonProperty("sessionToken") String sessionToken;
    @JsonProperty("userAgent") String userAgent;
    @JsonProperty("ipAddress") String ipAddress;
    @JsonProperty("requiredTags") List<String> requiredTags;
    @JsonProperty("deviceVerification") DeviceVerification deviceVerification;
    @JsonProperty("ignoreDeviceForVerification") Boolean ignoreDeviceForVerification;
}