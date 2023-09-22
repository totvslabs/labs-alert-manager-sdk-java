/*
 * alertmanager
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * PolicyChannelSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-22T19:03:10.955152Z[Etc/UTC]")
public class PolicyChannelSchema {
  public static final String SERIALIZED_NAME_CLIENT_UUID = "client_uuid";
  @SerializedName(SERIALIZED_NAME_CLIENT_UUID)
  private String clientUuid;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Object config;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_NOTIFICATION = "last_notification";
  @SerializedName(SERIALIZED_NAME_LAST_NOTIFICATION)
  private OffsetDateTime lastNotification;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public PolicyChannelSchema() {
  }

  public PolicyChannelSchema clientUuid(String clientUuid) {
    
    this.clientUuid = clientUuid;
    return this;
  }

   /**
   * Client uuid. This is the id defined by client app
   * @return clientUuid
  **/
  @javax.annotation.Nonnull
  public String getClientUuid() {
    return clientUuid;
  }


  public void setClientUuid(String clientUuid) {
    this.clientUuid = clientUuid;
  }


  public PolicyChannelSchema config(Object config) {
    
    this.config = config;
    return this;
  }

   /**
   * Policy Channel config
   * @return config
  **/
  @javax.annotation.Nonnull
  public Object getConfig() {
    return config;
  }


  public void setConfig(Object config) {
    this.config = config;
  }


  public PolicyChannelSchema createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PolicyChannelSchema deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Policy Channel deleted flag
   * @return deleted
  **/
  @javax.annotation.Nonnull
  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public PolicyChannelSchema enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Policy Channel enabled flag
   * @return enabled
  **/
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PolicyChannelSchema id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PolicyChannelSchema lastNotification(OffsetDateTime lastNotification) {
    
    this.lastNotification = lastNotification;
    return this;
  }

   /**
   * Get lastNotification
   * @return lastNotification
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastNotification() {
    return lastNotification;
  }


  public void setLastNotification(OffsetDateTime lastNotification) {
    this.lastNotification = lastNotification;
  }


  public PolicyChannelSchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Policy Channel name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PolicyChannelSchema type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Policy Channel type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PolicyChannelSchema updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyChannelSchema policyChannelSchema = (PolicyChannelSchema) o;
    return Objects.equals(this.clientUuid, policyChannelSchema.clientUuid) &&
        Objects.equals(this.config, policyChannelSchema.config) &&
        Objects.equals(this.createdAt, policyChannelSchema.createdAt) &&
        Objects.equals(this.deleted, policyChannelSchema.deleted) &&
        Objects.equals(this.enabled, policyChannelSchema.enabled) &&
        Objects.equals(this.id, policyChannelSchema.id) &&
        Objects.equals(this.lastNotification, policyChannelSchema.lastNotification) &&
        Objects.equals(this.name, policyChannelSchema.name) &&
        Objects.equals(this.type, policyChannelSchema.type) &&
        Objects.equals(this.updatedAt, policyChannelSchema.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUuid, config, createdAt, deleted, enabled, id, lastNotification, name, type, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyChannelSchema {\n");
    sb.append("    clientUuid: ").append(toIndentedString(clientUuid)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastNotification: ").append(toIndentedString(lastNotification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("client_uuid");
    openapiFields.add("config");
    openapiFields.add("created_at");
    openapiFields.add("deleted");
    openapiFields.add("enabled");
    openapiFields.add("id");
    openapiFields.add("last_notification");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_uuid");
    openapiRequiredFields.add("config");
    openapiRequiredFields.add("deleted");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PolicyChannelSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PolicyChannelSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PolicyChannelSchema is not found in the empty JSON string", PolicyChannelSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PolicyChannelSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PolicyChannelSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PolicyChannelSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("client_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_uuid").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PolicyChannelSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PolicyChannelSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PolicyChannelSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PolicyChannelSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<PolicyChannelSchema>() {
           @Override
           public void write(JsonWriter out, PolicyChannelSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PolicyChannelSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PolicyChannelSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PolicyChannelSchema
  * @throws IOException if the JSON string is invalid with respect to PolicyChannelSchema
  */
  public static PolicyChannelSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PolicyChannelSchema.class);
  }

 /**
  * Convert an instance of PolicyChannelSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

