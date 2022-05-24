import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium {

    @Test
    public void testImputFieldDemoQA(){
        String fullName = "Ieva";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        WebElement inputFullName = driver.findElement(By.xpath("//*[@id='userName']"));
//        driver.findElement(By.id("userName"));
//        driver.findElement(By.cssSelector("#userName"));

        inputFullName.sendKeys(fullName);

       driver.quit();
    }
    @Test
    public void testImputFieldSeleniumEasy(){
        String fullName = "Ieva";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='at-cv-lightbox-win']")));

        WebElement buttonCloseAdd = driver.findElement(By.xpath("//*[@id='at-cv-lightbox-close']"));
        buttonCloseAdd.click();

        WebElement singleInputField = driver.findElement(By.xpath("//*[@id='user-message']"));
        singleInputField.sendKeys(fullName);

        WebElement buttonShowMessage = driver.findElement(By.xpath("//*[@id='get-input']/button"));
        buttonShowMessage.click();

        String textMessage = driver.findElement(By.xpath("//*[@id='display']")).getText();

        Assert.assertEquals(textMessage, fullName);
        driver.quit();
    }
    @Test
    public void testTwoInputFields(){
        int input1 = 5;
        int input2 = 7;
        int sum = 12;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='at-cv-lightbox-win']")));

        WebElement buttonCloseAdd = driver.findElement(By.xpath("//*[@id='at-cv-lightbox-close']"));
        buttonCloseAdd.click();

        WebElement firstInputField = driver.findElement(By.xpath("//*[@id='sum1']"));
        firstInputField.sendKeys(Integer.toString(input1));

        WebElement secondInputField = driver.findElement(By.xpath("//*[@id='sum2']"));
        secondInputField.sendKeys(Integer.toString(input2));

        WebElement buttonGetTotal = driver.findElement(By.xpath("//*[@id='gettotal']/button"));
        buttonGetTotal.click();

        String actualSumText = driver.findElement(By.xpath("//*[@id='displayvalue']")).getText();

        Assert.assertEquals(actualSumText, Integer.toString(sum));

        driver.quit();

    }
}
