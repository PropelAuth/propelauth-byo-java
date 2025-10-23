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
    @JsonSubTypes.Type(value = ValidateAndRefreshSessionException.InvalidSessionToken.class, name = "InvalidSessionToken"),
    @JsonSubTypes.Type(value = ValidateAndRefreshSessionException.IpAddressError.class, name = "IpAddressError"),
    @JsonSubTypes.Type(value = ValidateAndRefreshSessionException.NewDeviceChallengeRequired.class, name = "NewDeviceChallengeRequired"),
    @JsonSubTypes.Type(value = ValidateAndRefreshSessionException.DeviceVerificationRequired.class, name = "DeviceVerificationRequired"),
    @JsonSubTypes.Type(value = ValidateAndRefreshSessionException.DeviceVerificationFailed.class, name = "DeviceVerificationFailed"),
    @JsonSubTypes.Type(value = ValidateAndRefreshSessionException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class ValidateAndRefreshSessionException extends Exception {
    protected ValidateAndRefreshSessionException(String message) {
        super(message);
    }
    
    @Getter
    public static class InvalidSessionToken extends ValidateAndRefreshSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public InvalidSessionToken(@NonNull @JsonProperty("details") String details) {
            super("Invalid session token");
            this.details = details;
        }
    }
    @Getter
    public static class IpAddressError extends ValidateAndRefreshSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public IpAddressError(@NonNull @JsonProperty("details") String details) {
            super("IP address error");
            this.details = details;
        }
    }
    @Getter
    public static class NewDeviceChallengeRequired extends ValidateAndRefreshSessionException {
        @NonNull @JsonProperty("details") private final ValidateAndRefreshSessionErrorNewDeviceChallengeRequiredDetails details;
        
        
        @JsonCreator
        public NewDeviceChallengeRequired(@NonNull @JsonProperty("details") ValidateAndRefreshSessionErrorNewDeviceChallengeRequiredDetails details) {
            super("New device challenge required");
            this.details = details;
        }
    }
    public static class DeviceVerificationRequired extends ValidateAndRefreshSessionException {
        public DeviceVerificationRequired() {
            super("Device verification required");
        }
    }
    public static class DeviceVerificationFailed extends ValidateAndRefreshSessionException {
        public DeviceVerificationFailed() {
            super("Device verification failed");
        }
    }
    @Getter
    public static class UnexpectedError extends ValidateAndRefreshSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}