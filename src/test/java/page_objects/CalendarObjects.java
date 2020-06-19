package page_objects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(how=How.XPATH, using="//XCUIElementTypeButton[@name='Add']")
    WebElement addnewevent;

    @FindBy(how=How.NAME, using="Every Day")
    WebElement everyday;

    @FindBy(how=How.NAME, using="Never")
    WebElement never_link;

    @FindBy(how=How.NAME, using="Starts")
    WebElement starts;

    @FindBy(how=How.NAME, using="Ends")
    WebElement ends;

    @FindBy(how=How.XPATH, using="//XCUIElementTypeApplication[@name='Calendar']//descendant::XCUIElementTypeTextField[@value='Title']")
    WebElement title;

    @FindBy(how=How.XPATH, using="//XCUIElementTypeApplication[@name='Calendar']//descendant::XCUIElementTypePickerWheel[2]")
    WebElement hour;

    @FindBy(how=How.XPATH, using="//XCUIElementTypeApplication[@name='Calendar']//descendant::XCUIElementTypePickerWheel[3]")
    WebElement minute;

    @FindBy(how=How.XPATH, using="//XCUIElementTypeApplication[@name='Calendar']//descendant::XCUIElementTypePickerWheel[4]")
    WebElement ampm;

    public void clickContinue(){
        continue_button.click();
    }

    public void setTitle(String titleName){
        title.sendKeys(titleName);
    }

    public void clickAllow(){
        allow_while_using.click();
    }

    public void clickAdd(){
        add.click();
    }

    public void clickAddevent(){
        addnewevent.click();
    }

    public void clickEveryday(){
        everyday.click();
    }

    public void clickNever(){
        never_link.click();
    }

    public void clickStarts(){
        starts.click();
    }

    public void clickEnds(){
        ends.click();
    }

    public void setHour(String hourvalue){
        hour.sendKeys(hourvalue);
    }

    public void setMinute(String minutevalue){
        minute.sendKeys(minutevalue);
    }

    public void setAmPm(String ampmselection){
        ampm.sendKeys(ampmselection);
    }

    public boolean continueVisible(){
        return continue_button.isDisplayed();
    }

    public boolean allowVisible(){
        return allow_while_using.isDisplayed();
    }

    public boolean confirmationVisible(){
        return eventconfirmation.isDisplayed();
    }
}