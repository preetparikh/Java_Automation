package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Weather {
    @Given("^I like to holiday in Bondi Beach$")
    public void i_like_to_holiday_in_bondi_beach() throws Throwable {
        driver.getTitle();
    }

    @Given("^I only like to holiday on Thursdays$")
    public void i_only_like_to_holiday_on_thursday() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I look up the the weather forecast for the next 14 days$")
    public void i_look_up_the_weather_forecast_for_the_next_14_days() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I can see the max temperature on Thursdays is always above 10 degrees in Bondi Beach$")
    public void i_can_see_the_max_tempreture_on_thursday_isalways_above_10_egrees_in_bondi_beach() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I can see that it won't be snowing for the next 14 days$")
    public void i_can_see_that_it_wont_be_snowing_for_the_next_14_days() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}

