package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class Demo {

    @Test
    public void testIfNumber4IsEven(){
        //Duomenys
        int input = 4;
        int actualRemainder;
        int expectedRemainder = 0;

        //Testo veiksmai
        actualRemainder =input % 2;

        //Palyginimas
        Assert.assertEquals(actualRemainder, expectedRemainder);
    }

    @Test
    public void testIfTimeNowIs19Hours(){
        int expectedHour = 19;
        LocalDateTime actualDateTime = LocalDateTime.now();
        int actualHour = actualDateTime.getHour();

//        Assert.assertEquals(actualHour, expectedHour);
        Assert.assertTrue(actualHour == expectedHour, "Expected: " +
                expectedHour + ", actual: " + actualHour);
    }
}