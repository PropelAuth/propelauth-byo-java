package com.propelauth.client;

import com.propelauth.client.generated.*;
import com.propelauth.client.internal.HttpClient;

public class SsoClient {
    private final HttpClient httpClient;
    public final SsoManagementClient management;

    public SsoClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        this.management = new SsoManagementClient(httpClient);
    }

    public InitiateOidcLoginResponse initiateOidcLogin(InitiateOidcLoginCommand command)
            throws InitiateOidcLoginException {
        return httpClient.request(
            "InitiateOidcLogin",
            command,
            InitiateOidcLoginResponse.class,
            InitiateOidcLoginException.class
        );
    }

    public CompleteOidcLoginResponse completeOidcLogin(CompleteOidcLoginCommand command)
            throws CompleteOidcLoginException {
        return httpClient.request(
            "CompleteOidcLogin",
            command,
            CompleteOidcLoginResponse.class,
            CompleteOidcLoginException.class
        );
    }

}