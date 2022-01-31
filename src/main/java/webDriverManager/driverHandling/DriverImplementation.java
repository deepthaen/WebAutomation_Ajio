package webDriverManager.driverHandling;

import com.sun.tools.internal.jxc.ap.Const;
import common.dataHandling.PropertyReader;
import globalConfig.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webDriverManager.capabilities.ChromeCapabilities;
import webutils.models.Browser;

import java.util.concurrent.TimeUnit;

public class DriverImplementation {
    static WebDriver driver = null;


    //creaeted singleton instance for a driver
    // SIngletone for instaiance browser
    public static WebDriver getWebDriver(Browser browser) {
        if(driver==null){
            driver = initateDriver(browser);
        }
        return driver;
    }


    public static WebDriver getWebDriver() {
        String browser = PropertyReader.getValue(Constants.BROWSER);
        if(driver==null){
            driver = initateDriver(Browser.valueOf(browser));
        }
        return driver;
    }


    public static WebDriver initateDriver(Browser browser) {
        switch (browser){
            case CHROME:
                System.setProperty("webdriver.chrome.driver",PropertyReader.getValue(Constants.CHROME_PATH));
                driver = new ChromeDriver(ChromeCapabilities.chromeCapabilities());
                break;
            case FIREFOX:
                break;
            default:
                //launch chrome browser
                break;
        }
        return driver;
    }


    public static void getUrl() {
        getWebDriver().get(PropertyReader.getValue(Constants.URl));
    }
    public static void getUrl(String url) {
        getWebDriver().get(PropertyReader.get(Constants.URl));
    }

// Overloading
    public static void implicitWait() {
        getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void implicitWait(long time){
        System.out.println("Implicit wait :: " + time);
        getWebDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public static void maximize(){
        getWebDriver().manage().window().maximize();
    }
    public static void quitBrowser() {
        getWebDriver().quit();
    }
    public void closeBrowser(){
        getWebDriver().close();
    }

    public static void sleeprFor(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
