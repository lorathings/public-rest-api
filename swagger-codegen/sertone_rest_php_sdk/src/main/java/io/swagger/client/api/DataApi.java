package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.DataPayload;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-09T07:12:27.273Z")
public class DataApi {
  private ApiClient apiClient;

  public DataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getAppDevDataPayload() - Gets payload data of given application and device.
   * This can only be done by the logged in users.
   * @param appEui The appEui where payload will be retrieved (required)
   * @param devEui The devEui where payload will be retrieved (required)
   * @return List<DataPayload>
   * @throws ApiException if fails to make API call
   */
  public List<DataPayload> getAppDevDataPayload(String appEui, String devEui) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appEui' is set
    if (appEui == null) {
      throw new ApiException(400, "Missing the required parameter 'appEui' when calling getAppDevDataPayload");
    }
    
    // verify the required parameter 'devEui' is set
    if (devEui == null) {
      throw new ApiException(400, "Missing the required parameter 'devEui' when calling getAppDevDataPayload");
    }
    
    // create path and map variables
    String localVarPath = "/data/{appEui}/nodes/{devEui}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appEui" + "\\}", apiClient.escapeString(appEui.toString()))
      .replaceAll("\\{" + "devEui" + "\\}", apiClient.escapeString(devEui.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/xml", "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "server_token", "client_id" };

    GenericType<List<DataPayload>> localVarReturnType = new GenericType<List<DataPayload>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
   * This can only be done by the logged in users.
   * @param appEui The appEui whom to get last timestamp (required)
   * @param devEui The devEui whom to get last timestamp (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getAppDevLastDataTimestamp(String appEui, String devEui) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appEui' is set
    if (appEui == null) {
      throw new ApiException(400, "Missing the required parameter 'appEui' when calling getAppDevLastDataTimestamp");
    }
    
    // verify the required parameter 'devEui' is set
    if (devEui == null) {
      throw new ApiException(400, "Missing the required parameter 'devEui' when calling getAppDevLastDataTimestamp");
    }
    
    // create path and map variables
    String localVarPath = "/data/{appEui}/nodes/{devEui}/timestamp".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appEui" + "\\}", apiClient.escapeString(appEui.toString()))
      .replaceAll("\\{" + "devEui" + "\\}", apiClient.escapeString(devEui.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/xml", "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "server_token", "client_id" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getAppDevLatestCounter() - Gets the latest counter for a given application and device.
   * This can only be done by the logged in users.
   * @param appEui The appEui whom to get last timestamp (required)
   * @param devEui The devEui whom to get last timestamp (required)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long getAppDevLatestCounter(String appEui, String devEui) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appEui' is set
    if (appEui == null) {
      throw new ApiException(400, "Missing the required parameter 'appEui' when calling getAppDevLatestCounter");
    }
    
    // verify the required parameter 'devEui' is set
    if (devEui == null) {
      throw new ApiException(400, "Missing the required parameter 'devEui' when calling getAppDevLatestCounter");
    }
    
    // create path and map variables
    String localVarPath = "/data/{appEui}/nodes/{devEui}/count".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appEui" + "\\}", apiClient.escapeString(appEui.toString()))
      .replaceAll("\\{" + "devEui" + "\\}", apiClient.escapeString(devEui.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/xml", "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "server_token", "client_id" };

    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getAppLastDataMethod() - Gets last data delivery method for a given application.
   * This can only be done by the logged in users.
   * @param appEui The appEui whom to get last timestamp (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getAppLastDataMethod(String appEui) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appEui' is set
    if (appEui == null) {
      throw new ApiException(400, "Missing the required parameter 'appEui' when calling getAppLastDataMethod");
    }
    
    // create path and map variables
    String localVarPath = "/data/{appEui}/method".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appEui" + "\\}", apiClient.escapeString(appEui.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/xml", "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "server_token", "client_id" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getAppLastDataTimestamp() - Gets last data timestamp for a given application.
   * This can only be done by the logged in users.
   * @param appEui The appEui whom to get last timestamp (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getAppLastDataTimestamp(String appEui) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'appEui' is set
    if (appEui == null) {
      throw new ApiException(400, "Missing the required parameter 'appEui' when calling getAppLastDataTimestamp");
    }
    
    // create path and map variables
    String localVarPath = "/data/{appEui}/timestamp".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "appEui" + "\\}", apiClient.escapeString(appEui.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/xml", "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "server_token", "client_id" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
