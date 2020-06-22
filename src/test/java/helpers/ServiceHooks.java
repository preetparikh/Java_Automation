package helpers;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ServiceHooks {
    protected Response response;
    protected ValidatableResponse json;
    protected RequestSpecification request;
    protected String BASE_URI = "https://api.weatherbit.io/v2.0/forecast/daily";
    protected String APIKey = "e367790c908944a882a863bd09e642b9";
}
