package com.propelauth.client;

import com.propelauth.client.generated.*;
import com.propelauth.client.internal.HttpClient;

public class ScimClient {
    private final HttpClient httpClient;
    public final ScimManagementClient management;

    public ScimClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        this.management = new ScimManagementClient(httpClient);
    }

    public ScimRequestResponse scimRequest(ScimRequestCommand command)
            throws ScimClientFacingException {
        return httpClient.request(
            "ScimRequest",
            command,
            ScimRequestResponse.class,
            ScimClientFacingException.class
        );
    }

    public CompletedScimRequestResponse linkScimUser(LinkScimUserCommand command)
            throws LinkScimUserException {
        return httpClient.request(
            "LinkScimUser",
            command,
            CompletedScimRequestResponse.class,
            LinkScimUserException.class
        );
    }

    public CompletedScimRequestResponse commitScimUserChange(CommitScimUserChangeCommand command)
            throws CommitScimUserChangeException {
        return httpClient.request(
            "CommitScimUserChange",
            command,
            CompletedScimRequestResponse.class,
            CommitScimUserChangeException.class
        );
    }

    public GetScimUserResponse getScimUser(GetScimUserCommand command)
            throws GetScimUserException {
        return httpClient.request(
            "GetScimUser",
            command,
            GetScimUserResponse.class,
            GetScimUserException.class
        );
    }

}