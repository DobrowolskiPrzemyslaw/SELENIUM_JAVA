package driver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import java.util.HashMap;
import java.util.Map;

public class OptionManager {

    public static ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        return options;
    }

    public static FirefoxOptions getFireFoxOptions(){

        FirefoxOptions options = new FirefoxOptions();
        options.setPlatformName("Windows 10");
        options.setBrowserVersion("92");
        Map<String, Object> cloudOptions = new HashMap<>();
        options.setCapability("cloud:options", cloudOptions);

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("dow.webnotifications.enabled", false);
        return options;
    }
}
