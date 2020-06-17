package step_definitions;

import helpers.Log;
import io.appium.java_client.AppiumDriver;
import modules.AddEventAction;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import org.testng.Reporter;

public class Calendar {
    public AppiumDriver driver;

    @Given("^I have launched the Calendar App$")
    public void i_have_launched_the_calendar_app() throws Throwable {

        pageobjects.Calendar.continue_button.click();
        Log.info("Click continue on first launch" );

        pageobjects.Calendar.allow_while_using.click();
        Log.info("Click allow on first launch" );
    }

    @Then("^I want to book a meeting with the title Introduction$")
    public void i_want_to_book_a_meeting_with_the_title_introduction() throws Throwable {

        pageobjects.Calendar.add.click();
        Log.info("Click add on calendar" );

        pageobjects.Calendar.AddEventPage.title.sendKeys(map.get("title"));
        Log.info(" is entered in Title text box" );

    }

    @And("^Set Meeting duration as 30 Minutes in the evening everyday$")
    public void set_meeting_duration_as_30_minutes_in_the_evening_everyday() throws Throwable {

        pageobjects.Calendar.AddEventPage.never_link.click();
        pageobjects.Calendar.AddEventPage.everyday.click();
        Log.info("Event to repeat everyday" );

        pageobjects.Calendar.AddEventPage.starts.click();
        pageobjects.Calendar.AddEventPage.hour.sendKeys(map.get("starthour"));
        pageobjects.Calendar.AddEventPage.minute.sendKeys(map.get("startminute"));

        pageobjects.Calendar.AddEventPage.ends.click();
        pageobjects.Calendar.AddEventPage.hour.sendKeys(map.get("endhour"));
        pageobjects.Calendar.AddEventPage.minute.sendKeys(map.get("endminute"));
    }

    @And("^I save the meeting$")
    public void i_save_the_meeting() throws Throwable {

        pageobjects.Calendar.AddEventPage.addnewevent.click();
    }

    @Then("^I Check if the meeting is created as expected$")
    public void i_check_if_the_meeting_is_created_as_expected() throws Throwable {
        pageobjects.Calendar.eventconfirmation.isDisplayed();
        Reporter.log("New Event is Successfully Added.");

    }
}
