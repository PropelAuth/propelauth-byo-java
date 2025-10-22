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
    @JsonSubTypes.Type(value = DeregisterPasskeyException.PasskeyNotFound.class, name = "PasskeyNotFound"),
    @JsonSubTypes.Type(value = DeregisterPasskeyException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class DeregisterPasskeyException extends Exception {
    protected DeregisterPasskeyException(String message) {
        super(message);
    }
    
    public static class PasskeyNotFound extends DeregisterPasskeyException {
        public PasskeyNotFound() {
            super("Passkey not found");
        }
    }
    @Getter
    public static class UnexpectedError extends DeregisterPasskeyException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}