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
public class DeviceInfo {
    @NonNull @JsonProperty("displayName") String displayName;
    @NonNull @JsonProperty("deviceType") DeviceType deviceType;
    @JsonProperty("browser") String browser;
    @JsonProperty("browserVersion") String browserVersion;
    @JsonProperty("os") String os;
    @JsonProperty("osVersion") String osVersion;
}