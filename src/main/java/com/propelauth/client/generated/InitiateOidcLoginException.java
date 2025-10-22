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
    @JsonSubTypes.Type(value = InitiateOidcLoginException.ClientNotFound.class, name = "ClientNotFound"),
    @JsonSubTypes.Type(value = InitiateOidcLoginException.RedirectUrlInvalid.class, name = "RedirectUrlInvalid"),
    @JsonSubTypes.Type(value = InitiateOidcLoginException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class InitiateOidcLoginException extends Exception {
    protected InitiateOidcLoginException(String message) {
        super(message);
    }
    
    public static class ClientNotFound extends InitiateOidcLoginException {
        public ClientNotFound() {
            super("Client not found");
        }
    }
    @Getter
    public static class RedirectUrlInvalid extends InitiateOidcLoginException {
        @NonNull @JsonProperty("details") private final InitiateOidcLoginErrorRedirectUrlInvalidDetails details;
        
        
        @JsonCreator
        public RedirectUrlInvalid(@NonNull @JsonProperty("details") InitiateOidcLoginErrorRedirectUrlInvalidDetails details) {
            super("Redirect url invalid");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends InitiateOidcLoginException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}