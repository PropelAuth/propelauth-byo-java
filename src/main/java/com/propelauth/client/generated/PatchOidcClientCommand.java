package com.propelauth.client.generated;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Value;
import lombok.NonNull;
import lombok.Builder;
import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
    @JsonSubTypes.Type(value = PatchOidcClientCommand.oidcClientId.class),
    @JsonSubTypes.Type(value = PatchOidcClientCommand.customerId.class)
})
public abstract class PatchOidcClientCommand {

    @Builder
    @Getter
    public static class oidcClientId extends PatchOidcClientCommand {
        @JsonProperty("idpInfoFromCustomer") private final OptionalIdpInfoFromCustomer idpInfoFromCustomer;
        @JsonProperty("displayName") private final String displayName;
        @JsonProperty("emailDomainAllowlist") private final java.util.List<String> emailDomainAllowlist;
        @JsonProperty("redirectUrl") private final String redirectUrl;
        @JsonProperty("additionalScopes") private final java.util.List<String> additionalScopes;
        @JsonProperty("scimMatchingDefinition") private final ScimMatchingDefinition scimMatchingDefinition;
        @NonNull @JsonProperty("oidcClientId") private final String oidcClientId;
        

        @JsonCreator
        public oidcClientId(@JsonProperty("idpInfoFromCustomer") OptionalIdpInfoFromCustomer idpInfoFromCustomer, @JsonProperty("displayName") String displayName, @JsonProperty("emailDomainAllowlist") java.util.List<String> emailDomainAllowlist, @JsonProperty("redirectUrl") String redirectUrl, @JsonProperty("additionalScopes") java.util.List<String> additionalScopes, @JsonProperty("scimMatchingDefinition") ScimMatchingDefinition scimMatchingDefinition, @NonNull @JsonProperty("oidcClientId") String oidcClientId) {
            this.idpInfoFromCustomer = idpInfoFromCustomer;
            this.displayName = displayName;
            this.emailDomainAllowlist = emailDomainAllowlist;
            this.redirectUrl = redirectUrl;
            this.additionalScopes = additionalScopes;
            this.scimMatchingDefinition = scimMatchingDefinition;
            this.oidcClientId = oidcClientId;
        }
    }
    @Builder
    @Getter
    public static class customerId extends PatchOidcClientCommand {
        @JsonProperty("idpInfoFromCustomer") private final OptionalIdpInfoFromCustomer idpInfoFromCustomer;
        @JsonProperty("displayName") private final String displayName;
        @JsonProperty("emailDomainAllowlist") private final java.util.List<String> emailDomainAllowlist;
        @JsonProperty("redirectUrl") private final String redirectUrl;
        @JsonProperty("additionalScopes") private final java.util.List<String> additionalScopes;
        @JsonProperty("scimMatchingDefinition") private final ScimMatchingDefinition scimMatchingDefinition;
        @NonNull @JsonProperty("customerId") private final String customerId;
        

        @JsonCreator
        public customerId(@JsonProperty("idpInfoFromCustomer") OptionalIdpInfoFromCustomer idpInfoFromCustomer, @JsonProperty("displayName") String displayName, @JsonProperty("emailDomainAllowlist") java.util.List<String> emailDomainAllowlist, @JsonProperty("redirectUrl") String redirectUrl, @JsonProperty("additionalScopes") java.util.List<String> additionalScopes, @JsonProperty("scimMatchingDefinition") ScimMatchingDefinition scimMatchingDefinition, @NonNull @JsonProperty("customerId") String customerId) {
            this.idpInfoFromCustomer = idpInfoFromCustomer;
            this.displayName = displayName;
            this.emailDomainAllowlist = emailDomainAllowlist;
            this.redirectUrl = redirectUrl;
            this.additionalScopes = additionalScopes;
            this.scimMatchingDefinition = scimMatchingDefinition;
            this.customerId = customerId;
        }
    }
}