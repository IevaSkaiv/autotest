package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RadioButtonsDemo extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.RadioButtonsDemo.open();
    }

    @DataProvider(name = "")
    public Object[][] radioButtonGender(){
        return new Object[][] { {"Male"},{"Female"} };
    }
    @Test(dataProvider = "radioButtonGender")
    public void radioButtonGender(String gender){
        pages.seleniumEasy.RadioButtonsDemo.inputRadioButton(gender);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        String actualMessage = pages.seleniumEasy.RadioButtonsDemo.readMessege();

        Assert.assertTrue(actualMessage.contains(gender));
    }

}
