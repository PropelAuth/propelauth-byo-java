package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class FetchOidcClientResponse {
    @NonNull @JsonProperty("idpInfoFromCustomer") IdpInfoFromCustomerResponse idpInfoFromCustomer;
    @NonNull @JsonProperty("customerId") String customerId;
    @JsonProperty("displayName") String displayName;
    @NonNull @JsonProperty("redirectUrl") String redirectUrl;
    @NonNull @JsonProperty("emailDomainAllowlist") List<String> emailDomainAllowlist;
    @JsonProperty("scimConnection") FetchScimConnectionResponse scimConnection;
    @NonNull @JsonProperty("additionalScopes") List<String> additionalScopes;
    @JsonProperty("scimMatchingDefinition") ScimMatchingDefinition scimMatchingDefinition;
}