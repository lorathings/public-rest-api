# SwaggerClient::GatewaysApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_gateway_status**](GatewaysApi.md#get_gateway_status) | **GET** /gateways/{gwEui}/status | getGatewayStatus() - Gets current status of gateway.
[**get_gateways_by_user_id**](GatewaysApi.md#get_gateways_by_user_id) | **GET** /users/{userId}/gateways | getGatewaysByUserId() - Gets all gateways owned by given user.


# **get_gateway_status**
> GatewaysStatus get_gateway_status(gw_eui)

getGatewayStatus() - Gets current status of gateway.



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: server_token
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['ClientID'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['ClientID'] = 'Bearer'
end

api_instance = SwaggerClient::GatewaysApi.new

gw_eui = "gw_eui_example" # String | The gatewayId to be retrieved


begin
  #getGatewayStatus() - Gets current status of gateway.
  result = api_instance.get_gateway_status(gw_eui)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GatewaysApi->get_gateway_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gw_eui** | **String**| The gatewayId to be retrieved | 

### Return type

[**GatewaysStatus**](GatewaysStatus.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



# **get_gateways_by_user_id**
> Array&lt;Gateways&gt; get_gateways_by_user_id(user_id)

getGatewaysByUserId() - Gets all gateways owned by given user.



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: server_token
  config.api_key['Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['Authorization'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['ClientID'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['ClientID'] = 'Bearer'
end

api_instance = SwaggerClient::GatewaysApi.new

user_id = "user_id_example" # String | The userId whom to get owned gateways


begin
  #getGatewaysByUserId() - Gets all gateways owned by given user.
  result = api_instance.get_gateways_by_user_id(user_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling GatewaysApi->get_gateways_by_user_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **String**| The userId whom to get owned gateways | 

### Return type

[**Array&lt;Gateways&gt;**](Gateways.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



