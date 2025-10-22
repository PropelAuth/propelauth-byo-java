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
    @JsonSubTypes.Type(value = IdentityProvider.MicrosoftEntra.class, name = "MicrosoftEntra"),
    @JsonSubTypes.Type(value = IdentityProvider.Okta.class, name = "Okta"),
    @JsonSubTypes.Type(value = IdentityProvider.Generic.class, name = "Generic")
})
public abstract class IdentityProvider {

    @Builder
    @Getter
    public static class MicrosoftEntra extends IdentityProvider {
        @NonNull @JsonProperty("tenantId") private final String tenantId;
        

        @JsonCreator
        public MicrosoftEntra(@NonNull @JsonProperty("tenantId") String tenantId) {
            this.tenantId = tenantId;
        }
    }
    @Builder
    @Getter
    public static class Okta extends IdentityProvider {
        @NonNull @JsonProperty("ssoDomain") private final String ssoDomain;
        

        @JsonCreator
        public Okta(@NonNull @JsonProperty("ssoDomain") String ssoDomain) {
            this.ssoDomain = ssoDomain;
        }
    }
    @Builder
    @Getter
    public static class Generic extends IdentityProvider {
        @NonNull @JsonProperty("authUrl") private final String authUrl;
        @NonNull @JsonProperty("tokenUrl") private final String tokenUrl;
        @NonNull @JsonProperty("userinfoUrl") private final String userinfoUrl;
        

        @JsonCreator
        public Generic(@NonNull @JsonProperty("authUrl") String authUrl, @NonNull @JsonProperty("tokenUrl") String tokenUrl, @NonNull @JsonProperty("userinfoUrl") String userinfoUrl) {
            this.authUrl = authUrl;
            this.tokenUrl = tokenUrl;
            this.userinfoUrl = userinfoUrl;
        }
    }
}