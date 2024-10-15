package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Analytics_Objects {
    public static WebDriver driver;

    // Page
    public By analyticsIcon = By.xpath("(//a[@href='/analytics'])[1]");
    public By analyticsDropdown = By.xpath("(//span[@title='Power Analysis'][normalize-space()='Power Analysis'])[1]");
    public By powerOption = By.xpath("(//span[@title='Power'])[1]");
    public By siteTextField = By.xpath("//input[@id = 'rc_select_1']");
//    public By selectSite = By.xpath("//div[contains(text(), '115 / G. Fisher')]");
    public By selectSite = By.xpath("(//div[contains(text(),'20042 - Dos Palos High School')])[1]");
    public By meterInverterTitle = By.xpath("(//*[name()='text'][normalize-space()='Total Meter and Inverter Power'])[1]");
//    public List<WebElement> meterInverterGraph = driver.findElements(By.xpath("(//*[local-name() = 'svg' and @class = 'highcharts-root'])[1]//*[name() = 'rect']"));

    public By meterInverterGraph = By.xpath("(//*[local-name() = 'svg' and @class = 'highcharts-root'])[1]//*[name() = 'rect']");
    public By analyticsDate = By.xpath("(//input[@id='rs-:rd:'])[1]");
    public By analyticsTime = By.xpath("(//div[@class='ant-select-selector'])[3]");
    public By analyticsTimer = By.xpath("(//span[@title='Off'][normalize-space()='Off'])[1]");
    public By analyticsSwitch = By.xpath("(//span[@class='ant-switch-inner'])[2]");
    public By allAnalytics = By.xpath("//span[@class = 'ant-select-tree-node-content-wrapper ant-select-tree-node-content-wrapper-normal']");
    public By allSites = By.xpath("//div[@class = 'ant-select-item-option-content']");
}
