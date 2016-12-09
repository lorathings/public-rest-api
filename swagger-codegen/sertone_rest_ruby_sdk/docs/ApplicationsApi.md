# SwaggerClient::ApplicationsApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_applications_by_user_id**](ApplicationsApi.md#get_applications_by_user_id) | **GET** /users/{userId}/applications | getApplicationsByUserId() - Gets all applications owned by given user.
[**get_applications_by_user_id_and_app_id**](ApplicationsApi.md#get_applications_by_user_id_and_app_id) | **GET** /users/{userId}/applications/{appEui} | getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.


# **get_applications_by_user_id**
> Array&lt;Applications&gt; get_applications_by_user_id(user_id)

getApplicationsByUserId() - Gets all applications owned by given user.



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

api_instance = SwaggerClient::ApplicationsApi.new

user_id = "user_id_example" # String | The userId whom to get owned applications


begin
  #getApplicationsByUserId() - Gets all applications owned by given user.
  result = api_instance.get_applications_by_user_id(user_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApplicationsApi->get_applications_by_user_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **String**| The userId whom to get owned applications | 

### Return type

[**Array&lt;Applications&gt;**](Applications.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



# **get_applications_by_user_id_and_app_id**
> Applications get_applications_by_user_id_and_app_id(user_id, app_eui)

getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.



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

api_instance = SwaggerClient::ApplicationsApi.new

user_id = "user_id_example" # String | The userId where application will be retrieved

app_eui = "app_eui_example" # String | The applicationId to be retrieved


begin
  #getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.
  result = api_instance.get_applications_by_user_id_and_app_id(user_id, app_eui)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ApplicationsApi->get_applications_by_user_id_and_app_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **String**| The userId where application will be retrieved | 
 **app_eui** | **String**| The applicationId to be retrieved | 

### Return type

[**Applications**](Applications.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json



