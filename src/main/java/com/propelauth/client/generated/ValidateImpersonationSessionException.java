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
    @JsonSubTypes.Type(value = ValidateImpersonationSessionException.ImpersonationNotEnabled.class, name = "ImpersonationNotEnabled"),
    @JsonSubTypes.Type(value = ValidateImpersonationSessionException.InvalidImpersonationToken.class, name = "InvalidImpersonationToken"),
    @JsonSubTypes.Type(value = ValidateImpersonationSessionException.SessionNotFound.class, name = "SessionNotFound"),
    @JsonSubTypes.Type(value = ValidateImpersonationSessionException.IpAddressMismatch.class, name = "IpAddressMismatch"),
    @JsonSubTypes.Type(value = ValidateImpersonationSessionException.UserAgentMismatch.class, name = "UserAgentMismatch"),
    @JsonSubTypes.Type(value = ValidateImpersonationSessionException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class ValidateImpersonationSessionException extends Exception {
    protected ValidateImpersonationSessionException(String message) {
        super(message);
    }
    
    public static class ImpersonationNotEnabled extends ValidateImpersonationSessionException {
        public ImpersonationNotEnabled() {
            super("Impersonation not enabled");
        }
    }
    @Getter
    public static class InvalidImpersonationToken extends ValidateImpersonationSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public InvalidImpersonationToken(@NonNull @JsonProperty("details") String details) {
            super("Invalid impersonation token");
            this.details = details;
        }
    }
    public static class SessionNotFound extends ValidateImpersonationSessionException {
        public SessionNotFound() {
            super("Session not found");
        }
    }
    public static class IpAddressMismatch extends ValidateImpersonationSessionException {
        public IpAddressMismatch() {
            super("Ip address mismatch");
        }
    }
    public static class UserAgentMismatch extends ValidateImpersonationSessionException {
        public UserAgentMismatch() {
            super("User agent mismatch");
        }
    }
    @Getter
    public static class UnexpectedError extends ValidateImpersonationSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}