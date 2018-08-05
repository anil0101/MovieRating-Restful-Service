/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package swagger.api;

import swagger.model.ResponseMessage;
import swagger.model.UserModelGet;
import swagger.model.UserModelPut;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "user information", nickname = "createUser", notes = "Information regarding a particular user", response = ResponseMessage.class, tags={ "User information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = ResponseMessage.class),
        @ApiResponse(code = 400, message = "bad request", response = ResponseMessage.class),
        @ApiResponse(code = 500, message = "internal server error", response = ResponseMessage.class),
        @ApiResponse(code = 200, message = "default response message", response = ResponseMessage.class) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ResponseMessage> createUser(@ApiParam(value = "body of the movies" ,required=true )  @Valid @RequestBody UserModelPut body);


    @ApiOperation(value = "user information", nickname = "outputUser", notes = "information of all the users", response = UserModelGet.class, tags={ "User information", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = UserModelGet.class) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<UserModelGet> outputUser();

}
