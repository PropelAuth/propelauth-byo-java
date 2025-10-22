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
public class OptionalIdpInfoFromCustomerForEntra {
    @JsonProperty("clientSecret") String clientSecret;
    @JsonProperty("usesPkce") Boolean usesPkce;
    @JsonProperty("tenantId") String tenantId;
}