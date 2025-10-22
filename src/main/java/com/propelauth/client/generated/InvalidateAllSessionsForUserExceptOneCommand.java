package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class InvalidateAllSessionsForUserExceptOneCommand {
    @NonNull @JsonProperty("userId") String userId;
    @NonNull @JsonProperty("sessionTokenToKeep") String sessionTokenToKeep;
    @JsonProperty("sessionTags") List<String> sessionTags;
}