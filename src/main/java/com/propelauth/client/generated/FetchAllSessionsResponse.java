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
public class FetchAllSessionsResponse {
    @NonNull @JsonProperty("items") List<SessionInfo> items;
    @NonNull @JsonProperty("page") Integer page;
    @NonNull @JsonProperty("pageSize") Integer pageSize;
    @NonNull @JsonProperty("totalCount") Integer totalCount;
    @NonNull @JsonProperty("hasMoreResults") Boolean hasMoreResults;
}