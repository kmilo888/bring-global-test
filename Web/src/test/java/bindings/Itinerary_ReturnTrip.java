package bindings;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Landing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Itinerary_ReturnTrip {

    static final String browserDriverName = "webdriver.chrome.driver";
    static final String browserDriverPath = "drivers/chromedriver.exe";

    WebDriver driver;
    Landing landing;

    @Before
    public void setupDriver(){
        System.setProperty(browserDriverName, browserDriverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("that I am on the {string} page")
    public void that_i_am_on_the_Page(String page) {
        switch(page) {
            case "landing":
                landing = new Landing(driver);
                driver.get(landing.getUrl());
                break;
        }
    }

    @Given("I have accepted the cookies")
    public void i_have_accepted_the_cookies() {
        landing.clickYesIAgreeOverlayButton();
    }

    @When("I enter {string} as the {string} airport")
    public void i_enter_AirportName_as_the_AirportPicker_airport(String airportName, String airportPicker) {
        switch (airportPicker) {
            case "Departure":
                landing.setDeparturePicker(airportName);
                break;
            case "Destination":
                landing.setDestinationPicker(airportName);
                break;
        }
    }

    @When("I choose {string} as the {string} date")
    public void i_choose_Date_as_the_DatePicker_date(String stringDate, String datePicker) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
            switch (datePicker){
                case "Depart":
                    landing.setDepartPicker(date);
                    break;
                case "Return":
                    landing.setReturnPicker(date);
                    break;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @When("I add {string} {string} to the Passengers input")
    public void i_add_to_the_passengers_input(String string, String string2) {
    }

    @When("I click the {string} button")
    public void i_click_the_button(String string) {
    }

    @Then("I verify I am on the {string} page")
    public void i_verify_i_am_on_the_page(String string) {
    }

}
