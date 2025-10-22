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
    @JsonSubTypes.Type(value = GetScimUsersException.ScimConnectionNotFound.class, name = "ScimConnectionNotFound"),
    @JsonSubTypes.Type(value = GetScimUsersException.InvalidQueryField.class, name = "InvalidQueryField"),
    @JsonSubTypes.Type(value = GetScimUsersException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class GetScimUsersException extends Exception {
    protected GetScimUsersException(String message) {
        super(message);
    }
    
    public static class ScimConnectionNotFound extends GetScimUsersException {
        public ScimConnectionNotFound() {
            super("Scim connection not found");
        }
    }
    @Getter
    public static class InvalidQueryField extends GetScimUsersException {
        @NonNull @JsonProperty("details") private final GetScimUsersErrorInvalidQueryFieldDetails details;
        
        
        @JsonCreator
        public InvalidQueryField(@NonNull @JsonProperty("details") GetScimUsersErrorInvalidQueryFieldDetails details) {
            super("Invalid query field");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends GetScimUsersException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}