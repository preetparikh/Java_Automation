package step_definitions;

import helpers.Hooks;
import helpers.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Reporter;
import page_objects.CalendarObjects;

import java.net.MalformedURLException;

public class CalendarSteps extends Hooks {

    CalendarObjects cOBJ;

    @Given("I have launched the Calendar App")
    public void i_have_launched_the_Calendar_App() throws MalformedURLException, InterruptedException {

        setup();
        cOBJ = new CalendarObjects(driver);
        Thread.sleep(5000);
        boolean continue_button_present = cOBJ.continueVisible();

        if (continue_button_present) {
            cOBJ.clickContinue();
            Log.info("Click continue on first launch");
        }

        else if (cOBJ.allowVisible()) {
            cOBJ.clickAllow();
            Log.info("Click allow on first launch");
        }

        else {
            Log.info("Not launching for first time.No need to click demo buttons.");
        }

    }

    @Then("I want to book a meeting with the title “Introduction”")
    public void i_want_to_book_a_meeting_with_the_title_introduction()  {

        cOBJ.clickAdd();
        Log.info("Click add on calendar" );

        cOBJ.setTitle("Introduction");
        Log.info(" is entered in Title text box" );

    }

    @And("^Set Meeting duration as 30 Minutes in the evening everyday$")
    public void set_meeting_duration_as_30_minutes_in_the_evening_everyday() {

        cOBJ.clickNever();
        cOBJ.clickEveryday();
        Log.info("Event to repeat everyday" );

        cOBJ.clickStarts();
        cOBJ.setHour("4");
        cOBJ.setMinute("00");
        cOBJ.setAmPm("PM");

        cOBJ.clickEnds();
        cOBJ.setHour("4");
        cOBJ.setMinute("30");
        cOBJ.setAmPm("PM");
    }

    @And("^I save the meeting$")
    public void i_save_the_meeting() {

        cOBJ.clickAddevent();
    }

    @Then("^I Check if the meeting is created as expected$")
    public void i_check_if_the_meeting_is_created_as_expected() {
        cOBJ.confirmationVisible();
        Reporter.log("New Event is Successfully Added.");

    }
}
