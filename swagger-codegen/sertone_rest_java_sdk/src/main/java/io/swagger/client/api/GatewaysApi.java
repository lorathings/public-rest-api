package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.GatewaysStatus;
import io.swagger.client.model.Gateways;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-09T07:17:28.646Z")
public class GatewaysApi {
  private ApiClient apiClient;

  public GatewaysApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GatewaysApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getGatewayStatus() - Gets current status of gateway.
   * 
   * @param gwEui The gatewayId to be retrieved (required)
   * @return GatewaysStatus
   * @throws ApiException if fails to make API call
   */
  public GatewaysStatus getGatewayStatus(String gwEui) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'gwEui' is set
    if (gwEui == null) {
      throw new ApiException(400, "Missing the required parameter 'gwEui' when calling getGatewayStatus");
    }
    
    // create path and map variables
    String localVarPath = "/gateways/{gwEui}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "gwEui" + "\\}", apiClient.escapeString(gwEui.toString()));

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

    GenericType<GatewaysStatus> localVarReturnType = new GenericType<GatewaysStatus>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getGatewaysByUserId() - Gets all gateways owned by given user.
   * 
   * @param userId The userId whom to get owned gateways (required)
   * @return List<Gateways>
   * @throws ApiException if fails to make API call
   */
  public List<Gateways> getGatewaysByUserId(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getGatewaysByUserId");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}/gateways".replaceAll("\\{format\\}","json")
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

    GenericType<List<Gateways>> localVarReturnType = new GenericType<List<Gateways>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
