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
    @JsonSubTypes.Type(value = LinkScimUserException.ScimConnectionNotFound.class, name = "ScimConnectionNotFound"),
    @JsonSubTypes.Type(value = LinkScimUserException.UserNotFound.class, name = "UserNotFound"),
    @JsonSubTypes.Type(value = LinkScimUserException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class LinkScimUserException extends Exception {
    protected LinkScimUserException(String message) {
        super(message);
    }
    
    public static class ScimConnectionNotFound extends LinkScimUserException {
        public ScimConnectionNotFound() {
            super("Scim connection not found");
        }
    }
    public static class UserNotFound extends LinkScimUserException {
        public UserNotFound() {
            super("User not found");
        }
    }
    @Getter
    public static class UnexpectedError extends LinkScimUserException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}