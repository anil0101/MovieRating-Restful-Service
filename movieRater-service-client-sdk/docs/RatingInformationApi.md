# RatingInformationApi

All URIs are relative to *https://swagger/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRating**](RatingInformationApi.md#createRating) | **PUT** /ratings | rating given by user for a particular movie.


<a name="createRating"></a>
# **createRating**
> ResponseMessage createRating(body)

rating given by user for a particular movie.

movie rating

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RatingInformationApi;


RatingInformationApi apiInstance = new RatingInformationApi();
RatingModel body = new RatingModel(); // RatingModel | body of the movies
try {
    ResponseMessage result = apiInstance.createRating(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingInformationApi#createRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RatingModel**](RatingModel.md)| body of the movies |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

