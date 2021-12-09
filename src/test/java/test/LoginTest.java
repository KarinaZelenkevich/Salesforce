package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class LoginTest extends BaseTest {

    @Test
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("pioni.mika-0uab@force.com", "karinazelenkevich12")
                .open()
                .isPageOpen();

        assertTrue(isHomePageOpened, "Страница HomePage не открылась");

    }


}
