package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        options.addArguments("start-maximized");
//        options.addArguments("window-size=5000,3000");
        driver.set(new ChromeDriver(options));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void closeDriver(){
        driver.get().quit();
        driver.remove();
    }
}
