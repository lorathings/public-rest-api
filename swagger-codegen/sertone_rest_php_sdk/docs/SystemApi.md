# SertoneRestApi.SystemApi

All URIs are relative to *http://api.dds.sertone.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSystemHealthz**](SystemApi.md#getSystemHealthz) | **GET** /system/healthz | getSystemHealthz() - Gets status health of the api server


<a name="getSystemHealthz"></a>
# **getSystemHealthz**
> &#39;String&#39; getSystemHealthz()

getSystemHealthz() - Gets status health of the api server

This can be used for monitoring purposes.

### Example
```javascript
var SertoneRestApi = require('sertone-rest-api');

var apiInstance = new SertoneRestApi.SystemApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSystemHealthz(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

