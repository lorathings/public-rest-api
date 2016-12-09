# swagger_client.ApplicationsApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_applications_by_user_id**](ApplicationsApi.md#get_applications_by_user_id) | **GET** /users/{userId}/applications | getApplicationsByUserId() - Gets all applications owned by given user.
[**get_applications_by_user_id_and_app_id**](ApplicationsApi.md#get_applications_by_user_id_and_app_id) | **GET** /users/{userId}/applications/{appEui} | getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.


# **get_applications_by_user_id**
> list[Applications] get_applications_by_user_id(user_id)

getApplicationsByUserId() - Gets all applications owned by given user.



### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: server_token
swagger_client.configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['Authorization'] = 'Bearer'
# Configure API key authorization: client_id
swagger_client.configuration.api_key['ClientID'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['ClientID'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ApplicationsApi()
user_id = 'user_id_example' # str | The userId whom to get owned applications

try: 
    # getApplicationsByUserId() - Gets all applications owned by given user.
    api_response = api_instance.get_applications_by_user_id(user_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ApplicationsApi->get_applications_by_user_id: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| The userId whom to get owned applications | 

### Return type

[**list[Applications]**](Applications.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_applications_by_user_id_and_app_id**
> Applications get_applications_by_user_id_and_app_id(user_id, app_eui)

getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.



### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: server_token
swagger_client.configuration.api_key['Authorization'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['Authorization'] = 'Bearer'
# Configure API key authorization: client_id
swagger_client.configuration.api_key['ClientID'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['ClientID'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ApplicationsApi()
user_id = 'user_id_example' # str | The userId where application will be retrieved
app_eui = 'app_eui_example' # str | The applicationId to be retrieved

try: 
    # getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.
    api_response = api_instance.get_applications_by_user_id_and_app_id(user_id, app_eui)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ApplicationsApi->get_applications_by_user_id_and_app_id: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| The userId where application will be retrieved | 
 **app_eui** | **str**| The applicationId to be retrieved | 

### Return type

[**Applications**](Applications.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

