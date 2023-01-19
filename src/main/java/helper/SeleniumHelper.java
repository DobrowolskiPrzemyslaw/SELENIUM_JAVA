package helper;

import driver.DriverManager;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SeleniumHelper {

    public static String takeScreenShot(WebDriver driver) throws IOException {
        TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
        File screenshotFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src//test//resources//screens//name " + LocalTime.now().getNano() + ".png");
        Files.copy(screenshotFile.toPath(), destinationFile.toPath());
        return destinationFile.getAbsolutePath();
    }

    public static void waitFor(int ms){
        try{
            Thread.sleep(ms);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public static List<String> sortWebElements(String pathOfList){
        WebDriver driver = DriverManager.getDriver();
        List<WebElement> list = driver.findElements(By.xpath(pathOfList));
        ArrayList<String> slist = new ArrayList<>();
        for (int i = 1; i <= list.size(); i++) {
            String nazwa = driver.findElement(By.xpath("("+pathOfList+")["+i+"]")).getText();
            slist.add(nazwa);
        }
        return slist.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }
}
