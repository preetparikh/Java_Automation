package step_definitions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Hooks {

    public static AppiumDriver driver;

    //    @BeforeTest
//    @Parameters({"deviceName","udid", "platformVersion","url"})
    public void setup() throws InterruptedException, MalformedURLException
    {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("deviceName", "iPhone 11");
        cap.setCapability("bundleId", "com.apple.mobilecal");
        cap.setCapability("platformName", "iOS");
        cap.setCapability("platformVersion", "13.5");
        System.out.println("Current data" +cap);
        System.out.println("============================");

        driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);

    }

}
