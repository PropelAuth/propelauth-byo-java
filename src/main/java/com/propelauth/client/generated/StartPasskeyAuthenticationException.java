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
    @JsonSubTypes.Type(value = StartPasskeyAuthenticationException.CannotParseAdditionalAllowedOrigin.class, name = "CannotParseAdditionalAllowedOrigin"),
    @JsonSubTypes.Type(value = StartPasskeyAuthenticationException.NoPasskeysRegisteredForUser.class, name = "NoPasskeysRegisteredForUser"),
    @JsonSubTypes.Type(value = StartPasskeyAuthenticationException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class StartPasskeyAuthenticationException extends Exception {
    protected StartPasskeyAuthenticationException(String message) {
        super(message);
    }
    
    public static class CannotParseAdditionalAllowedOrigin extends StartPasskeyAuthenticationException {
        public CannotParseAdditionalAllowedOrigin() {
            super("Cannot parse additional allowed origin");
        }
    }
    public static class NoPasskeysRegisteredForUser extends StartPasskeyAuthenticationException {
        public NoPasskeysRegisteredForUser() {
            super("No passkeys registered for user");
        }
    }
    @Getter
    public static class UnexpectedError extends StartPasskeyAuthenticationException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}