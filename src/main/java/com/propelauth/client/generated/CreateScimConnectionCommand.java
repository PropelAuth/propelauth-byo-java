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
public class CreateScimConnectionCommand {
    @NonNull @JsonProperty("customerId") String customerId;
    @JsonProperty("displayName") String displayName;
    @JsonProperty("scimApiKeyExpiration") Integer scimApiKeyExpiration;
    @JsonProperty("customMapping") ScimUserMappingConfig customMapping;
}