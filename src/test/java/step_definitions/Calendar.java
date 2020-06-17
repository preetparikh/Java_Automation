package step_definitions;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

public class Calendar {
    public AppiumDriver driver;

    @Given("^I have launched the Calendar App$")
    public void i_have_launched_the_calendar_app() throws Throwable {
        driver.getTitle();
    }

    @When("^It is not a weekend$")
    public void it_is_not_a_weekend() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, AutomationHomePage.class);
        PageFactory.initElements(driver, LoginPage.class);

        SignInAction.Execute(driver,datamap.get(0));
    }

    @When("^It is not a public holiday$")
    public void it_is_not_a_public_holiday() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignoutAction.Execute(driver);
    }

    @Then("^I want to book a meeting with the title Introduction$")
    public void i_want_to_book_a_meeting_with_the_title_introduction() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignoutAction.Execute(driver);
    }

    @Then("^Set Meeting duration as 30 Minutes in the evening$")
    public void set_meeting_duration_as_30_minutes_in_the_evening() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignoutAction.Execute(driver);
    }

    @Then("^I invite people$")
    public void i_invite_people() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignoutAction.Execute(driver);
    }

    @Then("^I Check if the meeting is created as expected$")
    public void i_check_if_the_meeting_is_created_as_expected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignoutAction.Execute(driver);
    }
}
