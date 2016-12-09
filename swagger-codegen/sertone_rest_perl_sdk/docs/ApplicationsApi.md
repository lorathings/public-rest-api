# WWW::SwaggerClient::ApplicationsApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::ApplicationsApi;
```

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_applications_by_user_id**](ApplicationsApi.md#get_applications_by_user_id) | **GET** /users/{userId}/applications | getApplicationsByUserId() - Gets all applications owned by given user.
[**get_applications_by_user_id_and_app_id**](ApplicationsApi.md#get_applications_by_user_id_and_app_id) | **GET** /users/{userId}/applications/{appEui} | getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.


# **get_applications_by_user_id**
> ARRAY[Applications] get_applications_by_user_id(user_id => $user_id)

getApplicationsByUserId() - Gets all applications owned by given user.



### Example 
```perl
use Data::Dumper;

# Configure API key authorization: server_token
$WWW::SwaggerClient::Configuration::api_key->{'Authorization'} = 'YOUR_API_KEY';
# uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$WWW::SwaggerClient::Configuration::api_key_prefix->{'Authorization'} = "Bearer";
# Configure API key authorization: client_id
$WWW::SwaggerClient::Configuration::api_key->{'ClientID'} = 'YOUR_API_KEY';
# uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$WWW::SwaggerClient::Configuration::api_key_prefix->{'ClientID'} = "Bearer";

my $api_instance = WWW::SwaggerClient::ApplicationsApi->new();
my $user_id = 'user_id_example'; # string | The userId whom to get owned applications

eval { 
    my $result = $api_instance->get_applications_by_user_id(user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ApplicationsApi->get_applications_by_user_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The userId whom to get owned applications | 

### Return type

[**ARRAY[Applications]**](Applications.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_applications_by_user_id_and_app_id**
> Applications get_applications_by_user_id_and_app_id(user_id => $user_id, app_eui => $app_eui)

getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.



### Example 
```perl
use Data::Dumper;

# Configure API key authorization: server_token
$WWW::SwaggerClient::Configuration::api_key->{'Authorization'} = 'YOUR_API_KEY';
# uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$WWW::SwaggerClient::Configuration::api_key_prefix->{'Authorization'} = "Bearer";
# Configure API key authorization: client_id
$WWW::SwaggerClient::Configuration::api_key->{'ClientID'} = 'YOUR_API_KEY';
# uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$WWW::SwaggerClient::Configuration::api_key_prefix->{'ClientID'} = "Bearer";

my $api_instance = WWW::SwaggerClient::ApplicationsApi->new();
my $user_id = 'user_id_example'; # string | The userId where application will be retrieved
my $app_eui = 'app_eui_example'; # string | The applicationId to be retrieved

eval { 
    my $result = $api_instance->get_applications_by_user_id_and_app_id(user_id => $user_id, app_eui => $app_eui);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ApplicationsApi->get_applications_by_user_id_and_app_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The userId where application will be retrieved | 
 **app_eui** | **string**| The applicationId to be retrieved | 

### Return type

[**Applications**](Applications.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

