package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {
    private WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
    driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
    }
    @When("I enter a username {string}")
    public void i_enter_a_username(String userName) {
      driver.findElement(By.id("text")).sendKeys(userName);
    }
    @When("I enter a password {}")
    public void i_enter_a_password_webdriver123(String password) {
      driver.findElement(By.id("password")).sendKeys(password);

    }
    @When("I click on the login button")
    public void i_click_on_the_login_button() {
       driver.findElement(By.id("login-button")).click();
    }
    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
      String  login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message,"validation succeeded");

    }
    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        String  login_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_Message,"validation failed");

    }
}
