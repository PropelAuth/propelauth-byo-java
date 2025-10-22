package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.propelauth.client.common.JsonValue;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class UpdateSessionsCommand {
    @NonNull @JsonProperty("filter") SessionsFilter filter;
    @JsonProperty("tagsToRemove") List<String> tagsToRemove;
    @JsonProperty("tagsToAdd") List<String> tagsToAdd;
    @JsonProperty("newMetadata") JsonValue newMetadata;
    @JsonProperty("patchMetadata") JsonValue patchMetadata;
}