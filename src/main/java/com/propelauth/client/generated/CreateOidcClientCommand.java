package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class CreateOidcClientCommand {
    @NonNull @JsonProperty("idpInfoFromCustomer") IdpInfoFromCustomer idpInfoFromCustomer;
    @NonNull @JsonProperty("customerId") String customerId;
    @JsonProperty("displayName") String displayName;
    @NonNull @JsonProperty("redirectUrl") String redirectUrl;
    @JsonProperty("additionalScopes") List<String> additionalScopes;
    @JsonProperty("scimMatchingDefinition") ScimMatchingDefinition scimMatchingDefinition;
    @JsonProperty("emailDomainAllowlist") List<String> emailDomainAllowlist;
}