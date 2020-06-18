package step_definitions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ServiceHooks {
    protected Response response;
    protected ValidatableResponse json;
    protected RequestSpecification request;
    protected String BASE_URI = "https://api.weatherbit.io/v2.0/forecast/daily";
    protected String APIKey = "";
}
