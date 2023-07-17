package co.uk.rightmove.stepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class PropertySearchSteps {

    @Given("I navigate to the homepage")
    public void iNavigateToTheHomepage() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.navigate().to("https://www.rightmove.co.uk/");
    }

    @When("I enter {string} into the search field")
    public void iEnterIntoTheSearchField(String string) {

    }

    @When("I click on For Sale button")
    public void iClickOOnForSaleButton() {

    }

    @When("I select radius {string} of the location")
    public void iSelectRadiusOfTheLocation(String string) {

    }

    @When("minimum price range of {string}")
    public void minimumPriceRangeOf(String string) {

    }

    @When("maximum price range of {string}")
    public void maximumPriceRangeOf(String string) {

    }

    @When("I select {string} as the minimum number of bedrooms")
    public void iSelectAsTheMinimumNumberOfBedrooms(String string) {

    }

    @When("I select {string} as the maximum number of bedrooms")
    public void iSelectAsTheMaximumNumberOfBedrooms(String string) {

    }

    @When("I select {string} as the property type")
    public void iSelectAsThePropertyType(String string) {

    }

    @When("I select {string} as added to site option")
    public void iSelectAsAddedToSiteOption(String string) {

    }

    @When("I click on Find Property button")
    public void iClickOnFindPropertyButton() {
        ;
    }

    @When("I ensure that search result page is displayed")
    public void iensureThatSearchResultPageIsDisplayed() {

    }

    @When("I click on the second result")
    public void iClickOnTheSecondResult() {

    }

    @Then("the detail of the property is displayed")
    public void theDetailOfThePropertyIsDisplayed() {

    }
}
