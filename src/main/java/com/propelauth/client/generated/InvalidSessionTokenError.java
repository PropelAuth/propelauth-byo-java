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
import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "__rustVariant")
@JsonSubTypes({
    @JsonSubTypes.Type(value = InvalidSessionTokenError.MalformedSessionToken.class, name = "MalformedSessionToken"),
    @JsonSubTypes.Type(value = InvalidSessionTokenError.WrongTokenType.class, name = "WrongTokenType"),
    @JsonSubTypes.Type(value = InvalidSessionTokenError.SessionTokenNotFound.class, name = "SessionTokenNotFound"),
    @JsonSubTypes.Type(value = InvalidSessionTokenError.MissingRequiredTags.class, name = "MissingRequiredTags")
})
public abstract class InvalidSessionTokenError {

    public static class MalformedSessionToken extends InvalidSessionTokenError {
        // Empty variant
    }
    @Builder
    @Getter
    public static class WrongTokenType extends InvalidSessionTokenError {
        @NonNull @JsonProperty("WrongTokenType") private final String wrongTokenType;
        

        @JsonCreator
        public WrongTokenType(@NonNull @JsonProperty("WrongTokenType") String wrongTokenType) {
            this.wrongTokenType = wrongTokenType;
        }
    }
    public static class SessionTokenNotFound extends InvalidSessionTokenError {
        // Empty variant
    }
    @Builder
    @Getter
    public static class MissingRequiredTags extends InvalidSessionTokenError {
        @NonNull @JsonProperty("MissingRequiredTags") private final java.util.List<String> missingRequiredTags;
        

        @JsonCreator
        public MissingRequiredTags(@NonNull @JsonProperty("MissingRequiredTags") java.util.List<String> missingRequiredTags) {
            this.missingRequiredTags = missingRequiredTags;
        }
    }
}