package tests.seleniumEasy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import tests.BaseTest;

public class InputFormSubmit extends BaseTest {

    @BeforeMethod
    public void openLink(){
        Common.openUrl("https://demo.seleniumeasy.com/input-form-demo.html");
    }

    @Test
    public void fillForm(){
        String firstName = "Ieva";
        String lastName = "Skaivydaite";

        pages.seleniumEasy.InputFormSubmit.InputFirstName(firstName);
        pages.seleniumEasy.InputFormSubmit.InputLastName(lastName);
//        pages.seleniumEasy.InputFormSubmit.InputEmail();
//        pages.seleniumEasy.InputFormSubmit.InputPhone();
    }
}
