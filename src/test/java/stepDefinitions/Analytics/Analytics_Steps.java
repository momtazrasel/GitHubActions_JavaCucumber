package stepDefinitions.Analytics;

import base.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Analytics_Objects;
import org.openqa.selenium.WebDriver;
import utils.DriverSetup;

public class Analytics_Steps {
    private WebDriver driver;
    private PageObjectManager reusableMethod;
    private Analytics_Objects analyticsLocator = new Analytics_Objects();

    public Analytics_Steps(DriverSetup driverSetup){
        this.driver = driverSetup.driver;
        this.reusableMethod = new PageObjectManager(driver);
    }

    @When("Navigate to the Analytics")
    public void navigateToTheAnalytics() throws InterruptedException {
        reusableMethod.performMouseHover(driver, analyticsLocator.analyticsIcon);
        reusableMethod.clickElement(analyticsLocator.analyticsIcon);
        Thread.sleep(2000);

    }

    @And("Click on the Analytics dropdown")
    public void clickOnTheAnalyticsDropdown() throws InterruptedException {
//        reusableMethod.performMouseHover(driver, analyticsLocator.analyticsDropdown);
        reusableMethod.clickElement(analyticsLocator.analyticsDropdown);
        Thread.sleep(2000);
    }

    @And("Select Power option from dropdown")
    public void selectPowerOptionFromDropdown() throws InterruptedException {
        reusableMethod.clickElement(analyticsLocator.powerOption);
        Thread.sleep(2000);

    }

    @Then("Verify that the Power analytics data is displayed")
    public void verifyThatThePowerAnalyticsDataIsDisplayed() throws InterruptedException {
//        Thread.sleep(2000);
////        reusableMethod.verifyGraphAndTitle(analyticsLocator.meterInverterGraph, analyticsLocator.meterInverterTitle, "Total Meter and Inverter Power");
//        Actions act = new Actions(driver);
//        for (WebElement e : analyticsLocator.meterInverterGraph){
//            act.moveToElement(e).perform();
//        }
        reusableMethod.verifyGraphAndTitle(analyticsLocator.meterInverterGraph, analyticsLocator.meterInverterTitle, "Total Meter and Inverter Power");


    }

    @And("Select site from the dropdown")
    public void selectSiteFromTheDropdown() throws InterruptedException {
        reusableMethod.clickElement(analyticsLocator.siteTextField);
        Thread.sleep(1000);
//        reusableMethod.sendKeysToElement(analyticsLocator.siteTextField, "115 / G. Fisher");
        reusableMethod.sendKeysToElement(analyticsLocator.siteTextField, "20042 - Dos Palos High School");
        Thread.sleep(1000);
        reusableMethod.clickElement(analyticsLocator.selectSite);
        Thread.sleep(1000);
    }

    @Then("Verify that the filter shows default selections or placeholders")
    public void verifyThatTheFilterShowsDefaultSelectionsOrPlaceholders() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(analyticsLocator.analyticsDropdown);
        reusableMethod.assertElementIsDisplayed(analyticsLocator.siteTextField);
        reusableMethod.assertElementIsDisplayed(analyticsLocator.analyticsDate);
        reusableMethod.assertElementIsDisplayed(analyticsLocator.analyticsTime);
        reusableMethod.assertElementIsDisplayed(analyticsLocator.analyticsTimer);
        reusableMethod.assertElementIsDisplayed(analyticsLocator.analyticsSwitch);

    }

    @Then("Verify that all the filters are clickable")
    public void verifyThatAllTheFiltersAreClickable() {
//        reusableMethod.clickElement(analyticsLocator.analyticsDropdown);
        reusableMethod.verifyDropdownClickable(analyticsLocator.analyticsDropdown, analyticsLocator.allAnalytics);
        reusableMethod.verifyDropdownClickable(analyticsLocator.siteTextField, analyticsLocator.allSites);
//        reusableMethod.clickElement(analyticsLocator.siteTextField);
        reusableMethod.clickElement(analyticsLocator.analyticsDate);
        reusableMethod.clickElement(analyticsLocator.analyticsTime);
        reusableMethod.clickElement(analyticsLocator.analyticsTimer);
        reusableMethod.clickElement(analyticsLocator.analyticsSwitch);
    }
}
