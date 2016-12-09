# GatewaysApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGatewayStatus**](GatewaysApi.md#getGatewayStatus) | **GET** /gateways/{gwEui}/status | getGatewayStatus() - Gets current status of gateway.
[**getGatewaysByUserId**](GatewaysApi.md#getGatewaysByUserId) | **GET** /users/{userId}/gateways | getGatewaysByUserId() - Gets all gateways owned by given user.


<a name="getGatewayStatus"></a>
# **getGatewayStatus**
> GatewaysStatus getGatewayStatus(gwEui)

getGatewayStatus() - Gets current status of gateway.



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GatewaysApi;

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

GatewaysApi apiInstance = new GatewaysApi();
String gwEui = "gwEui_example"; // String | The gatewayId to be retrieved
try {
    GatewaysStatus result = apiInstance.getGatewayStatus(gwEui);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GatewaysApi#getGatewayStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gwEui** | **String**| The gatewayId to be retrieved |

### Return type

[**GatewaysStatus**](GatewaysStatus.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getGatewaysByUserId"></a>
# **getGatewaysByUserId**
> List&lt;Gateways&gt; getGatewaysByUserId(userId)

getGatewaysByUserId() - Gets all gateways owned by given user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GatewaysApi;

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

GatewaysApi apiInstance = new GatewaysApi();
String userId = "userId_example"; // String | The userId whom to get owned gateways
try {
    List<Gateways> result = apiInstance.getGatewaysByUserId(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GatewaysApi#getGatewaysByUserId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId whom to get owned gateways |

### Return type

[**List&lt;Gateways&gt;**](Gateways.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

