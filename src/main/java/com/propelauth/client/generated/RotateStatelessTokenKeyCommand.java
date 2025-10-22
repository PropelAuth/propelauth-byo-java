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
public class RotateStatelessTokenKeyCommand {
    @NonNull @JsonProperty("secsBeforeNewKeyBecomesDefault") Integer secsBeforeNewKeyBecomesDefault;
    @NonNull @JsonProperty("secsBeforeExistingKeysAreDeactivated") Integer secsBeforeExistingKeysAreDeactivated;
}