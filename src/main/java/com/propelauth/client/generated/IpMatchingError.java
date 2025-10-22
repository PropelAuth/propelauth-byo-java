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

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "__rustVariant")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IpMatchingError.IpOnBlocklist.class, name = "IpOnBlocklist"),
    @JsonSubTypes.Type(value = IpMatchingError.IpNotOnAllowlist.class, name = "IpNotOnAllowlist"),
    @JsonSubTypes.Type(value = IpMatchingError.IpAddressNotSpecified.class, name = "IpAddressNotSpecified"),
    @JsonSubTypes.Type(value = IpMatchingError.CannotParseIpAddress.class, name = "CannotParseIpAddress")
})
public abstract class IpMatchingError {

    @Builder
    @Getter
    public static class IpOnBlocklist extends IpMatchingError {
        @NonNull @JsonProperty("ip") private final String ip;
        

        @JsonCreator
        public IpOnBlocklist(@NonNull @JsonProperty("ip") String ip) {
            this.ip = ip;
        }
    }
    @Builder
    @Getter
    public static class IpNotOnAllowlist extends IpMatchingError {
        @NonNull @JsonProperty("ip") private final String ip;
        

        @JsonCreator
        public IpNotOnAllowlist(@NonNull @JsonProperty("ip") String ip) {
            this.ip = ip;
        }
    }
    public static class IpAddressNotSpecified extends IpMatchingError {
        // Empty variant
    }
    @Builder
    @Getter
    public static class CannotParseIpAddress extends IpMatchingError {
        @NonNull @JsonProperty("ip") private final String ip;
        

        @JsonCreator
        public CannotParseIpAddress(@NonNull @JsonProperty("ip") String ip) {
            this.ip = ip;
        }
    }
}