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
    @JsonSubTypes.Type(value = ValidateSessionException.InvalidSessionToken.class, name = "InvalidSessionToken"),
    @JsonSubTypes.Type(value = ValidateSessionException.IpAddressError.class, name = "IpAddressError"),
    @JsonSubTypes.Type(value = ValidateSessionException.NewDeviceChallengeRequired.class, name = "NewDeviceChallengeRequired"),
    @JsonSubTypes.Type(value = ValidateSessionException.DeviceVerificationRequired.class, name = "DeviceVerificationRequired"),
    @JsonSubTypes.Type(value = ValidateSessionException.DeviceVerificationFailed.class, name = "DeviceVerificationFailed"),
    @JsonSubTypes.Type(value = ValidateSessionException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class ValidateSessionException extends Exception {
    protected ValidateSessionException(String message) {
        super(message);
    }
    
    @Getter
    public static class InvalidSessionToken extends ValidateSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public InvalidSessionToken(@NonNull @JsonProperty("details") String details) {
            super("Invalid session token");
            this.details = details;
        }
    }
    @Getter
    public static class IpAddressError extends ValidateSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public IpAddressError(@NonNull @JsonProperty("details") String details) {
            super("IP address error");
            this.details = details;
        }
    }
    @Getter
    public static class NewDeviceChallengeRequired extends ValidateSessionException {
        @NonNull @JsonProperty("details") private final ValidateSessionErrorNewDeviceChallengeRequiredDetails details;
        
        
        @JsonCreator
        public NewDeviceChallengeRequired(@NonNull @JsonProperty("details") ValidateSessionErrorNewDeviceChallengeRequiredDetails details) {
            super("New device challenge required");
            this.details = details;
        }
    }
    public static class DeviceVerificationRequired extends ValidateSessionException {
        public DeviceVerificationRequired() {
            super("Device verification required");
        }
    }
    public static class DeviceVerificationFailed extends ValidateSessionException {
        public DeviceVerificationFailed() {
            super("Device verification failed");
        }
    }
    @Getter
    public static class UnexpectedError extends ValidateSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}