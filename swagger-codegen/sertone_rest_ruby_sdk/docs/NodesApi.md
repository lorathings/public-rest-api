# SwaggerClient::NodesApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_nodes_by_user_id**](NodesApi.md#get_nodes_by_user_id) | **GET** /users/{userId}/nodes | getNodesByUserId() - Gets all nodes owned by given user.
[**get_nodes_by_user_id_and_sensor_id**](NodesApi.md#get_nodes_by_user_id_and_sensor_id) | **GET** /users/{userId}/nodes/{devEui} | getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.


# **get_nodes_by_user_id**
> Array&lt;Nodes&gt; get_nodes_by_user_id(user_id)

getNodesByUserId() - Gets all nodes owned by given user.



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

api_instance = SwaggerClient::NodesApi.new

user_id = "user_id_example" # String | The userId whom to get owned nodes


begin
  #getNodesByUserId() - Gets all nodes owned by given user.
  result = api_instance.get_nodes_by_user_id(user_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling NodesApi->get_nodes_by_user_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **String**| The userId whom to get owned nodes | 

### Return type

[**Array&lt;Nodes&gt;**](Nodes.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



# **get_nodes_by_user_id_and_sensor_id**
> NodeInfo get_nodes_by_user_id_and_sensor_id(user_id, dev_eui)

getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.



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

api_instance = SwaggerClient::NodesApi.new

user_id = "user_id_example" # String | The userId where node will be retrieved

dev_eui = "dev_eui_example" # String | The sensorID to be retrieved


begin
  #getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.
  result = api_instance.get_nodes_by_user_id_and_sensor_id(user_id, dev_eui)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling NodesApi->get_nodes_by_user_id_and_sensor_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **String**| The userId where node will be retrieved | 
 **dev_eui** | **String**| The sensorID to be retrieved | 

### Return type

[**NodeInfo**](NodeInfo.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



