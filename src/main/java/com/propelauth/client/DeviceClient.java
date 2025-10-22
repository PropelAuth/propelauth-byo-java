package com.propelauth.client;

import com.propelauth.client.generated.*;
import com.propelauth.client.internal.HttpClient;

public class DeviceClient {
    private final HttpClient httpClient;

    public DeviceClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public CreateDeviceChallengeResponse createChallenge(CreateDeviceChallengeCommand command)
            throws CreateDeviceChallengeException {
        return httpClient.request(
            "CreateDeviceChallenge",
            command,
            CreateDeviceChallengeResponse.class,
            CreateDeviceChallengeException.class
        );
    }

    public RegisterDeviceResponse register(RegisterDeviceCommand command)
            throws RegisterDeviceException {
        return httpClient.request(
            "RegisterDevice",
            command,
            RegisterDeviceResponse.class,
            RegisterDeviceException.class
        );
    }

}