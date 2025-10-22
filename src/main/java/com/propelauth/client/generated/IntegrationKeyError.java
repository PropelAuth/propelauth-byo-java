package com.propelauth.client.generated;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Value;
import lombok.NonNull;
import lombok.Builder;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IntegrationKeyError.InvalidPrefix.class, name = "InvalidPrefix"),
    @JsonSubTypes.Type(value = IntegrationKeyError.IntegrationKeyNotFound.class, name = "IntegrationKeyNotFound"),
    @JsonSubTypes.Type(value = IntegrationKeyError.NoIntegrationKeyFoundInHeader.class, name = "NoIntegrationKeyFoundInHeader"),
    @JsonSubTypes.Type(value = IntegrationKeyError.CommandNotAllowed.class, name = "CommandNotAllowed"),
    @JsonSubTypes.Type(value = IntegrationKeyError.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class IntegrationKeyError {

    @Builder
    @Getter
    public static class InvalidPrefix extends IntegrationKeyError {
        @NonNull @JsonProperty("details") private final String details;
        

        @JsonCreator
        public InvalidPrefix(@NonNull @JsonProperty("details") String details) {
            this.details = details;
        }
    }
    public static class IntegrationKeyNotFound extends IntegrationKeyError {
        // Empty variant
    }
    public static class NoIntegrationKeyFoundInHeader extends IntegrationKeyError {
        // Empty variant
    }
    @Builder
    @Getter
    public static class CommandNotAllowed extends IntegrationKeyError {
        @NonNull @JsonProperty("details") private final IntegrationKeyErrorCommandNotAllowedDetails details;
        

        @JsonCreator
        public CommandNotAllowed(@NonNull @JsonProperty("details") IntegrationKeyErrorCommandNotAllowedDetails details) {
            this.details = details;
        }
    }
    @Builder
    @Getter
    public static class UnexpectedError extends IntegrationKeyError {
        @NonNull @JsonProperty("details") private final String details;
        

        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            this.details = details;
        }
    }
}