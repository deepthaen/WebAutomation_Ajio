package webDriverManager.driverHandling;

import org.openqa.selenium.WebDriver;
import webutils.models.Browser;

public interface DriverController {
// interface and ABstraction


     WebDriver getWebDriver(Browser browser);
     WebDriver getWebDriver();// read from properties

     WebDriver initateDriver(Browser browser);

     void getUrl(String url);

     void implicitWait();
     void implicitWait(long time);

     void quitBrowser();







}
