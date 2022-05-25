package pages.seleniumEasy;

import pages.Common;
import pages.Locators;
import java.util.List;

public class CheckboxDemo {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public static void clickSingleCheckbox() {
        Common.clickElement(Locators.SeleniumEasy.CheckboxDemo.inputSingleCheckbox);
    }

    public static String readMessage() {
       return Common.getElementText(Locators.SeleniumEasy.CheckboxDemo.fieldSingleCheckbox);
    }

    public static String getMultipleCheckboxButtonText() {
        return Common.getElementAttributValue(Locators.SeleniumEasy.CheckboxDemo.buttonMultipleCheckbox, "value");
    }


    public static boolean checkIfAllCheckboxesAreSelected() {
        List<Boolean> statusList = Common.getSelectedStatusForCheckboxesByLocator(Locators.SeleniumEasy.CheckboxDemo.inputMultipleCheckbox);
        for(Boolean status: statusList){
            if(!status){
                return false;
            }
        }
        return true;
    }
}
