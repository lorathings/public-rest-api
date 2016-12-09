package io.swagger.client.api

import io.swagger.client.model.Applications
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ApplicationsApi(val defBasePath: String = "http://api.dds.sertone.com/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * getApplicationsByUserId() - Gets all applications owned by given user.
   * 
   * @param userId The userId whom to get owned applications 
   * @return List[Applications]
   */
  def getApplicationsByUserId (userId: String) : Option[List[Applications]] = {
    // create path and map variables
    val path = "/users/{userId}/applications".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}",apiInvoker.escape(userId))


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
           Some(ApiInvoker.deserialize(s, "array", classOf[Applications]).asInstanceOf[List[Applications]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * getApplicationsByUserIdAndAppId() - Gets details of given application ID for this given user.
   * 
   * @param userId The userId where application will be retrieved 
   * @param appEui The applicationId to be retrieved 
   * @return Applications
   */
  def getApplicationsByUserIdAndAppId (userId: String, appEui: String) : Option[Applications] = {
    // create path and map variables
    val path = "/users/{userId}/applications/{appEui}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}",apiInvoker.escape(userId))

.replaceAll("\\{" + "appEui" + "\\}",apiInvoker.escape(appEui))


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
           Some(ApiInvoker.deserialize(s, "", classOf[Applications]).asInstanceOf[Applications])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
