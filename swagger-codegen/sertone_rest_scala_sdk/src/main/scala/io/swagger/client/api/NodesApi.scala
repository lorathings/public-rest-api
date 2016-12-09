package io.swagger.client.api

import io.swagger.client.model.Nodes
import io.swagger.client.model.NodeInfo
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class NodesApi(val defBasePath: String = "http://api.dds.sertone.com/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * getNodesByUserId() - Gets all nodes owned by given user.
   * 
   * @param userId The userId whom to get owned nodes 
   * @return List[Nodes]
   */
  def getNodesByUserId (userId: String) : Option[List[Nodes]] = {
    // create path and map variables
    val path = "/users/{userId}/nodes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}",apiInvoker.escape(userId))


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
           Some(ApiInvoker.deserialize(s, "array", classOf[Nodes]).asInstanceOf[List[Nodes]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * getNodesByUserIdAndSensorId() - Gets details of given node ID for this given user.
   * 
   * @param userId The userId where node will be retrieved 
   * @param devEui The sensorID to be retrieved 
   * @return NodeInfo
   */
  def getNodesByUserIdAndSensorId (userId: String, devEui: String) : Option[NodeInfo] = {
    // create path and map variables
    val path = "/users/{userId}/nodes/{devEui}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}",apiInvoker.escape(userId))

.replaceAll("\\{" + "devEui" + "\\}",apiInvoker.escape(devEui))


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
           Some(ApiInvoker.deserialize(s, "", classOf[NodeInfo]).asInstanceOf[NodeInfo])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
