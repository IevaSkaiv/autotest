package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class SimpleFormDemo {

    @BeforeMethod
    public void setup() {
        Driver.setDriver();
        pages.seleniumEasy.SimpleFormDemo.open();
        pages.seleniumEasy.SimpleFormDemo.closeAd();
    }

    @Test
    public void testImputFieldSeleniumEasy() {
        String fullName = "Ieva";

        pages.seleniumEasy.SimpleFormDemo.enterMessage(fullName);
        pages.seleniumEasy.SimpleFormDemo.clickShowMessageButton();
        String textMessage = pages.seleniumEasy.SimpleFormDemo.readMessage();

        Assert.assertEquals(textMessage, fullName);
    }

    @Test
    public void testTwoInputFields() {
        int input1 = 5;
        int input2 = 7;
        int sum = 12;

        pages.seleniumEasy.SimpleFormDemo.enterValueA(Integer.toString(input1));
        pages.seleniumEasy.SimpleFormDemo.enterValueB(Integer.toString(input2));
        pages.seleniumEasy.SimpleFormDemo.clickGetTotalButton();
        String actualSumText = pages.seleniumEasy.SimpleFormDemo.readTotal();

        Assert.assertEquals(actualSumText, Integer.toString(sum));
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}
