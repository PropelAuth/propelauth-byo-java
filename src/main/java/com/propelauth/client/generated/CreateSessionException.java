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
    @JsonSubTypes.Type(value = CreateSessionException.SessionLimitExceeded.class, name = "SessionLimitExceeded"),
    @JsonSubTypes.Type(value = CreateSessionException.IpAddressError.class, name = "IpAddressError"),
    @JsonSubTypes.Type(value = CreateSessionException.TagParseError.class, name = "TagParseError"),
    @JsonSubTypes.Type(value = CreateSessionException.InvalidDeviceRegistration.class, name = "InvalidDeviceRegistration"),
    @JsonSubTypes.Type(value = CreateSessionException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class CreateSessionException extends Exception {
    protected CreateSessionException(String message) {
        super(message);
    }
    
    @Getter
    public static class SessionLimitExceeded extends CreateSessionException {
        @NonNull @JsonProperty("details") private final CreateSessionErrorSessionLimitExceededDetails details;
        
        
        @JsonCreator
        public SessionLimitExceeded(@NonNull @JsonProperty("details") CreateSessionErrorSessionLimitExceededDetails details) {
            super("Session limit exceeded");
            this.details = details;
        }
    }
    @Getter
    public static class IpAddressError extends CreateSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public IpAddressError(@NonNull @JsonProperty("details") String details) {
            super("IP address error");
            this.details = details;
        }
    }
    @Getter
    public static class TagParseError extends CreateSessionException {
        @NonNull @JsonProperty("details") private final InvalidTagError details;
        
        
        @JsonCreator
        public TagParseError(@NonNull @JsonProperty("details") InvalidTagError details) {
            super("Tag parse error");
            this.details = details;
        }
    }
    public static class InvalidDeviceRegistration extends CreateSessionException {
        public InvalidDeviceRegistration() {
            super("Invalid device registration");
        }
    }
    @Getter
    public static class UnexpectedError extends CreateSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}