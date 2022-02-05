package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class InputContact {

    String inputLocator = "//lightning-input//label[text()='%s']/ancestor::lightning-input//div//input";
    String AccountNameLocator = "//input[@placeholder='Search Accounts...']";
    String optionAccountNameLocator = "//input[@name='TestParentName']";


    WebDriver driver;
    String label;

    public InputContact(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        log.info("Writing text in the input field by the specified name when creating a contact");
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);
    }


    public void selectTestAccount(String text) {
        log.info(String.format("Select testAccount", AccountNameLocator));
        driver.findElement(By.xpath(String.format(AccountNameLocator, this.label))).sendKeys(text);
        driver.findElement(By.xpath(String.format(optionAccountNameLocator))).click();
    }
}