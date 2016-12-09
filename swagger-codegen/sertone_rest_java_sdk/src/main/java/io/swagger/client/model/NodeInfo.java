package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * NodeInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-09T07:17:28.646Z")
public class NodeInfo   {
  
  private String regType = null;
  private String devEui = null;
  private String appEui = null;
  private String appKey = null;
  private String appSKey = null;
  private String devAddr = null;
  private String nwkSKey = null;
  private Integer fcntUp = null;
  private Integer fcntDown = null;
  private String flags = null;
  private Boolean activated = null;

  
  /**
   * Registration Type - OTAA or ABP
   **/
  public NodeInfo regType(String regType) {
    this.regType = regType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Registration Type - OTAA or ABP")
  @JsonProperty("regType")
  public String getRegType() {
    return regType;
  }
  public void setRegType(String regType) {
    this.regType = regType;
  }


  /**
   **/
  public NodeInfo devEui(String devEui) {
    this.devEui = devEui;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("devEui")
  public String getDevEui() {
    return devEui;
  }
  public void setDevEui(String devEui) {
    this.devEui = devEui;
  }


  /**
   **/
  public NodeInfo appEui(String appEui) {
    this.appEui = appEui;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("appEui")
  public String getAppEui() {
    return appEui;
  }
  public void setAppEui(String appEui) {
    this.appEui = appEui;
  }


  /**
   **/
  public NodeInfo appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }


  /**
   **/
  public NodeInfo appSKey(String appSKey) {
    this.appSKey = appSKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("appSKey")
  public String getAppSKey() {
    return appSKey;
  }
  public void setAppSKey(String appSKey) {
    this.appSKey = appSKey;
  }


  /**
   **/
  public NodeInfo devAddr(String devAddr) {
    this.devAddr = devAddr;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("devAddr")
  public String getDevAddr() {
    return devAddr;
  }
  public void setDevAddr(String devAddr) {
    this.devAddr = devAddr;
  }


  /**
   **/
  public NodeInfo nwkSKey(String nwkSKey) {
    this.nwkSKey = nwkSKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nwkSKey")
  public String getNwkSKey() {
    return nwkSKey;
  }
  public void setNwkSKey(String nwkSKey) {
    this.nwkSKey = nwkSKey;
  }


  /**
   **/
  public NodeInfo fcntUp(Integer fcntUp) {
    this.fcntUp = fcntUp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fcntUp")
  public Integer getFcntUp() {
    return fcntUp;
  }
  public void setFcntUp(Integer fcntUp) {
    this.fcntUp = fcntUp;
  }


  /**
   **/
  public NodeInfo fcntDown(Integer fcntDown) {
    this.fcntDown = fcntDown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fcntDown")
  public Integer getFcntDown() {
    return fcntDown;
  }
  public void setFcntDown(Integer fcntDown) {
    this.fcntDown = fcntDown;
  }


  /**
   **/
  public NodeInfo flags(String flags) {
    this.flags = flags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flags")
  public String getFlags() {
    return flags;
  }
  public void setFlags(String flags) {
    this.flags = flags;
  }


  /**
   **/
  public NodeInfo activated(Boolean activated) {
    this.activated = activated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activated")
  public Boolean getActivated() {
    return activated;
  }
  public void setActivated(Boolean activated) {
    this.activated = activated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeInfo nodeInfo = (NodeInfo) o;
    return Objects.equals(this.regType, nodeInfo.regType) &&
        Objects.equals(this.devEui, nodeInfo.devEui) &&
        Objects.equals(this.appEui, nodeInfo.appEui) &&
        Objects.equals(this.appKey, nodeInfo.appKey) &&
        Objects.equals(this.appSKey, nodeInfo.appSKey) &&
        Objects.equals(this.devAddr, nodeInfo.devAddr) &&
        Objects.equals(this.nwkSKey, nodeInfo.nwkSKey) &&
        Objects.equals(this.fcntUp, nodeInfo.fcntUp) &&
        Objects.equals(this.fcntDown, nodeInfo.fcntDown) &&
        Objects.equals(this.flags, nodeInfo.flags) &&
        Objects.equals(this.activated, nodeInfo.activated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regType, devEui, appEui, appKey, appSKey, devAddr, nwkSKey, fcntUp, fcntDown, flags, activated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeInfo {\n");
    
    sb.append("    regType: ").append(toIndentedString(regType)).append("\n");
    sb.append("    devEui: ").append(toIndentedString(devEui)).append("\n");
    sb.append("    appEui: ").append(toIndentedString(appEui)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    appSKey: ").append(toIndentedString(appSKey)).append("\n");
    sb.append("    devAddr: ").append(toIndentedString(devAddr)).append("\n");
    sb.append("    nwkSKey: ").append(toIndentedString(nwkSKey)).append("\n");
    sb.append("    fcntUp: ").append(toIndentedString(fcntUp)).append("\n");
    sb.append("    fcntDown: ").append(toIndentedString(fcntDown)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

