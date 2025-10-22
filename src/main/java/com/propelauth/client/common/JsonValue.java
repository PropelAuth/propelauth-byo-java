package com.propelauth.client.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.Map;

/**
 * Represents an arbitrary JSON value.
 */
@Getter
@AllArgsConstructor
@JsonSerialize(using = JsonValue.Serializer.class)
@JsonDeserialize(using = JsonValue.Deserializer.class)
public class JsonValue {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private final JsonNode value;

    public static JsonValue of(JsonNode value) {
        return new JsonValue(value);
    }

    public static JsonValue of(Map<String, Object> map) {
        return new JsonValue(MAPPER.valueToTree(map));
    }

    public static JsonValue ofNull() {
        return new JsonValue(null);
    }

    /**
     * Custom serializer that writes the JsonNode directly without wrapping.
     */
    public static class Serializer extends JsonSerializer<JsonValue> {
        @Override
        public void serialize(JsonValue jsonValue, JsonGenerator gen, SerializerProvider serializers)
                throws IOException {
            if (jsonValue == null || jsonValue.value == null) {
                gen.writeNull();
            } else {
                gen.writeTree(jsonValue.value);
            }
        }
    }

    /**
     * Custom deserializer that reads a JsonNode directly.
     */
    public static class Deserializer extends JsonDeserializer<JsonValue> {
        @Override
        public JsonValue deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            JsonNode node = p.getCodec().readTree(p);
            return JsonValue.of(node);
        }
    }
}