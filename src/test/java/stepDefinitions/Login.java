package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pageObject.Base_PO;
import pageObject.Login_PO;

import static driver.DriverFactory.getDriver;

public class Login extends Base_PO {

 private WebDriver driver = getDriver();
 private Login_PO login;

 public Login(Login_PO login){
     this.login = login;
 }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
         login.navigateTo_WebDriverUniversity_Login_Page();
    }

    @When("I enter a username {string}")
    public void i_enter_a_username(String username) {
       //driver.findElement(By.id("text")).sendKeys(username);
        //sendKeys(By.id("text"),username);
          login.setUsername(username);
    }

    @When("I enter a unique username {word}")
    public void i_enter_a_unique_username(String username) {
       driver.findElement(By.id("text")).sendKeys(username);

    }

    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
        // driver.findElement(By.id("password")).sendKeys(password);
        login.setPassword(password);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        //driver.findElement(By.id("login-button")).click();
        login.buttonClick();
    }

    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
//        String login_Message = driver.switchTo().alert().getText();
//        Assert.assertEquals(login_Message, "validation succeeded");
        login.validate_SuccessfulLogin_Message();
    }

    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
//        String login_Message = driver.switchTo().alert().getText();
//        Assert.assertEquals(login_Message, "validation failed");
        login.validate_UnsuccessfullLogin_Message();
    }

    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String expectedMessage) {
//        String login_Message = driver.switchTo().alert().getText();
//        Assert.assertEquals(login_Message, expectedMessage);
        waitForAlert_And_Validate_Text(expectedMessage);
    }
}