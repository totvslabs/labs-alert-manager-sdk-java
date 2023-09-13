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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * NotificationSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-13T13:22:52.784665Z[Etc/UTC]")
public class NotificationSchema {
  public static final String SERIALIZED_NAME_CLIENT_UUID = "client_uuid";
  @SerializedName(SERIALIZED_NAME_CLIENT_UUID)
  private String clientUuid;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events;

  public static final String SERIALIZED_NAME_FIRST_EVENT = "first_event";
  @SerializedName(SERIALIZED_NAME_FIRST_EVENT)
  private OffsetDateTime firstEvent;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Integer retries;

  /**
   * Notification status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    QUEUED("Queued"),
    
    PROCESSING("Processing"),
    
    FAILED("Failed"),
    
    SUCCESS("Success");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public NotificationSchema() {
  }

  public NotificationSchema clientUuid(String clientUuid) {
    
    this.clientUuid = clientUuid;
    return this;
  }

   /**
   * Notification Client UUID
   * @return clientUuid
  **/
  @javax.annotation.Nonnull
  public String getClientUuid() {
    return clientUuid;
  }


  public void setClientUuid(String clientUuid) {
    this.clientUuid = clientUuid;
  }


  public NotificationSchema createdAt(OffsetDateTime createdAt) {
    
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


  public NotificationSchema events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public NotificationSchema addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * List of notification events
   * @return events
  **/
  @javax.annotation.Nullable
  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public NotificationSchema firstEvent(OffsetDateTime firstEvent) {
    
    this.firstEvent = firstEvent;
    return this;
  }

   /**
   * Get firstEvent
   * @return firstEvent
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getFirstEvent() {
    return firstEvent;
  }


  public void setFirstEvent(OffsetDateTime firstEvent) {
    this.firstEvent = firstEvent;
  }


  public NotificationSchema id(String id) {
    
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


  public NotificationSchema retries(Integer retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * Quantity notification retries
   * @return retries
  **/
  @javax.annotation.Nullable
  public Integer getRetries() {
    return retries;
  }


  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  public NotificationSchema status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Notification status
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public NotificationSchema updatedAt(OffsetDateTime updatedAt) {
    
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
    NotificationSchema notificationSchema = (NotificationSchema) o;
    return Objects.equals(this.clientUuid, notificationSchema.clientUuid) &&
        Objects.equals(this.createdAt, notificationSchema.createdAt) &&
        Objects.equals(this.events, notificationSchema.events) &&
        Objects.equals(this.firstEvent, notificationSchema.firstEvent) &&
        Objects.equals(this.id, notificationSchema.id) &&
        Objects.equals(this.retries, notificationSchema.retries) &&
        Objects.equals(this.status, notificationSchema.status) &&
        Objects.equals(this.updatedAt, notificationSchema.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUuid, createdAt, events, firstEvent, id, retries, status, updatedAt);
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
    sb.append("class NotificationSchema {\n");
    sb.append("    clientUuid: ").append(toIndentedString(clientUuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    firstEvent: ").append(toIndentedString(firstEvent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("events");
    openapiFields.add("first_event");
    openapiFields.add("id");
    openapiFields.add("retries");
    openapiFields.add("status");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_uuid");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NotificationSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotificationSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationSchema is not found in the empty JSON string", NotificationSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NotificationSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NotificationSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("client_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_uuid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("events") != null && !jsonObj.get("events").isJsonNull() && !jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationSchema>() {
           @Override
           public void write(JsonWriter out, NotificationSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationSchema
  * @throws IOException if the JSON string is invalid with respect to NotificationSchema
  */
  public static NotificationSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationSchema.class);
  }

 /**
  * Convert an instance of NotificationSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

