package step_definitions;

import helpers.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Reporter;
import pageobjects.CalendarObjects;

import java.net.MalformedURLException;

public class CalendarSteps extends Hooks{

    CalendarObjects cOBJ;

    @Given("I have launched the Calendar App")
    public void i_have_launched_the_Calendar_App() throws MalformedURLException, InterruptedException {

        setup();
        cOBJ = new CalendarObjects(driver);
        Thread.sleep(5000);
        boolean continue_button_present = cOBJ.continuevisible();

        if (continue_button_present) {
            cOBJ.clickcontinue();
            Log.info("Click continue on first launch");
        }

        else if (cOBJ.allowvisible()) {
            cOBJ.clickallow();
            Log.info("Click allow on first launch");
        }

        else {
            Log.info("Not launching for first time.No need to click demo buttons.");
        }

    }

    @Then("I want to book a meeting with the title “Introduction”")
    public void i_want_to_book_a_meeting_with_the_title_introduction()  {

        cOBJ.clickadd();
        Log.info("Click add on calendar" );

        cOBJ.SetTitle("Introduction");
        Log.info(" is entered in Title text box" );

    }

    @And("^Set Meeting duration as 30 Minutes in the evening everyday$")
    public void set_meeting_duration_as_30_minutes_in_the_evening_everyday() {

        cOBJ.clicknever();
        cOBJ.clickeveryday();
        Log.info("Event to repeat everyday" );

        cOBJ.clickstarts();
        cOBJ.SetHour("4");
        cOBJ.SetMinute("00");

        cOBJ.clickends();
        cOBJ.SetHour("4");
        cOBJ.SetMinute("30");
    }

    @And("^I save the meeting$")
    public void i_save_the_meeting() {

        cOBJ.clickaddevent();
    }

    @Then("^I Check if the meeting is created as expected$")
    public void i_check_if_the_meeting_is_created_as_expected() {
        cOBJ.confirmationvisible();
        Reporter.log("New Event is Successfully Added.");

    }
}
