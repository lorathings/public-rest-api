# DataApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppDevDataPayload**](DataApi.md#getAppDevDataPayload) | **GET** /data/{appEui}/nodes/{devEui} | getAppDevDataPayload() - Gets payload data of given application and device.
[**getAppDevLastDataTimestamp**](DataApi.md#getAppDevLastDataTimestamp) | **GET** /data/{appEui}/nodes/{devEui}/timestamp | getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
[**getAppDevLatestCounter**](DataApi.md#getAppDevLatestCounter) | **GET** /data/{appEui}/nodes/{devEui}/count | getAppDevLatestCounter() - Gets the latest counter for a given application and device.
[**getAppLastDataMethod**](DataApi.md#getAppLastDataMethod) | **GET** /data/{appEui}/method | getAppLastDataMethod() - Gets last data delivery method for a given application.
[**getAppLastDataTimestamp**](DataApi.md#getAppLastDataTimestamp) | **GET** /data/{appEui}/timestamp | getAppLastDataTimestamp() - Gets last data timestamp for a given application.


<a name="getAppDevDataPayload"></a>
# **getAppDevDataPayload**
> List&lt;DataPayload&gt; getAppDevDataPayload(appEui, devEui)

getAppDevDataPayload() - Gets payload data of given application and device.

This can only be done by the logged in users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

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

DataApi apiInstance = new DataApi();
String appEui = "appEui_example"; // String | The appEui where payload will be retrieved
String devEui = "devEui_example"; // String | The devEui where payload will be retrieved
try {
    List<DataPayload> result = apiInstance.getAppDevDataPayload(appEui, devEui);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getAppDevDataPayload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **String**| The appEui where payload will be retrieved |
 **devEui** | **String**| The devEui where payload will be retrieved |

### Return type

[**List&lt;DataPayload&gt;**](DataPayload.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAppDevLastDataTimestamp"></a>
# **getAppDevLastDataTimestamp**
> String getAppDevLastDataTimestamp(appEui, devEui)

getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.

This can only be done by the logged in users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

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

DataApi apiInstance = new DataApi();
String appEui = "appEui_example"; // String | The appEui whom to get last timestamp
String devEui = "devEui_example"; // String | The devEui whom to get last timestamp
try {
    String result = apiInstance.getAppDevLastDataTimestamp(appEui, devEui);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getAppDevLastDataTimestamp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **String**| The appEui whom to get last timestamp |
 **devEui** | **String**| The devEui whom to get last timestamp |

### Return type

**String**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAppDevLatestCounter"></a>
# **getAppDevLatestCounter**
> Long getAppDevLatestCounter(appEui, devEui)

getAppDevLatestCounter() - Gets the latest counter for a given application and device.

This can only be done by the logged in users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

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

DataApi apiInstance = new DataApi();
String appEui = "appEui_example"; // String | The appEui whom to get last timestamp
String devEui = "devEui_example"; // String | The devEui whom to get last timestamp
try {
    Long result = apiInstance.getAppDevLatestCounter(appEui, devEui);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getAppDevLatestCounter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **String**| The appEui whom to get last timestamp |
 **devEui** | **String**| The devEui whom to get last timestamp |

### Return type

**Long**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAppLastDataMethod"></a>
# **getAppLastDataMethod**
> String getAppLastDataMethod(appEui)

getAppLastDataMethod() - Gets last data delivery method for a given application.

This can only be done by the logged in users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

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

DataApi apiInstance = new DataApi();
String appEui = "appEui_example"; // String | The appEui whom to get last timestamp
try {
    String result = apiInstance.getAppLastDataMethod(appEui);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getAppLastDataMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **String**| The appEui whom to get last timestamp |

### Return type

**String**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAppLastDataTimestamp"></a>
# **getAppLastDataTimestamp**
> String getAppLastDataTimestamp(appEui)

getAppLastDataTimestamp() - Gets last data timestamp for a given application.

This can only be done by the logged in users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

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

DataApi apiInstance = new DataApi();
String appEui = "appEui_example"; // String | The appEui whom to get last timestamp
try {
    String result = apiInstance.getAppLastDataTimestamp(appEui);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getAppLastDataTimestamp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **String**| The appEui whom to get last timestamp |

### Return type

**String**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

