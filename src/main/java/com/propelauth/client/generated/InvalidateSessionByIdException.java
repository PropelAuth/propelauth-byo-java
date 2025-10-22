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
    @JsonSubTypes.Type(value = InvalidateSessionByIdException.SessionNotFound.class, name = "SessionNotFound"),
    @JsonSubTypes.Type(value = InvalidateSessionByIdException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class InvalidateSessionByIdException extends Exception {
    protected InvalidateSessionByIdException(String message) {
        super(message);
    }
    
    public static class SessionNotFound extends InvalidateSessionByIdException {
        public SessionNotFound() {
            super("Session not found");
        }
    }
    @Getter
    public static class UnexpectedError extends InvalidateSessionByIdException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}