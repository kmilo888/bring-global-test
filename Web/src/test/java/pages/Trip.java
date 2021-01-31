package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Trip {
    WebDriver driver;

    public Trip(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

}
