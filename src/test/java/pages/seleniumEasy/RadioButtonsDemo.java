package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class RadioButtonsDemo {
    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }


    public static void inputRadioButton(String gender) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputByGender(gender));
    }

    public static void clickGetCheckedValue() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.buttonRadioButton);
    }

    public static String readMessege() {
       return Common.getElementText(Locators.SeleniumEasy.RadioButtonsDemo.fieldRadioButton);
    }

    public static void clickRadioButtonGroupByGender(String gender) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputByGroupGender(gender));
    }

    public static void clickRadioButtonGroupByAgeGroup(String ageGroup) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputByAge(ageGroup));
    }

    public static void clickGetValue() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.buttonGetValues);
    }

    public static String readGroupMessege() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonsDemo.fieldValue);

    }
}
