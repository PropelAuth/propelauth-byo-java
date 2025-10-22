package com.propelauth.client.generated;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Value
@Builder
@Jacksonized
@AllArgsConstructor
public class ScimUsersWithWarningsPage {
    @NonNull @JsonProperty("users") List<ScimUserWithWarnings> users;
    @NonNull @JsonProperty("totalCount") Integer totalCount;
    @NonNull @JsonProperty("page") Integer page;
    @NonNull @JsonProperty("pageSize") Integer pageSize;
}