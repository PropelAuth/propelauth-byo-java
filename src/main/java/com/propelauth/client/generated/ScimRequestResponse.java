package com.propelauth.client.generated;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Value;
import lombok.NonNull;
import lombok.Builder;
import com.propelauth.client.common.JsonValue;
import java.util.List;

@JsonDeserialize(using = ScimRequestResponseDeserializer.class)
public abstract class ScimRequestResponse {

    @Builder
    @Getter
    public static class Completed extends ScimRequestResponse {
        @NonNull @JsonProperty("status") private final String status = "Completed";
        
        @NonNull @JsonProperty("connectionId") private final String connectionId;
        @JsonProperty("responseData") private final JsonValue responseData;
        @NonNull @JsonProperty("responseHttpCode") private final Integer responseHttpCode;
        @JsonProperty("affectedUserIds") private final java.util.List<String> affectedUserIds;

        @JsonCreator
        public Completed(@NonNull @JsonProperty("connectionId") String connectionId, @JsonProperty("responseData") JsonValue responseData, @NonNull @JsonProperty("responseHttpCode") Integer responseHttpCode, @JsonProperty("affectedUserIds") java.util.List<String> affectedUserIds) {
            
            this.connectionId = connectionId;
            
            this.responseData = responseData;
            
            this.responseHttpCode = responseHttpCode;
            
            this.affectedUserIds = affectedUserIds;
            
        }
    }
    @Getter
    public static class ActionRequired extends ScimRequestResponse {

        @Builder
        @Getter
        public static class ActionRequiredLinkUser extends ActionRequired {
            @NonNull @JsonProperty("status") private final String status = "ActionRequired";
            @NonNull @JsonProperty("action") private final String action = "LinkUser";
            @NonNull @JsonProperty("connectionId") private final String connectionId;
            @NonNull @JsonProperty("commitId") private final String commitId;
            @JsonProperty("primaryEmail") private final String primaryEmail;
            @NonNull @JsonProperty("userName") private final String userName;
            @NonNull @JsonProperty("parsedUserData") private final JsonValue parsedUserData;
            @NonNull @JsonProperty("active") private final Boolean active;
            @JsonProperty("ssoUserSubject") private final String ssoUserSubject;

            @JsonCreator
            public ActionRequiredLinkUser(@NonNull @JsonProperty("connectionId") String connectionId, @NonNull @JsonProperty("commitId") String commitId, @JsonProperty("primaryEmail") String primaryEmail, @NonNull @JsonProperty("userName") String userName, @NonNull @JsonProperty("parsedUserData") JsonValue parsedUserData, @NonNull @JsonProperty("active") Boolean active, @JsonProperty("ssoUserSubject") String ssoUserSubject) {
                this.connectionId = connectionId;
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
        public static class ActionRequiredDisableUser extends ActionRequired {
            @NonNull @JsonProperty("status") private final String status = "ActionRequired";
            @NonNull @JsonProperty("action") private final String action = "DisableUser";
            @NonNull @JsonProperty("connectionId") private final String connectionId;
            @NonNull @JsonProperty("commitId") private final String commitId;
            @NonNull @JsonProperty("userId") private final String userId;
            @JsonProperty("primaryEmail") private final String primaryEmail;
            @NonNull @JsonProperty("parsedUserData") private final JsonValue parsedUserData;

            @JsonCreator
            public ActionRequiredDisableUser(@NonNull @JsonProperty("connectionId") String connectionId, @NonNull @JsonProperty("commitId") String commitId, @NonNull @JsonProperty("userId") String userId, @JsonProperty("primaryEmail") String primaryEmail, @NonNull @JsonProperty("parsedUserData") JsonValue parsedUserData) {
                this.connectionId = connectionId;
                this.commitId = commitId;
                this.userId = userId;
                this.primaryEmail = primaryEmail;
                this.parsedUserData = parsedUserData;
            }
        }
        @Builder
        @Getter
        public static class ActionRequiredEnableUser extends ActionRequired {
            @NonNull @JsonProperty("status") private final String status = "ActionRequired";
            @NonNull @JsonProperty("action") private final String action = "EnableUser";
            @NonNull @JsonProperty("connectionId") private final String connectionId;
            @NonNull @JsonProperty("commitId") private final String commitId;
            @NonNull @JsonProperty("userId") private final String userId;
            @JsonProperty("primaryEmail") private final String primaryEmail;
            @NonNull @JsonProperty("parsedUserData") private final JsonValue parsedUserData;

            @JsonCreator
            public ActionRequiredEnableUser(@NonNull @JsonProperty("connectionId") String connectionId, @NonNull @JsonProperty("commitId") String commitId, @NonNull @JsonProperty("userId") String userId, @JsonProperty("primaryEmail") String primaryEmail, @NonNull @JsonProperty("parsedUserData") JsonValue parsedUserData) {
                this.connectionId = connectionId;
                this.commitId = commitId;
                this.userId = userId;
                this.primaryEmail = primaryEmail;
                this.parsedUserData = parsedUserData;
            }
        }
        @Builder
        @Getter
        public static class ActionRequiredDeleteUser extends ActionRequired {
            @NonNull @JsonProperty("status") private final String status = "ActionRequired";
            @NonNull @JsonProperty("action") private final String action = "DeleteUser";
            @NonNull @JsonProperty("connectionId") private final String connectionId;
            @NonNull @JsonProperty("commitId") private final String commitId;
            @NonNull @JsonProperty("userId") private final String userId;
            @JsonProperty("primaryEmail") private final String primaryEmail;
            @NonNull @JsonProperty("parsedUserData") private final JsonValue parsedUserData;

            @JsonCreator
            public ActionRequiredDeleteUser(@NonNull @JsonProperty("connectionId") String connectionId, @NonNull @JsonProperty("commitId") String commitId, @NonNull @JsonProperty("userId") String userId, @JsonProperty("primaryEmail") String primaryEmail, @NonNull @JsonProperty("parsedUserData") JsonValue parsedUserData) {
                this.connectionId = connectionId;
                this.commitId = commitId;
                this.userId = userId;
                this.primaryEmail = primaryEmail;
                this.parsedUserData = parsedUserData;
            }
        }
    }
}