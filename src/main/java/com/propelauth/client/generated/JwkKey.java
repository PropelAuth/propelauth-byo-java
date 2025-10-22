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
public class JwkKey {
    @NonNull @JsonProperty("kty") String kty;
    @NonNull @JsonProperty("kid") String kid;
    @NonNull @JsonProperty("use") String use;
    @NonNull @JsonProperty("alg") String alg;
    @NonNull @JsonProperty("n") String n;
    @NonNull @JsonProperty("e") String e;
}