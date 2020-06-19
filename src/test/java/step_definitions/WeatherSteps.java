package step_definitions;

import helpers.ServiceHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static helpers.HelperMethods.getDayName;


public class WeatherSteps extends ServiceHooks {

    @Given("^I like to holiday on \"([^\"]*)\"$")
    public void i_like_to_holiday_on(String name) {
        request = given().queryParams("city","Bondi Beach","key",APIKey);
    }

    @When("^I look up the weather forecast for the next (\\d+) days$")
    public void i_look_up_the_weather_forecast_for_the_next(int daysToConsider) {

        response = request.queryParam("days",daysToConsider).when().get(BASE_URI);
    }

    public void verify_valid_response_and_status_code(){
        String contentType = response.getContentType();
        int statusCode = response.getStatusCode();
        Assert.assertTrue("The response is not valid JSON",contentType.contains("application/json"));

        Assert.assertEquals("Expecting status code as 200 but it is displayed as "+statusCode,200,statusCode);

    }
    @Then("^The response is valid and contains \"([^\"]*)\" as city name$")
    public void verify_response_and_city_name(String cityNameToverfiy){
        verify_valid_response_and_status_code();
        String actualCityName = response.then().extract().path("city_name");
        System.out.println(actualCityName);
        Assert.assertEquals("City Name is not displayed with "+actualCityName,cityNameToverfiy,actualCityName);

    }

    @And("^I can see the max temperature on \"([^\"]*)\" is always above (\\d+) degrees$")
    public void verify_max_temperature_is_above_10_degrees(String particularDay, int degreesToVerify){

        String responseData = response.then().extract().asString();
        JSONObject jsonObject = new JSONObject(responseData);
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        for (int index = 0; index < jsonArray.length(); index++) {
            JSONObject dataObj = jsonArray.getJSONObject(index); // you will get the json object
            String actualDateTime = dataObj.getString("datetime");
            String dayName = getDayName(actualDateTime);
            if(dayName.equals(particularDay)){
                int maxTemp = dataObj.getInt("max_temp");
                assertThat(maxTemp, greaterThan(degreesToVerify));
            }
        }
    }

    @And("^There is no snow forecast for any day$")
    public void verify_no_snow_forecast(){

        String responseData = response.then().extract().asString();
        JSONObject jsonObject = new JSONObject(responseData);
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        for (int index = 0; index < jsonArray.length(); index++) {
            JSONObject dataObj = jsonArray.getJSONObject(index); // you will get the json object
            int actualSnow = dataObj.getInt("snow");
            assertThat(actualSnow, equalTo(0));
        }
    }



}

