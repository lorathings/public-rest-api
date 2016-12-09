# WWW::SwaggerClient::DataApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::DataApi;
```

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_app_dev_data_payload**](DataApi.md#get_app_dev_data_payload) | **GET** /data/{appEui}/nodes/{devEui} | getAppDevDataPayload() - Gets payload data of given application and device.
[**get_app_dev_last_data_timestamp**](DataApi.md#get_app_dev_last_data_timestamp) | **GET** /data/{appEui}/nodes/{devEui}/timestamp | getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
[**get_app_dev_latest_counter**](DataApi.md#get_app_dev_latest_counter) | **GET** /data/{appEui}/nodes/{devEui}/count | getAppDevLatestCounter() - Gets the latest counter for a given application and device.
[**get_app_last_data_method**](DataApi.md#get_app_last_data_method) | **GET** /data/{appEui}/method | getAppLastDataMethod() - Gets last data delivery method for a given application.
[**get_app_last_data_timestamp**](DataApi.md#get_app_last_data_timestamp) | **GET** /data/{appEui}/timestamp | getAppLastDataTimestamp() - Gets last data timestamp for a given application.


# **get_app_dev_data_payload**
> ARRAY[DataPayload] get_app_dev_data_payload(app_eui => $app_eui, dev_eui => $dev_eui)

getAppDevDataPayload() - Gets payload data of given application and device.

This can only be done by the logged in users.

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

my $api_instance = WWW::SwaggerClient::DataApi->new();
my $app_eui = 'app_eui_example'; # string | The appEui where payload will be retrieved
my $dev_eui = 'dev_eui_example'; # string | The devEui where payload will be retrieved

eval { 
    my $result = $api_instance->get_app_dev_data_payload(app_eui => $app_eui, dev_eui => $dev_eui);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DataApi->get_app_dev_data_payload: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **string**| The appEui where payload will be retrieved | 
 **dev_eui** | **string**| The devEui where payload will be retrieved | 

### Return type

[**ARRAY[DataPayload]**](DataPayload.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_dev_last_data_timestamp**
> string get_app_dev_last_data_timestamp(app_eui => $app_eui, dev_eui => $dev_eui)

getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.

This can only be done by the logged in users.

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

my $api_instance = WWW::SwaggerClient::DataApi->new();
my $app_eui = 'app_eui_example'; # string | The appEui whom to get last timestamp
my $dev_eui = 'dev_eui_example'; # string | The devEui whom to get last timestamp

eval { 
    my $result = $api_instance->get_app_dev_last_data_timestamp(app_eui => $app_eui, dev_eui => $dev_eui);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DataApi->get_app_dev_last_data_timestamp: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **string**| The appEui whom to get last timestamp | 
 **dev_eui** | **string**| The devEui whom to get last timestamp | 

### Return type

**string**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_dev_latest_counter**
> int get_app_dev_latest_counter(app_eui => $app_eui, dev_eui => $dev_eui)

getAppDevLatestCounter() - Gets the latest counter for a given application and device.

This can only be done by the logged in users.

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

my $api_instance = WWW::SwaggerClient::DataApi->new();
my $app_eui = 'app_eui_example'; # string | The appEui whom to get last timestamp
my $dev_eui = 'dev_eui_example'; # string | The devEui whom to get last timestamp

eval { 
    my $result = $api_instance->get_app_dev_latest_counter(app_eui => $app_eui, dev_eui => $dev_eui);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DataApi->get_app_dev_latest_counter: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **string**| The appEui whom to get last timestamp | 
 **dev_eui** | **string**| The devEui whom to get last timestamp | 

### Return type

**int**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_last_data_method**
> string get_app_last_data_method(app_eui => $app_eui)

getAppLastDataMethod() - Gets last data delivery method for a given application.

This can only be done by the logged in users.

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

my $api_instance = WWW::SwaggerClient::DataApi->new();
my $app_eui = 'app_eui_example'; # string | The appEui whom to get last timestamp

eval { 
    my $result = $api_instance->get_app_last_data_method(app_eui => $app_eui);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DataApi->get_app_last_data_method: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **string**| The appEui whom to get last timestamp | 

### Return type

**string**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_last_data_timestamp**
> string get_app_last_data_timestamp(app_eui => $app_eui)

getAppLastDataTimestamp() - Gets last data timestamp for a given application.

This can only be done by the logged in users.

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

my $api_instance = WWW::SwaggerClient::DataApi->new();
my $app_eui = 'app_eui_example'; # string | The appEui whom to get last timestamp

eval { 
    my $result = $api_instance->get_app_last_data_timestamp(app_eui => $app_eui);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DataApi->get_app_last_data_timestamp: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **string**| The appEui whom to get last timestamp | 

### Return type

**string**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

