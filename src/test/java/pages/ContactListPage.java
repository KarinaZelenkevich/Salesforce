package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage{
    public static final By CONTACT_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CONTACT_LABEL);
    }

    public ContactListPage open() {
        driver.get(BASE_URL + "/lightning/o/Contact/list");
        return this;
    }

    public AccountModalPage clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new AccountModalPage(driver);
    }

}
