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
    @JsonSubTypes.Type(value = FinishPasskeyRegistrationException.CannotParseAdditionalAllowedOrigin.class, name = "CannotParseAdditionalAllowedOrigin"),
    @JsonSubTypes.Type(value = FinishPasskeyRegistrationException.NoRegistrationChallengeFound.class, name = "NoRegistrationChallengeFound"),
    @JsonSubTypes.Type(value = FinishPasskeyRegistrationException.OriginNotAllowed.class, name = "OriginNotAllowed"),
    @JsonSubTypes.Type(value = FinishPasskeyRegistrationException.PasskeyForUserAlreadyExists.class, name = "PasskeyForUserAlreadyExists"),
    @JsonSubTypes.Type(value = FinishPasskeyRegistrationException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class FinishPasskeyRegistrationException extends Exception {
    protected FinishPasskeyRegistrationException(String message) {
        super(message);
    }
    
    public static class CannotParseAdditionalAllowedOrigin extends FinishPasskeyRegistrationException {
        public CannotParseAdditionalAllowedOrigin() {
            super("Cannot parse additional allowed origin");
        }
    }
    public static class NoRegistrationChallengeFound extends FinishPasskeyRegistrationException {
        public NoRegistrationChallengeFound() {
            super("No registration challenge found");
        }
    }
    @Getter
    public static class OriginNotAllowed extends FinishPasskeyRegistrationException {
        @NonNull @JsonProperty("details") private final FinishPasskeyRegistrationErrorOriginNotAllowedDetails details;
        
        
        @JsonCreator
        public OriginNotAllowed(@NonNull @JsonProperty("details") FinishPasskeyRegistrationErrorOriginNotAllowedDetails details) {
            super("Origin not allowed");
            this.details = details;
        }
    }
    public static class PasskeyForUserAlreadyExists extends FinishPasskeyRegistrationException {
        public PasskeyForUserAlreadyExists() {
            super("Passkey for user already exists");
        }
    }
    @Getter
    public static class UnexpectedError extends FinishPasskeyRegistrationException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}