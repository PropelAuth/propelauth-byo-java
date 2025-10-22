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
public class CreateImpersonationSessionCommand {
    @NonNull @JsonProperty("employeeEmail") String employeeEmail;
    @NonNull @JsonProperty("targetUserId") String targetUserId;
    @NonNull @JsonProperty("userAgent") String userAgent;
    @NonNull @JsonProperty("ipAddress") String ipAddress;
    @JsonProperty("metadata") JsonValue metadata;
}