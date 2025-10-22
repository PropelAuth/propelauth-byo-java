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
    @JsonSubTypes.Type(value = CommitScimUserChangeException.ScimConnectionNotFound.class, name = "ScimConnectionNotFound"),
    @JsonSubTypes.Type(value = CommitScimUserChangeException.StagedChangeNotFound.class, name = "StagedChangeNotFound"),
    @JsonSubTypes.Type(value = CommitScimUserChangeException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class CommitScimUserChangeException extends Exception {
    protected CommitScimUserChangeException(String message) {
        super(message);
    }
    
    public static class ScimConnectionNotFound extends CommitScimUserChangeException {
        public ScimConnectionNotFound() {
            super("Scim connection not found");
        }
    }
    public static class StagedChangeNotFound extends CommitScimUserChangeException {
        public StagedChangeNotFound() {
            super("Staged change not found");
        }
    }
    @Getter
    public static class UnexpectedError extends CommitScimUserChangeException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}