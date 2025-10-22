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
    @JsonSubTypes.Type(value = FinishPasskeyAuthenticationException.CannotParseAdditionalAllowedOrigin.class, name = "CannotParseAdditionalAllowedOrigin"),
    @JsonSubTypes.Type(value = FinishPasskeyAuthenticationException.NoAuthenticationChallengeFound.class, name = "NoAuthenticationChallengeFound"),
    @JsonSubTypes.Type(value = FinishPasskeyAuthenticationException.OriginNotAllowed.class, name = "OriginNotAllowed"),
    @JsonSubTypes.Type(value = FinishPasskeyAuthenticationException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class FinishPasskeyAuthenticationException extends Exception {
    protected FinishPasskeyAuthenticationException(String message) {
        super(message);
    }
    
    public static class CannotParseAdditionalAllowedOrigin extends FinishPasskeyAuthenticationException {
        public CannotParseAdditionalAllowedOrigin() {
            super("Cannot parse additional allowed origin");
        }
    }
    public static class NoAuthenticationChallengeFound extends FinishPasskeyAuthenticationException {
        public NoAuthenticationChallengeFound() {
            super("No authentication challenge found");
        }
    }
    @Getter
    public static class OriginNotAllowed extends FinishPasskeyAuthenticationException {
        @NonNull @JsonProperty("details") private final FinishPasskeyAuthenticationErrorOriginNotAllowedDetails details;
        
        
        @JsonCreator
        public OriginNotAllowed(@NonNull @JsonProperty("details") FinishPasskeyAuthenticationErrorOriginNotAllowedDetails details) {
            super("Origin not allowed");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends FinishPasskeyAuthenticationException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}