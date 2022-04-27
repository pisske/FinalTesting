package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver>webDriver = new ThreadLocal<>();
    public static WebDriver getDriver(){
        if(webDriver.get()==null){
            webDriver.set(createDriver());
        }
        return webDriver.get();
    }
    private static WebDriver createDriver(){
        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    public static void cleanupDriver(){
        webDriver.get().quit();
        webDriver.remove();
    }
}
