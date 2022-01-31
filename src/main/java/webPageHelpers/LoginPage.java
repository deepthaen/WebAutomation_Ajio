package webPageHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webDriverManager.driverHandling.DriverImplementation;
import webDriverManager.pageHelper.WebPageImplementation;

public class LoginPage  extends WebPageImplementation {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    // currently using this method
    public LoginPage(){
        driver= DriverImplementation.getWebDriver();
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath="//span[text()='Login']")
    private WebElement login;

    public void clickonLogin(){
        //login.click();
        click(login);
    }
}
