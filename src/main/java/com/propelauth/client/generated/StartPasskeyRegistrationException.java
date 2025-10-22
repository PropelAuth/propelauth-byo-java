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
    @JsonSubTypes.Type(value = StartPasskeyRegistrationException.CannotParseAdditionalAllowedOrigin.class, name = "CannotParseAdditionalAllowedOrigin"),
    @JsonSubTypes.Type(value = StartPasskeyRegistrationException.TooManyPasskeys.class, name = "TooManyPasskeys"),
    @JsonSubTypes.Type(value = StartPasskeyRegistrationException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class StartPasskeyRegistrationException extends Exception {
    protected StartPasskeyRegistrationException(String message) {
        super(message);
    }
    
    public static class CannotParseAdditionalAllowedOrigin extends StartPasskeyRegistrationException {
        public CannotParseAdditionalAllowedOrigin() {
            super("Cannot parse additional allowed origin");
        }
    }
    @Getter
    public static class TooManyPasskeys extends StartPasskeyRegistrationException {
        @NonNull @JsonProperty("details") private final StartPasskeyRegistrationErrorTooManyPasskeysDetails details;
        
        
        @JsonCreator
        public TooManyPasskeys(@NonNull @JsonProperty("details") StartPasskeyRegistrationErrorTooManyPasskeysDetails details) {
            super("Too many passkeys");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends StartPasskeyRegistrationException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}