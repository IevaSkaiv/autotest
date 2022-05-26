package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class InputFormSubmit {
    public static void InputFirstName(String keys) {
        Common.sendKeysToElement(Locators.SeleniumEasy.InputFormSubmit.inputFirstName, keys);
    }

    public static void InputLastName(String keys) {
        Common.sendKeysToElement(Locators.SeleniumEasy.InputFormSubmit.inputLastName, keys);
    }
}
