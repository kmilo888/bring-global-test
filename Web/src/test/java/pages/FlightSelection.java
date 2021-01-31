package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FlightSelection {

    WebDriver driver;

    public FlightSelection(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
}
