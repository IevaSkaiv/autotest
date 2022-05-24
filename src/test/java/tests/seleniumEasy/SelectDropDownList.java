package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SelectDropDownList extends BaseTest {

    @BeforeMethod
    public void initialize() {
        pages.seleniumEasy.SelectDropDownList.open();
    }

    @Test
    public void selectDayOfWeek(){
        String expectedDay = "Wednesday";

        pages.seleniumEasy.SelectDropDownList.selectDayFromDropdown(expectedDay);
//        String message = pages.seleniumEasy.SelectDropDownList.readMessage();
//        Assert.assertTrue(message.contains(expectedDay));
    }

}
