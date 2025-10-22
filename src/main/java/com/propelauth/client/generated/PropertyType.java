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
import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "dataType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PropertyType.String.class, name = "String"),
    @JsonSubTypes.Type(value = PropertyType.Integer.class, name = "Integer"),
    @JsonSubTypes.Type(value = PropertyType.Float.class, name = "Float"),
    @JsonSubTypes.Type(value = PropertyType.Boolean.class, name = "Boolean"),
    @JsonSubTypes.Type(value = PropertyType.Date.class, name = "Date"),
    @JsonSubTypes.Type(value = PropertyType.DateTime.class, name = "DateTime"),
    @JsonSubTypes.Type(value = PropertyType.Enum.class, name = "Enum"),
    @JsonSubTypes.Type(value = PropertyType.List.class, name = "List")
})
public abstract class PropertyType {

    public static class String extends PropertyType {
        // Empty variant
    }
    public static class Integer extends PropertyType {
        // Empty variant
    }
    public static class Float extends PropertyType {
        // Empty variant
    }
    public static class Boolean extends PropertyType {
        // Empty variant
    }
    public static class Date extends PropertyType {
        // Empty variant
    }
    public static class DateTime extends PropertyType {
        // Empty variant
    }
    @Builder
    @Getter
    public static class Enum extends PropertyType {
        @NonNull @JsonProperty("options") private final java.util.List<String> options;
        

        @JsonCreator
        public Enum(@NonNull @JsonProperty("options") java.util.List<String> options) {
            this.options = options;
        }
    }
    @Builder
    @Getter
    public static class List extends PropertyType {
        @NonNull @JsonProperty("itemType") private final PropertyType itemType;
        

        @JsonCreator
        public List(@NonNull @JsonProperty("itemType") PropertyType itemType) {
            this.itemType = itemType;
        }
    }
}