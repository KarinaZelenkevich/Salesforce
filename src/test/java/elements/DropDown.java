package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class DropDown {
    String dropdownLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]/div[@class='uiMenu']";
    String optionLocator = "//div[contains(@class, 'visible')]//a[@title='%s']";
    String parentAccountLocator = "//input[@placeholder='Search Accounts...']";
    String parentAccountOptionLocator = "//div[@title='TestParentAccount']";

    String label;
    WebDriver driver;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        log.info("Select option from the list by name when creating an account");
        driver.findElement(By.xpath(String.format(dropdownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();

    }

    public void selectParentAccount(String parentAccountOption) {
        log.info(String.format("Select parentAccount in dropdown", parentAccountOption));
        driver.findElement(By.xpath(String.format(parentAccountLocator))).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath(String.format(parentAccountOptionLocator))).click();
    }


}