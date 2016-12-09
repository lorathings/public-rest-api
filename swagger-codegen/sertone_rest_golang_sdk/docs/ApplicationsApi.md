# \ApplicationsApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetApplicationsByUserId**](ApplicationsApi.md#GetApplicationsByUserId) | **Get** /users/{userId}/applications | getApplicationsByUserId() - Gets all applications owned by given user.
[**GetApplicationsByUserIdAndAppId**](ApplicationsApi.md#GetApplicationsByUserIdAndAppId) | **Get** /users/{userId}/applications/{appEui} | getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.


# **GetApplicationsByUserId**
> []Applications GetApplicationsByUserId($userId)

getApplicationsByUserId() - Gets all applications owned by given user.




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string**| The userId whom to get owned applications | 

### Return type

[**[]Applications**](Applications.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetApplicationsByUserIdAndAppId**
> Applications GetApplicationsByUserIdAndAppId($userId, $appEui)

getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string**| The userId where application will be retrieved | 
 **appEui** | **string**| The applicationId to be retrieved | 

### Return type

[**Applications**](Applications.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

