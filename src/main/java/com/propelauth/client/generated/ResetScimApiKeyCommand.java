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
    @JsonSubTypes.Type(value = ResetScimApiKeyCommand.scimConnectionId.class),
    @JsonSubTypes.Type(value = ResetScimApiKeyCommand.customerId.class)
})
public abstract class ResetScimApiKeyCommand {

    @Builder
    @Getter
    public static class scimConnectionId extends ResetScimApiKeyCommand {
        @JsonProperty("scimApiKeyExpiration") private final Integer scimApiKeyExpiration;
        @NonNull @JsonProperty("scimConnectionId") private final String scimConnectionId;
        

        @JsonCreator
        public scimConnectionId(@JsonProperty("scimApiKeyExpiration") Integer scimApiKeyExpiration, @NonNull @JsonProperty("scimConnectionId") String scimConnectionId) {
            this.scimApiKeyExpiration = scimApiKeyExpiration;
            this.scimConnectionId = scimConnectionId;
        }
    }
    @Builder
    @Getter
    public static class customerId extends ResetScimApiKeyCommand {
        @JsonProperty("scimApiKeyExpiration") private final Integer scimApiKeyExpiration;
        @NonNull @JsonProperty("customerId") private final String customerId;
        

        @JsonCreator
        public customerId(@JsonProperty("scimApiKeyExpiration") Integer scimApiKeyExpiration, @NonNull @JsonProperty("customerId") String customerId) {
            this.scimApiKeyExpiration = scimApiKeyExpiration;
            this.customerId = customerId;
        }
    }
}