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
    @JsonSubTypes.Type(value = ScimUnderlyingError.InvalidApiKey.class, name = "InvalidApiKey"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.InvalidPath.class, name = "InvalidPath"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.UserNotFound.class, name = "UserNotFound"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.GroupNotFound.class, name = "GroupNotFound"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.MissingRequiredField.class, name = "MissingRequiredField"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.CantRemoveRequiredField.class, name = "CantRemoveRequiredField"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.ScimUserIdAlreadyTaken.class, name = "ScimUserIdAlreadyTaken"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.InvalidBody.class, name = "InvalidBody"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.InvalidQueryField.class, name = "InvalidQueryField"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.InvalidPatchPath.class, name = "InvalidPatchPath"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.InvalidPatchOperation.class, name = "InvalidPatchOperation"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.InvalidPatchValue.class, name = "InvalidPatchValue"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.InvalidSchema.class, name = "InvalidSchema"),
    @JsonSubTypes.Type(value = ScimUnderlyingError.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class ScimUnderlyingError {

    public static class InvalidApiKey extends ScimUnderlyingError {
        // Empty variant
    }
    public static class InvalidPath extends ScimUnderlyingError {
        // Empty variant
    }
    public static class UserNotFound extends ScimUnderlyingError {
        // Empty variant
    }
    public static class GroupNotFound extends ScimUnderlyingError {
        // Empty variant
    }
    @Builder
    @Getter
    public static class MissingRequiredField extends ScimUnderlyingError {
        @NonNull @JsonProperty("details") private final ScimUnderlyingErrorMissingRequiredFieldDetails details;
        

        @JsonCreator
        public MissingRequiredField(@NonNull @JsonProperty("details") ScimUnderlyingErrorMissingRequiredFieldDetails details) {
            this.details = details;
        }
    }
    @Builder
    @Getter
    public static class CantRemoveRequiredField extends ScimUnderlyingError {
        @NonNull @JsonProperty("details") private final ScimUnderlyingErrorCantRemoveRequiredFieldDetails details;
        

        @JsonCreator
        public CantRemoveRequiredField(@NonNull @JsonProperty("details") ScimUnderlyingErrorCantRemoveRequiredFieldDetails details) {
            this.details = details;
        }
    }
    @Builder
    @Getter
    public static class ScimUserIdAlreadyTaken extends ScimUnderlyingError {
        @NonNull @JsonProperty("details") private final ScimUnderlyingErrorScimUserIdAlreadyTakenDetails details;
        

        @JsonCreator
        public ScimUserIdAlreadyTaken(@NonNull @JsonProperty("details") ScimUnderlyingErrorScimUserIdAlreadyTakenDetails details) {
            this.details = details;
        }
    }
    public static class InvalidBody extends ScimUnderlyingError {
        // Empty variant
    }
    @Builder
    @Getter
    public static class InvalidQueryField extends ScimUnderlyingError {
        @NonNull @JsonProperty("details") private final ScimUnderlyingErrorInvalidQueryFieldDetails details;
        

        @JsonCreator
        public InvalidQueryField(@NonNull @JsonProperty("details") ScimUnderlyingErrorInvalidQueryFieldDetails details) {
            this.details = details;
        }
    }
    public static class InvalidPatchPath extends ScimUnderlyingError {
        // Empty variant
    }
    public static class InvalidPatchOperation extends ScimUnderlyingError {
        // Empty variant
    }
    @Builder
    @Getter
    public static class InvalidPatchValue extends ScimUnderlyingError {
        @NonNull @JsonProperty("details") private final ScimUnderlyingErrorInvalidPatchValueDetails details;
        

        @JsonCreator
        public InvalidPatchValue(@NonNull @JsonProperty("details") ScimUnderlyingErrorInvalidPatchValueDetails details) {
            this.details = details;
        }
    }
    public static class InvalidSchema extends ScimUnderlyingError {
        // Empty variant
    }
    @Builder
    @Getter
    public static class UnexpectedError extends ScimUnderlyingError {
        @NonNull @JsonProperty("details") private final String details;
        

        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            this.details = details;
        }
    }
}