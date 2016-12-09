# \DataApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAppDevDataPayload**](DataApi.md#GetAppDevDataPayload) | **Get** /data/{appEui}/nodes/{devEui} | getAppDevDataPayload() - Gets payload data of given application and device.
[**GetAppDevLastDataTimestamp**](DataApi.md#GetAppDevLastDataTimestamp) | **Get** /data/{appEui}/nodes/{devEui}/timestamp | getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
[**GetAppDevLatestCounter**](DataApi.md#GetAppDevLatestCounter) | **Get** /data/{appEui}/nodes/{devEui}/count | getAppDevLatestCounter() - Gets the latest counter for a given application and device.
[**GetAppLastDataMethod**](DataApi.md#GetAppLastDataMethod) | **Get** /data/{appEui}/method | getAppLastDataMethod() - Gets last data delivery method for a given application.
[**GetAppLastDataTimestamp**](DataApi.md#GetAppLastDataTimestamp) | **Get** /data/{appEui}/timestamp | getAppLastDataTimestamp() - Gets last data timestamp for a given application.


# **GetAppDevDataPayload**
> []DataPayload GetAppDevDataPayload($appEui, $devEui)

getAppDevDataPayload() - Gets payload data of given application and device.

This can only be done by the logged in users.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **string**| The appEui where payload will be retrieved | 
 **devEui** | **string**| The devEui where payload will be retrieved | 

### Return type

[**[]DataPayload**](DataPayload.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAppDevLastDataTimestamp**
> string GetAppDevLastDataTimestamp($appEui, $devEui)

getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.

This can only be done by the logged in users.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **string**| The appEui whom to get last timestamp | 
 **devEui** | **string**| The devEui whom to get last timestamp | 

### Return type

**string**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAppDevLatestCounter**
> int64 GetAppDevLatestCounter($appEui, $devEui)

getAppDevLatestCounter() - Gets the latest counter for a given application and device.

This can only be done by the logged in users.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **string**| The appEui whom to get last timestamp | 
 **devEui** | **string**| The devEui whom to get last timestamp | 

### Return type

**int64**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAppLastDataMethod**
> string GetAppLastDataMethod($appEui)

getAppLastDataMethod() - Gets last data delivery method for a given application.

This can only be done by the logged in users.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **string**| The appEui whom to get last timestamp | 

### Return type

**string**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAppLastDataTimestamp**
> string GetAppLastDataTimestamp($appEui)

getAppLastDataTimestamp() - Gets last data timestamp for a given application.

This can only be done by the logged in users.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appEui** | **string**| The appEui whom to get last timestamp | 

### Return type

**string**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

