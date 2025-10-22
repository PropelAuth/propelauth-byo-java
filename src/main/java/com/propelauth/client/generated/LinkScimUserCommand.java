package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class LinkScimUserCommand {
    @NonNull @JsonProperty("connectionId") String connectionId;
    @NonNull @JsonProperty("commitId") String commitId;
    @NonNull @JsonProperty("userId") String userId;
}