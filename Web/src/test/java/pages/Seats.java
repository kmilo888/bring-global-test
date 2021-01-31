package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Seats {
    WebDriver driver;

    public Seats(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
}
