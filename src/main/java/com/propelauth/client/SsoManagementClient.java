package com.propelauth.client;

import com.propelauth.client.generated.*;
import com.propelauth.client.internal.HttpClient;

public class SsoManagementClient {
    private final HttpClient httpClient;

    public SsoManagementClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public CreateOidcClientResponse createOidcClient(CreateOidcClientCommand command)
            throws CreateOidcClientException {
        return httpClient.request(
            "CreateOidcClient",
            command,
            CreateOidcClientResponse.class,
            CreateOidcClientException.class
        );
    }

    public FetchOidcClientResponse fetchOidcClient(FetchOidcClientCommand command)
            throws FetchOidcClientException {
        return httpClient.request(
            "FetchOidcClient",
            command,
            FetchOidcClientResponse.class,
            FetchOidcClientException.class
        );
    }

    public PatchOidcClientResponse patchOidcClient(PatchOidcClientCommand command)
            throws PatchOidcClientException {
        return httpClient.request(
            "PatchOidcClient",
            command,
            PatchOidcClientResponse.class,
            PatchOidcClientException.class
        );
    }

    public DeleteOidcClientResponse deleteOidcClient(DeleteOidcClientCommand command)
            throws DeleteOidcClientException {
        return httpClient.request(
            "DeleteOidcClient",
            command,
            DeleteOidcClientResponse.class,
            DeleteOidcClientException.class
        );
    }

}