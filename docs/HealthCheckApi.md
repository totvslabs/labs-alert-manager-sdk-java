# HealthCheckApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHealthCheck**](HealthCheckApi.md#getHealthCheck) | **GET** /health_check |  |


<a id="getHealthCheck"></a>
# **getHealthCheck**
> getHealthCheck()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthCheckApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: auth_token
    ApiKeyAuth auth_token = (ApiKeyAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth_token.setApiKeyPrefix("Token");

    HealthCheckApi apiInstance = new HealthCheckApi(defaultClient);
    try {
      apiInstance.getHealthCheck();
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCheckApi#getHealthCheck");
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

null (empty response body)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response |  -  |

