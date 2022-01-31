package webDriverManager.pageHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriverManager.driverHandling.DriverImplementation;
import webutils.models.Locators;

import java.util.List;

public class WebPageImplementation {
    public By by;
    public WebElement element;
    public List<WebElement> elements;
    public WebDriver driver;

    public  WebPageImplementation(WebDriver driver){
        this.driver= driver;
    }
// currently using this method
    public  WebPageImplementation(){
        this.driver=DriverImplementation.getWebDriver();
    }

    public void click(WebElement element){
        //explicit wait - wait for element clicakble
        element.click();
    }

    public void type(WebElement element,String text){

        element.sendKeys(text);
    }



}
