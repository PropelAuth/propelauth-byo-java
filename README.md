# PropelAuth Java Client Library

Official Java client library for the PropelAuth API.

## Installation

### Gradle

```gradle
dependencies {
    implementation 'com.propelauth:propelauth-byo:1.0.3'
}
```

### Maven

```xml
<dependency>
    <groupId>com.propelauth</groupId>
    <artifactId>propelauth-byo</artifactId>
    <version>1.0.3</version>
</dependency>
```

## Usage

### Basic Usage

```java
import com.propelauth.client.PropelAuthClient;
import com.propelauth.client.generated.*;

// Create client
PropelAuthClient client = PropelAuthClient.create(
    "https://your-byo-instance.com",
    "your-integration-key"
);

// Validate a session
ValidateSessionCommand validateCommand = ValidateSessionCommand.builder()
    .sessionToken(token)
    .ipAddress("192.168.1.1")
    .build();

try {
    ValidateSessionResponse response = client.session.validate(validateCommand);
    System.out.println("User ID: " + response.getUserId());
} catch (ValidateSessionException ex) {
    if (ex instanceof ValidateSessionException.InvalidSessionToken) {
        System.out.println("Invalid session token");
    } else if (ex instanceof ValidateSessionException.NewDeviceChallengeRequired) {
        ValidateSessionException.NewDeviceChallengeRequired challenge =
            (ValidateSessionException.NewDeviceChallengeRequired) ex;
        System.out.println("Device challenge required: " +
            challenge.getDetails().getDeviceChallenge());
    } else {
        System.out.println("Validation failed: " + ex.getMessage());
    }
}
```

### Using with Dependency Injection

```java
// Create a singleton instance
@Bean
public PropelAuthClient propelAuthClient(
    @Value("${propelauth.url}") String url,
    @Value("${propelauth.integrationKey}") String integrationKey) {
    return PropelAuthClient.create(url, integrationKey);
}

// Inject into your services
@Service
public class AuthService {
    private final PropelAuthClient propelAuthClient;

    public AuthService(PropelAuthClient propelAuthClient) {
        this.propelAuthClient = propelAuthClient;
    }
}
```

## Features

- **Strong typing**: Full type safety with immutable builders via Lombok
- **Type-safe errors**: Polymorphic exception hierarchy for error handling
- **Hierarchical design**: Organized client structure for discoverability
- **Immutable models**: All data models are immutable with builder pattern
- **Jackson integration**: Seamless JSON serialization/deserialization

## Client Structure

The client is organized hierarchically:

```java
client.session.validate(command);
client.session.device.createChallenge(command);
client.scim.createConnection(command);
client.passkeys.startRegistration(command);
client.impersonation.create(command);
client.sso.initiateOidcLogin(command);
```

## Error Handling

All API errors are thrown as typed exceptions with specific subtypes:

```java
try {
    ValidateSessionResponse response = client.session.validate(command);
} catch (ValidateSessionException ex) {
    if (ex instanceof ValidateSessionException.NewDeviceChallengeRequired) {
        ValidateSessionException.NewDeviceChallengeRequired challenge =
            (ValidateSessionException.NewDeviceChallengeRequired) ex;
        // Handle device challenge
    } else if (ex instanceof ValidateSessionException.InvalidSessionToken) {
        // Handle invalid token
    } else if (ex instanceof ValidateSessionException.UnexpectedError) {
        // Handle unexpected errors
    }
}
```

## Requirements

- Java 11 or later

## License

MIT
