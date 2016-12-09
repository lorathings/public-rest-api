# WWW::SwaggerClient::NodesApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::NodesApi;
```

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_nodes_by_user_id**](NodesApi.md#get_nodes_by_user_id) | **GET** /users/{userId}/nodes | getNodesByUserId() - Gets all nodes owned by given user.
[**get_nodes_by_user_id_and_sensor_id**](NodesApi.md#get_nodes_by_user_id_and_sensor_id) | **GET** /users/{userId}/nodes/{devEui} | getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.


# **get_nodes_by_user_id**
> ARRAY[Nodes] get_nodes_by_user_id(user_id => $user_id)

getNodesByUserId() - Gets all nodes owned by given user.



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

my $api_instance = WWW::SwaggerClient::NodesApi->new();
my $user_id = 'user_id_example'; # string | The userId whom to get owned nodes

eval { 
    my $result = $api_instance->get_nodes_by_user_id(user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling NodesApi->get_nodes_by_user_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The userId whom to get owned nodes | 

### Return type

[**ARRAY[Nodes]**](Nodes.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_nodes_by_user_id_and_sensor_id**
> NodeInfo get_nodes_by_user_id_and_sensor_id(user_id => $user_id, dev_eui => $dev_eui)

getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.



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

my $api_instance = WWW::SwaggerClient::NodesApi->new();
my $user_id = 'user_id_example'; # string | The userId where node will be retrieved
my $dev_eui = 'dev_eui_example'; # string | The sensorID to be retrieved

eval { 
    my $result = $api_instance->get_nodes_by_user_id_and_sensor_id(user_id => $user_id, dev_eui => $dev_eui);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling NodesApi->get_nodes_by_user_id_and_sensor_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The userId where node will be retrieved | 
 **dev_eui** | **string**| The sensorID to be retrieved | 

### Return type

[**NodeInfo**](NodeInfo.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

