# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Startedilk

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.MovieInformationApi;

import java.io.File;
import java.util.*;

public class MovieInformationApiExample {

    public static void main(String[] args) {
        
        MovieInformationApi apiInstance = new MovieInformationApi();
        MovieModelPut body = new MovieModelPut(); // MovieModelPut | body of the movies
        try {
            ResponseMessage result = apiInstance.createMovie(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MovieInformationApi#createMovie");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://swagger/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MovieInformationApi* | [**createMovie**](docs/MovieInformationApi.md#createMovie) | **PUT** /movies | information about a movie
*MovieInformationApi* | [**outputMovie**](docs/MovieInformationApi.md#outputMovie) | **GET** /movies | information about a movie.
*RatingInformationApi* | [**createRating**](docs/RatingInformationApi.md#createRating) | **PUT** /ratings | rating given by user for a particular movie.
*UserInformationApi* | [**createUser**](docs/UserInformationApi.md#createUser) | **PUT** /users | user information
*UserInformationApi* | [**outputUser**](docs/UserInformationApi.md#outputUser) | **GET** /users | user information


## Documentation for Models

 - [MovieModelGet](docs/MovieModelGet.md)
 - [MovieModelGetInner](docs/MovieModelGetInner.md)
 - [MovieModelGetInnerRating](docs/MovieModelGetInnerRating.md)
 - [MovieModelPut](docs/MovieModelPut.md)
 - [RatingModel](docs/RatingModel.md)
 - [ResponseMessage](docs/ResponseMessage.md)
 - [UserModelGet](docs/UserModelGet.md)
 - [UserModelGetInner](docs/UserModelGetInner.md)
 - [UserModelPut](docs/UserModelPut.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



