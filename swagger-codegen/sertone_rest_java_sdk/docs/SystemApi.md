# SystemApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSystemHealthz**](SystemApi.md#getSystemHealthz) | **GET** /system/healthz | getSystemHealthz() - Gets status health of the api server


<a name="getSystemHealthz"></a>
# **getSystemHealthz**
> String getSystemHealthz()

getSystemHealthz() - Gets status health of the api server

This can be used for monitoring purposes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    String result = apiInstance.getSystemHealthz();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#getSystemHealthz");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

