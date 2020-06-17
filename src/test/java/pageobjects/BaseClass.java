package pageobjects;

import io.appium.java_client.AppiumDriver;

public abstract class BaseClass {
	public static AppiumDriver driver;
	public static boolean bResult;

	public BaseClass(AppiumDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}

}
