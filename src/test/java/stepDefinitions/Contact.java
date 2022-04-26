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


    @Given("I access the web driver university contact us page")
    public void i_access_the_web_driver_university_contact_us_page() {
     driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }
    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
       driver.findElement(By.xpath(""))
    }
    @When("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be presented wit a successful contact us submission message")
    public void i_should_be_presented_wit_a_successful_contact_us_submission_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
