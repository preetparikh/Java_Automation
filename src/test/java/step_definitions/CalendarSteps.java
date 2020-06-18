package step_definitions;

import helpers.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import pageobjects.CalendarObjects;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CalendarSteps extends Hooks{

    public static List<HashMap<String,String>> datamap = null;


    public CalendarSteps() throws MalformedURLException, InterruptedException {

        setup();

        datamap = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> sampleData = new HashMap<String,String>();
        sampleData.put("title","Introduction");
        sampleData.put("starthour","4");
        sampleData.put("startminute","00");
        sampleData.put("endhour","4");
        sampleData.put("endminute","30");
        System.out.println("Current data" +sampleData);
        datamap.add(sampleData);
    }

    @Given("I have launched the Calendar App")
    public void i_have_launched_the_Calendar_App()  {

        PageFactory.initElements(driver,CalendarObjects.class);

        boolean continue_button_present = CalendarObjects.continue_button.isDisplayed();
        boolean allow_button_present = CalendarObjects.allow_while_using.isDisplayed();

        if (continue_button_present) {
            CalendarObjects.continue_button.click();
            Log.info("Click continue on first launch");
        }

        else if (allow_button_present) {
            CalendarObjects.allow_while_using.click();
            Log.info("Click allow on first launch");
        }

        else {
            Log.info("Not launching for first time.No need to click demo buttons.");
        }

    }

    @Then("I want to book a meeting with the title “Introduction”")
    public void i_want_to_book_a_meeting_with_the_title_introduction()  {

        CalendarObjects.add.click();
        Log.info("Click add on calendar" );

        CalendarObjects.title.sendKeys("Introduction");
        Log.info(" is entered in Title text box" );

    }

    @And("^Set Meeting duration as 30 Minutes in the evening everyday$")
    public void set_meeting_duration_as_30_minutes_in_the_evening_everyday() {

        CalendarObjects.never_link.click();
        CalendarObjects.everyday.click();
        Log.info("Event to repeat everyday" );

        CalendarObjects.starts.click();
        CalendarObjects.hour.sendKeys("4");
        CalendarObjects.minute.sendKeys("00");

        CalendarObjects.ends.click();
        CalendarObjects.hour.sendKeys("4");
        CalendarObjects.minute.sendKeys("30");
    }

    @And("^I save the meeting$")
    public void i_save_the_meeting() {

        CalendarObjects.addnewevent.click();
    }

    @Then("^I Check if the meeting is created as expected$")
    public void i_check_if_the_meeting_is_created_as_expected() {
        CalendarObjects.eventconfirmation.isDisplayed();
        Reporter.log("New Event is Successfully Added.");

    }
}
