package com.propelauth.client.generated;

import lombok.Getter;
import lombok.Value;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = CreateStatelessTokenException.TokenCreationFailed.class, name = "TokenCreationFailed"),
    @JsonSubTypes.Type(value = CreateStatelessTokenException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class CreateStatelessTokenException extends Exception {
    protected CreateStatelessTokenException(String message) {
        super(message);
    }
    
    @Getter
    public static class TokenCreationFailed extends CreateStatelessTokenException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public TokenCreationFailed(@NonNull @JsonProperty("details") String details) {
            super("Token creation failed");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends CreateStatelessTokenException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}