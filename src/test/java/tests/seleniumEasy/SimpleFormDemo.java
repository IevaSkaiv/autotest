package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SimpleFormDemo extends BaseTest {

    @BeforeMethod
    public void initialize() {
        pages.seleniumEasy.SimpleFormDemo.open();
        pages.seleniumEasy.SimpleFormDemo.closeAd();
    }

    @Test
    public void testInputFieldSeleniumEasy() {
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
}
