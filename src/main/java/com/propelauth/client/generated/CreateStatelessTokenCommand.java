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
public class CreateStatelessTokenCommand {
    @NonNull @JsonProperty("userId") String userId;
    @JsonProperty("sessionId") String sessionId;
    @JsonProperty("customClaims") JsonValue customClaims;
    @JsonProperty("issuer") String issuer;
    @JsonProperty("audience") String audience;
    @JsonProperty("notBeforeUnixtime") Integer notBeforeUnixtime;
    @JsonProperty("lifetimeSecs") Integer lifetimeSecs;
}