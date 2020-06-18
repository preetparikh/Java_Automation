package step_definitions;

import helpers.DataHelper;
import helpers.Log;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Reporter;

import java.util.HashMap;
import java.util.List;

public class Calendar {
    public AppiumDriver driver;
    public List<HashMap<String,String>> datamap = DataHelper.data();


    @Given("^I have launched the Calendar App$")
    public void i_have_launched_the_calendar_app() throws Throwable {

        boolean continue_button_present = pageobjects.Calendar.continue_button.isDisplayed();
        boolean allow_button_present = pageobjects.Calendar.allow_while_using.isDisplayed();

        if (continue_button_present = true) {
            pageobjects.Calendar.continue_button.click();
            Log.info("Click continue on first launch");
        }

        else if (allow_button_present = true) {
            pageobjects.Calendar.allow_while_using.click();
            Log.info("Click allow on first launch");
        }

        else {
            Log.info("Not launching for first time.No need to click demo buttons.");
        }
    }

    @Then("^I want to book a meeting with the title Introduction$")
    public void i_want_to_book_a_meeting_with_the_title_introduction(HashMap<String,String> datamap) throws Throwable {

        pageobjects.Calendar.add.click();
        Log.info("Click add on calendar" );

        pageobjects.Calendar.AddEventPage.title.sendKeys(datamap.get("title"));
        Log.info(" is entered in Title text box" );

    }

    @And("^Set Meeting duration as 30 Minutes in the evening everyday$")
    public void set_meeting_duration_as_30_minutes_in_the_evening_everyday(HashMap<String,String> datamap) throws Throwable {

        pageobjects.Calendar.AddEventPage.never_link.click();
        pageobjects.Calendar.AddEventPage.everyday.click();
        Log.info("Event to repeat everyday" );

        pageobjects.Calendar.AddEventPage.starts.click();
        pageobjects.Calendar.AddEventPage.hour.sendKeys(datamap.get("starthour"));
        pageobjects.Calendar.AddEventPage.minute.sendKeys(datamap.get("startminute"));

        pageobjects.Calendar.AddEventPage.ends.click();
        pageobjects.Calendar.AddEventPage.hour.sendKeys(datamap.get("endhour"));
        pageobjects.Calendar.AddEventPage.minute.sendKeys(datamap.get("endminute"));
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
