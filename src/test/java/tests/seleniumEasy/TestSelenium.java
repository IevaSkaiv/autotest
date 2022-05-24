package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.seleniumEasy.SimpleFormDemo;
import utilities.Driver;

public class TestSelenium {

    @BeforeMethod
    public void setup() {
        Driver.setDriver();
        SimpleFormDemo.open();
        SimpleFormDemo.closeAd();
    }

    @Test
    public void testImputFieldSeleniumEasy() {
        String fullName = "Ieva";

        SimpleFormDemo.enterMessage(fullName);
        SimpleFormDemo.clickShowMessageButton();
        String textMessage = SimpleFormDemo.readMessage();

        Assert.assertEquals(textMessage, fullName);
    }

    @Test
    public void testTwoInputFields() {
        int input1 = 5;
        int input2 = 7;
        int sum = 12;

        SimpleFormDemo.enterValueA(Integer.toString(input1));
        SimpleFormDemo.enterValueB(Integer.toString(input2));
        SimpleFormDemo.clickGetTotalButton();
        String actualSumText = SimpleFormDemo.readTotal();

        Assert.assertEquals(actualSumText, Integer.toString(sum));
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}
