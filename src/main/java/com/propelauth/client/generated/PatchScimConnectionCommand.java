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
    @JsonSubTypes.Type(value = PatchScimConnectionCommand.scimConnectionId.class),
    @JsonSubTypes.Type(value = PatchScimConnectionCommand.customerId.class)
})
public abstract class PatchScimConnectionCommand {

    @Builder
    @Getter
    public static class scimConnectionId extends PatchScimConnectionCommand {
        @JsonProperty("displayName") private final String displayName;
        @JsonProperty("scimApiKeyExpiration") private final Integer scimApiKeyExpiration;
        @JsonProperty("customMapping") private final ScimUserMappingConfig customMapping;
        @NonNull @JsonProperty("scimConnectionId") private final String scimConnectionId;
        

        @JsonCreator
        public scimConnectionId(@JsonProperty("displayName") String displayName, @JsonProperty("scimApiKeyExpiration") Integer scimApiKeyExpiration, @JsonProperty("customMapping") ScimUserMappingConfig customMapping, @NonNull @JsonProperty("scimConnectionId") String scimConnectionId) {
            this.displayName = displayName;
            this.scimApiKeyExpiration = scimApiKeyExpiration;
            this.customMapping = customMapping;
            this.scimConnectionId = scimConnectionId;
        }
    }
    @Builder
    @Getter
    public static class customerId extends PatchScimConnectionCommand {
        @JsonProperty("displayName") private final String displayName;
        @JsonProperty("scimApiKeyExpiration") private final Integer scimApiKeyExpiration;
        @JsonProperty("customMapping") private final ScimUserMappingConfig customMapping;
        @NonNull @JsonProperty("customerId") private final String customerId;
        

        @JsonCreator
        public customerId(@JsonProperty("displayName") String displayName, @JsonProperty("scimApiKeyExpiration") Integer scimApiKeyExpiration, @JsonProperty("customMapping") ScimUserMappingConfig customMapping, @NonNull @JsonProperty("customerId") String customerId) {
            this.displayName = displayName;
            this.scimApiKeyExpiration = scimApiKeyExpiration;
            this.customMapping = customMapping;
            this.customerId = customerId;
        }
    }
}