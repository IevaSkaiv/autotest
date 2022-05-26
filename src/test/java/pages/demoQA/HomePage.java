package pages.demoQA;

import pages.Common;
import pages.Locators;

public class HomePage {
    public static void open() {
        Common.openUrl("https://demoqa.com/");
    }

    public static void clickElementsPage() {
        Common.clickElement(Locators.DemoQA.HomePage.menuElements);
    }
}
