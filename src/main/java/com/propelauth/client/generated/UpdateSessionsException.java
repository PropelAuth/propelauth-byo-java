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
    @JsonSubTypes.Type(value = UpdateSessionsException.ConflictingMetadataOptions.class, name = "ConflictingMetadataOptions"),
    @JsonSubTypes.Type(value = UpdateSessionsException.InvalidTagFormat.class, name = "InvalidTagFormat"),
    @JsonSubTypes.Type(value = UpdateSessionsException.CannotModifyOnCreateOnlyTags.class, name = "CannotModifyOnCreateOnlyTags"),
    @JsonSubTypes.Type(value = UpdateSessionsException.UpdatingTooManySessionsAtOnce.class, name = "UpdatingTooManySessionsAtOnce"),
    @JsonSubTypes.Type(value = UpdateSessionsException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class UpdateSessionsException extends Exception {
    protected UpdateSessionsException(String message) {
        super(message);
    }
    
    public static class ConflictingMetadataOptions extends UpdateSessionsException {
        public ConflictingMetadataOptions() {
            super("Conflicting metadata options");
        }
    }
    @Getter
    public static class InvalidTagFormat extends UpdateSessionsException {
        @NonNull @JsonProperty("details") private final InvalidTagError details;
        
        
        @JsonCreator
        public InvalidTagFormat(@NonNull @JsonProperty("details") InvalidTagError details) {
            super("Invalid tag format");
            this.details = details;
        }
    }
    @Getter
    public static class CannotModifyOnCreateOnlyTags extends UpdateSessionsException {
        @NonNull @JsonProperty("details") private final UpdateSessionsErrorCannotModifyOnCreateOnlyTagsDetails details;
        
        
        @JsonCreator
        public CannotModifyOnCreateOnlyTags(@NonNull @JsonProperty("details") UpdateSessionsErrorCannotModifyOnCreateOnlyTagsDetails details) {
            super("Cannot modify on create only tags");
            this.details = details;
        }
    }
    public static class UpdatingTooManySessionsAtOnce extends UpdateSessionsException {
        public UpdatingTooManySessionsAtOnce() {
            super("Updating too many sessions at once");
        }
    }
    @Getter
    public static class UnexpectedError extends UpdateSessionsException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}