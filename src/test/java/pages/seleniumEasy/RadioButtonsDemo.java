package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class RadioButtonsDemo {
    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }


    public static void inputRadioButton(String gender) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputRadioButtonGender(gender));
    }

    public static void clickGetCheckedValue() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.buttonRadioButton);
    }

    public static String readMessege() {
       return Common.getElementText(Locators.SeleniumEasy.RadioButtonsDemo.fieldRadioButton);
    }
}
