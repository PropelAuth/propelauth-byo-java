package com.propelauth.client;

import com.propelauth.client.generated.*;
import com.propelauth.client.internal.HttpClient;

public class ScimManagementClient {
    private final HttpClient httpClient;

    public ScimManagementClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public GetScimUsersResponse getScimUsers(GetScimUsersCommand command)
            throws GetScimUsersException {
        return httpClient.request(
            "GetScimUsers",
            command,
            GetScimUsersResponse.class,
            GetScimUsersException.class
        );
    }

    public CreateScimConnectionResponse createScimConnection(CreateScimConnectionCommand command)
            throws CreateScimConnectionException {
        return httpClient.request(
            "CreateScimConnection",
            command,
            CreateScimConnectionResponse.class,
            CreateScimConnectionException.class
        );
    }

    public FetchScimConnectionResponse fetchScimConnection(FetchScimConnectionCommand command)
            throws FetchScimConnectionException {
        return httpClient.request(
            "FetchScimConnection",
            command,
            FetchScimConnectionResponse.class,
            FetchScimConnectionException.class
        );
    }

    public PatchScimConnectionResponse patchScimConnection(PatchScimConnectionCommand command)
            throws PatchScimConnectionException {
        return httpClient.request(
            "PatchScimConnection",
            command,
            PatchScimConnectionResponse.class,
            PatchScimConnectionException.class
        );
    }

    public ResetScimApiKeyResponse resetScimApiKey(ResetScimApiKeyCommand command)
            throws ResetScimApiKeyException {
        return httpClient.request(
            "ResetScimApiKey",
            command,
            ResetScimApiKeyResponse.class,
            ResetScimApiKeyException.class
        );
    }

    public DeleteScimConnectionResponse deleteScimConnection(DeleteScimConnectionCommand command)
            throws DeleteScimConnectionException {
        return httpClient.request(
            "DeleteScimConnection",
            command,
            DeleteScimConnectionResponse.class,
            DeleteScimConnectionException.class
        );
    }

}