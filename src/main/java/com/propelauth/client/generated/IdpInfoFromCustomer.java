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
    @JsonSubTypes.Type(value = IdpInfoFromCustomer.MicrosoftEntra.class, name = "MicrosoftEntra"),
    @JsonSubTypes.Type(value = IdpInfoFromCustomer.Okta.class, name = "Okta"),
    @JsonSubTypes.Type(value = IdpInfoFromCustomer.Generic.class, name = "Generic")
})
public abstract class IdpInfoFromCustomer {

    @Builder
    @Getter
    public static class MicrosoftEntra extends IdpInfoFromCustomer {
        @NonNull @JsonProperty("clientId") private final String clientId;
        @NonNull @JsonProperty("clientSecret") private final String clientSecret;
        @NonNull @JsonProperty("usesPkce") private final Boolean usesPkce;
        @NonNull @JsonProperty("tenantId") private final String tenantId;
        

        @JsonCreator
        public MicrosoftEntra(@NonNull @JsonProperty("clientId") String clientId, @NonNull @JsonProperty("clientSecret") String clientSecret, @NonNull @JsonProperty("usesPkce") Boolean usesPkce, @NonNull @JsonProperty("tenantId") String tenantId) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.usesPkce = usesPkce;
            this.tenantId = tenantId;
        }
    }
    @Builder
    @Getter
    public static class Okta extends IdpInfoFromCustomer {
        @NonNull @JsonProperty("clientId") private final String clientId;
        @NonNull @JsonProperty("clientSecret") private final String clientSecret;
        @NonNull @JsonProperty("usesPkce") private final Boolean usesPkce;
        @NonNull @JsonProperty("ssoDomain") private final String ssoDomain;
        

        @JsonCreator
        public Okta(@NonNull @JsonProperty("clientId") String clientId, @NonNull @JsonProperty("clientSecret") String clientSecret, @NonNull @JsonProperty("usesPkce") Boolean usesPkce, @NonNull @JsonProperty("ssoDomain") String ssoDomain) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.usesPkce = usesPkce;
            this.ssoDomain = ssoDomain;
        }
    }
    @Builder
    @Getter
    public static class Generic extends IdpInfoFromCustomer {
        @NonNull @JsonProperty("clientId") private final String clientId;
        @NonNull @JsonProperty("clientSecret") private final String clientSecret;
        @NonNull @JsonProperty("usesPkce") private final Boolean usesPkce;
        @NonNull @JsonProperty("authUrl") private final String authUrl;
        @NonNull @JsonProperty("tokenUrl") private final String tokenUrl;
        @NonNull @JsonProperty("userinfoUrl") private final String userinfoUrl;
        

        @JsonCreator
        public Generic(@NonNull @JsonProperty("clientId") String clientId, @NonNull @JsonProperty("clientSecret") String clientSecret, @NonNull @JsonProperty("usesPkce") Boolean usesPkce, @NonNull @JsonProperty("authUrl") String authUrl, @NonNull @JsonProperty("tokenUrl") String tokenUrl, @NonNull @JsonProperty("userinfoUrl") String userinfoUrl) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.usesPkce = usesPkce;
            this.authUrl = authUrl;
            this.tokenUrl = tokenUrl;
            this.userinfoUrl = userinfoUrl;
        }
    }
}