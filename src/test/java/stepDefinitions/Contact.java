package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Contact {
    private WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }



    public String generateRandomNumber(int length){
        return RandomStringUtils.randomNumeric(length);
    }
    public String generateRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }

    @Given("I access the web driver university contact us page")
    public void i_access_the_web_driver_university_contact_us_page() {
     driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }
    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
       driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).sendKeys("FirstName"+generateRandomNumber(5));
    }
    @When("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
     driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]")).sendKeys("LastName"+generateRandomNumber(6));
    }
    @When("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
    driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]")).sendKeys("Email"+generateRandomNumber(10)+"gmail.com");
    }
    @When("I enter a unique comment")
    public void i_enter_a_unique_comment() {
 driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea")).sendKeys("Hello World"+ generateRandomString(20));
    }
    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
    driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();
    }
    @Then("I should be presented wit a successful contact us submission message")
    public void i_should_be_presented_wit_a_successful_contact_us_submission_message() {
       WebElement contactUs_Submission_Message = driver.findElement(By.xpath("//*[@id=\"contact_reply\"]/h1"));
       Assert.assertEquals(contactUs_Submission_Message.getText(),"Thank You for your Message!");

    }


}
