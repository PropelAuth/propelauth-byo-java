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
public class ScimGroupMembershipResponse {
    @NonNull @JsonProperty("groupId") String groupId;
    @NonNull @JsonProperty("displayName") String displayName;
    @JsonProperty("externalId") String externalId;
}