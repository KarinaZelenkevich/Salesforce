package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
//        + "|//div[contains(@class, 'modal-body')]//*[text()='%s']/ancestor::lightning-input//div";

    WebDriver driver;
    String label;
    String inputLocator = "//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";
    String optionLocator = "//li//a//div[@title='%s']";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.printf("Writing text '%s' into input with label '%s\n", text, this.label);
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);
    }

    public void click(String accountName) {
        driver.findElement(By.xpath(String.format(inputLocator, label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, accountName))).click();
    }
}

