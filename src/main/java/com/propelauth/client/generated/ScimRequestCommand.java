package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.propelauth.client.common.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class ScimRequestCommand {
    @NonNull @JsonProperty("method") HttpMethod method;
    @NonNull @JsonProperty("pathAndQueryParams") String pathAndQueryParams;
    @JsonProperty("body") JsonValue body;
    @JsonProperty("scimApiKey") String scimApiKey;
}