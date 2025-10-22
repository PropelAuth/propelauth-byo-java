package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.propelauth.client.common.JsonValue;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class CreateSessionCommand {
    @NonNull @JsonProperty("userId") String userId;
    @JsonProperty("tags") List<String> tags;
    @JsonProperty("userAgent") String userAgent;
    @JsonProperty("ipAddress") String ipAddress;
    @JsonProperty("metadata") JsonValue metadata;
    @JsonProperty("deviceRegistration") DeviceRegistration deviceRegistration;
}