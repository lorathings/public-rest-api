# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApplicationsApi;

import java.io.File;
import java.util.*;

public class ApplicationsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: server_token
        ApiKeyAuth server_token = (ApiKeyAuth) defaultClient.getAuthentication("server_token");
        server_token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //server_token.setApiKeyPrefix("Token");

        // Configure API key authorization: client_id
        ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
        client_id.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //client_id.setApiKeyPrefix("Token");

        ApplicationsApi apiInstance = new ApplicationsApi();
        String userId = "userId_example"; // String | The userId whom to get owned applications
        try {
            List<Applications> result = apiInstance.getApplicationsByUserId(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationsApi#getApplicationsByUserId");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.dds.sertone.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationsApi* | [**getApplicationsByUserId**](docs/ApplicationsApi.md#getApplicationsByUserId) | **GET** /users/{userId}/applications | getApplicationsByUserId() - Gets all applications owned by given user.
*ApplicationsApi* | [**getApplicationsByUserIdAndAppId**](docs/ApplicationsApi.md#getApplicationsByUserIdAndAppId) | **GET** /users/{userId}/applications/{appEui} | getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.
*DataApi* | [**getAppDevDataPayload**](docs/DataApi.md#getAppDevDataPayload) | **GET** /data/{appEui}/nodes/{devEui} | getAppDevDataPayload() - Gets payload data of given application and device.
*DataApi* | [**getAppDevLastDataTimestamp**](docs/DataApi.md#getAppDevLastDataTimestamp) | **GET** /data/{appEui}/nodes/{devEui}/timestamp | getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
*DataApi* | [**getAppDevLatestCounter**](docs/DataApi.md#getAppDevLatestCounter) | **GET** /data/{appEui}/nodes/{devEui}/count | getAppDevLatestCounter() - Gets the latest counter for a given application and device.
*DataApi* | [**getAppLastDataMethod**](docs/DataApi.md#getAppLastDataMethod) | **GET** /data/{appEui}/method | getAppLastDataMethod() - Gets last data delivery method for a given application.
*DataApi* | [**getAppLastDataTimestamp**](docs/DataApi.md#getAppLastDataTimestamp) | **GET** /data/{appEui}/timestamp | getAppLastDataTimestamp() - Gets last data timestamp for a given application.
*GatewaysApi* | [**getGatewayStatus**](docs/GatewaysApi.md#getGatewayStatus) | **GET** /gateways/{gwEui}/status | getGatewayStatus() - Gets current status of gateway.
*GatewaysApi* | [**getGatewaysByUserId**](docs/GatewaysApi.md#getGatewaysByUserId) | **GET** /users/{userId}/gateways | getGatewaysByUserId() - Gets all gateways owned by given user.
*NodesApi* | [**getNodesByUserId**](docs/NodesApi.md#getNodesByUserId) | **GET** /users/{userId}/nodes | getNodesByUserId() - Gets all nodes owned by given user.
*NodesApi* | [**getNodesByUserIdAndSensorId**](docs/NodesApi.md#getNodesByUserIdAndSensorId) | **GET** /users/{userId}/nodes/{devEui} | getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.
*SystemApi* | [**getSystemHealthz**](docs/SystemApi.md#getSystemHealthz) | **GET** /system/healthz | getSystemHealthz() - Gets status health of the api server


## Documentation for Models

 - [Applications](docs/Applications.md)
 - [DataPayload](docs/DataPayload.md)
 - [Gateways](docs/Gateways.md)
 - [GatewaysStatus](docs/GatewaysStatus.md)
 - [NodeInfo](docs/NodeInfo.md)
 - [Nodes](docs/Nodes.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### petstore_auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorizatoin URL**: http://petstore.www.sertone.com/oauth/dialog
- **Scopes**: 
  - write:pets: modify pets in your account
  - read:pets: read your pets

### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header

### server_token

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### client_id

- **Type**: API key
- **API key parameter name**: ClientID
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

email@sertone.com

