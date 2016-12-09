# WWW::SwaggerClient::GatewaysApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::GatewaysApi;
```

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_gateway_status**](GatewaysApi.md#get_gateway_status) | **GET** /gateways/{gwEui}/status | getGatewayStatus() - Gets current status of gateway.
[**get_gateways_by_user_id**](GatewaysApi.md#get_gateways_by_user_id) | **GET** /users/{userId}/gateways | getGatewaysByUserId() - Gets all gateways owned by given user.


# **get_gateway_status**
> GatewaysStatus get_gateway_status(gw_eui => $gw_eui)

getGatewayStatus() - Gets current status of gateway.



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

my $api_instance = WWW::SwaggerClient::GatewaysApi->new();
my $gw_eui = 'gw_eui_example'; # string | The gatewayId to be retrieved

eval { 
    my $result = $api_instance->get_gateway_status(gw_eui => $gw_eui);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GatewaysApi->get_gateway_status: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gw_eui** | **string**| The gatewayId to be retrieved | 

### Return type

[**GatewaysStatus**](GatewaysStatus.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_gateways_by_user_id**
> ARRAY[Gateways] get_gateways_by_user_id(user_id => $user_id)

getGatewaysByUserId() - Gets all gateways owned by given user.



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

my $api_instance = WWW::SwaggerClient::GatewaysApi->new();
my $user_id = 'user_id_example'; # string | The userId whom to get owned gateways

eval { 
    my $result = $api_instance->get_gateways_by_user_id(user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GatewaysApi->get_gateways_by_user_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The userId whom to get owned gateways | 

### Return type

[**ARRAY[Gateways]**](Gateways.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

