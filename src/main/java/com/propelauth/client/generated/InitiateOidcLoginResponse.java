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
public class InitiateOidcLoginResponse {
    @NonNull @JsonProperty("sendUserToIdpUrl") String sendUserToIdpUrl;
    @NonNull @JsonProperty("stateForCookie") String stateForCookie;
}