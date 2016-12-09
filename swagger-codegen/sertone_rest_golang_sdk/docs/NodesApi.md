# \NodesApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetNodesByUserId**](NodesApi.md#GetNodesByUserId) | **Get** /users/{userId}/nodes | getNodesByUserId() - Gets all nodes owned by given user.
[**GetNodesByUserIdAndSensorId**](NodesApi.md#GetNodesByUserIdAndSensorId) | **Get** /users/{userId}/nodes/{devEui} | getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.


# **GetNodesByUserId**
> []Nodes GetNodesByUserId($userId)

getNodesByUserId() - Gets all nodes owned by given user.




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string**| The userId whom to get owned nodes | 

### Return type

[**[]Nodes**](Nodes.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetNodesByUserIdAndSensorId**
> NodeInfo GetNodesByUserIdAndSensorId($userId, $devEui)

getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string**| The userId where node will be retrieved | 
 **devEui** | **string**| The sensorID to be retrieved | 

### Return type

[**NodeInfo**](NodeInfo.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

