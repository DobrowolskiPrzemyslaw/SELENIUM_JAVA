package javaTips.enums;

import org.testng.annotations.Test;

public class SeasonOfYearEnumTest {

    @Test
    public void testEnum() {
        getSomething(SeasonOfYear.AUTUMN);
    }

    // We must have method which use enum in parameter
    private static void getSomething(SeasonOfYear seasonOfYear){
        if(seasonOfYear == seasonOfYear.AUTUMN){
            System.out.println("Right now is: "+ seasonOfYear);
        }else if(seasonOfYear == SeasonOfYear.SUMMER){
            System.out.println("Right now is: "+ seasonOfYear);
        }else if(seasonOfYear == SeasonOfYear.SPRING){
            System.out.println("Right now is:"+ seasonOfYear);
        }else{
            System.out.println("Right now is:"+ SeasonOfYear.WINTER);
        }
    }
}
