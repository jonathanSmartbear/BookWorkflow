/*
 * Book API
 * API for tracking your books.
 *
 * OpenAPI spec version: 1.1.0
 * Contact: micheal.higgins@smartbear.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse200Items
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-02-13T22:57:17.356Z[GMT]")
public class InlineResponse200Items {
  @SerializedName("title")
  private String title = null;

  @SerializedName("author")
  private String author = null;

  @SerializedName("pub-date")
  private String pubDate = null;

  public InlineResponse200Items title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(example = "Time Enough For Love", required = true, description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InlineResponse200Items author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @Schema(example = "Robert Heinlein", required = true, description = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public InlineResponse200Items pubDate(String pubDate) {
    this.pubDate = pubDate;
    return this;
  }

   /**
   * Get pubDate
   * @return pubDate
  **/
  @Schema(example = "22-01-2021", description = "")
  public String getPubDate() {
    return pubDate;
  }

  public void setPubDate(String pubDate) {
    this.pubDate = pubDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Items inlineResponse200Items = (InlineResponse200Items) o;
    return Objects.equals(this.title, inlineResponse200Items.title) &&
        Objects.equals(this.author, inlineResponse200Items.author) &&
        Objects.equals(this.pubDate, inlineResponse200Items.pubDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, author, pubDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Items {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    pubDate: ").append(toIndentedString(pubDate)).append("\n");
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
