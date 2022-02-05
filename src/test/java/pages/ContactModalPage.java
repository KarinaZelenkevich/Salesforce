package pages;

import elements.*;
import models.Contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage {
    public static final By CONTACT_MODAL_TITLE = By.xpath("//*[contains(@class, 'slds-modal__header')]//h2");
    public static final By CONTACT_SAVE_BUTTON = By.xpath("//button[@name='SaveEdit']");

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CONTACT_MODAL_TITLE);
    }


    public ContactDetailsPage create(Contact contact) {

        new DropDownContact(driver, "Salutation").selectOption(contact.getSalutation());
        new InputContact(driver, "First Name").write(contact.getFirstName());
        new InputContact(driver, "Last Name").write(contact.getLastName());
        new InputContact(driver, "Title").write(contact.getTitle());
        new DropDownContact(driver, "Account Name").selectAccountName(contact.getAccountName());
        new InputContact(driver, "Phone").write(contact.getPhone());
        new InputContact(driver, "Mobile").write(contact.getMobile());
        new InputContact(driver, "Email").write(contact.getEmail());
        new TextAreaContact(driver, "Mailing Street").write(contact.getMailingStreet());
        new InputContact(driver, "Mailing City").write(contact.getMailingCity());
        new InputContact(driver, "Mailing State/Province").write(contact.getMailingState());

        return clickSaveButton();
    }


    public ContactDetailsPage clickSaveButton() {
        driver.findElement(CONTACT_SAVE_BUTTON).click();
        return new ContactDetailsPage(driver);
    }
}
