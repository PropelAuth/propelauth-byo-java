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
    @JsonSubTypes.Type(value = GetScimUserCommand.scimConnectionId.class),
    @JsonSubTypes.Type(value = GetScimUserCommand.customerId.class)
})
public abstract class GetScimUserCommand {

    @Builder
    @Getter
    public static class scimConnectionId extends GetScimUserCommand {
        @NonNull @JsonProperty("userId") private final String userId;
        @NonNull @JsonProperty("scimConnectionId") private final String scimConnectionId;
        

        @JsonCreator
        public scimConnectionId(@NonNull @JsonProperty("userId") String userId, @NonNull @JsonProperty("scimConnectionId") String scimConnectionId) {
            this.userId = userId;
            this.scimConnectionId = scimConnectionId;
        }
    }
    @Builder
    @Getter
    public static class customerId extends GetScimUserCommand {
        @NonNull @JsonProperty("userId") private final String userId;
        @NonNull @JsonProperty("customerId") private final String customerId;
        

        @JsonCreator
        public customerId(@NonNull @JsonProperty("userId") String userId, @NonNull @JsonProperty("customerId") String customerId) {
            this.userId = userId;
            this.customerId = customerId;
        }
    }
}