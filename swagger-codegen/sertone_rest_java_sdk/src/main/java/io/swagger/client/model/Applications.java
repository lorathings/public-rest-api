package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Applications
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-09T07:17:28.646Z")
public class Applications   {
  
  private Long id = null;
  private String appEui = null;
  private String name = null;
  private String owner = null;
  private String accessKeys = null;
  private Boolean valid = null;

  
  /**
   **/
  public Applications id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   **/
  public Applications appEui(String appEui) {
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
   * Name or Title of the application
   **/
  public Applications name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name or Title of the application")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public Applications owner(String owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }


  /**
   **/
  public Applications accessKeys(String accessKeys) {
    this.accessKeys = accessKeys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accessKeys")
  public String getAccessKeys() {
    return accessKeys;
  }
  public void setAccessKeys(String accessKeys) {
    this.accessKeys = accessKeys;
  }


  /**
   **/
  public Applications valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Applications applications = (Applications) o;
    return Objects.equals(this.id, applications.id) &&
        Objects.equals(this.appEui, applications.appEui) &&
        Objects.equals(this.name, applications.name) &&
        Objects.equals(this.owner, applications.owner) &&
        Objects.equals(this.accessKeys, applications.accessKeys) &&
        Objects.equals(this.valid, applications.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appEui, name, owner, accessKeys, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Applications {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appEui: ").append(toIndentedString(appEui)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    accessKeys: ").append(toIndentedString(accessKeys)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

