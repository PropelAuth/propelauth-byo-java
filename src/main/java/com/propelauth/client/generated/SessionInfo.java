package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.propelauth.client.common.JsonValue;
import java.util.List;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class SessionInfo {
    @NonNull @JsonProperty("sessionId") String sessionId;
    @NonNull @JsonProperty("createdAt") Long createdAt;
    @NonNull @JsonProperty("expiresAt") Long expiresAt;
    @NonNull @JsonProperty("lastActivityAt") Long lastActivityAt;
    @NonNull @JsonProperty("device") DeviceInfo device;
    @JsonProperty("ipAddress") String ipAddress;
    @JsonProperty("sessionTags") List<String> sessionTags;
    @JsonProperty("metadata") JsonValue metadata;
}