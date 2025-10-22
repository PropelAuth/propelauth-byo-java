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
    @JsonSubTypes.Type(value = CompleteOidcLoginException.LoginBlockedByEmailAllowlist.class, name = "LoginBlockedByEmailAllowlist"),
    @JsonSubTypes.Type(value = CompleteOidcLoginException.ScimUserNotFoundWhereExpected.class, name = "ScimUserNotFoundWhereExpected"),
    @JsonSubTypes.Type(value = CompleteOidcLoginException.ScimUserNotActive.class, name = "ScimUserNotActive"),
    @JsonSubTypes.Type(value = CompleteOidcLoginException.InvalidLoginRequest.class, name = "InvalidLoginRequest"),
    @JsonSubTypes.Type(value = CompleteOidcLoginException.IdentityProviderError.class, name = "IdentityProviderError"),
    @JsonSubTypes.Type(value = CompleteOidcLoginException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class CompleteOidcLoginException extends Exception {
    protected CompleteOidcLoginException(String message) {
        super(message);
    }
    
    public static class LoginBlockedByEmailAllowlist extends CompleteOidcLoginException {
        public LoginBlockedByEmailAllowlist() {
            super("Login blocked by email allowlist");
        }
    }
    public static class ScimUserNotFoundWhereExpected extends CompleteOidcLoginException {
        public ScimUserNotFoundWhereExpected() {
            super("Scim user not found where expected");
        }
    }
    public static class ScimUserNotActive extends CompleteOidcLoginException {
        public ScimUserNotActive() {
            super("Scim user not active");
        }
    }
    @Getter
    public static class InvalidLoginRequest extends CompleteOidcLoginException {
        @NonNull @JsonProperty("details") private final OidcLoginRequestError details;
        
        
        @JsonCreator
        public InvalidLoginRequest(@NonNull @JsonProperty("details") OidcLoginRequestError details) {
            super("Invalid login request");
            this.details = details;
        }
    }
    @Getter
    public static class IdentityProviderError extends CompleteOidcLoginException {
        @NonNull @JsonProperty("details") private final IdentityProviderError details;
        
        
        @JsonCreator
        public IdentityProviderError(@NonNull @JsonProperty("details") IdentityProviderError details) {
            super("Identity provider error");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends CompleteOidcLoginException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}