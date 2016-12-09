# Swagger\Client\SystemApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSystemHealthz**](SystemApi.md#getSystemHealthz) | **GET** /system/healthz | getSystemHealthz() - Gets status health of the api server


# **getSystemHealthz**
> string getSystemHealthz()

getSystemHealthz() - Gets status health of the api server

This can be used for monitoring purposes.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SystemApi();

try {
    $result = $api_instance->getSystemHealthz();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SystemApi->getSystemHealthz: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

