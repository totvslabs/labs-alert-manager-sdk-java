# openapi-java-client

alertmanager
- API version: 1.0.0
  - Build date: 2023-06-02T15:01:33.240562Z[Etc/UTC]

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
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      String result = apiInstance.deleteClientAppGetDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteClientAppGetDelete");
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
*DefaultApi* | [**deleteClientAppGetDelete**](docs/DefaultApi.md#deleteClientAppGetDelete) | **DELETE** /client_apps/{id} | 
*DefaultApi* | [**getClientAppGet**](docs/DefaultApi.md#getClientAppGet) | **GET** /client_apps/{id} | 
*DefaultApi* | [**getClientAppGetAll**](docs/DefaultApi.md#getClientAppGetAll) | **GET** /client_apps | 
*DefaultApi* | [**getDocs**](docs/DefaultApi.md#getDocs) | **GET** /docs | 
*DefaultApi* | [**getHealthCheck**](docs/DefaultApi.md#getHealthCheck) | **GET** /health_check | 
*DefaultApi* | [**getSwaggerJson**](docs/DefaultApi.md#getSwaggerJson) | **GET** /docs/swagger.json | 
*DefaultApi* | [**postClientAppPost**](docs/DefaultApi.md#postClientAppPost) | **POST** /client_apps/{id} | 
*DefaultApi* | [**putClientAppPut**](docs/DefaultApi.md#putClientAppPut) | **PUT** /client_apps | 


## Documentation for Models

 - [ClientAppSchema](docs/ClientAppSchema.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



