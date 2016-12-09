# swagger_client.SystemApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_system_healthz**](SystemApi.md#get_system_healthz) | **GET** /system/healthz | getSystemHealthz() - Gets status health of the api server


# **get_system_healthz**
> str get_system_healthz()

getSystemHealthz() - Gets status health of the api server

This can be used for monitoring purposes.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SystemApi()

try: 
    # getSystemHealthz() - Gets status health of the api server
    api_response = api_instance.get_system_healthz()
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SystemApi->get_system_healthz: %s\n" % e
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

