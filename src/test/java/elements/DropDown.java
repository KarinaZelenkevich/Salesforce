package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    String dropdownLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]/div[@class='uiMenu']";
    String optionLocator = "//div[contains(@class, 'visible')]//a[@title='%s']";
    String parentAccountLocator = "//input[@placeholder='Search Accounts...']";
    String parentAccountOptionLocator = "(//div[@title='TestAccountName'])[1]";
    String salutationLocator = "//input[@name='salutation']";
    String salutationOptionLocator = "";
    String reportsToLocator = "//input[@placeholder='Search Contacts...']";
    String reportsToOptionLocator = "//div[@title='Test]][1]";


    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        System.out.printf("Select option '%s' into dropdown with label '%s'", option, this.label);
        driver.findElement(By.xpath(String.format(dropdownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();

    }

    public void selectParentAccount(String parentAccountOption, String salutationOption){
        driver.findElement(By.xpath(parentAccountLocator)).click();
        driver.findElement(By.xpath(parentAccountOptionLocator)).click();
        driver.findElement(By.xpath(salutationLocator)).click();
        driver.findElement(By.xpath(reportsToLocator)).click();
        driver.findElement(By.xpath(reportsToOptionLocator)).click();
    }


}