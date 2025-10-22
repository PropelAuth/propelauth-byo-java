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
    @JsonSubTypes.Type(value = PatchScimConnectionException.ScimConnectionNotFound.class, name = "ScimConnectionNotFound"),
    @JsonSubTypes.Type(value = PatchScimConnectionException.DisplayNameInvalid.class, name = "DisplayNameInvalid"),
    @JsonSubTypes.Type(value = PatchScimConnectionException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class PatchScimConnectionException extends Exception {
    protected PatchScimConnectionException(String message) {
        super(message);
    }
    
    public static class ScimConnectionNotFound extends PatchScimConnectionException {
        public ScimConnectionNotFound() {
            super("Scim connection not found");
        }
    }
    @Getter
    public static class DisplayNameInvalid extends PatchScimConnectionException {
        @NonNull @JsonProperty("details") private final PatchScimConnectionErrorDisplayNameInvalidDetails details;
        
        
        @JsonCreator
        public DisplayNameInvalid(@NonNull @JsonProperty("details") PatchScimConnectionErrorDisplayNameInvalidDetails details) {
            super("Display name invalid");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends PatchScimConnectionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}