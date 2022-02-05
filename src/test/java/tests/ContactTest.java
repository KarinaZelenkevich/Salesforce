package tests;

import lombok.extern.log4j.Log4j2;
import models.Contact;
import models.ContactFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


@Log4j2
public class ContactTest extends BaseTest {

    @Test(description = "Create new contact and check to compare data entered into ContactModalPage and displayed on ContactDetailsPage")
    public void contactShouldBeCreated() throws InterruptedException {
        log.info("Test start ContactTest");
        loginPage.open();
        loginPage.login("blablablabla-d5xv@force.com", "karina_zelenkevich12");

        boolean isContactModalOpen = contactListPage
                .open()
                .clickNew()
                .isPageOpen();
        log.info("Checking that ContactModal has opened");
        Assert.assertTrue(isContactModalOpen, "Popup AccountModal did not open");

        log.info("Create a new contact");

        Contact contact = ContactFactory.get();

        boolean isContactDetailsPageOpen = contactModalPage
                .create(contact)
                .isPageOpen();

        log.error("New contact creation completed");

        Assert.assertTrue(isContactDetailsPageOpen, "Details page did not open");

        log.info("Start assertEquals to compare data entered into ContactModalPage and displayed on ContactDetailsPage");
        Assert.assertEquals(contactDetailsPage.getFieldFormatNameValue("Name"), contact.getSalutation() + " " + contact.getFirstName() + " " + contact.getLastName(), "Field Name does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatAccountName("Account Name"), contact.getAccountName(), "Field Account Name does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatTextValue("Title"), contact.getTitle(), "Title does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatPhoneValue("Phone"), contact.getPhone(), "Phone does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatPhoneValue("Mobile"), contact.getMobile(), "Mobile  does not match");
        Assert.assertEquals(contactDetailsPage.getFieldFormatEmailValue("Email"), contact.getEmail(), "Email  does not match");

        log.info("Completing the ContactTest");
    }
}