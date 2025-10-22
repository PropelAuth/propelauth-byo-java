package com.propelauth.client.generated;

import lombok.Getter;
import lombok.Value;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = FetchOidcClientException.OidcClientNotFound.class, name = "OidcClientNotFound"),
    @JsonSubTypes.Type(value = FetchOidcClientException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class FetchOidcClientException extends Exception {
    protected FetchOidcClientException(String message) {
        super(message);
    }
    
    public static class OidcClientNotFound extends FetchOidcClientException {
        public OidcClientNotFound() {
            super("Oidc client not found");
        }
    }
    @Getter
    public static class UnexpectedError extends FetchOidcClientException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}