# Swagger\Client\DataApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppDevDataPayload**](DataApi.md#getAppDevDataPayload) | **GET** /data/{appEui}/nodes/{devEui} | getAppDevDataPayload() - Gets payload data of given application and device.
[**getAppDevLastDataTimestamp**](DataApi.md#getAppDevLastDataTimestamp) | **GET** /data/{appEui}/nodes/{devEui}/timestamp | getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
[**getAppDevLatestCounter**](DataApi.md#getAppDevLatestCounter) | **GET** /data/{appEui}/nodes/{devEui}/count | getAppDevLatestCounter() - Gets the latest counter for a given application and device.
[**getAppLastDataMethod**](DataApi.md#getAppLastDataMethod) | **GET** /data/{appEui}/method | getAppLastDataMethod() - Gets last data delivery method for a given application.
[**getAppLastDataTimestamp**](DataApi.md#getAppLastDataTimestamp) | **GET** /data/{appEui}/timestamp | getAppLastDataTimestamp() - Gets last data timestamp for a given application.


# **getAppDevDataPayload**
> \Swagger\Client\Model\DataPayload[] getAppDevDataPayload($app_eui, $dev_eui)

getAppDevDataPayload() - Gets payload data of given application and device.

This can only be done by the logged in users.

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

$api_instance = new Swagger\Client\Api\DataApi();
$app_eui = "app_eui_example"; // string | The appEui where payload will be retrieved
$dev_eui = "dev_eui_example"; // string | The devEui where payload will be retrieved

try {
    $result = $api_instance->getAppDevDataPayload($app_eui, $dev_eui);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataApi->getAppDevDataPayload: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **string**| The appEui where payload will be retrieved |
 **dev_eui** | **string**| The devEui where payload will be retrieved |

### Return type

[**\Swagger\Client\Model\DataPayload[]**](../Model/DataPayload.md)

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAppDevLastDataTimestamp**
> string getAppDevLastDataTimestamp($app_eui, $dev_eui)

getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.

This can only be done by the logged in users.

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

$api_instance = new Swagger\Client\Api\DataApi();
$app_eui = "app_eui_example"; // string | The appEui whom to get last timestamp
$dev_eui = "dev_eui_example"; // string | The devEui whom to get last timestamp

try {
    $result = $api_instance->getAppDevLastDataTimestamp($app_eui, $dev_eui);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataApi->getAppDevLastDataTimestamp: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **string**| The appEui whom to get last timestamp |
 **dev_eui** | **string**| The devEui whom to get last timestamp |

### Return type

**string**

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAppDevLatestCounter**
> int getAppDevLatestCounter($app_eui, $dev_eui)

getAppDevLatestCounter() - Gets the latest counter for a given application and device.

This can only be done by the logged in users.

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

$api_instance = new Swagger\Client\Api\DataApi();
$app_eui = "app_eui_example"; // string | The appEui whom to get last timestamp
$dev_eui = "dev_eui_example"; // string | The devEui whom to get last timestamp

try {
    $result = $api_instance->getAppDevLatestCounter($app_eui, $dev_eui);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataApi->getAppDevLatestCounter: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **string**| The appEui whom to get last timestamp |
 **dev_eui** | **string**| The devEui whom to get last timestamp |

### Return type

**int**

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAppLastDataMethod**
> string getAppLastDataMethod($app_eui)

getAppLastDataMethod() - Gets last data delivery method for a given application.

This can only be done by the logged in users.

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

$api_instance = new Swagger\Client\Api\DataApi();
$app_eui = "app_eui_example"; // string | The appEui whom to get last timestamp

try {
    $result = $api_instance->getAppLastDataMethod($app_eui);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataApi->getAppLastDataMethod: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **string**| The appEui whom to get last timestamp |

### Return type

**string**

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAppLastDataTimestamp**
> string getAppLastDataTimestamp($app_eui)

getAppLastDataTimestamp() - Gets last data timestamp for a given application.

This can only be done by the logged in users.

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

$api_instance = new Swagger\Client\Api\DataApi();
$app_eui = "app_eui_example"; // string | The appEui whom to get last timestamp

try {
    $result = $api_instance->getAppLastDataTimestamp($app_eui);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DataApi->getAppLastDataTimestamp: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_eui** | **string**| The appEui whom to get last timestamp |

### Return type

**string**

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

