# SertoneRestApi.NodesApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNodesByUserId**](NodesApi.md#getNodesByUserId) | **GET** /users/{userId}/nodes | getNodesByUserId() - Gets all nodes owned by given user.
[**getNodesByUserIdAndSensorId**](NodesApi.md#getNodesByUserIdAndSensorId) | **GET** /users/{userId}/nodes/{devEui} | getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.


<a name="getNodesByUserId"></a>
# **getNodesByUserId**
> [Nodes] getNodesByUserId(userId)

getNodesByUserId() - Gets all nodes owned by given user.



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

var apiInstance = new SertoneRestApi.NodesApi();

var userId = "userId_example"; // String | The userId whom to get owned nodes


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNodesByUserId(userId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId whom to get owned nodes | 

### Return type

[**[Nodes]**](Nodes.md)

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

var apiInstance = new SertoneRestApi.NodesApi();

var userId = "userId_example"; // String | The userId where node will be retrieved

var devEui = "devEui_example"; // String | The sensorID to be retrieved


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNodesByUserIdAndSensorId(userId, devEui, callback);
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

