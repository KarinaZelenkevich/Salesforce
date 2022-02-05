package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class LoginTest extends BaseTest {

    @Test
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("blablablabla-d5xv@force.com", "karina_zelenkevich12")
                .open()
                .isPageOpen();

        assertTrue(isHomePageOpened, "Страница HomePage не открылась");

    }


}
