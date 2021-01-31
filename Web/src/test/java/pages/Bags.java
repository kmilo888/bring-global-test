package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Bags {
    WebDriver driver;

    public Bags(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

}
