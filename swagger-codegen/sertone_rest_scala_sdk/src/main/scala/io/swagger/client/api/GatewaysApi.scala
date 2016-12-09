package io.swagger.client.api

import io.swagger.client.model.GatewaysStatus
import io.swagger.client.model.Gateways
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class GatewaysApi(val defBasePath: String = "http://api.dds.sertone.com/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * getGatewayStatus() - Gets current status of gateway.
   * 
   * @param gwEui The gatewayId to be retrieved 
   * @return GatewaysStatus
   */
  def getGatewayStatus (gwEui: String) : Option[GatewaysStatus] = {
    // create path and map variables
    val path = "/gateways/{gwEui}/status".replaceAll("\\{format\\}","json").replaceAll("\\{" + "gwEui" + "\\}",apiInvoker.escape(gwEui))


    val contentTypes = List("application/xml", "application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    
    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[GatewaysStatus]).asInstanceOf[GatewaysStatus])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * getGatewaysByUserId() - Gets all gateways owned by given user.
   * 
   * @param userId The userId whom to get owned gateways 
   * @return List[Gateways]
   */
  def getGatewaysByUserId (userId: String) : Option[List[Gateways]] = {
    // create path and map variables
    val path = "/users/{userId}/gateways".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}",apiInvoker.escape(userId))


    val contentTypes = List("application/xml", "application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    
    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[Gateways]).asInstanceOf[List[Gateways]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
