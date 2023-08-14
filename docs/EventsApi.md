# EventsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteEventsParametersDelete**](EventsApi.md#deleteEventsParametersDelete) | **DELETE** /events/parameters/{app_key} |  |
| [**getEventsGet**](EventsApi.md#getEventsGet) | **GET** /events/{id} |  |
| [**getEventsGetAll**](EventsApi.md#getEventsGetAll) | **GET** /events |  |
| [**getEventsParametersGet**](EventsApi.md#getEventsParametersGet) | **GET** /events/parameters |  |
| [**postEventsPost**](EventsApi.md#postEventsPost) | **POST** /events |  |


<a id="deleteEventsParametersDelete"></a>
# **deleteEventsParametersDelete**
> String deleteEventsParametersDelete(appKey)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String appKey = "appKey_example"; // String | 
    try {
      String result = apiInstance.deleteEventsParametersDelete(appKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#deleteEventsParametersDelete");
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
| **appKey** | **String**|  | |

### Return type

**String**

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response |  -  |

<a id="getEventsGet"></a>
# **getEventsGet**
> EventSchema getEventsGet(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      EventSchema result = apiInstance.getEventsGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEventsGet");
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

[**EventSchema**](EventSchema.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response |  -  |

<a id="getEventsGetAll"></a>
# **getEventsGetAll**
> PaginationSchema getEventsGetAll()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    try {
      PaginationSchema result = apiInstance.getEventsGetAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEventsGetAll");
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

<a id="getEventsParametersGet"></a>
# **getEventsParametersGet**
> List&lt;EventSchema&gt; getEventsParametersGet()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    try {
      List<EventSchema> result = apiInstance.getEventsParametersGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEventsParametersGet");
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

[**List&lt;EventSchema&gt;**](EventSchema.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response |  -  |

<a id="postEventsPost"></a>
# **postEventsPost**
> EventSchema postEventsPost(requestBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    EventSchema requestBody = new EventSchema(); // EventSchema | 
    try {
      EventSchema result = apiInstance.postEventsPost(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#postEventsPost");
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
| **requestBody** | [**EventSchema**](EventSchema.md)|  | [optional] |

### Return type

[**EventSchema**](EventSchema.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response |  -  |

