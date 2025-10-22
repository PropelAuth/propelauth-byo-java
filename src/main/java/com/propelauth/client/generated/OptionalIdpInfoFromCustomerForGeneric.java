package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class OptionalIdpInfoFromCustomerForGeneric {
    @JsonProperty("clientSecret") String clientSecret;
    @JsonProperty("usesPkce") Boolean usesPkce;
    @JsonProperty("authUrl") String authUrl;
    @JsonProperty("tokenUrl") String tokenUrl;
    @JsonProperty("userinfoUrl") String userinfoUrl;
}