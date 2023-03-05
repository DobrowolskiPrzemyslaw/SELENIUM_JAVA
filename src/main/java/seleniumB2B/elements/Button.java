package seleniumB2B.elements;

import org.openqa.selenium.By;

public class Button extends BaseElements{

    // Konstruktor dla obiektu klasy Button
    public Button(By locator){
        super(locator); // lokator został przekazany do klasy wyżej czyli BaseElements // locator jest potrzebny do odpowiedniego działania metod w klasie BaseElements
    }

    public void clickOnElement(){
        clickOnElementBase();
    }

    public void klikajAzPojawiSieWebelemnet(By coMamKlikac, By coMaBycwidoczne ){
        int i = 1;
        int iMax = 5;
        do {
            driver.findElement(coMamKlikac).click();
            czekaj(2000);
            if (driver.findElement(coMaBycwidoczne).isEnabled() && driver.findElement(coMaBycwidoczne).isDisplayed())
                break;
        }while (i<iMax);
    }

    public void czekaj(int ms){
        try{
            Thread.sleep(ms);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
