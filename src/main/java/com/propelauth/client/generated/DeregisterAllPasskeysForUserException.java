package com.propelauth.client.generated;

import lombok.Getter;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Exception wrapper for DeregisterAllPasskeysForUserError
 */
@Getter
public class DeregisterAllPasskeysForUserException extends Exception {
    @NonNull @JsonProperty("type") private final String type;
    @NonNull @JsonProperty("details") private final String details;

    public DeregisterAllPasskeysForUserException(String message, @NonNull String type, @NonNull String details) {
        super(message);
        this.type = type;
        this.details = details;
    }

    @JsonCreator
    public DeregisterAllPasskeysForUserException(@JsonProperty("type") @NonNull String type, @JsonProperty("details") @NonNull String details) {
        this("Deregister all passkeys for user error", type, details);
    }
}