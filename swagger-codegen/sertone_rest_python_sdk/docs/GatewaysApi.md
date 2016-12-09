# swagger_client.GatewaysApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_gateway_status**](GatewaysApi.md#get_gateway_status) | **GET** /gateways/{gwEui}/status | getGatewayStatus() - Gets current status of gateway.
[**get_gateways_by_user_id**](GatewaysApi.md#get_gateways_by_user_id) | **GET** /users/{userId}/gateways | getGatewaysByUserId() - Gets all gateways owned by given user.


# **get_gateway_status**
> GatewaysStatus get_gateway_status(gw_eui)

getGatewayStatus() - Gets current status of gateway.



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
api_instance = swagger_client.GatewaysApi()
gw_eui = 'gw_eui_example' # str | The gatewayId to be retrieved

try: 
    # getGatewayStatus() - Gets current status of gateway.
    api_response = api_instance.get_gateway_status(gw_eui)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling GatewaysApi->get_gateway_status: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gw_eui** | **str**| The gatewayId to be retrieved | 

### Return type

[**GatewaysStatus**](GatewaysStatus.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_gateways_by_user_id**
> list[Gateways] get_gateways_by_user_id(user_id)

getGatewaysByUserId() - Gets all gateways owned by given user.



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
api_instance = swagger_client.GatewaysApi()
user_id = 'user_id_example' # str | The userId whom to get owned gateways

try: 
    # getGatewaysByUserId() - Gets all gateways owned by given user.
    api_response = api_instance.get_gateways_by_user_id(user_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling GatewaysApi->get_gateways_by_user_id: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| The userId whom to get owned gateways | 

### Return type

[**list[Gateways]**](Gateways.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

