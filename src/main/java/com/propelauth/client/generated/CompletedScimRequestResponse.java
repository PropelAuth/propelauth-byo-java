package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.propelauth.client.common.JsonValue;
import java.util.List;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class CompletedScimRequestResponse {
    @NonNull @JsonProperty("connectionId") String connectionId;
    @JsonProperty("responseData") JsonValue responseData;
    @NonNull @JsonProperty("responseHttpCode") Integer responseHttpCode;
    @JsonProperty("affectedUserIds") List<String> affectedUserIds;
}