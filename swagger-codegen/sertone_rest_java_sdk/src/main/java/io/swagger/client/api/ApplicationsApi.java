package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.Applications;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-09T07:17:28.646Z")
public class ApplicationsApi {
  private ApiClient apiClient;

  public ApplicationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApplicationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getApplicationsByUserId() - Gets all applications owned by given user.
   * 
   * @param userId The userId whom to get owned applications (required)
   * @return List<Applications>
   * @throws ApiException if fails to make API call
   */
  public List<Applications> getApplicationsByUserId(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getApplicationsByUserId");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}/applications".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<List<Applications>> localVarReturnType = new GenericType<List<Applications>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.
   * 
   * @param userId The userId where application will be retrieved (required)
   * @param appEui The applicationId to be retrieved (required)
   * @return Applications
   * @throws ApiException if fails to make API call
   */
  public Applications getApplicationsByUserIdAndAppId(String userId, String appEui) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getApplicationsByUserIdAndAppId");
    }
    
    // verify the required parameter 'appEui' is set
    if (appEui == null) {
      throw new ApiException(400, "Missing the required parameter 'appEui' when calling getApplicationsByUserIdAndAppId");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}/applications/{appEui}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
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

    GenericType<Applications> localVarReturnType = new GenericType<Applications>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
