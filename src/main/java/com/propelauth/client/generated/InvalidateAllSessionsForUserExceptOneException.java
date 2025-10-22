package com.propelauth.client.generated;

import lombok.Getter;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Exception wrapper for InvalidateAllSessionsForUserExceptOneError
 */
@Getter
public class InvalidateAllSessionsForUserExceptOneException extends Exception {
    @NonNull @JsonProperty("type") private final String type;
    @NonNull @JsonProperty("details") private final String details;

    public InvalidateAllSessionsForUserExceptOneException(String message, @NonNull String type, @NonNull String details) {
        super(message);
        this.type = type;
        this.details = details;
    }

    @JsonCreator
    public InvalidateAllSessionsForUserExceptOneException(@JsonProperty("type") @NonNull String type, @JsonProperty("details") @NonNull String details) {
        this("Invalidate all sessions for user except one error", type, details);
    }
}