/**
 * VeriCiteLmsApiV1
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.vericite.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ExternalContentData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-30T12:19:34.237Z")
public class ExternalContentData   {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("uploadContentType")
  private String uploadContentType = null;

  @SerializedName("uploadContentLength")
  private Integer uploadContentLength = null;

  @SerializedName("externalContentID")
  private String externalContentID = null;

  public ExternalContentData fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the file
   * @return fileName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the file")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ExternalContentData uploadContentType(String uploadContentType) {
    this.uploadContentType = uploadContentType;
    return this;
  }

   /**
   * The content type of the file
   * @return uploadContentType
  **/
  @ApiModelProperty(example = "null", required = true, value = "The content type of the file")
  public String getUploadContentType() {
    return uploadContentType;
  }

  public void setUploadContentType(String uploadContentType) {
    this.uploadContentType = uploadContentType;
  }

  public ExternalContentData uploadContentLength(Integer uploadContentLength) {
    this.uploadContentLength = uploadContentLength;
    return this;
  }

   /**
   * The content length of the file
   * @return uploadContentLength
  **/
  @ApiModelProperty(example = "null", required = true, value = "The content length of the file")
  public Integer getUploadContentLength() {
    return uploadContentLength;
  }

  public void setUploadContentLength(Integer uploadContentLength) {
    this.uploadContentLength = uploadContentLength;
  }

  public ExternalContentData externalContentID(String externalContentID) {
    this.externalContentID = externalContentID;
    return this;
  }

   /**
   * External Content ID
   * @return externalContentID
  **/
  @ApiModelProperty(example = "null", required = true, value = "External Content ID")
  public String getExternalContentID() {
    return externalContentID;
  }

  public void setExternalContentID(String externalContentID) {
    this.externalContentID = externalContentID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContentData externalContentData = (ExternalContentData) o;
    return Objects.equals(this.fileName, externalContentData.fileName) &&
        Objects.equals(this.uploadContentType, externalContentData.uploadContentType) &&
        Objects.equals(this.uploadContentLength, externalContentData.uploadContentLength) &&
        Objects.equals(this.externalContentID, externalContentData.externalContentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, uploadContentType, uploadContentLength, externalContentID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContentData {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    uploadContentType: ").append(toIndentedString(uploadContentType)).append("\n");
    sb.append("    uploadContentLength: ").append(toIndentedString(uploadContentLength)).append("\n");
    sb.append("    externalContentID: ").append(toIndentedString(externalContentID)).append("\n");
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
