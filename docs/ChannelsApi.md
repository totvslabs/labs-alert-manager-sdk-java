# ChannelsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePolicyChannelsDelete**](ChannelsApi.md#deletePolicyChannelsDelete) | **DELETE** /channels/{id} |  |
| [**getPolicyChannelsGet**](ChannelsApi.md#getPolicyChannelsGet) | **GET** /channels/{id} |  |
| [**getPolicyChannelsGetAll**](ChannelsApi.md#getPolicyChannelsGetAll) | **GET** /channels |  |
| [**postPolicyChannelsPost**](ChannelsApi.md#postPolicyChannelsPost) | **POST** /channels |  |
| [**postPolicyChannelsTest**](ChannelsApi.md#postPolicyChannelsTest) | **POST** /channels/test |  |
| [**putPolicyChannelsPut**](ChannelsApi.md#putPolicyChannelsPut) | **PUT** /channels/{id} |  |


<a id="deletePolicyChannelsDelete"></a>
# **deletePolicyChannelsDelete**
> PolicyChannelSchema deletePolicyChannelsDelete(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      PolicyChannelSchema result = apiInstance.deletePolicyChannelsDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#deletePolicyChannelsDelete");
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

<a id="getPolicyChannelsGet"></a>
# **getPolicyChannelsGet**
> PolicyChannelSchema getPolicyChannelsGet(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      PolicyChannelSchema result = apiInstance.getPolicyChannelsGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#getPolicyChannelsGet");
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

<a id="getPolicyChannelsGetAll"></a>
# **getPolicyChannelsGetAll**
> PaginationSchema getPolicyChannelsGetAll()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    try {
      PaginationSchema result = apiInstance.getPolicyChannelsGetAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#getPolicyChannelsGetAll");
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

<a id="postPolicyChannelsPost"></a>
# **postPolicyChannelsPost**
> PolicyChannelSchema postPolicyChannelsPost(requestBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    PolicyChannelSchema requestBody = new PolicyChannelSchema(); // PolicyChannelSchema | 
    try {
      PolicyChannelSchema result = apiInstance.postPolicyChannelsPost(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#postPolicyChannelsPost");
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
| **requestBody** | [**PolicyChannelSchema**](PolicyChannelSchema.md)|  | [optional] |

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

<a id="postPolicyChannelsTest"></a>
# **postPolicyChannelsTest**
> PolicyChannelSchema postPolicyChannelsTest(requestBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    PolicyChannelSchema requestBody = new PolicyChannelSchema(); // PolicyChannelSchema | 
    try {
      PolicyChannelSchema result = apiInstance.postPolicyChannelsTest(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#postPolicyChannelsTest");
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
| **requestBody** | [**PolicyChannelSchema**](PolicyChannelSchema.md)|  | [optional] |

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

<a id="putPolicyChannelsPut"></a>
# **putPolicyChannelsPut**
> PolicyChannelSchema putPolicyChannelsPut(id, requestBody)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    String id = "id_example"; // String | 
    PolicyChannelSchema requestBody = new PolicyChannelSchema(); // PolicyChannelSchema | 
    try {
      PolicyChannelSchema result = apiInstance.putPolicyChannelsPut(id, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#putPolicyChannelsPut");
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
| **requestBody** | [**PolicyChannelSchema**](PolicyChannelSchema.md)|  | [optional] |

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

