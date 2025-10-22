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
public class GetScimUserResponse {
    @NonNull @JsonProperty("connectionId") String connectionId;
    @NonNull @JsonProperty("user") CompleteScimUserResponse user;
    @NonNull @JsonProperty("groups") List<ScimGroupMembershipResponse> groups;
}