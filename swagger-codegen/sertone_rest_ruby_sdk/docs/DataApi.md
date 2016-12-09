# SwaggerClient::DataApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_app_dev_data_payload**](DataApi.md#get_app_dev_data_payload) | **GET** /data/{appEui}/nodes/{devEui} | getAppDevDataPayload() - Gets payload data of given application and device.
[**get_app_dev_last_data_timestamp**](DataApi.md#get_app_dev_last_data_timestamp) | **GET** /data/{appEui}/nodes/{devEui}/timestamp | getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
[**get_app_dev_latest_counter**](DataApi.md#get_app_dev_latest_counter) | **GET** /data/{appEui}/nodes/{devEui}/count | getAppDevLatestCounter() - Gets the latest counter for a given application and device.
[**get_app_last_data_method**](DataApi.md#get_app_last_data_method) | **GET** /data/{appEui}/method | getAppLastDataMethod() - Gets last data delivery method for a given application.
[**get_app_last_data_timestamp**](DataApi.md#get_app_last_data_timestamp) | **GET** /data/{appEui}/timestamp | getAppLastDataTimestamp() - Gets last data timestamp for a given application.


# **get_app_dev_data_payload**
> Array&lt;DataPayload&gt; get_app_dev_data_payload(app_eui, dev_eui)

getAppDevDataPayload() - Gets payload data of given application and device.

This can only be done by the logged in users.

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

api_instance = SwaggerClient::DataApi.new

app_eui = "app_eui_example" # String | The appEui where payload will be retrieved

dev_eui = "dev_eui_example" # String | The devEui where payload will be retrieved


begin
  #getAppDevDataPayload() - Gets payload data of given application and device.
  result = api_instance.get_app_dev_data_payload(app_eui, dev_eui)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DataApi->get_app_dev_data_payload: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **String**| The appEui where payload will be retrieved | 
 **dev_eui** | **String**| The devEui where payload will be retrieved | 

### Return type

[**Array&lt;DataPayload&gt;**](DataPayload.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



# **get_app_dev_last_data_timestamp**
> String get_app_dev_last_data_timestamp(app_eui, dev_eui)

getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.

This can only be done by the logged in users.

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

api_instance = SwaggerClient::DataApi.new

app_eui = "app_eui_example" # String | The appEui whom to get last timestamp

dev_eui = "dev_eui_example" # String | The devEui whom to get last timestamp


begin
  #getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
  result = api_instance.get_app_dev_last_data_timestamp(app_eui, dev_eui)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DataApi->get_app_dev_last_data_timestamp: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **String**| The appEui whom to get last timestamp | 
 **dev_eui** | **String**| The devEui whom to get last timestamp | 

### Return type

**String**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



# **get_app_dev_latest_counter**
> Integer get_app_dev_latest_counter(app_eui, dev_eui)

getAppDevLatestCounter() - Gets the latest counter for a given application and device.

This can only be done by the logged in users.

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

api_instance = SwaggerClient::DataApi.new

app_eui = "app_eui_example" # String | The appEui whom to get last timestamp

dev_eui = "dev_eui_example" # String | The devEui whom to get last timestamp


begin
  #getAppDevLatestCounter() - Gets the latest counter for a given application and device.
  result = api_instance.get_app_dev_latest_counter(app_eui, dev_eui)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DataApi->get_app_dev_latest_counter: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **String**| The appEui whom to get last timestamp | 
 **dev_eui** | **String**| The devEui whom to get last timestamp | 

### Return type

**Integer**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



# **get_app_last_data_method**
> String get_app_last_data_method(app_eui)

getAppLastDataMethod() - Gets last data delivery method for a given application.

This can only be done by the logged in users.

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

api_instance = SwaggerClient::DataApi.new

app_eui = "app_eui_example" # String | The appEui whom to get last timestamp


begin
  #getAppLastDataMethod() - Gets last data delivery method for a given application.
  result = api_instance.get_app_last_data_method(app_eui)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DataApi->get_app_last_data_method: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **String**| The appEui whom to get last timestamp | 

### Return type

**String**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



# **get_app_last_data_timestamp**
> String get_app_last_data_timestamp(app_eui)

getAppLastDataTimestamp() - Gets last data timestamp for a given application.

This can only be done by the logged in users.

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

api_instance = SwaggerClient::DataApi.new

app_eui = "app_eui_example" # String | The appEui whom to get last timestamp


begin
  #getAppLastDataTimestamp() - Gets last data timestamp for a given application.
  result = api_instance.get_app_last_data_timestamp(app_eui)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DataApi->get_app_last_data_timestamp: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **String**| The appEui whom to get last timestamp | 

### Return type

**String**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



