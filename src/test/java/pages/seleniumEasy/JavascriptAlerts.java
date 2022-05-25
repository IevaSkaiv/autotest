package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class JavascriptAlerts {
    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
    }

    public static void clickButtonToOpenAlertBox() {
        Common.clickElement(Locators.SeleniumEasy.JavascriptAlerts.buttonForAlertBox);
    }

    public static void clickOkToCloseAlertBox() {
        Common.acceptAlert();
    }

    public static void clickButtonToOpenConfirmBox() {
        Common.clickElement(Locators.SeleniumEasy.JavascriptAlerts.buttonForConfirmBox);
    }

    public static void clickOktoCloseConfirmBox() {
        Common.acceptAlert();
    }

    public static String readMessageFromConfirmBox() {
        return Common.getElementText(Locators.SeleniumEasy.JavascriptAlerts.fieldConfirmBoxMessage);
    }

    public static void clickCanceltoCloseConfirmBox() {
        Common.dismissAlert();
    }
    public static boolean isAlertIsPresent() {
        return Common.isAlertPresesnt();
    }
}
