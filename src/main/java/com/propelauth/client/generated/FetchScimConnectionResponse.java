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
public class FetchScimConnectionResponse {
    @NonNull @JsonProperty("connectionId") String connectionId;
    @NonNull @JsonProperty("customerId") String customerId;
    @JsonProperty("displayName") String displayName;
    @JsonProperty("scimApiKeyValidUntil") Integer scimApiKeyValidUntil;
    @NonNull @JsonProperty("userMapping") ScimUserMappingConfig userMapping;
}