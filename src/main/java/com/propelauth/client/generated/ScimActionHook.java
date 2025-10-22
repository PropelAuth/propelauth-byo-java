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
import com.propelauth.client.common.JsonValue;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "action")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ScimActionHook.LinkUser.class, name = "LinkUser"),
    @JsonSubTypes.Type(value = ScimActionHook.DisableUser.class, name = "DisableUser"),
    @JsonSubTypes.Type(value = ScimActionHook.EnableUser.class, name = "EnableUser"),
    @JsonSubTypes.Type(value = ScimActionHook.DeleteUser.class, name = "DeleteUser")
})
public abstract class ScimActionHook {

    @Builder
    @Getter
    public static class LinkUser extends ScimActionHook {
        @NonNull @JsonProperty("commitId") private final String commitId;
        @JsonProperty("primaryEmail") private final String primaryEmail;
        @NonNull @JsonProperty("userName") private final String userName;
        @NonNull @JsonProperty("parsedUserData") private final JsonValue parsedUserData;
        @NonNull @JsonProperty("active") private final Boolean active;
        @JsonProperty("ssoUserSubject") private final String ssoUserSubject;
        

        @JsonCreator
        public LinkUser(@NonNull @JsonProperty("commitId") String commitId, @JsonProperty("primaryEmail") String primaryEmail, @NonNull @JsonProperty("userName") String userName, @NonNull @JsonProperty("parsedUserData") JsonValue parsedUserData, @NonNull @JsonProperty("active") Boolean active, @JsonProperty("ssoUserSubject") String ssoUserSubject) {
            this.commitId = commitId;
            this.primaryEmail = primaryEmail;
            this.userName = userName;
            this.parsedUserData = parsedUserData;
            this.active = active;
            this.ssoUserSubject = ssoUserSubject;
        }
    }
    @Builder
    @Getter
    public static class DisableUser extends ScimActionHook {
        @NonNull @JsonProperty("commitId") private final String commitId;
        @NonNull @JsonProperty("userId") private final String userId;
        @JsonProperty("primaryEmail") private final String primaryEmail;
        @NonNull @JsonProperty("parsedUserData") private final JsonValue parsedUserData;
        

        @JsonCreator
        public DisableUser(@NonNull @JsonProperty("commitId") String commitId, @NonNull @JsonProperty("userId") String userId, @JsonProperty("primaryEmail") String primaryEmail, @NonNull @JsonProperty("parsedUserData") JsonValue parsedUserData) {
            this.commitId = commitId;
            this.userId = userId;
            this.primaryEmail = primaryEmail;
            this.parsedUserData = parsedUserData;
        }
    }
    @Builder
    @Getter
    public static class EnableUser extends ScimActionHook {
        @NonNull @JsonProperty("commitId") private final String commitId;
        @NonNull @JsonProperty("userId") private final String userId;
        @JsonProperty("primaryEmail") private final String primaryEmail;
        @NonNull @JsonProperty("parsedUserData") private final JsonValue parsedUserData;
        

        @JsonCreator
        public EnableUser(@NonNull @JsonProperty("commitId") String commitId, @NonNull @JsonProperty("userId") String userId, @JsonProperty("primaryEmail") String primaryEmail, @NonNull @JsonProperty("parsedUserData") JsonValue parsedUserData) {
            this.commitId = commitId;
            this.userId = userId;
            this.primaryEmail = primaryEmail;
            this.parsedUserData = parsedUserData;
        }
    }
    @Builder
    @Getter
    public static class DeleteUser extends ScimActionHook {
        @NonNull @JsonProperty("commitId") private final String commitId;
        @NonNull @JsonProperty("userId") private final String userId;
        @JsonProperty("primaryEmail") private final String primaryEmail;
        @NonNull @JsonProperty("parsedUserData") private final JsonValue parsedUserData;
        

        @JsonCreator
        public DeleteUser(@NonNull @JsonProperty("commitId") String commitId, @NonNull @JsonProperty("userId") String userId, @JsonProperty("primaryEmail") String primaryEmail, @NonNull @JsonProperty("parsedUserData") JsonValue parsedUserData) {
            this.commitId = commitId;
            this.userId = userId;
            this.primaryEmail = primaryEmail;
            this.parsedUserData = parsedUserData;
        }
    }
}