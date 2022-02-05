
package tests;

import lombok.extern.log4j.Log4j2;
import models.Account;
import models.AccountFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


@Log4j2
public class AccountTest extends BaseTest {
    @Test(description = "Create new account and check to compare data entered into AccountModalPage and displayed on AccountDetailsPage")

    public void accountShouldBeCreated() throws InterruptedException {

        log.info("Test start AccountTest");
        loginPage.open();
        loginPage.login("blablablabla-d5xv@force.com", "karina_zelenkevich12");

        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();

        Assert.assertTrue(isAccountModalOpen, "Popup AccountModal did not open");


        log.info("Creating new Account");
        Account account = AccountFactory.getAccount();

        boolean isAccountDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();


        log.error("New account creation completed");
        Assert.assertTrue(isAccountDetailsPageOpen, "Details page did not open");

        log.error("Start assertEquals to compare data entered into AccountModalPage and displayed on AccountDetailsPage");
        Assert.assertEquals(accountDetailsPage.getFieldFormatPhoneValueByName("Phone"), account.getPhone(), "Phone does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatUrlValue("Website"), account.getWebSite(), "Website does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Type"), account.getType(), "Type does not match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatNumberValue("Employees"), account.getEmployees(), "Employees number doesn't match");
        Assert.assertEquals(accountDetailsPage.getFieldFormatTextValueByName("Industry"), account.getIndustry(), "Industry does not match");
        log.info("Completing the AccountTest");
    }
}
