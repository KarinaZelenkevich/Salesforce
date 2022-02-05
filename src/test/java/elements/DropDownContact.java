package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class DropDownContact {
    String dropDownLocator = "//div[contains(@class, 'modal-body')]//label[text()='%s']/ancestor::lightning-combobox/div/lightning-base-combobox/div/div/input";
    String optionLocator = "//span[text()='%s']";
    String dropDownAccountNameLocator = "//input[@placeholder='Search Accounts...']";


    WebDriver driver;
    String label;

    public DropDownContact(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        System.out.printf("Select item '%s' from dropdown list '%s'\n", option, this.label);
        driver.findElement(By.xpath(String.format(dropDownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }

    public void selectAccountName(String option) {
        System.out.printf("Select item '%s' from dropdown list '%s'", option, this.label);
        driver.findElement(By.xpath(String.format(dropDownAccountNameLocator, this.label))).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}
