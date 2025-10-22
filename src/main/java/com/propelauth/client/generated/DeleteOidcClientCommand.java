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
    @JsonSubTypes.Type(value = DeleteOidcClientCommand.oidcClientId.class),
    @JsonSubTypes.Type(value = DeleteOidcClientCommand.customerId.class)
})
public abstract class DeleteOidcClientCommand {

    @Builder
    @Getter
    public static class oidcClientId extends DeleteOidcClientCommand {
        @NonNull @JsonProperty("oidcClientId") private final String oidcClientId;
        

        @JsonCreator
        public oidcClientId(@NonNull @JsonProperty("oidcClientId") String oidcClientId) {
            this.oidcClientId = oidcClientId;
        }
    }
    @Builder
    @Getter
    public static class customerId extends DeleteOidcClientCommand {
        @NonNull @JsonProperty("customerId") private final String customerId;
        

        @JsonCreator
        public customerId(@NonNull @JsonProperty("customerId") String customerId) {
            this.customerId = customerId;
        }
    }
}