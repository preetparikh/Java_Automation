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

    public static AppiumDriver<MobileElement> driver;
    @BeforeTest
    @Parameters({"deviceName","udid", "platformVersion","url"})
    public void setup(String deviceName, String udid,String platformVersion,String url) throws InterruptedException, MalformedURLException
    {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("deviceName", deviceName);
        cap.setCapability("udid", udid);
        cap.setCapability("bundleId", "com.apple.mobilecal");
        cap.setCapability("platformName", "iOS");
        cap.setCapability("platformVersion", platformVersion);
        driver=new AppiumDriver<MobileElement>(new URL(url), cap);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);

    }

}
