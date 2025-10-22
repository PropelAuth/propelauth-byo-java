package com.propelauth.client;

import com.propelauth.client.generated.*;
import com.propelauth.client.internal.HttpClient;

public class SessionClient {
    private final HttpClient httpClient;
    public final DeviceClient device;

    public SessionClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        this.device = new DeviceClient(httpClient);
    }

    public CreateSessionResponse create(CreateSessionCommand command)
            throws CreateSessionException {
        return httpClient.request(
            "CreateSession",
            command,
            CreateSessionResponse.class,
            CreateSessionException.class
        );
    }

    public ValidateSessionResponse validate(ValidateSessionCommand command)
            throws ValidateSessionException {
        return httpClient.request(
            "ValidateSession",
            command,
            ValidateSessionResponse.class,
            ValidateSessionException.class
        );
    }

    public ValidateAndRefreshSessionResponse validateAndRefresh(ValidateAndRefreshSessionCommand command)
            throws ValidateAndRefreshSessionException {
        return httpClient.request(
            "ValidateAndRefreshSession",
            command,
            ValidateAndRefreshSessionResponse.class,
            ValidateAndRefreshSessionException.class
        );
    }

    public FetchAllSessionsForUserResponse fetchAllForUser(FetchAllSessionsForUserCommand command)
            throws FetchAllSessionsForUserException {
        return httpClient.request(
            "FetchAllSessionsForUser",
            command,
            FetchAllSessionsForUserResponse.class,
            FetchAllSessionsForUserException.class
        );
    }

    public FetchAllSessionsResponse fetchAll(FetchAllSessionsCommand command)
            throws FetchAllSessionsException {
        return httpClient.request(
            "FetchAllSessions",
            command,
            FetchAllSessionsResponse.class,
            FetchAllSessionsException.class
        );
    }

    public SessionInfo fetchById(FetchSessionByIdCommand command)
            throws FetchSessionByIdException {
        return httpClient.request(
            "FetchSessionById",
            command,
            SessionInfo.class,
            FetchSessionByIdException.class
        );
    }

    public UpdateSessionResponse update(UpdateSessionCommand command)
            throws UpdateSessionException {
        return httpClient.request(
            "UpdateSession",
            command,
            UpdateSessionResponse.class,
            UpdateSessionException.class
        );
    }

    public UpdateSessionsResponse updateMany(UpdateSessionsCommand command)
            throws UpdateSessionsException {
        return httpClient.request(
            "UpdateSessions",
            command,
            UpdateSessionsResponse.class,
            UpdateSessionsException.class
        );
    }

    public InvalidateSessionByIdResponse invalidateById(InvalidateSessionByIdCommand command)
            throws InvalidateSessionByIdException {
        return httpClient.request(
            "InvalidateSessionById",
            command,
            InvalidateSessionByIdResponse.class,
            InvalidateSessionByIdException.class
        );
    }

    public InvalidateSessionByTokenResponse invalidateByToken(InvalidateSessionByTokenCommand command)
            throws InvalidateSessionByTokenException {
        return httpClient.request(
            "InvalidateSessionByToken",
            command,
            InvalidateSessionByTokenResponse.class,
            InvalidateSessionByTokenException.class
        );
    }

    public InvalidateAllSessionsForUserResponse invalidateAllForUser(InvalidateAllSessionsForUserCommand command)
            throws InvalidateAllSessionsForUserException {
        return httpClient.request(
            "InvalidateAllSessionsForUser",
            command,
            InvalidateAllSessionsForUserResponse.class,
            InvalidateAllSessionsForUserException.class
        );
    }

    public InvalidateAllSessionsForUserExceptOneResponse invalidateAllForUserExceptOne(InvalidateAllSessionsForUserExceptOneCommand command)
            throws InvalidateAllSessionsForUserExceptOneException {
        return httpClient.request(
            "InvalidateAllSessionsForUserExceptOne",
            command,
            InvalidateAllSessionsForUserExceptOneResponse.class,
            InvalidateAllSessionsForUserExceptOneException.class
        );
    }

    public CreateStatelessTokenResponse createStatelessToken(CreateStatelessTokenCommand command)
            throws CreateStatelessTokenException {
        return httpClient.request(
            "CreateStatelessToken",
            command,
            CreateStatelessTokenResponse.class,
            CreateStatelessTokenException.class
        );
    }

    public GetJwksResponse getJwks(GetJwksCommand command)
            throws GetJwksException {
        return httpClient.request(
            "GetJwks",
            command,
            GetJwksResponse.class,
            GetJwksException.class
        );
    }

    public RotateStatelessTokenKeyResponse rotateStatelessTokenKey(RotateStatelessTokenKeyCommand command)
            throws RotateStatelessTokenKeyException {
        return httpClient.request(
            "RotateStatelessTokenKey",
            command,
            RotateStatelessTokenKeyResponse.class,
            RotateStatelessTokenKeyException.class
        );
    }

}