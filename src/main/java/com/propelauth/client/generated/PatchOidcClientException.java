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
    @JsonSubTypes.Type(value = PatchOidcClientException.OidcClientNotFound.class, name = "OidcClientNotFound"),
    @JsonSubTypes.Type(value = PatchOidcClientException.InvalidFields.class, name = "InvalidFields"),
    @JsonSubTypes.Type(value = PatchOidcClientException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class PatchOidcClientException extends Exception {
    protected PatchOidcClientException(String message) {
        super(message);
    }
    
    public static class OidcClientNotFound extends PatchOidcClientException {
        public OidcClientNotFound() {
            super("Oidc client not found");
        }
    }
    @Getter
    public static class InvalidFields extends PatchOidcClientException {
        @NonNull @JsonProperty("details") private final PatchOidcClientErrorInvalidFieldsDetails details;
        
        
        @JsonCreator
        public InvalidFields(@NonNull @JsonProperty("details") PatchOidcClientErrorInvalidFieldsDetails details) {
            super("Invalid fields");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends PatchOidcClientException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}