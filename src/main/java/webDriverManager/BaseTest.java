package webDriverManager;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import webDriverManager.driverHandling.DriverImplementation;

public class BaseTest extends  DriverImplementation{

    /**
     * @Before test
     *
     * @Before emthod
     *
     * @AfterTest
     * @AFter Method
     */
    WebDriver driver;
    @BeforeMethod
    public void tearup(){
        driver = getWebDriver();
        maximize();
        implicitWait();
    }

    @AfterMethod
    public void tearDown(){
        quitBrowser();
    }


}
