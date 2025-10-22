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
    @JsonSubTypes.Type(value = CreateOidcClientException.InvalidFields.class, name = "InvalidFields"),
    @JsonSubTypes.Type(value = CreateOidcClientException.ClientIdAlreadyTaken.class, name = "ClientIdAlreadyTaken"),
    @JsonSubTypes.Type(value = CreateOidcClientException.CustomerIdAlreadyTakenForEoidcClient.class, name = "CustomerIdAlreadyTakenForEoidcClient"),
    @JsonSubTypes.Type(value = CreateOidcClientException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class CreateOidcClientException extends Exception {
    protected CreateOidcClientException(String message) {
        super(message);
    }
    
    @Getter
    public static class InvalidFields extends CreateOidcClientException {
        @NonNull @JsonProperty("details") private final CreateOidcClientErrorInvalidFieldsDetails details;
        
        
        @JsonCreator
        public InvalidFields(@NonNull @JsonProperty("details") CreateOidcClientErrorInvalidFieldsDetails details) {
            super("Invalid fields");
            this.details = details;
        }
    }
    public static class ClientIdAlreadyTaken extends CreateOidcClientException {
        public ClientIdAlreadyTaken() {
            super("Client id already taken");
        }
    }
    public static class CustomerIdAlreadyTakenForEoidcClient extends CreateOidcClientException {
        public CustomerIdAlreadyTakenForEoidcClient() {
            super("Customer id already taken for eoidc client");
        }
    }
    @Getter
    public static class UnexpectedError extends CreateOidcClientException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}