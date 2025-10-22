package com.propelauth.client.generated;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import java.io.IOException;

public class ScimRequestResponseDeserializer extends StdDeserializer<ScimRequestResponse> {

    // Use a clean ObjectMapper that ignores the JsonDeserialize annotation for this type only
    // to avoid infinite recursion when deserializing concrete subclasses
    private static final ObjectMapper CLEAN_MAPPER;
    static {
        CLEAN_MAPPER = new ObjectMapper();
        // Create a custom annotation introspector that ignores JsonDeserialize annotations only for ScimRequestResponse
        JacksonAnnotationIntrospector introspector = new JacksonAnnotationIntrospector() {
            @Override
            public Object findDeserializer(com.fasterxml.jackson.databind.introspect.Annotated a) {
                // Only ignore @JsonDeserialize for ScimRequestResponse and its subclasses
                if (a.getRawType() != null && ScimRequestResponse.class.isAssignableFrom(a.getRawType())) {
                    return null;
                }
                // For other types like JsonValue, use their deserializers normally
                return super.findDeserializer(a);
            }
        };
        CLEAN_MAPPER.setAnnotationIntrospector(introspector);
    }

    public ScimRequestResponseDeserializer() {
        super(ScimRequestResponse.class);
    }

    @Override
    public ScimRequestResponse deserialize(JsonParser p, DeserializationContext ctx) throws IOException {
        JsonNode node = p.getCodec().readTree(p);

        // Handle nested discriminated union with two levels
        String status = node.has("status") ? node.get("status").asText() : null;

        if ("Completed".equals(status)) {
            // No secondary discriminator, direct mapping
            return CLEAN_MAPPER.readValue(node.toString(), ScimRequestResponse.Completed.class);
        }
        else if ("ActionRequired".equals(status)) {
            // Check secondary discriminator
            String action = node.has("action") ? node.get("action").asText() : null;
            if ("LinkUser".equals(action)) {
                return CLEAN_MAPPER.readValue(node.toString(), ScimRequestResponse.ActionRequired.ActionRequiredLinkUser.class);
            }
            else if ("DisableUser".equals(action)) {
                return CLEAN_MAPPER.readValue(node.toString(), ScimRequestResponse.ActionRequired.ActionRequiredDisableUser.class);
            }
            else if ("EnableUser".equals(action)) {
                return CLEAN_MAPPER.readValue(node.toString(), ScimRequestResponse.ActionRequired.ActionRequiredEnableUser.class);
            }
            else if ("DeleteUser".equals(action)) {
                return CLEAN_MAPPER.readValue(node.toString(), ScimRequestResponse.ActionRequired.ActionRequiredDeleteUser.class);
            }
            else {
                throw new IOException("Unknown action: " + action);
            }
        }
        else {
            throw new IOException("Unknown status: " + status);
        }
    }
}