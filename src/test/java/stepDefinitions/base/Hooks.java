package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setup() {
      getDriver();
    }

    @After("@login")
    public void tearDown() {
     cleanupDriver();
    }
}
