# WWW::SwaggerClient::SystemApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::SystemApi;
```

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_system_healthz**](SystemApi.md#get_system_healthz) | **GET** /system/healthz | getSystemHealthz() - Gets status health of the api server


# **get_system_healthz**
> string get_system_healthz()

getSystemHealthz() - Gets status health of the api server

This can be used for monitoring purposes.

### Example 
```perl
use Data::Dumper;

my $api_instance = WWW::SwaggerClient::SystemApi->new();

eval { 
    my $result = $api_instance->get_system_healthz();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SystemApi->get_system_healthz: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

