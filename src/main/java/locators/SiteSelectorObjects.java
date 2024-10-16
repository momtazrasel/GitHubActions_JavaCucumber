package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SiteSelectorObjects {
    public static WebDriver driver;

    // Sit Selector Page
    public By siteSelectorButton = By.xpath("(//a[@href='/site'])[1]");
    public By siteDropdown = By.xpath("(//input[@class  = 'ant-select-selection-search-input'])[1]");
    public By domainDropdownValues = By.xpath("//div[@class = 'ant-select-item-option-content']");
}
