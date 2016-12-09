# ApplicationsApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplicationsByUserId**](ApplicationsApi.md#getApplicationsByUserId) | **GET** /users/{userId}/applications | getApplicationsByUserId() - Gets all applications owned by given user.
[**getApplicationsByUserIdAndAppId**](ApplicationsApi.md#getApplicationsByUserIdAndAppId) | **GET** /users/{userId}/applications/{appEui} | getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.


<a name="getApplicationsByUserId"></a>
# **getApplicationsByUserId**
> List&lt;Applications&gt; getApplicationsByUserId(userId)

getApplicationsByUserId() - Gets all applications owned by given user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationsApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId whom to get owned applications |

### Return type

[**List&lt;Applications&gt;**](Applications.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getApplicationsByUserIdAndAppId"></a>
# **getApplicationsByUserIdAndAppId**
> Applications getApplicationsByUserIdAndAppId(userId, appEui)

getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationsApi;

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
String userId = "userId_example"; // String | The userId where application will be retrieved
String appEui = "appEui_example"; // String | The applicationId to be retrieved
try {
    Applications result = apiInstance.getApplicationsByUserIdAndAppId(userId, appEui);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationsApi#getApplicationsByUserIdAndAppId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId where application will be retrieved |
 **appEui** | **String**| The applicationId to be retrieved |

### Return type

[**Applications**](Applications.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

