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
    @JsonSubTypes.Type(value = RegisterDeviceException.SessionNotFound.class, name = "SessionNotFound"),
    @JsonSubTypes.Type(value = RegisterDeviceException.NewDeviceChallengeRequired.class, name = "NewDeviceChallengeRequired"),
    @JsonSubTypes.Type(value = RegisterDeviceException.InvalidDeviceRegistration.class, name = "InvalidDeviceRegistration"),
    @JsonSubTypes.Type(value = RegisterDeviceException.DeviceAlreadyRegistered.class, name = "DeviceAlreadyRegistered"),
    @JsonSubTypes.Type(value = RegisterDeviceException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class RegisterDeviceException extends Exception {
    protected RegisterDeviceException(String message) {
        super(message);
    }
    
    public static class SessionNotFound extends RegisterDeviceException {
        public SessionNotFound() {
            super("Session not found");
        }
    }
    @Getter
    public static class NewDeviceChallengeRequired extends RegisterDeviceException {
        @NonNull @JsonProperty("details") private final RegisterDeviceErrorNewDeviceChallengeRequiredDetails details;
        
        
        @JsonCreator
        public NewDeviceChallengeRequired(@NonNull @JsonProperty("details") RegisterDeviceErrorNewDeviceChallengeRequiredDetails details) {
            super("New device challenge required");
            this.details = details;
        }
    }
    public static class InvalidDeviceRegistration extends RegisterDeviceException {
        public InvalidDeviceRegistration() {
            super("Invalid device registration");
        }
    }
    public static class DeviceAlreadyRegistered extends RegisterDeviceException {
        public DeviceAlreadyRegistered() {
            super("Device already registered");
        }
    }
    @Getter
    public static class UnexpectedError extends RegisterDeviceException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}