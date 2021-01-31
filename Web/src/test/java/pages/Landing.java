package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Landing {

    private static final String url = "https://www.ryanair.com/gb/en";

    @FindBy(className = "cookie-popup-with-overlay__button")
    private WebElement yesIAgreeOverlayButton;

    @FindBy(id = "input-button__departure")
    private WebElement departurePicker;

    @FindBy(id = "input-button__destination")
    private WebElement destinationPicker;

    @FindBy(css = ".b2.airport-item span")
    private WebElement airportPickerAutoComplete;

    @FindBys(@FindBy(css = ".m-toggle__month"))
    private List<WebElement> monthsPicker;

    @FindBy(css=".m-toggle__button icon[iconid='glyphs/chevron-right']")
    private WebElement monthChevronRight;

    WebDriver driver;

    public Landing(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public static String getUrl() {
        return url;
    }

    public void clickYesIAgreeOverlayButton() {
        if(yesIAgreeOverlayButton.isDisplayed()) {
            yesIAgreeOverlayButton.click();
        }
    }

    public void setDeparturePicker(String airportName){
        clearAirportPicker(this.departurePicker);
        departurePicker.sendKeys(airportName);
        airportPickerAutoComplete.click();
    }

    public void setDestinationPicker(String airportName){
        clearAirportPicker(this.destinationPicker);
        destinationPicker.sendKeys(airportName);
        airportPickerAutoComplete.click();
    }

    public void setDepartPicker(Date date) {
        clickMonthToPick(date);
    }

    public void setReturnPicker(Date date) {
        clickMonthToPick(date);
    }

    private void clickMonthToPick(Date date) {
        /*
        String monthStr = (new SimpleDateFormat("MMM")).format(date);
        for ( WebElement monthPicker : monthsPicker ) {
            if ( monthPicker.getText().equals(monthStr) ) {
                while( !monthPicker.isDisplayed() ) {
                    monthChevronRight.click();
                }
                monthPicker.click();
                return;
            }
        }*/
    }


    private void clearAirportPicker(WebElement airportPicker){
        airportPicker.sendKeys(Keys.CONTROL + "a");
        airportPicker.sendKeys(Keys.DELETE);
    }

}
