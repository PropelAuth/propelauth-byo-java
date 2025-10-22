package com.propelauth.client;

import com.propelauth.client.internal.HttpClient;
import com.propelauth.client.PasskeyClient;
import com.propelauth.client.SessionClient;
import com.propelauth.client.ScimClient;
import com.propelauth.client.ImpersonationClient;
import com.propelauth.client.SsoClient;
import com.propelauth.client.generated.PingCommand;
import com.propelauth.client.generated.PingResponse;
import com.propelauth.client.generated.PingException;

/**
 * Main client for interacting with PropelAuth backend services.
 */
public class PropelAuthClient {
    private final HttpClient httpClient;

    public final PasskeyClient passkeys;
    public final SessionClient session;
    public final ScimClient scim;
    public final ImpersonationClient impersonation;
    public final SsoClient sso;

    public PropelAuthClient(String url, String integrationKey) {
        this(url, integrationKey, null);
    }

    public PropelAuthClient(String url, String integrationKey, java.net.http.HttpClient httpClient) {
        this.httpClient = new HttpClient(url, integrationKey, httpClient);

        // Initialize sub-clients
        this.passkeys = new PasskeyClient(this.httpClient);
        this.session = new SessionClient(this.httpClient);
        this.scim = new ScimClient(this.httpClient);
        this.impersonation = new ImpersonationClient(this.httpClient);
        this.sso = new SsoClient(this.httpClient);
    }

    public PingResponse ping(PingCommand command)
            throws PingException {
        return httpClient.request(
            "Ping",
            command,
            PingResponse.class,
            PingException.class
        );
    }

    /**
     * Creates a PropelAuth client with default settings.
     */
    public static PropelAuthClient create(String url, String integrationKey) {
        return new PropelAuthClient(url, integrationKey);
    }

    /**
     * Creates a PropelAuth client with a custom HttpClient.
     */
    public static PropelAuthClient create(String url, String integrationKey, java.net.http.HttpClient httpClient) {
        return new PropelAuthClient(url, integrationKey, httpClient);
    }
}