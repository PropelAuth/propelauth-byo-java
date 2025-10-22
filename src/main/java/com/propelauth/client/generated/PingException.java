package com.propelauth.client.generated;

import lombok.Getter;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Exception wrapper for PingError
 */
@Getter
public class PingException extends Exception {
    @NonNull @JsonProperty("type") private final String type;
    @NonNull @JsonProperty("details") private final String details;

    public PingException(String message, @NonNull String type, @NonNull String details) {
        super(message);
        this.type = type;
        this.details = details;
    }

    @JsonCreator
    public PingException(@JsonProperty("type") @NonNull String type, @JsonProperty("details") @NonNull String details) {
        this("Ping error", type, details);
    }
}