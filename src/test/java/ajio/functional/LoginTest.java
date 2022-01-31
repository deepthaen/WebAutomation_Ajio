package ajio.functional;

import org.testng.annotations.Test;
import webDriverManager.BaseTest;
import webPageHelpers.LoginPage;

public class LoginTest extends BaseTest {


    @Test
    public void logintest(){
        getUrl();
        LoginPage login = new LoginPage();
        login.clickonLogin();
        sleeprFor(5000);
    }
}
