/*
 * Movie Rating Service
 * This is a movie rating service
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.RatingModel;
import io.swagger.client.model.ResponseMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RatingInformationApi
 */
@Ignore
public class RatingInformationApiTest {

    private final RatingInformationApi api = new RatingInformationApi();

    
    /**
     * rating given by user for a particular movie.
     *
     * movie rating
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRatingTest() throws ApiException {
        RatingModel body = null;
        ResponseMessage response = api.createRating(body);

        // TODO: test validations
    }
    
}
