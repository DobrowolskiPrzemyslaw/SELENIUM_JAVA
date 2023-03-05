package base;


import org.testng.annotations.Test;

import java.awt.*;
import java.util.Random;

public class BaseTest2 {


    @Test
    public void test() throws InterruptedException, AWTException {
        Random random = new Random();
        int time = 60000;
        int x = random.nextInt() % 1200;
        int y = random.nextInt() % 900;
        Robot robot = new Robot();
        int licznik = 0;
        while(true){
            Thread.sleep(time);
            robot.mouseMove(x,y);
            System.out.println("Licznik: " + licznik);
            licznik++;
        }
    }
}
