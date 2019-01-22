/**
 * Pesaway Pesamoni API Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse200 {
  
  @SerializedName("status")
  private String status = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("mobile")
  private String mobile = null;
  @SerializedName("statuscode")
  private String statuscode = null;
  @SerializedName("transaction_type")
  private String transactionType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMobile() {
    return mobile;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatuscode() {
    return statuscode;
  }
  public void setStatuscode(String statuscode) {
    this.statuscode = statuscode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return (this.status == null ? inlineResponse200.status == null : this.status.equals(inlineResponse200.status)) &&
        (this.token == null ? inlineResponse200.token == null : this.token.equals(inlineResponse200.token)) &&
        (this.description == null ? inlineResponse200.description == null : this.description.equals(inlineResponse200.description)) &&
        (this.mobile == null ? inlineResponse200.mobile == null : this.mobile.equals(inlineResponse200.mobile)) &&
        (this.statuscode == null ? inlineResponse200.statuscode == null : this.statuscode.equals(inlineResponse200.statuscode)) &&
        (this.transactionType == null ? inlineResponse200.transactionType == null : this.transactionType.equals(inlineResponse200.transactionType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.mobile == null ? 0: this.mobile.hashCode());
    result = 31 * result + (this.statuscode == null ? 0: this.statuscode.hashCode());
    result = 31 * result + (this.transactionType == null ? 0: this.transactionType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  mobile: ").append(mobile).append("\n");
    sb.append("  statuscode: ").append(statuscode).append("\n");
    sb.append("  transactionType: ").append(transactionType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
