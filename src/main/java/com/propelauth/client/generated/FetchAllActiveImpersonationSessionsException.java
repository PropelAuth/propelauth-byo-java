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
    @JsonSubTypes.Type(value = FetchAllActiveImpersonationSessionsException.InvalidPagingToken.class, name = "InvalidPagingToken"),
    @JsonSubTypes.Type(value = FetchAllActiveImpersonationSessionsException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class FetchAllActiveImpersonationSessionsException extends Exception {
    protected FetchAllActiveImpersonationSessionsException(String message) {
        super(message);
    }
    
    public static class InvalidPagingToken extends FetchAllActiveImpersonationSessionsException {
        public InvalidPagingToken() {
            super("Invalid paging token");
        }
    }
    @Getter
    public static class UnexpectedError extends FetchAllActiveImpersonationSessionsException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}