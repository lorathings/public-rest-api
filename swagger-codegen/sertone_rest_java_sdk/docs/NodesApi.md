# NodesApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNodesByUserId**](NodesApi.md#getNodesByUserId) | **GET** /users/{userId}/nodes | getNodesByUserId() - Gets all nodes owned by given user.
[**getNodesByUserIdAndSensorId**](NodesApi.md#getNodesByUserIdAndSensorId) | **GET** /users/{userId}/nodes/{devEui} | getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.


<a name="getNodesByUserId"></a>
# **getNodesByUserId**
> List&lt;Nodes&gt; getNodesByUserId(userId)

getNodesByUserId() - Gets all nodes owned by given user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodesApi;

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

NodesApi apiInstance = new NodesApi();
String userId = "userId_example"; // String | The userId whom to get owned nodes
try {
    List<Nodes> result = apiInstance.getNodesByUserId(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#getNodesByUserId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId whom to get owned nodes |

### Return type

[**List&lt;Nodes&gt;**](Nodes.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getNodesByUserIdAndSensorId"></a>
# **getNodesByUserIdAndSensorId**
> NodeInfo getNodesByUserIdAndSensorId(userId, devEui)

getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodesApi;

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

NodesApi apiInstance = new NodesApi();
String userId = "userId_example"; // String | The userId where node will be retrieved
String devEui = "devEui_example"; // String | The sensorID to be retrieved
try {
    NodeInfo result = apiInstance.getNodesByUserIdAndSensorId(userId, devEui);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#getNodesByUserIdAndSensorId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId where node will be retrieved |
 **devEui** | **String**| The sensorID to be retrieved |

### Return type

[**NodeInfo**](NodeInfo.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

