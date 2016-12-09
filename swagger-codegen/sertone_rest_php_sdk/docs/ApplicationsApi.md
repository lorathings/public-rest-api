# SertoneRestApi.ApplicationsApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplicationsByUserId**](ApplicationsApi.md#getApplicationsByUserId) | **GET** /users/{userId}/applications | getApplicationsByUserId() - Gets all applications owned by given user.
[**getApplicationsByUserIdAndAppId**](ApplicationsApi.md#getApplicationsByUserIdAndAppId) | **GET** /users/{userId}/applications/{appEui} | getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.


<a name="getApplicationsByUserId"></a>
# **getApplicationsByUserId**
> [Applications] getApplicationsByUserId(userId)

getApplicationsByUserId() - Gets all applications owned by given user.



### Example
```javascript
var SertoneRestApi = require('sertone-rest-api');
var defaultClient = SertoneRestApi.ApiClient.default;

// Configure API key authorization: server_token
var server_token = defaultClient.authentications['server_token'];
server_token.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//server_token.apiKeyPrefix = 'Token';

// Configure API key authorization: client_id
var client_id = defaultClient.authentications['client_id'];
client_id.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client_id.apiKeyPrefix = 'Token';

var apiInstance = new SertoneRestApi.ApplicationsApi();

var userId = "userId_example"; // String | The userId whom to get owned applications


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getApplicationsByUserId(userId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId whom to get owned applications | 

### Return type

[**[Applications]**](Applications.md)

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
```javascript
var SertoneRestApi = require('sertone-rest-api');
var defaultClient = SertoneRestApi.ApiClient.default;

// Configure API key authorization: server_token
var server_token = defaultClient.authentications['server_token'];
server_token.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//server_token.apiKeyPrefix = 'Token';

// Configure API key authorization: client_id
var client_id = defaultClient.authentications['client_id'];
client_id.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client_id.apiKeyPrefix = 'Token';

var apiInstance = new SertoneRestApi.ApplicationsApi();

var userId = "userId_example"; // String | The userId where application will be retrieved

var appEui = "appEui_example"; // String | The applicationId to be retrieved


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getApplicationsByUserIdAndAppId(userId, appEui, callback);
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

