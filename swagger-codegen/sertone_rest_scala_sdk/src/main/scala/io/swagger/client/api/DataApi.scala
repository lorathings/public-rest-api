package io.swagger.client.api

import io.swagger.client.model.DataPayload
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class DataApi(val defBasePath: String = "http://api.dds.sertone.com/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * getAppDevDataPayload() - Gets payload data of given application and device.
   * This can only be done by the logged in users.
   * @param appEui The appEui where payload will be retrieved 
   * @param devEui The devEui where payload will be retrieved 
   * @return List[DataPayload]
   */
  def getAppDevDataPayload (appEui: String, devEui: String) : Option[List[DataPayload]] = {
    // create path and map variables
    val path = "/data/{appEui}/nodes/{devEui}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "appEui" + "\\}",apiInvoker.escape(appEui))

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
           Some(ApiInvoker.deserialize(s, "array", classOf[DataPayload]).asInstanceOf[List[DataPayload]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * getAppDevLastDataTimestamp() - Gets last data timestamp for a given application and device.
   * This can only be done by the logged in users.
   * @param appEui The appEui whom to get last timestamp 
   * @param devEui The devEui whom to get last timestamp 
   * @return String
   */
  def getAppDevLastDataTimestamp (appEui: String, devEui: String) : Option[String] = {
    // create path and map variables
    val path = "/data/{appEui}/nodes/{devEui}/timestamp".replaceAll("\\{format\\}","json").replaceAll("\\{" + "appEui" + "\\}",apiInvoker.escape(appEui))

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
           Some(ApiInvoker.deserialize(s, "", classOf[String]).asInstanceOf[String])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * getAppDevLatestCounter() - Gets the latest counter for a given application and device.
   * This can only be done by the logged in users.
   * @param appEui The appEui whom to get last timestamp 
   * @param devEui The devEui whom to get last timestamp 
   * @return Long
   */
  def getAppDevLatestCounter (appEui: String, devEui: String) : Option[Long] = {
    // create path and map variables
    val path = "/data/{appEui}/nodes/{devEui}/count".replaceAll("\\{format\\}","json").replaceAll("\\{" + "appEui" + "\\}",apiInvoker.escape(appEui))

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
           Some(ApiInvoker.deserialize(s, "", classOf[Long]).asInstanceOf[Long])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * getAppLastDataMethod() - Gets last data delivery method for a given application.
   * This can only be done by the logged in users.
   * @param appEui The appEui whom to get last timestamp 
   * @return String
   */
  def getAppLastDataMethod (appEui: String) : Option[String] = {
    // create path and map variables
    val path = "/data/{appEui}/method".replaceAll("\\{format\\}","json").replaceAll("\\{" + "appEui" + "\\}",apiInvoker.escape(appEui))


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
           Some(ApiInvoker.deserialize(s, "", classOf[String]).asInstanceOf[String])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * getAppLastDataTimestamp() - Gets last data timestamp for a given application.
   * This can only be done by the logged in users.
   * @param appEui The appEui whom to get last timestamp 
   * @return String
   */
  def getAppLastDataTimestamp (appEui: String) : Option[String] = {
    // create path and map variables
    val path = "/data/{appEui}/timestamp".replaceAll("\\{format\\}","json").replaceAll("\\{" + "appEui" + "\\}",apiInvoker.escape(appEui))


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
           Some(ApiInvoker.deserialize(s, "", classOf[String]).asInstanceOf[String])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
