package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Common {

    public static void openUrl(String url){
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static List<WebElement> getElements(By locator)
    {
        return Driver.getDriver().findElements(locator);
    }
    public static void clickElement(By locator){
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String keys){
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByValue(By locator, String value){
        WebElement webElement = getElement(locator);
        Select selectElement = new Select(webElement);
        selectElement.selectByValue(value);
    }

    public static String getElementAttributValue(By locator, String attributeName){
        return getElement(locator).getAttribute(attributeName);
    }

    public static List<Boolean> getSelectedStatusForCheckboxesByLocator(By locator){
        List<WebElement> elements = Common.getElements(locator);
        List<Boolean> statusList = new ArrayList(Arrays.asList());
        for (WebElement element : elements) {
            statusList.add(element.isSelected());
        }
        return statusList;
    }

    public static void acceptAlert(){
        Driver.getDriver().switchTo().alert().accept();
    }

    public static void dismissAlert(){
        Driver.getDriver().switchTo().alert().dismiss();
    }

    public static boolean isAlertPresesnt() {
        try{
            Driver.getDriver().switchTo().alert();
            return true;
        }catch(NoAlertPresentException ex){
            return false;
        }
    }

    public static void sendKeysToAlert(String message) {
        Driver.getDriver().switchTo().alert().sendKeys(message);
    }

    public static Boolean isElementPresent(By locator){
        List<WebElement> elements = getElements(locator);
        return elements.size() > 0;
    }

    public static void doubleClick(By locator) {
        WebElement element = getElement(locator);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.doubleClick();
        actions.perform();
    }

    public static void rightClick(By locator) {
        WebElement element = getElement(locator);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.contextClick();
        actions.perform();
    }
}
