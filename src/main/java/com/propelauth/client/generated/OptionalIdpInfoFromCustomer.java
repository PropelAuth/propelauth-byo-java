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

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "idpType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = OptionalIdpInfoFromCustomer.MicrosoftEntra.class, name = "MicrosoftEntra"),
    @JsonSubTypes.Type(value = OptionalIdpInfoFromCustomer.Okta.class, name = "Okta"),
    @JsonSubTypes.Type(value = OptionalIdpInfoFromCustomer.Generic.class, name = "Generic")
})
public abstract class OptionalIdpInfoFromCustomer {

    @Builder
    @Getter
    public static class MicrosoftEntra extends OptionalIdpInfoFromCustomer {
        @JsonProperty("clientSecret") private final String clientSecret;
        @JsonProperty("usesPkce") private final Boolean usesPkce;
        @JsonProperty("tenantId") private final String tenantId;
        

        @JsonCreator
        public MicrosoftEntra(@JsonProperty("clientSecret") String clientSecret, @JsonProperty("usesPkce") Boolean usesPkce, @JsonProperty("tenantId") String tenantId) {
            this.clientSecret = clientSecret;
            this.usesPkce = usesPkce;
            this.tenantId = tenantId;
        }
    }
    @Builder
    @Getter
    public static class Okta extends OptionalIdpInfoFromCustomer {
        @JsonProperty("clientSecret") private final String clientSecret;
        @JsonProperty("usesPkce") private final Boolean usesPkce;
        @JsonProperty("ssoDomain") private final String ssoDomain;
        

        @JsonCreator
        public Okta(@JsonProperty("clientSecret") String clientSecret, @JsonProperty("usesPkce") Boolean usesPkce, @JsonProperty("ssoDomain") String ssoDomain) {
            this.clientSecret = clientSecret;
            this.usesPkce = usesPkce;
            this.ssoDomain = ssoDomain;
        }
    }
    @Builder
    @Getter
    public static class Generic extends OptionalIdpInfoFromCustomer {
        @JsonProperty("clientSecret") private final String clientSecret;
        @JsonProperty("usesPkce") private final Boolean usesPkce;
        @JsonProperty("authUrl") private final String authUrl;
        @JsonProperty("tokenUrl") private final String tokenUrl;
        @JsonProperty("userinfoUrl") private final String userinfoUrl;
        

        @JsonCreator
        public Generic(@JsonProperty("clientSecret") String clientSecret, @JsonProperty("usesPkce") Boolean usesPkce, @JsonProperty("authUrl") String authUrl, @JsonProperty("tokenUrl") String tokenUrl, @JsonProperty("userinfoUrl") String userinfoUrl) {
            this.clientSecret = clientSecret;
            this.usesPkce = usesPkce;
            this.authUrl = authUrl;
            this.tokenUrl = tokenUrl;
            this.userinfoUrl = userinfoUrl;
        }
    }
}