package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextAreaContact {

    String textareaLocator = "//div[contains(@class, 'modal-body')]//label[text()='%s']/ancestor::lightning-textarea//textarea";

    WebDriver driver;
    String label;

    public TextAreaContact(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.printf("Writing text '%s' into input field '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(textareaLocator, this.label))).sendKeys(text);
    }
}