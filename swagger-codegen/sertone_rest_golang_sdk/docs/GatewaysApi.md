# \GatewaysApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetGatewayStatus**](GatewaysApi.md#GetGatewayStatus) | **Get** /gateways/{gwEui}/status | getGatewayStatus() - Gets current status of gateway.
[**GetGatewaysByUserId**](GatewaysApi.md#GetGatewaysByUserId) | **Get** /users/{userId}/gateways | getGatewaysByUserId() - Gets all gateways owned by given user.


# **GetGatewayStatus**
> GatewaysStatus GetGatewayStatus($gwEui)

getGatewayStatus() - Gets current status of gateway.




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gwEui** | **string**| The gatewayId to be retrieved | 

### Return type

[**GatewaysStatus**](GatewaysStatus.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetGatewaysByUserId**
> []Gateways GetGatewaysByUserId($userId)

getGatewaysByUserId() - Gets all gateways owned by given user.




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string**| The userId whom to get owned gateways | 

### Return type

[**[]Gateways**](Gateways.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

