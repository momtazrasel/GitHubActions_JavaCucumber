package stepDefinitions.EventFeed;

import base.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Event_Feed_Objects;
import org.openqa.selenium.WebDriver;
import utils.DriverSetup;

public class Event_Feed_Steps {

    private WebDriver driver;
    private PageObjectManager reusableMethod;
    private Event_Feed_Objects eventFeedLocator = new Event_Feed_Objects();

    public Event_Feed_Steps(DriverSetup driverSetup){
        this.driver = driverSetup.driver;
        this.reusableMethod = new PageObjectManager(driver);
    }

    @When("Navigate to the Event")
    public void navigateToTheEvent() throws InterruptedException {
        reusableMethod.performMouseHover(driver, eventFeedLocator.feedIcon);
        reusableMethod.clickElement(eventFeedLocator.feedIcon);
        Thread.sleep(3000);
    }

    @And("Click on the Create Event button")
    public void clickOnTheCreateEventButton() {
        reusableMethod.clickElement(eventFeedLocator.createEventButton);


    }

    @And("Fill up all the event information")
    public void fillUpAllTheEventInformation() throws InterruptedException {
        reusableMethod.clickElement(eventFeedLocator.siteDropdown);
        reusableMethod.clickElement(eventFeedLocator.siteOption);
        reusableMethod.clickElement(eventFeedLocator.categoryDropdown);
        reusableMethod.clickElement(eventFeedLocator.categoryOption);
        reusableMethod.clickElement(eventFeedLocator.date);
//        reusableMethod.sendKeysToElement(eventFeedLocator.startDate, "2024-09-04 18:12");
        Thread.sleep(1000);
        reusableMethod.clickElement(eventFeedLocator.dateNow);

        reusableMethod.sendKeysToElement(eventFeedLocator.title, "Test");
        reusableMethod.clickElement(eventFeedLocator.subCategory);
        reusableMethod.clickElement(eventFeedLocator.subCategoryOption);
        reusableMethod.clickElement(eventFeedLocator.ongoing);
//        Thread.sleep(3000);
//        reusableMethod.javaScriptClick(eventFeedLocator.ongoingNow);
        reusableMethod.clickElement(eventFeedLocator.ongoingCheckbox);
        reusableMethod.sendKeysToElement(eventFeedLocator.description, "This Event creation for testing purpose");



    }

    @And("Click on the Save button")
    public void clickOnTheSaveButton() throws InterruptedException {
        reusableMethod.clickElement(eventFeedLocator.saveButton);
        Thread.sleep(2000);
    }

    @Then("Verify successfully text is appear")
    public void verifySuccessfullyTextIsAppear() throws InterruptedException {
        Thread.sleep(1000);
        reusableMethod.assertElementText(driver, eventFeedLocator.successfullyPopUpText, "Event created successfully");
    }

    @And("Click on the Comment Text field")
    public void clickOnTheCommentTextField() {
        reusableMethod.clickElement(eventFeedLocator.commentTextField);
    }

    @And("Enter short comment and click enter")
    public void enterShortCommentAndClickEnter() throws InterruptedException {
        reusableMethod.sendKeysToElement(eventFeedLocator.commentTextField, "Event created successfully");
        reusableMethod.clickElement(eventFeedLocator.enterButton);
        Thread.sleep(2000);
        
    }

    @And("Enter long comment and click enter")
    public void enterLongCommentAndClickEnter() {
        reusableMethod.sendKeysToElement(eventFeedLocator.commentTextField, "The notification confirming successful event creation has been displayed as anticipated.");
        reusableMethod.clickElement(eventFeedLocator.enterButton);
    }


    @And("Click on the share button")
    public void clickOnTheShareButton() throws InterruptedException {
        reusableMethod.clickElement(eventFeedLocator.shareButton);
        reusableMethod.isElementDisplayed(eventFeedLocator.shareOption);

    }

    @Then("Verify that the event site name")
    public void verify_that_the_event_site_name() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.eventSiteName);
        reusableMethod.assertElementColor(driver, eventFeedLocator.eventSiteName, "#3a60ac");

    }
    @Then("Verify that the event title name")
    public void verify_that_the_event_title_name() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.eventSiteTitle);

    }
    @Then("Verify that the event category and sub category")
    public void verify_that_the_event_category_and_sub_category() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.eventSiteCategory);
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.eventSubcategory);

    }
    @Then("Verify that the event time")
    public void verify_that_the_event_time() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.eventDateAndTime);

    }
    @Then("Verify that the event descriptions")
    public void verify_that_the_event_descriptions() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.eventDescription);

    }
    @And("Verify that the event comments")
    public void verifyThatTheEventComments() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.eventShortComment);
        reusableMethod.assertElementText(driver, eventFeedLocator.eventShortComment, "Event created successfully");
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.eventLongComment);
        reusableMethod.assertElementText(driver, eventFeedLocator.eventLongComment, "The notification confirming successful event creation has been displayed as anticipated.");
    }


    @Then("Verify that the pending event count indicator")
    public void verify_that_the_pending_event_count_indicator() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.eventPendingCount);
//        reusableMethod.assertElementText(driver, eventFeedLocator.eventPendingCount, "Pending events (115)");

    }
    @Then("Verify that the activate filter color")
    public void verify_that_the_activate_filter_color() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.eventSiteTitle);
    }

    @When("Enter filter title")
    public void enter_filter_title() {
        reusableMethod.sendKeysToElement(eventFeedLocator.filterTitle, "Test");

    }
    @And("Select Filter site from dropdown")
    public void select_filter_site_from_dropdown() {
        reusableMethod.clickElement(eventFeedLocator.filterSite);
        reusableMethod.clickElement(eventFeedLocator.filterSiteOption);

    }
    @And("Select event start and end date")
    public void select_event_start_and_end_date() {
        reusableMethod.clickElement(eventFeedLocator.filterTitle);
        reusableMethod.clickElement(eventFeedLocator.filterDateField);
        reusableMethod.clickElement(eventFeedLocator.filterDateToday);


    }
    @And("Reset the filter widget after setting filters")
    public void reset_the_filter_widget_after_setting_filters() {
        reusableMethod.clickElement(eventFeedLocator.resetFilterButton);

    }


    @And("Click on the Task button and verify that icon color is red")
    public void clickOnTheTaskButtonAndVerifyThatIconColorIsRed() throws InterruptedException {
//        try {
            Thread.sleep(2000);

//            reusableMethod.clickElement(eventFeedLocator.taskButton);
            reusableMethod.assertElementColor(driver, eventFeedLocator.defaultTaskButton, "#5f667a");
            Thread.sleep(2000);
            reusableMethod.clickElement(eventFeedLocator.defaultTaskButton);
//        } catch (Exception e){
//            reusableMethod.clickElement(eventFeedLocator.taskButton);
//            reusableMethod.assertElementColor(driver, eventFeedLocator.taskButton, "#696475");
//        }
//        Thread.sleep(1000);
//        reusableMethod.clickElement(eventFeedLocator.taskButton);
//        reusableMethod.assertElementColor(driver, eventFeedLocator.taskButton, "#d84c40");
//        Thread.sleep(2000);
    }

    @And("Click on the Task button and verify that icon return to default state")
    public void clickOnTheTaskButtonAndVerifyThatIconReturnToDefaultState()  {
//        reusableMethod.clickElement(eventFeedLocator.taskButton);
//        reusableMethod.assertElementColor(driver, eventFeedLocator.taskButton, "#696475");

//        try {
//            Thread.sleep(1000);
////            reusableMethod.clickElement(eventFeedLocator.taskButton);
//            reusableMethod.assertElementColor(driver, eventFeedLocator.taskButton, "#5f667a");
//            Thread.sleep(2000);
//            reusableMethod.clickElement(eventFeedLocator.taskButton);
//        } catch (Exception e){
//            reusableMethod.clickElement(eventFeedLocator.taskButton);
        reusableMethod.assertElementColor(driver, eventFeedLocator.redTaskButton, "#d94c40");
        reusableMethod.clickElement(eventFeedLocator.redTaskButton);
//        }
    }

    @And("Click on the Portfolio tab")
    public void clickOnThePortfolioTab() {
        reusableMethod.clickElement(eventFeedLocator.portfolio);
    }

    @And("Verify that the Tasks column is available")
    public void verifyThatTheTasksColumnIsAvailable() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.tasksColumn);
        reusableMethod.assertElementText(driver, eventFeedLocator.tasksColumn, "Tasks");

    }

    @Then("Verify that total number of events in portfolio")
    public void verifyThatTotalNumberOfEventsInPortfolio() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.totalEvents);
//        reusableMethod.assertElementText(driver, eventFeedLocator.totalEvents, "115");
    }

    @And("Click on the Task checkbox and perform a search")
    public void clickOnTheTaskCheckboxAndPerformASearch() throws InterruptedException {
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.feedsSearch);
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.taskCheckbox);
        reusableMethod.clickElement(eventFeedLocator.taskCheckbox);
        Thread.sleep(2000);
    }

    @Then("Verify that the search results are filtered")
    public void verifyThatTheSearchResultsAreFiltered() throws InterruptedException {
        Thread.sleep(1000);
        reusableMethod.assertElementIsDisplayed(eventFeedLocator.activeTask);
        Thread.sleep(1000);

    }

    @Then("Verify that the filter should reset after switching tabs")
    public void verifyThatTheFilterShouldResetAfterSwitchingTabs() {
        reusableMethod.verifyFieldIsEmpty(eventFeedLocator.filterTitle);
        reusableMethod.verifyFieldIsEmpty(eventFeedLocator.filterSite);
    }

    @And("Select a event from the list")
    public void selectAEventFromTheList() {
        reusableMethod.clickElement(eventFeedLocator.firstSite);
    }

    @And("Click on the Edit Button")
    public void clickOnTheEditButton() {
        reusableMethod.clickElement(eventFeedLocator.editButton);
    }

    @And("Change the site title and description")
    public void changeTheSiteTitleAndDescription() throws InterruptedException {
        reusableMethod.clickElement(eventFeedLocator.siteTitle);
        Thread.sleep(2000);
        reusableMethod.clearText(eventFeedLocator.siteTitle);
        Thread.sleep(1000);
        reusableMethod.sendKeysToElement(eventFeedLocator.siteTitle, "Testing");
        reusableMethod.clickElement(eventFeedLocator.siteDescription);
        Thread.sleep(1000);
        reusableMethod.clearText(eventFeedLocator.siteDescription);
        Thread.sleep(1000);
        reusableMethod.sendKeysToElement(eventFeedLocator.siteDescription, "Updated Description");

    }


}
