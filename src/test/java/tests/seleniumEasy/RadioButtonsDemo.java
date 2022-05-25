package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RadioButtonsDemo extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.RadioButtonsDemo.open();
    }

    @Test
    public void radioButtonDemo(){
        String gender = "Male";
        pages.seleniumEasy.RadioButtonsDemo.inputRadioButton(gender);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        String actualMessage = pages.seleniumEasy.RadioButtonsDemo.readMessege();

        Assert.assertTrue(actualMessage.contains(gender));

        gender = "Female";
        pages.seleniumEasy.RadioButtonsDemo.inputRadioButton(gender);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        actualMessage = pages.seleniumEasy.RadioButtonsDemo.readMessege();

        Assert.assertTrue(actualMessage.contains(gender));

    }

}
