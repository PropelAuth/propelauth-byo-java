package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class GetJwksResponse {
    @NonNull @JsonProperty("keys") List<JwkKey> keys;
}