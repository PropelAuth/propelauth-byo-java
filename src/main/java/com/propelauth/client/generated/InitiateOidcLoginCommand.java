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

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
    @JsonSubTypes.Type(value = InitiateOidcLoginCommand.oidcClientId.class),
    @JsonSubTypes.Type(value = InitiateOidcLoginCommand.customerId.class)
})
public abstract class InitiateOidcLoginCommand {

    @Builder
    @Getter
    public static class oidcClientId extends InitiateOidcLoginCommand {
        @JsonProperty("postLoginRedirectUrl") private final String postLoginRedirectUrl;
        @NonNull @JsonProperty("oidcClientId") private final String oidcClientId;
        

        @JsonCreator
        public oidcClientId(@JsonProperty("postLoginRedirectUrl") String postLoginRedirectUrl, @NonNull @JsonProperty("oidcClientId") String oidcClientId) {
            this.postLoginRedirectUrl = postLoginRedirectUrl;
            this.oidcClientId = oidcClientId;
        }
    }
    @Builder
    @Getter
    public static class customerId extends InitiateOidcLoginCommand {
        @JsonProperty("postLoginRedirectUrl") private final String postLoginRedirectUrl;
        @NonNull @JsonProperty("customerId") private final String customerId;
        

        @JsonCreator
        public customerId(@JsonProperty("postLoginRedirectUrl") String postLoginRedirectUrl, @NonNull @JsonProperty("customerId") String customerId) {
            this.postLoginRedirectUrl = postLoginRedirectUrl;
            this.customerId = customerId;
        }
    }
}