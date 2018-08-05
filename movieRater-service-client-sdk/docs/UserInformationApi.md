# UserInformationApi

All URIs are relative to *https://swagger/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserInformationApi.md#createUser) | **PUT** /users | user information
[**outputUser**](UserInformationApi.md#outputUser) | **GET** /users | user information


<a name="createUser"></a>
# **createUser**
> ResponseMessage createUser(body)

user information

Information regarding a particular user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserInformationApi;


UserInformationApi apiInstance = new UserInformationApi();
UserModelPut body = new UserModelPut(); // UserModelPut | body of the movies
try {
    ResponseMessage result = apiInstance.createUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInformationApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserModelPut**](UserModelPut.md)| body of the movies |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outputUser"></a>
# **outputUser**
> UserModelGet outputUser()

user information

information of all the users

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserInformationApi;


UserInformationApi apiInstance = new UserInformationApi();
try {
    UserModelGet result = apiInstance.outputUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInformationApi#outputUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserModelGet**](UserModelGet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

