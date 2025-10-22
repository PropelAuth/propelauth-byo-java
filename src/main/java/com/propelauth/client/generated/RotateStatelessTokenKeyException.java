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
    @JsonSubTypes.Type(value = RotateStatelessTokenKeyException.RotationFailed.class, name = "RotationFailed"),
    @JsonSubTypes.Type(value = RotateStatelessTokenKeyException.InvalidParameters.class, name = "InvalidParameters"),
    @JsonSubTypes.Type(value = RotateStatelessTokenKeyException.UnexpectedError.class, name = "UnexpectedError")
})
public abstract class RotateStatelessTokenKeyException extends Exception {
    protected RotateStatelessTokenKeyException(String message) {
        super(message);
    }
    
    @Getter
    public static class RotationFailed extends RotateStatelessTokenKeyException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public RotationFailed(@NonNull @JsonProperty("details") String details) {
            super("Rotation failed");
            this.details = details;
        }
    }
    @Getter
    public static class InvalidParameters extends RotateStatelessTokenKeyException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public InvalidParameters(@NonNull @JsonProperty("details") String details) {
            super("Invalid parameters");
            this.details = details;
        }
    }
    @Getter
    public static class UnexpectedError extends RotateStatelessTokenKeyException {
        @NonNull @JsonProperty("details") private final String details;
        
        
        @JsonCreator
        public UnexpectedError(@NonNull @JsonProperty("details") String details) {
            super("An unexpected error occurred");
            this.details = details;
        }
    }
}