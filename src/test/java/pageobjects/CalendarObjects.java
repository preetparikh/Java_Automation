package pageobjects;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import step_definitions.Hooks;

public class CalendarObjects extends Hooks {


    @FindBy(how=How.NAME, using="Continue")
    public static IOSElement continue_button;

    @FindBy(how=How.NAME, using="Allow While Using App")
    public static IOSElement allow_while_using;

    @FindBy(how=How.NAME, using="Add")
    public static IOSElement add;

    @FindBy(how=How.NAME, using="Introduction, from 4:00 PM to 4:30 PM")
    public static IOSElement eventconfirmation;

    @FindBy(how=How.NAME, using="Add")
    public static IOSElement addnewevent;

    @FindBy(how=How.NAME, using="Every Day")
    public static IOSElement everyday;

    @FindBy(how=How.NAME, using="Never")
    public static IOSElement never_link;

    @FindBy(how=How.NAME, using="Starts")
    public static IOSElement starts;

    @FindBy(how=How.NAME, using="Ends")
    public static IOSElement ends;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Calendar\"]//descendant::XCUIElementTypeTextField[@value=\"Title\"]")
    public static IOSElement title;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Calendar\"]//descendant::XCUIElementTypePickerWheel[2]")
    public static IOSElement hour;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Calendar\"]//descendant::XCUIElementTypePickerWheel[3]")
    public static IOSElement minute;

}