# swagger_client.DataApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_app_dev_data_payload**](DataApi.md#get_app_dev_data_payload) | **GET** /data/{appEui}/nodes/{devEui} | getAppDevDataPayload() - Gets payload data of given application and device.
[**get_app_dev_last_data_timestamp**](DataApi.md#get_app_dev_last_data_timestamp) | **GET** /data/{appEui}/nodes/{devEui}/timestamp | getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
[**get_app_dev_latest_counter**](DataApi.md#get_app_dev_latest_counter) | **GET** /data/{appEui}/nodes/{devEui}/count | getAppDevLatestCounter() - Gets the latest counter for a given application and device.
[**get_app_last_data_method**](DataApi.md#get_app_last_data_method) | **GET** /data/{appEui}/method | getAppLastDataMethod() - Gets last data delivery method for a given application.
[**get_app_last_data_timestamp**](DataApi.md#get_app_last_data_timestamp) | **GET** /data/{appEui}/timestamp | getAppLastDataTimestamp() - Gets last data timestamp for a given application.


# **get_app_dev_data_payload**
> list[DataPayload] get_app_dev_data_payload(app_eui, dev_eui)

getAppDevDataPayload() - Gets payload data of given application and device.

This can only be done by the logged in users.

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
api_instance = swagger_client.DataApi()
app_eui = 'app_eui_example' # str | The appEui where payload will be retrieved
dev_eui = 'dev_eui_example' # str | The devEui where payload will be retrieved

try: 
    # getAppDevDataPayload() - Gets payload data of given application and device.
    api_response = api_instance.get_app_dev_data_payload(app_eui, dev_eui)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling DataApi->get_app_dev_data_payload: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **str**| The appEui where payload will be retrieved | 
 **dev_eui** | **str**| The devEui where payload will be retrieved | 

### Return type

[**list[DataPayload]**](DataPayload.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_dev_last_data_timestamp**
> str get_app_dev_last_data_timestamp(app_eui, dev_eui)

getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.

This can only be done by the logged in users.

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
api_instance = swagger_client.DataApi()
app_eui = 'app_eui_example' # str | The appEui whom to get last timestamp
dev_eui = 'dev_eui_example' # str | The devEui whom to get last timestamp

try: 
    # getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
    api_response = api_instance.get_app_dev_last_data_timestamp(app_eui, dev_eui)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling DataApi->get_app_dev_last_data_timestamp: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **str**| The appEui whom to get last timestamp | 
 **dev_eui** | **str**| The devEui whom to get last timestamp | 

### Return type

**str**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_dev_latest_counter**
> int get_app_dev_latest_counter(app_eui, dev_eui)

getAppDevLatestCounter() - Gets the latest counter for a given application and device.

This can only be done by the logged in users.

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
api_instance = swagger_client.DataApi()
app_eui = 'app_eui_example' # str | The appEui whom to get last timestamp
dev_eui = 'dev_eui_example' # str | The devEui whom to get last timestamp

try: 
    # getAppDevLatestCounter() - Gets the latest counter for a given application and device.
    api_response = api_instance.get_app_dev_latest_counter(app_eui, dev_eui)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling DataApi->get_app_dev_latest_counter: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **str**| The appEui whom to get last timestamp | 
 **dev_eui** | **str**| The devEui whom to get last timestamp | 

### Return type

**int**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_last_data_method**
> str get_app_last_data_method(app_eui)

getAppLastDataMethod() - Gets last data delivery method for a given application.

This can only be done by the logged in users.

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
api_instance = swagger_client.DataApi()
app_eui = 'app_eui_example' # str | The appEui whom to get last timestamp

try: 
    # getAppLastDataMethod() - Gets last data delivery method for a given application.
    api_response = api_instance.get_app_last_data_method(app_eui)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling DataApi->get_app_last_data_method: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **str**| The appEui whom to get last timestamp | 

### Return type

**str**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_last_data_timestamp**
> str get_app_last_data_timestamp(app_eui)

getAppLastDataTimestamp() - Gets last data timestamp for a given application.

This can only be done by the logged in users.

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
api_instance = swagger_client.DataApi()
app_eui = 'app_eui_example' # str | The appEui whom to get last timestamp

try: 
    # getAppLastDataTimestamp() - Gets last data timestamp for a given application.
    api_response = api_instance.get_app_last_data_timestamp(app_eui)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling DataApi->get_app_last_data_timestamp: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **str**| The appEui whom to get last timestamp | 

### Return type

**str**

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

