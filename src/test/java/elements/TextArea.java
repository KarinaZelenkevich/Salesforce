package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextArea {
    String inputTextArea = "//div[contains(@class, 'modal-body')]//label[text()='Mailing Country']/..";
//            "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//textarea";
//    "//div[contains(@class, 'modal-body')]//label[text()='%s']/ancestor::lightning-textarea//textarea";

    WebDriver driver;
    String label;

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        log.info("Writing text into textarea with by the specified name when creating an account");
        driver.findElement(By.xpath(String.format(inputTextArea, this.label))).sendKeys(text);
    }
}
