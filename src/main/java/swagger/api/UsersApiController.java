package swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import swagger.model.ResponseMessage;
import swagger.model.UserModelGet;
import swagger.model.UserModelPut;
import swagger.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

@Controller
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    UserService userService;

    @Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseMessage> createUser(@ApiParam(value = "body of the movies" ,required=true )  @Valid @RequestBody UserModelPut body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                userService.saveUser(body);
                return new ResponseEntity<ResponseMessage>(objectMapper.readValue("{  \"code\" : 201,  \"message\" : \"Success\"}", ResponseMessage.class), HttpStatus.CREATED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseMessage>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseMessage>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserModelGet> outputUser() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
                return new ResponseEntity<UserModelGet>(userService.findAllUsers(), HttpStatus.CREATED);
        }

        return new ResponseEntity<UserModelGet>(HttpStatus.NOT_IMPLEMENTED);
    }

}
