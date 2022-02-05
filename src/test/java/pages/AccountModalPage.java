package pages;

import elements.DropDown;
import elements.Input;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;


public class AccountModalPage extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//*[contains(@class, 'inlineTitle')]");


    public AccountModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MODAL_TITLE);
    }

    public AccountDetailsPage create(Account account) {

        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebSite());
        new DropDown(driver, "Type").selectOption(account.getType());
        new DropDown(driver, "Industry").selectOption(account.getIndustry());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Employees").write(account.getEmployees());
        new DropDown(driver, "Parent Account").selectParentAccount(account.getParentAccount());
        new TextArea("Description").setText(account.getDescription());
        new TextArea("Billing Street").setText(account.getBillingStreet());
        new TextArea("Shipping Street").setText(account.getShippingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        return clickSave();
    }


    public AccountDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }


}
