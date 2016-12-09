package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * GatewaysStatus
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-09T07:12:27.273Z")
public class GatewaysStatus   {
  
  private String gatewayEui = null;
  private String gatewayActivity = null;
  private String lastPullData = null;
  private String lastPushData = null;
  private String pullDataCount = null;
  private String pushDataCount = null;

  
  /**
   **/
  public GatewaysStatus gatewayEui(String gatewayEui) {
    this.gatewayEui = gatewayEui;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("gateway_eui")
  public String getGatewayEui() {
    return gatewayEui;
  }
  public void setGatewayEui(String gatewayEui) {
    this.gatewayEui = gatewayEui;
  }


  /**
   * Gateway activity can be Active, Inactive, Not Found
   **/
  public GatewaysStatus gatewayActivity(String gatewayActivity) {
    this.gatewayActivity = gatewayActivity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Gateway activity can be Active, Inactive, Not Found")
  @JsonProperty("gateway_activity")
  public String getGatewayActivity() {
    return gatewayActivity;
  }
  public void setGatewayActivity(String gatewayActivity) {
    this.gatewayActivity = gatewayActivity;
  }


  /**
   **/
  public GatewaysStatus lastPullData(String lastPullData) {
    this.lastPullData = lastPullData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("last_pull_data")
  public String getLastPullData() {
    return lastPullData;
  }
  public void setLastPullData(String lastPullData) {
    this.lastPullData = lastPullData;
  }


  /**
   **/
  public GatewaysStatus lastPushData(String lastPushData) {
    this.lastPushData = lastPushData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("last_push_data")
  public String getLastPushData() {
    return lastPushData;
  }
  public void setLastPushData(String lastPushData) {
    this.lastPushData = lastPushData;
  }


  /**
   **/
  public GatewaysStatus pullDataCount(String pullDataCount) {
    this.pullDataCount = pullDataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pull_data_count")
  public String getPullDataCount() {
    return pullDataCount;
  }
  public void setPullDataCount(String pullDataCount) {
    this.pullDataCount = pullDataCount;
  }


  /**
   **/
  public GatewaysStatus pushDataCount(String pushDataCount) {
    this.pushDataCount = pushDataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("push_data_count")
  public String getPushDataCount() {
    return pushDataCount;
  }
  public void setPushDataCount(String pushDataCount) {
    this.pushDataCount = pushDataCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewaysStatus gatewaysStatus = (GatewaysStatus) o;
    return Objects.equals(this.gatewayEui, gatewaysStatus.gatewayEui) &&
        Objects.equals(this.gatewayActivity, gatewaysStatus.gatewayActivity) &&
        Objects.equals(this.lastPullData, gatewaysStatus.lastPullData) &&
        Objects.equals(this.lastPushData, gatewaysStatus.lastPushData) &&
        Objects.equals(this.pullDataCount, gatewaysStatus.pullDataCount) &&
        Objects.equals(this.pushDataCount, gatewaysStatus.pushDataCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayEui, gatewayActivity, lastPullData, lastPushData, pullDataCount, pushDataCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewaysStatus {\n");
    
    sb.append("    gatewayEui: ").append(toIndentedString(gatewayEui)).append("\n");
    sb.append("    gatewayActivity: ").append(toIndentedString(gatewayActivity)).append("\n");
    sb.append("    lastPullData: ").append(toIndentedString(lastPullData)).append("\n");
    sb.append("    lastPushData: ").append(toIndentedString(lastPushData)).append("\n");
    sb.append("    pullDataCount: ").append(toIndentedString(pullDataCount)).append("\n");
    sb.append("    pushDataCount: ").append(toIndentedString(pushDataCount)).append("\n");
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

