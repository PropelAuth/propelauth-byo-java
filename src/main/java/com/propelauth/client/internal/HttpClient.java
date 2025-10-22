package com.propelauth.client.internal;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Internal HTTP client for making RPC calls to the PropelAuth backend.
 */
public class HttpClient {
    private final String baseUrl;
    private final String integrationKey;
    private final ObjectMapper objectMapper;
    private final java.net.http.HttpClient httpClient;

    public HttpClient(String baseUrl, String integrationKey) {
        this(baseUrl, integrationKey, null);
    }

    public HttpClient(String baseUrl, String integrationKey, java.net.http.HttpClient httpClient) {
        this.baseUrl = normalizeUrl(baseUrl);
        this.integrationKey = integrationKey;
        this.objectMapper = new ObjectMapper();
        // Allow empty beans (classes with no fields) to be serialized as {}
        this.objectMapper.configure(com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        this.httpClient = httpClient != null ? httpClient : java.net.http.HttpClient.newBuilder()
                .connectTimeout(java.time.Duration.ofSeconds(30))
                .build();
    }

    private String normalizeUrl(String url) {
        if (url.endsWith("/")) {
            return url.substring(0, url.length() - 1);
        }
        return url;
    }

    public <T, E extends Exception> T request(
            String command,
            Object input,
            Class<T> responseClass,
            Class<E> errorClass) throws E {
        try {
            // Create the request payload
            Map<String, Object> payload = new HashMap<>();
            payload.put("command", command);
            if (input != null) {
                payload.put("data", input);
            }

            String jsonPayload = objectMapper.writeValueAsString(payload);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(baseUrl + "/run-command"))
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + integrationKey)
                    .POST(HttpRequest.BodyPublishers.ofString(jsonPayload))
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return objectMapper.readValue(response.body(), responseClass);
            } else {
                E error = objectMapper.readValue(response.body(), errorClass);
                throw error;
            }
        } catch (Exception e) {
            if (errorClass.isInstance(e)) {
                throw (E) e;
            }
            throw new RuntimeException("Failed to make request: " + e.getMessage(), e);
        }
    }
}
