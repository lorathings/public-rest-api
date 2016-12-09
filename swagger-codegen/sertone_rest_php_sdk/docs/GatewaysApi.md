# SertoneRestApi.GatewaysApi

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

var apiInstance = new SertoneRestApi.GatewaysApi();

var gwEui = "gwEui_example"; // String | The gatewayId to be retrieved


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGatewayStatus(gwEui, callback);
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
> [Gateways] getGatewaysByUserId(userId)

getGatewaysByUserId() - Gets all gateways owned by given user.



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

var apiInstance = new SertoneRestApi.GatewaysApi();

var userId = "userId_example"; // String | The userId whom to get owned gateways


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGatewaysByUserId(userId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId whom to get owned gateways | 

### Return type

[**[Gateways]**](Gateways.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

