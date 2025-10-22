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
public class CompleteScimUserResponse {
    @NonNull @JsonProperty("connectionId") String connectionId;
    @NonNull @JsonProperty("scimUser") JsonValue scimUser;
    @JsonProperty("primaryEmail") String primaryEmail;
    @NonNull @JsonProperty("parsedUserData") JsonValue parsedUserData;
    @NonNull @JsonProperty("active") Boolean active;
    @JsonProperty("userId") String userId;
}