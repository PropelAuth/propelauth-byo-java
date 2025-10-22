package com.propelauth.client.generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Details about an unexpected error that occurred.
 * This is typically a string message providing additional context about the error.
 *
 * In TypeScript, this is a type alias for string, so we handle JSON serialization
 * to maintain compatibility.
 */
public class UnexpectedErrorDetails {
    private final String message;

    @JsonCreator
    public UnexpectedErrorDetails(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @JsonValue
    @Override
    public String toString() {
        return message;
    }

    // Static factory method for convenience
    public static UnexpectedErrorDetails of(String message) {
        return new UnexpectedErrorDetails(message);
    }
}