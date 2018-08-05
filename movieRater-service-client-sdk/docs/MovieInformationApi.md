# MovieInformationApi

All URIs are relative to *https://swagger/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMovie**](MovieInformationApi.md#createMovie) | **PUT** /movies | information about a movie
[**outputMovie**](MovieInformationApi.md#outputMovie) | **GET** /movies | information about a movie.


<a name="createMovie"></a>
# **createMovie**
> ResponseMessage createMovie(body)

information about a movie

Details of a movie

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MovieInformationApi;


MovieInformationApi apiInstance = new MovieInformationApi();
MovieModelPut body = new MovieModelPut(); // MovieModelPut | body of the movies
try {
    ResponseMessage result = apiInstance.createMovie(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieInformationApi#createMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MovieModelPut**](MovieModelPut.md)| body of the movies |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outputMovie"></a>
# **outputMovie**
> MovieModelGet outputMovie()

information about a movie.

Details of a movie

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MovieInformationApi;


MovieInformationApi apiInstance = new MovieInformationApi();
try {
    MovieModelGet result = apiInstance.outputMovie();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovieInformationApi#outputMovie");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MovieModelGet**](MovieModelGet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

