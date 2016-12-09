package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * DataPayload
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-09T07:12:27.273Z")
public class DataPayload   {
  
  private String devEui = null;
  private String appEui = null;
  private Long seqNum = null;
  private String lastDataReceived = null;
  private String payload = null;

  
  /**
   **/
  public DataPayload devEui(String devEui) {
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
  public DataPayload appEui(String appEui) {
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
  public DataPayload seqNum(Long seqNum) {
    this.seqNum = seqNum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("seqNum")
  public Long getSeqNum() {
    return seqNum;
  }
  public void setSeqNum(Long seqNum) {
    this.seqNum = seqNum;
  }


  /**
   **/
  public DataPayload lastDataReceived(String lastDataReceived) {
    this.lastDataReceived = lastDataReceived;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastDataReceived")
  public String getLastDataReceived() {
    return lastDataReceived;
  }
  public void setLastDataReceived(String lastDataReceived) {
    this.lastDataReceived = lastDataReceived;
  }


  /**
   **/
  public DataPayload payload(String payload) {
    this.payload = payload;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPayload dataPayload = (DataPayload) o;
    return Objects.equals(this.devEui, dataPayload.devEui) &&
        Objects.equals(this.appEui, dataPayload.appEui) &&
        Objects.equals(this.seqNum, dataPayload.seqNum) &&
        Objects.equals(this.lastDataReceived, dataPayload.lastDataReceived) &&
        Objects.equals(this.payload, dataPayload.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devEui, appEui, seqNum, lastDataReceived, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPayload {\n");
    
    sb.append("    devEui: ").append(toIndentedString(devEui)).append("\n");
    sb.append("    appEui: ").append(toIndentedString(appEui)).append("\n");
    sb.append("    seqNum: ").append(toIndentedString(seqNum)).append("\n");
    sb.append("    lastDataReceived: ").append(toIndentedString(lastDataReceived)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

