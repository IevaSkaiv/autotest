package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TestsClasswork {
    @Test
    public void testIfNumber995DividesBy3(){
        int input = 995;
        int actualRemainder;
        int expectedRemainder = 0;

        actualRemainder = input % 3;

        Assert.assertEquals(actualRemainder, expectedRemainder);
    }

    @Test
    public void testIfTodayIsWednesday(){
        DayOfWeek expectedDay = DayOfWeek.WEDNESDAY;
        LocalDate actualDate = LocalDate.now();
        DayOfWeek actualDay = actualDate.getDayOfWeek();

        Assert.assertEquals(actualDay, expectedDay);
    }

    @Test
    public void testWait5Sec(){
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    @Test
    public void testCountOfEvenNumbersBetween1And10(){
        int expectedCounter = 4;
        int actualEvenNumberCounter = 0;
        for(int i = 1; i < 11; i++){
            if(i % 2 == 0){
                actualEvenNumberCounter++;
            }
        }

        Assert.assertEquals(actualEvenNumberCounter, expectedCounter);
    }
}
