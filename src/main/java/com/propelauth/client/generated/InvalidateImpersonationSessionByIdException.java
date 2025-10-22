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
    @JsonSubTypes.Type(value = InvalidateImpersonationSessionByIdException.SessionNotFound.class, name = "SessionNotFound"),
    @JsonSubTypes.Type(value = InvalidateImpersonationSessionByIdException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class InvalidateImpersonationSessionByIdException extends Exception {
    protected InvalidateImpersonationSessionByIdException(String message) {
        super(message);
    }
    
    public static class SessionNotFound extends InvalidateImpersonationSessionByIdException {
        public SessionNotFound() {
            super("Session not found");
        }
    }
    @Getter
    public static class UnexpectedError extends InvalidateImpersonationSessionByIdException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}