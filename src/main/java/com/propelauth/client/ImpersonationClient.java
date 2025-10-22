package com.propelauth.client;

import com.propelauth.client.generated.*;
import com.propelauth.client.internal.HttpClient;

public class ImpersonationClient {
    private final HttpClient httpClient;

    public ImpersonationClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public CreateImpersonationSessionResponse create(CreateImpersonationSessionCommand command)
            throws CreateImpersonationSessionException {
        return httpClient.request(
            "CreateImpersonationSession",
            command,
            CreateImpersonationSessionResponse.class,
            CreateImpersonationSessionException.class
        );
    }

    public ValidateImpersonationSessionResponse validate(ValidateImpersonationSessionCommand command)
            throws ValidateImpersonationSessionException {
        return httpClient.request(
            "ValidateImpersonationSession",
            command,
            ValidateImpersonationSessionResponse.class,
            ValidateImpersonationSessionException.class
        );
    }

    public ImpersonationSessionInfo fetchById(FetchImpersonationSessionByIdCommand command)
            throws FetchImpersonationSessionByIdException {
        return httpClient.request(
            "FetchImpersonationSessionById",
            command,
            ImpersonationSessionInfo.class,
            FetchImpersonationSessionByIdException.class
        );
    }

    public FetchAllImpersonationSessionsForEmployeeResponse fetchAllForEmployee(FetchAllImpersonationSessionsForEmployeeCommand command)
            throws FetchAllImpersonationSessionsForEmployeeException {
        return httpClient.request(
            "FetchAllImpersonationSessionsForEmployee",
            command,
            FetchAllImpersonationSessionsForEmployeeResponse.class,
            FetchAllImpersonationSessionsForEmployeeException.class
        );
    }

    public FetchAllImpersonationSessionsForUserResponse fetchAllForUser(FetchAllImpersonationSessionsForUserCommand command)
            throws FetchAllImpersonationSessionsForUserException {
        return httpClient.request(
            "FetchAllImpersonationSessionsForUser",
            command,
            FetchAllImpersonationSessionsForUserResponse.class,
            FetchAllImpersonationSessionsForUserException.class
        );
    }

    public FetchAllActiveImpersonationSessionsResponse fetchAllActive(FetchAllActiveImpersonationSessionsCommand command)
            throws FetchAllActiveImpersonationSessionsException {
        return httpClient.request(
            "FetchAllActiveImpersonationSessions",
            command,
            FetchAllActiveImpersonationSessionsResponse.class,
            FetchAllActiveImpersonationSessionsException.class
        );
    }

    public InvalidateImpersonationSessionByIdResponse invalidateById(InvalidateImpersonationSessionByIdCommand command)
            throws InvalidateImpersonationSessionByIdException {
        return httpClient.request(
            "InvalidateImpersonationSessionById",
            command,
            InvalidateImpersonationSessionByIdResponse.class,
            InvalidateImpersonationSessionByIdException.class
        );
    }

    public InvalidateImpersonationSessionByTokenResponse invalidateByToken(InvalidateImpersonationSessionByTokenCommand command)
            throws InvalidateImpersonationSessionByTokenException {
        return httpClient.request(
            "InvalidateImpersonationSessionByToken",
            command,
            InvalidateImpersonationSessionByTokenResponse.class,
            InvalidateImpersonationSessionByTokenException.class
        );
    }

    public InvalidateAllImpersonationSessionsForEmployeeResponse invalidateAllForEmployee(InvalidateAllImpersonationSessionsForEmployeeCommand command)
            throws InvalidateAllImpersonationSessionsForEmployeeException {
        return httpClient.request(
            "InvalidateAllImpersonationSessionsForEmployee",
            command,
            InvalidateAllImpersonationSessionsForEmployeeResponse.class,
            InvalidateAllImpersonationSessionsForEmployeeException.class
        );
    }

    public InvalidateAllImpersonationSessionsForUserResponse invalidateAllForUser(InvalidateAllImpersonationSessionsForUserCommand command)
            throws InvalidateAllImpersonationSessionsForUserException {
        return httpClient.request(
            "InvalidateAllImpersonationSessionsForUser",
            command,
            InvalidateAllImpersonationSessionsForUserResponse.class,
            InvalidateAllImpersonationSessionsForUserException.class
        );
    }

}