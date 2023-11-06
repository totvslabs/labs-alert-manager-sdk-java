# openapi-java-client

alertmanager
- API version: 1.0.0
  - Build date: 2023-11-06T15:51:09.937846Z[Etc/UTC]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChannelsApi* | [**deletePolicyChannelsDelete**](docs/ChannelsApi.md#deletePolicyChannelsDelete) | **DELETE** /channels/{id} | 
*ChannelsApi* | [**getPolicyChannelsGet**](docs/ChannelsApi.md#getPolicyChannelsGet) | **GET** /channels/{id} | 
*ChannelsApi* | [**getPolicyChannelsGetAll**](docs/ChannelsApi.md#getPolicyChannelsGetAll) | **GET** /channels | 
*ChannelsApi* | [**postPolicyChannelsPost**](docs/ChannelsApi.md#postPolicyChannelsPost) | **POST** /channels | 
*ChannelsApi* | [**postPolicyChannelsTest**](docs/ChannelsApi.md#postPolicyChannelsTest) | **POST** /channels/test | 
*ChannelsApi* | [**putPolicyChannelsPut**](docs/ChannelsApi.md#putPolicyChannelsPut) | **PUT** /channels/{id} | 
*DocsApi* | [**getSwaggerJson**](docs/DocsApi.md#getSwaggerJson) | **GET** /docs/swagger.json | 
*DocsApi* | [**getSwaggerYml**](docs/DocsApi.md#getSwaggerYml) | **GET** /docs/swagger.yml | 
*EventsApi* | [**deleteEventsParametersDelete**](docs/EventsApi.md#deleteEventsParametersDelete) | **DELETE** /events/parameters/{app_key} | 
*EventsApi* | [**getEventsGet**](docs/EventsApi.md#getEventsGet) | **GET** /events/{id} | 
*EventsApi* | [**getEventsGetAll**](docs/EventsApi.md#getEventsGetAll) | **GET** /events | 
*EventsApi* | [**getEventsParametersGet**](docs/EventsApi.md#getEventsParametersGet) | **GET** /events/parameters | 
*EventsApi* | [**postEventsPost**](docs/EventsApi.md#postEventsPost) | **POST** /events | 
*HealthCheckApi* | [**getHealthCheck**](docs/HealthCheckApi.md#getHealthCheck) | **GET** /health_check | 
*NotificationsApi* | [**getNotificationLogGet**](docs/NotificationsApi.md#getNotificationLogGet) | **GET** /notifications/{id} | 
*NotificationsApi* | [**getNotificationLogGetAll**](docs/NotificationsApi.md#getNotificationLogGetAll) | **GET** /notifications | 
*NotificationsApi* | [**postNotificationLogResend**](docs/NotificationsApi.md#postNotificationLogResend) | **POST** /notifications/{id}/resend | 
*PoliciesApi* | [**deletePoliciesDelete**](docs/PoliciesApi.md#deletePoliciesDelete) | **DELETE** /policies/{id} | 
*PoliciesApi* | [**getPoliciesGet**](docs/PoliciesApi.md#getPoliciesGet) | **GET** /policies/{id} | 
*PoliciesApi* | [**getPoliciesGetAll**](docs/PoliciesApi.md#getPoliciesGetAll) | **GET** /policies | 
*PoliciesApi* | [**postPoliciesPost**](docs/PoliciesApi.md#postPoliciesPost) | **POST** /policies | 
*PoliciesApi* | [**putPoliciesPut**](docs/PoliciesApi.md#putPoliciesPut) | **PUT** /policies/{id} | 
*WelcomeApi* | [**getWelcome**](docs/WelcomeApi.md#getWelcome) | **GET** / | 


## Documentation for Models

 - [EventSchema](docs/EventSchema.md)
 - [NotificationSchema](docs/NotificationSchema.md)
 - [PaginationSchema](docs/PaginationSchema.md)
 - [PolicyChannelSchema](docs/PolicyChannelSchema.md)
 - [PolicySchema](docs/PolicySchema.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="auth_token"></a>
### auth_token

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



