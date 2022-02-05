package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountDetailsPage extends BasePage {

    public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    String fieldFormatTextValue = "//span[text()='%s']/ancestor::div[@force-recordlayoutitem_recordlayoutitem]//lightning-formatted-text";
    String fieldFormatPhoneValue = "//span[text()='%s']//ancestor::div[@force-recordlayoutitem_recordlayoutitem]//a[@lightning-formattedphone_formattedphone]";
    String fieldFormatUrlValue = "//span[text()='%s']//ancestor::flexipage-tab2//lightning-formatted-url";
    String fieldFormatNumberValue = "//span[text()='%s']/ancestor::div[@force-recordlayoutitem_recordlayoutitem]//lightning-formatted-number";
    String fieldFormatAddressValue = "//span[text()='%']/ancestor::div[@force-recordlayoutitem_recordlayoutitem]//lightning-formatted-address//a";


    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.debug("Go to the AccountsDetailsPage");
        driver.findElement(DETAILS_LINK).click();
        return isExist(DETAILS_LINK);
    }


    public String getFieldFormatTextValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatTextValue, fieldName))).getText().replaceAll(",", "");
    }

    public String getFieldFormatPhoneValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatPhoneValue, fieldName))).getText();
    }

    public String getFieldFormatUrlValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatUrlValue, fieldName))).getText();
    }

    public String getFieldFormatNumberValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatNumberValue, fieldName))).getText().replaceAll(",", "");
    }

    public String getFieldFormatAddressValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatAddressValue, fieldName))).getText();
    }
}