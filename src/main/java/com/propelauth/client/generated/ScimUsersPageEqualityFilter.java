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
    @JsonSubTypes.Type(value = ScimUsersPageEqualityFilter.userName.class),
    @JsonSubTypes.Type(value = ScimUsersPageEqualityFilter.externalId.class),
    @JsonSubTypes.Type(value = ScimUsersPageEqualityFilter.primaryEmail.class),
    @JsonSubTypes.Type(value = ScimUsersPageEqualityFilter.userId.class)
})
public abstract class ScimUsersPageEqualityFilter {

    @Builder
    @Getter
    public static class userName extends ScimUsersPageEqualityFilter {
        @NonNull @JsonProperty("userName") private final String userName;
        

        @JsonCreator
        public userName(@NonNull @JsonProperty("userName") String userName) {
            this.userName = userName;
        }
    }
    @Builder
    @Getter
    public static class externalId extends ScimUsersPageEqualityFilter {
        @NonNull @JsonProperty("externalId") private final String externalId;
        

        @JsonCreator
        public externalId(@NonNull @JsonProperty("externalId") String externalId) {
            this.externalId = externalId;
        }
    }
    @Builder
    @Getter
    public static class primaryEmail extends ScimUsersPageEqualityFilter {
        @NonNull @JsonProperty("primaryEmail") private final String primaryEmail;
        

        @JsonCreator
        public primaryEmail(@NonNull @JsonProperty("primaryEmail") String primaryEmail) {
            this.primaryEmail = primaryEmail;
        }
    }
    @Builder
    @Getter
    public static class userId extends ScimUsersPageEqualityFilter {
        @NonNull @JsonProperty("userId") private final String userId;
        

        @JsonCreator
        public userId(@NonNull @JsonProperty("userId") String userId) {
            this.userId = userId;
        }
    }
}