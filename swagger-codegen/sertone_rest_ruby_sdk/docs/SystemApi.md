# SwaggerClient::SystemApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_system_healthz**](SystemApi.md#get_system_healthz) | **GET** /system/healthz | getSystemHealthz() - Gets status health of the api server


# **get_system_healthz**
> String get_system_healthz

getSystemHealthz() - Gets status health of the api server

This can be used for monitoring purposes.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SystemApi.new

begin
  #getSystemHealthz() - Gets status health of the api server
  result = api_instance.get_system_healthz
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SystemApi->get_system_healthz: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



