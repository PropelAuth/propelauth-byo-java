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
    @JsonSubTypes.Type(value = CreateScimConnectionException.InvalidFields.class, name = "InvalidFields"),
    @JsonSubTypes.Type(value = CreateScimConnectionException.ScimConnectionForCustomerIdAlreadyExists.class, name = "ScimConnectionForCustomerIdAlreadyExists"),
    @JsonSubTypes.Type(value = CreateScimConnectionException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class CreateScimConnectionException extends Exception {
    protected CreateScimConnectionException(String message) {
        super(message);
    }
    
    @Getter
    public static class InvalidFields extends CreateScimConnectionException {
        @NonNull @JsonProperty("details") private final CreateScimConnectionErrorInvalidFieldsDetails details;
        
        
        @JsonCreator
        public InvalidFields(@NonNull @JsonProperty("details") CreateScimConnectionErrorInvalidFieldsDetails details) {
            super("Invalid fields");
            this.details = details;
        }
    }
    public static class ScimConnectionForCustomerIdAlreadyExists extends CreateScimConnectionException {
        public ScimConnectionForCustomerIdAlreadyExists() {
            super("Scim connection for customer id already exists");
        }
    }
    @Getter
    public static class UnexpectedError extends CreateScimConnectionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}