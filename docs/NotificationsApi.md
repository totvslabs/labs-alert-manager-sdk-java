# NotificationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNotificationLogGet**](NotificationsApi.md#getNotificationLogGet) | **GET** /notifications/{id} |  |
| [**getNotificationLogGetAll**](NotificationsApi.md#getNotificationLogGetAll) | **GET** /notifications |  |


<a id="getNotificationLogGet"></a>
# **getNotificationLogGet**
> PolicyChannelSchema getNotificationLogGet(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      PolicyChannelSchema result = apiInstance.getNotificationLogGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getNotificationLogGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**PolicyChannelSchema**](PolicyChannelSchema.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response |  -  |

<a id="getNotificationLogGetAll"></a>
# **getNotificationLogGetAll**
> PaginationSchema getNotificationLogGetAll()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    try {
      PaginationSchema result = apiInstance.getNotificationLogGetAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getNotificationLogGetAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaginationSchema**](PaginationSchema.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response |  -  |

