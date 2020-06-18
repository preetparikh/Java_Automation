package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import step_definitions.Hooks;

public class CalendarObjects {

    private AppiumDriver driver;

    public CalendarObjects(AppiumDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(how=How.NAME, using="Continue")
    WebElement continue_button;

    @FindBy(how=How.NAME, using="Allow While Using App")
    WebElement allow_while_using;

    @FindBy(how=How.NAME, using="Add")
    WebElement add;

    @FindBy(how=How.NAME, using="Introduction, from 4:00 PM to 4:30 PM")
    WebElement eventconfirmation;

    @FindBy(how=How.NAME, using="Add")
    WebElement addnewevent;

    @FindBy(how=How.NAME, using="Every Day")
    WebElement everyday;

    @FindBy(how=How.NAME, using="Never")
    WebElement never_link;

    @FindBy(how=How.NAME, using="Starts")
    WebElement starts;

    @FindBy(how=How.NAME, using="Ends")
    WebElement ends;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Calendar\"]//descendant::XCUIElementTypeTextField[@value=\"Title\"]")
    WebElement title;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Calendar\"]//descendant::XCUIElementTypePickerWheel[2]")
    WebElement hour;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Calendar\"]//descendant::XCUIElementTypePickerWheel[3]")
    WebElement minute;

    public void clickcontinue(){
        continue_button.click();
    }

    public void SetTitle(String titleName){
        title.sendKeys(titleName);
    }

    public void clickallow(){
        allow_while_using.click();
    }

    public void clickadd(){
        add.click();
    }

    public void clickaddevent(){
        addnewevent.click();
    }

    public void clickeveryday(){
        everyday.click();
    }

    public void clicknever(){
        never_link.click();
    }

    public void clickstarts(){
        starts.click();
    }

    public void clickends(){
        ends.click();
    }

    public void SetHour(String hourvalue){
        hour.sendKeys(hourvalue);
    }

    public void SetMinute(String minutevalue){
        minute.sendKeys(minutevalue);
    }

    public boolean continuevisible(){
        return continue_button.isDisplayed();
    }

    public boolean allowvisible(){
        return allow_while_using.isDisplayed();
    }

    public boolean confirmationvisible(){
        return eventconfirmation.isDisplayed();
    }
}