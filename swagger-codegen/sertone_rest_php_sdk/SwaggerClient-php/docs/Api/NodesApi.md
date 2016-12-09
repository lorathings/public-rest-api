# Swagger\Client\NodesApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNodesByUserId**](NodesApi.md#getNodesByUserId) | **GET** /users/{userId}/nodes | getNodesByUserId() - Gets all nodes owned by given user.
[**getNodesByUserIdAndSensorId**](NodesApi.md#getNodesByUserIdAndSensorId) | **GET** /users/{userId}/nodes/{devEui} | getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.


# **getNodesByUserId**
> \Swagger\Client\Model\Nodes[] getNodesByUserId($user_id)

getNodesByUserId() - Gets all nodes owned by given user.



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: server_token
Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');
// Configure API key authorization: client_id
Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('ClientID', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ClientID', 'Bearer');

$api_instance = new Swagger\Client\Api\NodesApi();
$user_id = "user_id_example"; // string | The userId whom to get owned nodes

try {
    $result = $api_instance->getNodesByUserId($user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling NodesApi->getNodesByUserId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The userId whom to get owned nodes |

### Return type

[**\Swagger\Client\Model\Nodes[]**](../Model/Nodes.md)

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getNodesByUserIdAndSensorId**
> \Swagger\Client\Model\NodeInfo getNodesByUserIdAndSensorId($user_id, $dev_eui)

getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: server_token
Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');
// Configure API key authorization: client_id
Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('ClientID', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('ClientID', 'Bearer');

$api_instance = new Swagger\Client\Api\NodesApi();
$user_id = "user_id_example"; // string | The userId where node will be retrieved
$dev_eui = "dev_eui_example"; // string | The sensorID to be retrieved

try {
    $result = $api_instance->getNodesByUserIdAndSensorId($user_id, $dev_eui);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling NodesApi->getNodesByUserIdAndSensorId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The userId where node will be retrieved |
 **dev_eui** | **string**| The sensorID to be retrieved |

### Return type

[**\Swagger\Client\Model\NodeInfo**](../Model/NodeInfo.md)

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

