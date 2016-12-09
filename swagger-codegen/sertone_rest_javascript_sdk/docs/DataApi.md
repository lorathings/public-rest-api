# SertoneRestApi.DataApi

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
> [DataPayload] getAppDevDataPayload(appEui, devEui)

getAppDevDataPayload() - Gets payload data of given application and device.

This can only be done by the logged in users.

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

var apiInstance = new SertoneRestApi.DataApi();

var appEui = "appEui_example"; // String | The appEui where payload will be retrieved

var devEui = "devEui_example"; // String | The devEui where payload will be retrieved


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAppDevDataPayload(appEui, devEui, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **String**| The appEui where payload will be retrieved | 
 **devEui** | **String**| The devEui where payload will be retrieved | 

### Return type

[**[DataPayload]**](DataPayload.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAppDevLastDataTimestamp"></a>
# **getAppDevLastDataTimestamp**
> &#39;String&#39; getAppDevLastDataTimestamp(appEui, devEui)

getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.

This can only be done by the logged in users.

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

var apiInstance = new SertoneRestApi.DataApi();

var appEui = "appEui_example"; // String | The appEui whom to get last timestamp

var devEui = "devEui_example"; // String | The devEui whom to get last timestamp


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAppDevLastDataTimestamp(appEui, devEui, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **String**| The appEui whom to get last timestamp | 
 **devEui** | **String**| The devEui whom to get last timestamp | 

### Return type

**&#39;String&#39;**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAppDevLatestCounter"></a>
# **getAppDevLatestCounter**
> &#39;Integer&#39; getAppDevLatestCounter(appEui, devEui)

getAppDevLatestCounter() - Gets the latest counter for a given application and device.

This can only be done by the logged in users.

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

var apiInstance = new SertoneRestApi.DataApi();

var appEui = "appEui_example"; // String | The appEui whom to get last timestamp

var devEui = "devEui_example"; // String | The devEui whom to get last timestamp


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAppDevLatestCounter(appEui, devEui, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **String**| The appEui whom to get last timestamp | 
 **devEui** | **String**| The devEui whom to get last timestamp | 

### Return type

**&#39;Integer&#39;**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAppLastDataMethod"></a>
# **getAppLastDataMethod**
> &#39;String&#39; getAppLastDataMethod(appEui)

getAppLastDataMethod() - Gets last data delivery method for a given application.

This can only be done by the logged in users.

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

var apiInstance = new SertoneRestApi.DataApi();

var appEui = "appEui_example"; // String | The appEui whom to get last timestamp


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAppLastDataMethod(appEui, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **String**| The appEui whom to get last timestamp | 

### Return type

**&#39;String&#39;**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAppLastDataTimestamp"></a>
# **getAppLastDataTimestamp**
> &#39;String&#39; getAppLastDataTimestamp(appEui)

getAppLastDataTimestamp() - Gets last data timestamp for a given application.

This can only be done by the logged in users.

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

var apiInstance = new SertoneRestApi.DataApi();

var appEui = "appEui_example"; // String | The appEui whom to get last timestamp


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAppLastDataTimestamp(appEui, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **String**| The appEui whom to get last timestamp | 

### Return type

**&#39;String&#39;**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

