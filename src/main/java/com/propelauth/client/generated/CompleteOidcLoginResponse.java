package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.propelauth.client.common.JsonValue;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class CompleteOidcLoginResponse {
    @NonNull @JsonProperty("clientId") String clientId;
    @NonNull @JsonProperty("customerId") String customerId;
    @NonNull @JsonProperty("oidcUserId") String oidcUserId;
    @JsonProperty("email") String email;
    @NonNull @JsonProperty("emailVerified") Boolean emailVerified;
    @JsonProperty("preferredUsername") String preferredUsername;
    @NonNull @JsonProperty("dataFromSso") JsonValue dataFromSso;
    @JsonProperty("scimUser") CompleteScimUserResponse scimUser;
    @JsonProperty("postLoginRedirectUrl") String postLoginRedirectUrl;
}