package stepDefinitions.SiteSelector;
import ReusableMethods.ExcelDataReader;
import base.PageObjectManager;
import base.TestData;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.LoginObjectPage;
import locators.SiteSelectorObjects;
import org.openqa.selenium.WebDriver;
import utils.DriverSetup;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SiteSelectorSteps {
    private WebDriver driver;
    private PageObjectManager reusableMethod;
    private SiteSelectorObjects siteSelectorLocator = new SiteSelectorObjects();
    private LoginObjectPage loginPage = new LoginObjectPage();
    private TestData data = new TestData();


    public SiteSelectorSteps(DriverSetup driverSetup){
        this.driver = driverSetup.driver;
        this.reusableMethod = new PageObjectManager(driver);
    }

    @When("Navigate to the site selector")
    public void navigateToTheSiteSelector() throws InterruptedException {
//        reusableMethod.performMouseHover(driver, siteSelectorLocator.siteSelectorButton);
        reusableMethod.clickElement(siteSelectorLocator.siteSelectorButton);
        Thread.sleep(4000);
    }

    @When("Log in using domain credentials")
    public void logInUsingDomainCredentials() throws IOException, InterruptedException {
        String filePath = "TestData/Credentials.xlsx";
        String sheetName = "Sheet1";
        List<String[]> excelData = ExcelDataReader.readDataFromExcel(filePath, sheetName);
        if (excelData.size() > 1) {
            String[] row = excelData.get(1);

            if (row.length >= 2) {
                String username = row[0]; // Column 1 (index 0)
                String password = row[1]; // Column 2 (index 1)

                // Use the extracted data
                reusableMethod.sendKeysToElement(loginPage.emailTextField, username);
                Thread.sleep(2000);
                reusableMethod.sendKeysToElement(loginPage.passwordTextField, password);
                Thread.sleep(2000);
            } else {
                System.out.println("Invalid data format in row 2. Not enough columns.");
            }
        } else {
            System.out.println("Insufficient rows in the Excel file.");
        }


    }

    @Then("Verify that all domain based sites are available")
    public void verifyThatAllDomainBasedSitesAreAvailable() {
        reusableMethod.clickElement(siteSelectorLocator.siteDropdown);
        List<String> expectedValues = Arrays.asList(data.getDomainDropdownValues());
        boolean result = reusableMethod.verifyInputDropdownValues(driver, siteSelectorLocator.siteDropdown, siteSelectorLocator.domainDropdownValues, expectedValues);

        if (result) {
            System.out.println("Dropdown values do not match the expected values.");
        } else {
            System.out.println("Dropdown values match the expected values.");
        }

    }

    @When("Log in using company credentials")
    public void logInUsingCompanyCredentials() throws InterruptedException, IOException {
        String filePath = "TestData/Credentials.xlsx";
        String sheetName = "Sheet1";
        List<String[]> excelData = ExcelDataReader.readDataFromExcel(filePath, sheetName);
        if (excelData.size() > 1) {
            String[] row = excelData.get(3);

            if (row.length >= 2) {
                String username = row[0]; // Column 1 (index 0)
                String password = row[1]; // Column 2 (index 1)

                // Use the extracted data
                reusableMethod.sendKeysToElement(loginPage.emailTextField, username);
                Thread.sleep(2000);
                reusableMethod.sendKeysToElement(loginPage.passwordTextField, password);
                Thread.sleep(2000);
            } else {
                System.out.println("Invalid data format in row 2. Not enough columns.");
            }
        } else {
            System.out.println("Insufficient rows in the Excel file.");
        }



    }

    @Then("Verify that all company based sites are available")
    public void verifyThatAllCompanyBasedSitesAreAvailable() {
        reusableMethod.clickElement(siteSelectorLocator.siteDropdown);
        List<String> expectedValues = Arrays.asList(data.getCompanyDropdownValues());
        boolean result = reusableMethod.verifyInputDropdownValues(driver, siteSelectorLocator.siteDropdown, siteSelectorLocator.domainDropdownValues, expectedValues);

        if (result) {
            System.out.println("Dropdown values do not match the expected values.");
        } else {
            System.out.println("Dropdown values match the expected values.");
        }

    }

    @When("Log in using super admin credentials")
    public void logInUsingSuperAdminCredentials() throws InterruptedException, IOException {
        String filePath = "TestData/Credentials.xlsx";
        String sheetName = "Sheet1";
        List<String[]> excelData = ExcelDataReader.readDataFromExcel(filePath, sheetName);
        if (excelData.size() > 1) {
            String[] row = excelData.get(2);

            if (row.length >= 2) {
                String username = row[0]; // Column 1 (index 0)
                String password = row[1]; // Column 2 (index 1)

                // Use the extracted data
                reusableMethod.sendKeysToElement(loginPage.emailTextField, username);
                Thread.sleep(2000);
                reusableMethod.sendKeysToElement(loginPage.passwordTextField, password);
                Thread.sleep(2000);
            } else {
                System.out.println("Invalid data format in row 2. Not enough columns.");
            }
        } else {
            System.out.println("Insufficient rows in the Excel file.");
        }



    }

    @Then("Verify that all super admin based sites are available")
    public void verifyThatAllSuperAdminBasedSitesAreAvailable() throws InterruptedException {
        reusableMethod.clickElement(siteSelectorLocator.siteDropdown);


        reusableMethod.scrollAndCaptureDropdownValues(driver, siteSelectorLocator.siteDropdown, siteSelectorLocator.domainDropdownValues);
        Thread.sleep(1000);




        List<String> expectedValues = Arrays.asList(data.getSuperAdminDropdownValues());
        boolean result = reusableMethod.verifyInputDropdownValues(driver, siteSelectorLocator.siteDropdown, siteSelectorLocator.domainDropdownValues, expectedValues);

        if (result) {
            System.out.println("Dropdown values do not match the expected values.");
        } else {
            System.out.println("Dropdown values match the expected values.");
        }
    }
}
