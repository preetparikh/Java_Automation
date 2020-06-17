package modules;

import io.appium.java_client.AppiumDriver;
import org.testng.Reporter;
import pageobjects.Calendar;
import helpers.Log;

import java.util.HashMap;

public class AddEventAction {

    public static void Execute(AppiumDriver driver, HashMap<String,String> map) throws Exception{


        Calendar.continue_button.click();
        Log.info("Click continue on first launch" );

        Calendar.allow_while_using.click();
        Log.info("Click allow on first launch" );

        Calendar.add.click();
        Log.info("Click add on calendar" );

        Calendar.AddEventPage.title.sendKeys(map.get("title"));
        Log.info(" is entered in Title text box" );

        Calendar.AddEventPage.never_link.click();
        Calendar.AddEventPage.everyday.click();
        Log.info("Event to repeat everyday" );

        Calendar.AddEventPage.starts.click();
        Calendar.AddEventPage.hour.sendKeys(map.get("starthour"));
        Calendar.AddEventPage.minute.sendKeys(map.get("startminute"));

        Calendar.AddEventPage.ends.click();
        Calendar.AddEventPage.hour.sendKeys(map.get("endhour"));
        Calendar.AddEventPage.minute.sendKeys(map.get("endminute"));

        Calendar.AddEventPage.addnewevent.click();

        Calendar.eventconfirmation.isDisplayed();

        Reporter.log("New Event is Successfully Added.");

    }
}
