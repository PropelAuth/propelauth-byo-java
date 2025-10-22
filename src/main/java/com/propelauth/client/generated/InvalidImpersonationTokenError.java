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

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "__rustVariant")
@JsonSubTypes({
    @JsonSubTypes.Type(value = InvalidImpersonationTokenError.MalformedToken.class, name = "MalformedToken"),
    @JsonSubTypes.Type(value = InvalidImpersonationTokenError.WrongTokenType.class, name = "WrongTokenType")
})
public abstract class InvalidImpersonationTokenError {

    public static class MalformedToken extends InvalidImpersonationTokenError {
        // Empty variant
    }
    @Builder
    @Getter
    public static class WrongTokenType extends InvalidImpersonationTokenError {
        @NonNull @JsonProperty("WrongTokenType") private final String wrongTokenType;
        

        @JsonCreator
        public WrongTokenType(@NonNull @JsonProperty("WrongTokenType") String wrongTokenType) {
            this.wrongTokenType = wrongTokenType;
        }
    }
}