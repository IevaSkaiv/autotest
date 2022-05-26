package tests.demoQA;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import tests.BaseTest;

public class DynamicProperties extends BaseTest {

    @BeforeMethod
    public void open() {
        pages.demoQA.DynamicProperties.open();
    }

    @Test
    public void buttonEnableAfter(){
        pages.demoQA.DynamicProperties.clickButtonEnableAfter();
    }
}
