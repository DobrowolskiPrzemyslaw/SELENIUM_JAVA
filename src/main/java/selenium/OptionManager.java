package selenium;

import org.openqa.selenium.chrome.ChromeOptions;

public class OptionManager {

    public static ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        return options;
    }
}
