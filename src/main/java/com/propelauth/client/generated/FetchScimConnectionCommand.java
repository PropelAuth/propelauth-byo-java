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
    @JsonSubTypes.Type(value = FetchScimConnectionCommand.scimConnectionId.class),
    @JsonSubTypes.Type(value = FetchScimConnectionCommand.customerId.class)
})
public abstract class FetchScimConnectionCommand {

    @Builder
    @Getter
    public static class scimConnectionId extends FetchScimConnectionCommand {
        @NonNull @JsonProperty("scimConnectionId") private final String scimConnectionId;
        

        @JsonCreator
        public scimConnectionId(@NonNull @JsonProperty("scimConnectionId") String scimConnectionId) {
            this.scimConnectionId = scimConnectionId;
        }
    }
    @Builder
    @Getter
    public static class customerId extends FetchScimConnectionCommand {
        @NonNull @JsonProperty("customerId") private final String customerId;
        

        @JsonCreator
        public customerId(@NonNull @JsonProperty("customerId") String customerId) {
            this.customerId = customerId;
        }
    }
}