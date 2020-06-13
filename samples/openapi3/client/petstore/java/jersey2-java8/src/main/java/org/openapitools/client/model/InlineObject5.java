/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * InlineObject5
 */
@JsonPropertyOrder({
  InlineObject5.JSON_PROPERTY_ADDITIONAL_METADATA,
  InlineObject5.JSON_PROPERTY_REQUIRED_FILE
})

public class InlineObject5 {
  public static final String JSON_PROPERTY_ADDITIONAL_METADATA = "additionalMetadata";
  private String additionalMetadata;

  public static final String JSON_PROPERTY_REQUIRED_FILE = "requiredFile";
  private File requiredFile;


  public InlineObject5 additionalMetadata(String additionalMetadata) {
    this.additionalMetadata = additionalMetadata;
    return this;
  }

   /**
   * Additional data to pass to server
   * @return additionalMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional data to pass to server")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalMetadata() {
    return additionalMetadata;
  }


  public void setAdditionalMetadata(String additionalMetadata) {
    this.additionalMetadata = additionalMetadata;
  }


  public InlineObject5 requiredFile(File requiredFile) {
    this.requiredFile = requiredFile;
    return this;
  }

   /**
   * file to upload
   * @return requiredFile
  **/
  @ApiModelProperty(required = true, value = "file to upload")
  @JsonProperty(JSON_PROPERTY_REQUIRED_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public File getRequiredFile() {
    return requiredFile;
  }


  public void setRequiredFile(File requiredFile) {
    this.requiredFile = requiredFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject5 inlineObject5 = (InlineObject5) o;
    return Objects.equals(this.additionalMetadata, inlineObject5.additionalMetadata) &&
        Objects.equals(this.requiredFile, inlineObject5.requiredFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalMetadata, requiredFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject5 {\n");
    sb.append("    additionalMetadata: ").append(toIndentedString(additionalMetadata)).append("\n");
    sb.append("    requiredFile: ").append(toIndentedString(requiredFile)).append("\n");
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
