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
    @JsonSubTypes.Type(value = CreateImpersonationSessionException.ImpersonationDisabled.class, name = "ImpersonationDisabled"),
    @JsonSubTypes.Type(value = CreateImpersonationSessionException.UnauthorizedEmployee.class, name = "UnauthorizedEmployee"),
    @JsonSubTypes.Type(value = CreateImpersonationSessionException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class CreateImpersonationSessionException extends Exception {
    protected CreateImpersonationSessionException(String message) {
        super(message);
    }
    
    public static class ImpersonationDisabled extends CreateImpersonationSessionException {
        public ImpersonationDisabled() {
            super("Impersonation disabled");
        }
    }
    @Getter
    public static class UnauthorizedEmployee extends CreateImpersonationSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnauthorizedEmployee(@NonNull @JsonProperty("details") String details) {
            super("Unauthorized employee");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends CreateImpersonationSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}