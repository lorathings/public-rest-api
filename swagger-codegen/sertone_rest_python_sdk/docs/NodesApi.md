# swagger_client.NodesApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_nodes_by_user_id**](NodesApi.md#get_nodes_by_user_id) | **GET** /users/{userId}/nodes | getNodesByUserId() - Gets all nodes owned by given user.
[**get_nodes_by_user_id_and_sensor_id**](NodesApi.md#get_nodes_by_user_id_and_sensor_id) | **GET** /users/{userId}/nodes/{devEui} | getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.


# **get_nodes_by_user_id**
> list[Nodes] get_nodes_by_user_id(user_id)

getNodesByUserId() - Gets all nodes owned by given user.



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
api_instance = swagger_client.NodesApi()
user_id = 'user_id_example' # str | The userId whom to get owned nodes

try: 
    # getNodesByUserId() - Gets all nodes owned by given user.
    api_response = api_instance.get_nodes_by_user_id(user_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling NodesApi->get_nodes_by_user_id: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| The userId whom to get owned nodes | 

### Return type

[**list[Nodes]**](Nodes.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_nodes_by_user_id_and_sensor_id**
> NodeInfo get_nodes_by_user_id_and_sensor_id(user_id, dev_eui)

getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.



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
api_instance = swagger_client.NodesApi()
user_id = 'user_id_example' # str | The userId where node will be retrieved
dev_eui = 'dev_eui_example' # str | The sensorID to be retrieved

try: 
    # getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.
    api_response = api_instance.get_nodes_by_user_id_and_sensor_id(user_id, dev_eui)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling NodesApi->get_nodes_by_user_id_and_sensor_id: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| The userId where node will be retrieved | 
 **dev_eui** | **str**| The sensorID to be retrieved | 

### Return type

[**NodeInfo**](NodeInfo.md)

### Authorization

[server_token](../README.md#server_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

