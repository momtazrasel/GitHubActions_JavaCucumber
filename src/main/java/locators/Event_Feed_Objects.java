package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Event_Feed_Objects {
    public static WebDriver driver;

    //Create Event
    public By feedIcon = By.xpath("(//a[@href='/events-feed'])[1]");
    public By createEventButton = By.xpath("(//button[@class='ant-btn css-163tgoe ant-btn-round ant-btn-default relative hidden h-12 w-full flex-none bg-secondary font-raleway text-base font-bold uppercase text-[#1C4179] transition-all hover:!border-secondary-light hover:!bg-secondary-light hover:!text-[#1C4179] md:block'])[1]");
    public By siteDropdown = By.xpath("(//input[@id='site'])[1]");
    public By siteOption = By.xpath("(//div[@class='ant-select-item-option-content'][normalize-space()='00 Calibration Gateway'])[1]");
    public By categoryDropdown = By.xpath("(//span[@class='ant-select-selection-search'])[2]");
    public By categoryOption = By.xpath("(//div[contains(text(),'Admin')])[1]");
    public By date = By.xpath("(//div[@class='ant-picker ant-picker-outlined css-163tgoe mb-2 h-12 w-full'])[1]");
    public By startDate = By.xpath("(//input[@id='startDate'])[1]");
    public By dateNow = By.xpath("(//a[normalize-space()='Now'])[1]");
    public By okButton = By.xpath("(//button[@class = 'ant-btn css-163tgoe ant-btn-primary ant-btn-sm'])[2]");
    public By title = By.xpath("(//input[@id='title'])[1]");
    public By ongoing = By.xpath("(//input[@id='endDate'])[1]");
    public By ongoingNow = By.xpath("(//a[normalize-space()='Now'])[1]");
    public By ongoingCheckbox = By.xpath("(//span[normalize-space()='Ongoing'])[1]");
    public By description = By.xpath("(//textarea[@id='description'])[1]");
    public By subCategory = By.xpath("(//span[@class='ant-select-selection-search'])[3]");
    public By subCategoryOption = By.xpath("(//div[contains(text(),'Model Update')])[1]");
    public By saveButton = By.xpath("(//button[normalize-space()='Save'])[1]");
    public By successfullyPopUpText = By.xpath("(//span[normalize-space()='Event created successfully'])[1]");
    public By commentTextField = By.xpath("(//input[@placeholder='Write a comment'])[1]");
    public By enterButton = By.xpath("(//*[name()='svg'][@class='text-primary'])[1]");
    public By shareButton = By.xpath("(//div[@class='text-xs font-medium 2xl:text-sm'][normalize-space()='Share'])[1]");
    public By shareOption = By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[1]");
    public By eventSiteName = By.xpath("(//div[@class='cursor-pointer font-bold text-primary transition-all hover:underline focus:no-underline dark:text-[#9EADD9]'][normalize-space()='00 Calibration Gateway'])[1]");
    public By eventSiteTitle = By.xpath("(//div[@class='mt-1'][normalize-space()='Test'])[1]");
    public By eventSiteCategory = By.xpath("(//span[contains(text(),'Admin')])[1]");
    public By eventSubcategory = By.xpath("((//div[@class='mt-1 flex w-full justify-between gap-2'])[1]//span)[2]");
    public By eventDateAndTime = By.xpath("(//div[@class='flex items-center gap-1 text-sm text-text-secondary dark:text-[#9EADD9]'])[1]");
    public By eventDescription = By.xpath("(//span[contains(text(),'This Event creation for testing purpose')])[1]");
    public By eventShortComment = By.xpath("(//div[@class='mt-2'][normalize-space()='Event created successfully'])[1]");
    public By eventLongComment = By.xpath("(//div[@class='mt-2'][contains(text(),'The notification confirming successful event creation has been displayed as anticipated.')])[1]");
    public By eventPendingCount = By.xpath("((//div[@class='mr-4 flex justify-between py-4 font-medium dark:text-[#9EADD9]'])[1]//span)[1]");
    public By filterTitle = By.xpath("(//input[@placeholder='Search by title, category, and subcategory'])[1]");
    public By filterSite = By.xpath("(//div[@class='ant-select-selector'])[1]");
    public By filterSiteOption = By.xpath("(//div[@class='ant-select-item-option-content'][normalize-space()='00 Calibration Gateway'])[1]");
    public By filterDateField = By.xpath("(//input[@id='rs-:r1m:'])[1]");
    public By filterDateToday = By.xpath("(//button[normalize-space()='Today'])[1]");
    public By resetFilterButton = By.xpath("(//span[contains(text(),'Reset filter')])[1]");
    public By defaultTaskButton = By.xpath("(//div[@class='flex w-full cursor-pointer justify-start gap-1 rounded-full border-0 py-2 text-start transition-all hover:bg-[#E6E6E6] dark:text-[#85A6E8] dark:hover:bg-[#0e1b35] md:items-center md:justify-center md:border md:py-3 dark:border-[#85A6E8]'])[1]");
    public By redTaskButton = By.xpath("(//div[@class='flex w-full cursor-pointer justify-start gap-1 rounded-full border-0 py-2 text-start transition-all hover:bg-[#E6E6E6] dark:text-[#85A6E8] dark:hover:bg-[#0e1b35] md:items-center md:justify-center md:border md:py-3 text-red-600 dark:border-red-600 dark:text-red-600'])[1]");
    public By portfolio = By.xpath("(//a[@href='/portfolio'])[1]");
    public By tasksColumn = By.xpath("(//th[normalize-space()='Tasks'])[1]");
    public By totalEvents = By.xpath("(//span[@class='absolute -right-2 -top-2 flex items-center justify-center rounded-full bg-primary p-0.5 text-xs text-white dark:bg-[#85A6E8] dark:text-[#172A50]'])[1]");
    public By feedsSearch = By.xpath("(//input[@placeholder='Search by title, category, and subcategory'])[1]");
    public By taskCheckbox = By.xpath("(//span[normalize-space()='Open Tasks'])[1]");
    public By activeTask = By.xpath("(//div[@class='flex w-full cursor-pointer justify-start gap-1 rounded-full border-0 py-2 text-start transition-all hover:bg-[#E6E6E6] dark:text-[#85A6E8] dark:hover:bg-[#0e1b35] md:items-center md:justify-center md:border md:py-3 text-red-600 dark:border-red-600 dark:text-red-600'])[1]");
    public By firstSite = By.xpath("(//div[@class='cursor-pointer font-bold text-primary transition-all hover:underline focus:no-underline dark:text-[#9EADD9]'])[1]");
    public By editButton = By.xpath("(//button[normalize-space()='Edit'])[1]");
    public By siteTitle = By.xpath("(//input[@id='title'])[1]");
    public By siteDescription = By.xpath("(//textarea[@id='description'])[1]");

}
