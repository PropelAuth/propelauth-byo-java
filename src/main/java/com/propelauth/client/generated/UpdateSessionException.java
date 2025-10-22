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
    @JsonSubTypes.Type(value = UpdateSessionException.SessionNotFound.class, name = "SessionNotFound"),
    @JsonSubTypes.Type(value = UpdateSessionException.ConflictingMetadataOptions.class, name = "ConflictingMetadataOptions"),
    @JsonSubTypes.Type(value = UpdateSessionException.InvalidTagFormat.class, name = "InvalidTagFormat"),
    @JsonSubTypes.Type(value = UpdateSessionException.CannotModifyOnCreateOnlyTags.class, name = "CannotModifyOnCreateOnlyTags"),
    @JsonSubTypes.Type(value = UpdateSessionException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class UpdateSessionException extends Exception {
    protected UpdateSessionException(String message) {
        super(message);
    }
    
    public static class SessionNotFound extends UpdateSessionException {
        public SessionNotFound() {
            super("Session not found");
        }
    }
    public static class ConflictingMetadataOptions extends UpdateSessionException {
        public ConflictingMetadataOptions() {
            super("Conflicting metadata options");
        }
    }
    @Getter
    public static class InvalidTagFormat extends UpdateSessionException {
        @NonNull @JsonProperty("details") private final InvalidTagError details;
        
        
        @JsonCreator
        public InvalidTagFormat(@NonNull @JsonProperty("details") InvalidTagError details) {
            super("Invalid tag format");
            this.details = details;
        }
    }
    @Getter
    public static class CannotModifyOnCreateOnlyTags extends UpdateSessionException {
        @NonNull @JsonProperty("details") private final UpdateSessionErrorCannotModifyOnCreateOnlyTagsDetails details;
        
        
        @JsonCreator
        public CannotModifyOnCreateOnlyTags(@NonNull @JsonProperty("details") UpdateSessionErrorCannotModifyOnCreateOnlyTagsDetails details) {
            super("Cannot modify on create only tags");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends UpdateSessionException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}