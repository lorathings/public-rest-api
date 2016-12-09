# Swagger\Client\GatewaysApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGatewayStatus**](GatewaysApi.md#getGatewayStatus) | **GET** /gateways/{gwEui}/status | getGatewayStatus() - Gets current status of gateway.
[**getGatewaysByUserId**](GatewaysApi.md#getGatewaysByUserId) | **GET** /users/{userId}/gateways | getGatewaysByUserId() - Gets all gateways owned by given user.


# **getGatewayStatus**
> \Swagger\Client\Model\GatewaysStatus getGatewayStatus($gw_eui)

getGatewayStatus() - Gets current status of gateway.



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

$api_instance = new Swagger\Client\Api\GatewaysApi();
$gw_eui = "gw_eui_example"; // string | The gatewayId to be retrieved

try {
    $result = $api_instance->getGatewayStatus($gw_eui);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GatewaysApi->getGatewayStatus: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gw_eui** | **string**| The gatewayId to be retrieved |

### Return type

[**\Swagger\Client\Model\GatewaysStatus**](../Model/GatewaysStatus.md)

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getGatewaysByUserId**
> \Swagger\Client\Model\Gateways[] getGatewaysByUserId($user_id)

getGatewaysByUserId() - Gets all gateways owned by given user.



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

$api_instance = new Swagger\Client\Api\GatewaysApi();
$user_id = "user_id_example"; // string | The userId whom to get owned gateways

try {
    $result = $api_instance->getGatewaysByUserId($user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GatewaysApi->getGatewaysByUserId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The userId whom to get owned gateways |

### Return type

[**\Swagger\Client\Model\Gateways[]**](../Model/Gateways.md)

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

