package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Gateways
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-09T07:17:28.646Z")
public class Gateways   {
  
  private Long id = null;
  private String owner = null;
  private String gatewayEui = null;
  private String gatewayStatus = null;
  private String longitude = null;
  private String latitude = null;
  private String altitude = null;
  private String address = null;
  private String baseModel = null;
  private String city = null;
  private String concentrator = null;
  private String country = null;
  private String freqPlan = null;
  private String region = null;
  private String relCustomerUid = null;
  private String gatewayTitle = null;
  private String zipCode = null;
  private String createdOn = null;

  
  /**
   **/
  public Gateways id(Long id) {
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
  public Gateways owner(String owner) {
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
  public Gateways gatewayEui(String gatewayEui) {
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
   * Gateway status can be Planned, Active, Inactive, Maintenance, Deprecated
   **/
  public Gateways gatewayStatus(String gatewayStatus) {
    this.gatewayStatus = gatewayStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Gateway status can be Planned, Active, Inactive, Maintenance, Deprecated")
  @JsonProperty("gateway_status")
  public String getGatewayStatus() {
    return gatewayStatus;
  }
  public void setGatewayStatus(String gatewayStatus) {
    this.gatewayStatus = gatewayStatus;
  }


  /**
   **/
  public Gateways longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  /**
   **/
  public Gateways latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  /**
   **/
  public Gateways altitude(String altitude) {
    this.altitude = altitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("altitude")
  public String getAltitude() {
    return altitude;
  }
  public void setAltitude(String altitude) {
    this.altitude = altitude;
  }


  /**
   **/
  public Gateways address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   **/
  public Gateways baseModel(String baseModel) {
    this.baseModel = baseModel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("base_model")
  public String getBaseModel() {
    return baseModel;
  }
  public void setBaseModel(String baseModel) {
    this.baseModel = baseModel;
  }


  /**
   **/
  public Gateways city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }


  /**
   **/
  public Gateways concentrator(String concentrator) {
    this.concentrator = concentrator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("concentrator")
  public String getConcentrator() {
    return concentrator;
  }
  public void setConcentrator(String concentrator) {
    this.concentrator = concentrator;
  }


  /**
   **/
  public Gateways country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  /**
   **/
  public Gateways freqPlan(String freqPlan) {
    this.freqPlan = freqPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("freq_plan")
  public String getFreqPlan() {
    return freqPlan;
  }
  public void setFreqPlan(String freqPlan) {
    this.freqPlan = freqPlan;
  }


  /**
   **/
  public Gateways region(String region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   **/
  public Gateways relCustomerUid(String relCustomerUid) {
    this.relCustomerUid = relCustomerUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rel_customer_uid")
  public String getRelCustomerUid() {
    return relCustomerUid;
  }
  public void setRelCustomerUid(String relCustomerUid) {
    this.relCustomerUid = relCustomerUid;
  }


  /**
   **/
  public Gateways gatewayTitle(String gatewayTitle) {
    this.gatewayTitle = gatewayTitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("gateway_title")
  public String getGatewayTitle() {
    return gatewayTitle;
  }
  public void setGatewayTitle(String gatewayTitle) {
    this.gatewayTitle = gatewayTitle;
  }


  /**
   **/
  public Gateways zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zip_code")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  /**
   **/
  public Gateways createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("created_on")
  public String getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gateways gateways = (Gateways) o;
    return Objects.equals(this.id, gateways.id) &&
        Objects.equals(this.owner, gateways.owner) &&
        Objects.equals(this.gatewayEui, gateways.gatewayEui) &&
        Objects.equals(this.gatewayStatus, gateways.gatewayStatus) &&
        Objects.equals(this.longitude, gateways.longitude) &&
        Objects.equals(this.latitude, gateways.latitude) &&
        Objects.equals(this.altitude, gateways.altitude) &&
        Objects.equals(this.address, gateways.address) &&
        Objects.equals(this.baseModel, gateways.baseModel) &&
        Objects.equals(this.city, gateways.city) &&
        Objects.equals(this.concentrator, gateways.concentrator) &&
        Objects.equals(this.country, gateways.country) &&
        Objects.equals(this.freqPlan, gateways.freqPlan) &&
        Objects.equals(this.region, gateways.region) &&
        Objects.equals(this.relCustomerUid, gateways.relCustomerUid) &&
        Objects.equals(this.gatewayTitle, gateways.gatewayTitle) &&
        Objects.equals(this.zipCode, gateways.zipCode) &&
        Objects.equals(this.createdOn, gateways.createdOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, gatewayEui, gatewayStatus, longitude, latitude, altitude, address, baseModel, city, concentrator, country, freqPlan, region, relCustomerUid, gatewayTitle, zipCode, createdOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gateways {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    gatewayEui: ").append(toIndentedString(gatewayEui)).append("\n");
    sb.append("    gatewayStatus: ").append(toIndentedString(gatewayStatus)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    baseModel: ").append(toIndentedString(baseModel)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    concentrator: ").append(toIndentedString(concentrator)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    freqPlan: ").append(toIndentedString(freqPlan)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    relCustomerUid: ").append(toIndentedString(relCustomerUid)).append("\n");
    sb.append("    gatewayTitle: ").append(toIndentedString(gatewayTitle)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

