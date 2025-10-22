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
public class StartPasskeyRegistrationErrorTooManyPasskeysDetails {
    @NonNull @JsonProperty("max_passkeys") Integer maxPasskeys;
    @NonNull @JsonProperty("current_count") Integer currentCount;
}