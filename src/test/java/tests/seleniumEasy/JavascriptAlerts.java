package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class JavascriptAlerts extends BaseTest {

    @BeforeMethod
    public void openLink(){
        pages.seleniumEasy.JavascriptAlerts.open();
    }

    @Test
    public void closeAlertBox(){
        pages.seleniumEasy.JavascriptAlerts.clickButtonToOpenAlertBox();
        pages.seleniumEasy.JavascriptAlerts.clickOkToCloseAlertBox();
        Assert.assertFalse(pages.seleniumEasy.JavascriptAlerts.isAlertIsPresent());
    }

    @Test
    public void acceptConfirmBox(){
        pages.seleniumEasy.JavascriptAlerts.clickButtonToOpenConfirmBox();
        pages.seleniumEasy.JavascriptAlerts.clickOktoCloseConfirmBox();
        String message = pages.seleniumEasy.JavascriptAlerts.readMessageFromConfirmBox();
        Assert.assertTrue(message.contains("OK"));
    }

    @Test
    public void rejectConfirmBox(){
        pages.seleniumEasy.JavascriptAlerts.clickButtonToOpenConfirmBox();
        pages.seleniumEasy.JavascriptAlerts.clickCanceltoCloseConfirmBox();
        String message = pages.seleniumEasy.JavascriptAlerts.readMessageFromConfirmBox();
        Assert.assertTrue(message.contains("Cancel"));
    }
}
