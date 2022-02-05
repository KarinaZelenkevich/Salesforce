package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ContactDetailsPage extends BasePage {


    String fieldFormatNameValue = "//span[text()='Name']/ancestor::div[@force-recordlayoutitem_recordlayoutitem]//lightning-formatted-name";
    String fieldFormatAccountName = "//span[text()='%s']/ancestor::force-record-layout-row//slot//span[@force-lookup_lookup]";
    String fieldFormatTextValue = "//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text";
    String fieldFormatPhoneValue = "//span[text()='%s']//ancestor::div[@force-recordlayoutitem_recordlayoutitem]//a[@lightning-formattedphone_formattedphone]";
    String fieldFormatAddressValue = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-address";
    String fieldFormatEmailValue = "//span[text()='%s']/ancestor::force-record-layout-item//a";
    public static final By DETAILS_LINK = By.xpath("//a[@data-tab-value='detailTab']");

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.debug("Go to the ContactsDetailsPage");
        driver.findElement(DETAILS_LINK).click();
        return isExist(DETAILS_LINK);
    }


    public String getFieldFormatNameValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatNameValue, fieldName))).getText();
    }

    public String getFieldFormatAccountName(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatAccountName, fieldName))).getText();
    }

    public String getFieldFormatTextValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatTextValue, fieldName))).getText();
    }

    public String getFieldFormatPhoneValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatPhoneValue, fieldName))).getText();
    }

    public String getFieldFormatEmailValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatEmailValue, fieldName))).getText();
    }

    public String getFieldFormatAddressValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFormatAddressValue, fieldName))).getText();
    }
}

