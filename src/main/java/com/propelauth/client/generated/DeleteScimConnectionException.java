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
    @JsonSubTypes.Type(value = DeleteScimConnectionException.ScimConnectionNotFound.class, name = "ScimConnectionNotFound"),
    @JsonSubTypes.Type(value = DeleteScimConnectionException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class DeleteScimConnectionException extends Exception {
    protected DeleteScimConnectionException(String message) {
        super(message);
    }
    
    public static class ScimConnectionNotFound extends DeleteScimConnectionException {
        public ScimConnectionNotFound() {
            super("Scim connection not found");
        }
    }
    @Getter
    public static class UnexpectedError extends DeleteScimConnectionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}