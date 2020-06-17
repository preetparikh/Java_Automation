package pageobjects;
import helpers.Log;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Calendar extends BaseClass{

    public Calendar(AppiumDriver driver){
        super(driver);
    }


    @FindBy(how=How.NAME, using="Continue")
    public static WebElement continue_button;

    @FindBy(how=How.NAME, using="Allow While Using App")
    public static WebElement allow_while_using;

    @FindBy(how=How.NAME, using="Add")
    public static WebElement add;

    public static class AddEventPage
    {

        @FindBy(how=How.NAME, using="Every Day")
        public static WebElement everyday;

        @FindBy(how=How.NAME, using="Never")
        public static WebElement never_link;

        @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Calendar\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField")
        public static WebElement title;


        public static class DressesPage
        {

            @FindBy(how=How.XPATH, using="//*a[@title='Summer Dresses']")
            public static WebElement summer_dresses;

        }

    }

}