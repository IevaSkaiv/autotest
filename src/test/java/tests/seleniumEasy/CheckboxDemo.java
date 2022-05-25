package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Locators;
import tests.BaseTest;

public class CheckboxDemo extends BaseTest {

    @BeforeMethod
    public void initialize() {
        pages.seleniumEasy.CheckboxDemo.open();
    }

    @Test
    public void singleCheckbox() {
        String expectedMessage = "Success - Check box is checked";

        pages.seleniumEasy.CheckboxDemo.clickSingleCheckbox();
        String actualMessage = pages.seleniumEasy.CheckboxDemo.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void multipleCheckbox(){
        String buttonChecked = "Uncheck All";
        String buttonUnchecked = "Check All";

        pages.Common.clickElement(Locators.SeleniumEasy.CheckboxDemo.buttonMultipleCheckbox);
        String actualButtonText = pages.seleniumEasy.CheckboxDemo.getMultipleCheckboxButtonText();
        Assert.assertEquals(actualButtonText, buttonChecked);
        Boolean status = pages.seleniumEasy.CheckboxDemo.checkIfAllCheckboxesAreSelected();
        Assert.assertEquals(status, true);
        pages.Common.clickElement(Locators.SeleniumEasy.CheckboxDemo.buttonMultipleCheckbox);
        actualButtonText = pages.seleniumEasy.CheckboxDemo.getMultipleCheckboxButtonText();
        Assert.assertEquals(actualButtonText, buttonUnchecked);
        status = pages.seleniumEasy.CheckboxDemo.checkIfAllCheckboxesAreSelected();
        Assert.assertEquals(status, false);
    }
}
