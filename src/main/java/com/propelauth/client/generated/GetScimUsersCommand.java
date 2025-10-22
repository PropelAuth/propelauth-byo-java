package com.propelauth.client.generated;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Value;
import lombok.NonNull;
import lombok.Builder;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
    @JsonSubTypes.Type(value = GetScimUsersCommand.scimConnectionId.class),
    @JsonSubTypes.Type(value = GetScimUsersCommand.customerId.class)
})
public abstract class GetScimUsersCommand {

    @Builder
    @Getter
    public static class scimConnectionId extends GetScimUsersCommand {
        @JsonProperty("filter") private final ScimUsersPageEqualityFilter filter;
        @JsonProperty("pageNumber") private final Integer pageNumber;
        @JsonProperty("pageSize") private final Integer pageSize;
        @NonNull @JsonProperty("scimConnectionId") private final String scimConnectionId;
        

        @JsonCreator
        public scimConnectionId(@JsonProperty("filter") ScimUsersPageEqualityFilter filter, @JsonProperty("pageNumber") Integer pageNumber, @JsonProperty("pageSize") Integer pageSize, @NonNull @JsonProperty("scimConnectionId") String scimConnectionId) {
            this.filter = filter;
            this.pageNumber = pageNumber;
            this.pageSize = pageSize;
            this.scimConnectionId = scimConnectionId;
        }
    }
    @Builder
    @Getter
    public static class customerId extends GetScimUsersCommand {
        @JsonProperty("filter") private final ScimUsersPageEqualityFilter filter;
        @JsonProperty("pageNumber") private final Integer pageNumber;
        @JsonProperty("pageSize") private final Integer pageSize;
        @NonNull @JsonProperty("customerId") private final String customerId;
        

        @JsonCreator
        public customerId(@JsonProperty("filter") ScimUsersPageEqualityFilter filter, @JsonProperty("pageNumber") Integer pageNumber, @JsonProperty("pageSize") Integer pageSize, @NonNull @JsonProperty("customerId") String customerId) {
            this.filter = filter;
            this.pageNumber = pageNumber;
            this.pageSize = pageSize;
            this.customerId = customerId;
        }
    }
}