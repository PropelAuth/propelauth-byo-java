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
    @JsonSubTypes.Type(value = GetScimUserException.ScimConnectionNotFound.class, name = "ScimConnectionNotFound"),
    @JsonSubTypes.Type(value = GetScimUserException.UserNotFound.class, name = "UserNotFound"),
    @JsonSubTypes.Type(value = GetScimUserException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class GetScimUserException extends Exception {
    protected GetScimUserException(String message) {
        super(message);
    }
    
    public static class ScimConnectionNotFound extends GetScimUserException {
        public ScimConnectionNotFound() {
            super("Scim connection not found");
        }
    }
    public static class UserNotFound extends GetScimUserException {
        public UserNotFound() {
            super("User not found");
        }
    }
    @Getter
    public static class UnexpectedError extends GetScimUserException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}