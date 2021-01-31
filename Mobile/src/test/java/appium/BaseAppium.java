package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebElement;

public class BaseAppium {

    public static AppiumDriverLocalService service;
    public static AndroidDriver<WebElement> driver;

    public void init () throws Exception {

    }
}
