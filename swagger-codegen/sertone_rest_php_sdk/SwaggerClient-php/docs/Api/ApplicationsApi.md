# Swagger\Client\ApplicationsApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplicationsByUserId**](ApplicationsApi.md#getApplicationsByUserId) | **GET** /users/{userId}/applications | getApplicationsByUserId() - Gets all applications owned by given user.
[**getApplicationsByUserIdAndAppId**](ApplicationsApi.md#getApplicationsByUserIdAndAppId) | **GET** /users/{userId}/applications/{appEui} | getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.


# **getApplicationsByUserId**
> \Swagger\Client\Model\Applications[] getApplicationsByUserId($user_id)

getApplicationsByUserId() - Gets all applications owned by given user.



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

$api_instance = new Swagger\Client\Api\ApplicationsApi();
$user_id = "user_id_example"; // string | The userId whom to get owned applications

try {
    $result = $api_instance->getApplicationsByUserId($user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApplicationsApi->getApplicationsByUserId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The userId whom to get owned applications |

### Return type

[**\Swagger\Client\Model\Applications[]**](../Model/Applications.md)

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getApplicationsByUserIdAndAppId**
> \Swagger\Client\Model\Applications getApplicationsByUserIdAndAppId($user_id, $app_eui)

getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.



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

$api_instance = new Swagger\Client\Api\ApplicationsApi();
$user_id = "user_id_example"; // string | The userId where application will be retrieved
$app_eui = "app_eui_example"; // string | The applicationId to be retrieved

try {
    $result = $api_instance->getApplicationsByUserIdAndAppId($user_id, $app_eui);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApplicationsApi->getApplicationsByUserIdAndAppId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The userId where application will be retrieved |
 **app_eui** | **string**| The applicationId to be retrieved |

### Return type

[**\Swagger\Client\Model\Applications**](../Model/Applications.md)

### Authorization

[server_token](../../README.md#server_token), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

