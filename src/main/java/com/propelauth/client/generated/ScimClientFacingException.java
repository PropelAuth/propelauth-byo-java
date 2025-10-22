package com.propelauth.client.generated;

import lombok.Getter;
import lombok.NonNull;
import com.propelauth.client.common.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Exception wrapper for ScimClientFacingError
 */
@Getter
public class ScimClientFacingException extends Exception {
    @NonNull @JsonProperty("statusToReturn") private final Integer statusToReturn;
    @NonNull @JsonProperty("bodyToReturn") private final JsonValue bodyToReturn;
    @NonNull @JsonProperty("underlyingError") private final ScimUnderlyingError underlyingError;

    public ScimClientFacingException(String message, @NonNull Integer statusToReturn, @NonNull JsonValue bodyToReturn, @NonNull ScimUnderlyingError underlyingError) {
        super(message);
        this.statusToReturn = statusToReturn;
        this.bodyToReturn = bodyToReturn;
        this.underlyingError = underlyingError;
    }

    @JsonCreator
    public ScimClientFacingException(@JsonProperty("statusToReturn") @NonNull Integer statusToReturn, @JsonProperty("bodyToReturn") @NonNull JsonValue bodyToReturn, @JsonProperty("underlyingError") @NonNull ScimUnderlyingError underlyingError) {
        this("Scim client facing error", statusToReturn, bodyToReturn, underlyingError);
    }
}