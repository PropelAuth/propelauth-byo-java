package com.propelauth.client.generated;

import lombok.Getter;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Exception wrapper for InvalidateSessionByTokenError
 */
@Getter
public class InvalidateSessionByTokenException extends Exception {
    @NonNull @JsonProperty("type") private final String type;
    @NonNull @JsonProperty("details") private final String details;

    public InvalidateSessionByTokenException(String message, @NonNull String type, @NonNull String details) {
        super(message);
        this.type = type;
        this.details = details;
    }

    @JsonCreator
    public InvalidateSessionByTokenException(@JsonProperty("type") @NonNull String type, @JsonProperty("details") @NonNull String details) {
        this("Invalidate session by token error", type, details);
    }
}