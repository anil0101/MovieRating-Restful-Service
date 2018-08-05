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
import swagger.model.MovieModelGet;
import swagger.model.MovieModelPut;
import swagger.model.ResponseMessage;
import swagger.service.MovieServiceGet;
import swagger.service.MovieServicePut;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

@Controller
public class MoviesApiController implements MoviesApi {

    private static final Logger log = LoggerFactory.getLogger(MoviesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    MovieServicePut movieServicePut;

    @Autowired
    MovieServiceGet movieServiceGet;

    @Autowired
    public MoviesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseMessage> createMovie(@ApiParam(value = "body of the movies" ,required=true )  @Valid @RequestBody MovieModelPut body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                movieServicePut.saveMovie(body);
                return new ResponseEntity<ResponseMessage>(objectMapper.readValue("{  \"code\" : 201,  \"message\" : \"Success\"}", ResponseMessage.class), HttpStatus.CREATED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseMessage>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseMessage>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MovieModelGet> outputMovie() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

            return new ResponseEntity<MovieModelGet>(movieServiceGet.outputMovieList(), HttpStatus.CREATED);
        }

        return new ResponseEntity<MovieModelGet>(HttpStatus.NOT_IMPLEMENTED);
    }

}
