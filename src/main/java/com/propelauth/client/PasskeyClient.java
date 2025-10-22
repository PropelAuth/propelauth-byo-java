package com.propelauth.client;

import com.propelauth.client.generated.*;
import com.propelauth.client.internal.HttpClient;

public class PasskeyClient {
    private final HttpClient httpClient;

    public PasskeyClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public StartPasskeyRegistrationResponse startRegistration(StartPasskeyRegistrationCommand command)
            throws StartPasskeyRegistrationException {
        return httpClient.request(
            "StartPasskeyRegistration",
            command,
            StartPasskeyRegistrationResponse.class,
            StartPasskeyRegistrationException.class
        );
    }

    public FinishPasskeyRegistrationResponse finishRegistration(FinishPasskeyRegistrationCommand command)
            throws FinishPasskeyRegistrationException {
        return httpClient.request(
            "FinishPasskeyRegistration",
            command,
            FinishPasskeyRegistrationResponse.class,
            FinishPasskeyRegistrationException.class
        );
    }

    public StartPasskeyAuthenticationResponse startAuthentication(StartPasskeyAuthenticationCommand command)
            throws StartPasskeyAuthenticationException {
        return httpClient.request(
            "StartPasskeyAuthentication",
            command,
            StartPasskeyAuthenticationResponse.class,
            StartPasskeyAuthenticationException.class
        );
    }

    public FinishPasskeyAuthenticationResponse finishAuthentication(FinishPasskeyAuthenticationCommand command)
            throws FinishPasskeyAuthenticationException {
        return httpClient.request(
            "FinishPasskeyAuthentication",
            command,
            FinishPasskeyAuthenticationResponse.class,
            FinishPasskeyAuthenticationException.class
        );
    }

    public FetchAllPasskeysForUserResponse fetchAllPasskeysForUser(FetchAllPasskeysForUserCommand command)
            throws FetchAllPasskeysForUserException {
        return httpClient.request(
            "FetchAllPasskeysForUser",
            command,
            FetchAllPasskeysForUserResponse.class,
            FetchAllPasskeysForUserException.class
        );
    }

    public DeregisterPasskeyResponse deregisterPasskey(DeregisterPasskeyCommand command)
            throws DeregisterPasskeyException {
        return httpClient.request(
            "DeregisterPasskey",
            command,
            DeregisterPasskeyResponse.class,
            DeregisterPasskeyException.class
        );
    }

    public DeregisterAllPasskeysForUserResponse deregisterAllPasskeysForUser(DeregisterAllPasskeysForUserCommand command)
            throws DeregisterAllPasskeysForUserException {
        return httpClient.request(
            "DeregisterAllPasskeysForUser",
            command,
            DeregisterAllPasskeysForUserResponse.class,
            DeregisterAllPasskeysForUserException.class
        );
    }

}