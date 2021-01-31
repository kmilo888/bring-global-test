package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Extras {
    WebDriver driver;

    public Extras(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

}
