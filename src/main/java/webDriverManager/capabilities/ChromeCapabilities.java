package webDriverManager.capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeCapabilities {

    public void chromeOptions(){

    }

    public static Capabilities chromeCapabilities(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        return options;
    }
}
