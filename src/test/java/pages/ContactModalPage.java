package pages;

import elements.DropDown;
import elements.Input;
import models.Contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage {
    public static final By CONTACT_MODAL_TITLE= By.xpath("//*[contains(@class, 'slds-modal__header')]//h2");

    public static final By CONTACT_SAVE_BUTTON = By.xpath("//button[@name='SaveEdit']");

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CONTACT_MODAL_TITLE);
    }


    public ContactDetailsPage create(Contact contact) {

        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new DropDown(driver, "Salutation").selectOption(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Account Name").write(contact.getAccountName());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Email").write(contact.getEmail());
        new DropDown(driver, "Reports To").selectOption(contact.getReportsTo());
        new Input(driver, "Mailling Street").write(contact.getMaillingStreet());
        new Input(driver, "Other Street").write(contact.getOtherStreet());
        new Input(driver, "Mailling City").write(contact.getMaillingCity());
        new Input(driver, "Mailling State/Province").write(contact.getMaillingState());
        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other State/Province").write(contact.getOtherState());
        new Input(driver, "Mailling Zip/Postal Code").write(contact.getMaillingZip());
        new Input(driver, "Mailling Country").write(contact.getMaillingCountry());
        new Input(driver, "Other Zip/Postal Code").write(contact.getOtherZip());
        new Input(driver, "Other Country").write(contact.getOtherCountry());
        new DropDown(driver, "Lead Source").selectOption(contact.getLeadSource());
        new DropDown(driver, "Birthdate").selectOption(contact.getBirthdate());

        return clickSaveButton();
    }


    public ContactDetailsPage clickSaveButton() {
        driver.findElement(CONTACT_SAVE_BUTTON).click();
        return new ContactDetailsPage(driver);
    }
}
