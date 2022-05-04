package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pageObject.Base_PO;
import pageObject.Contact_PO;

import static driver.DriverFactory.getDriver;

public class Contact extends Base_PO {
  private WebDriver driver = getDriver();


   private Contact_PO contact;
   public Contact (Contact_PO contact){
       this.contact = contact;
   }


    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
      contact.navigateTo_WebDriverUniversity_Contact_Page();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        //wait for element be clickable
      //  driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("AutoFN" + generateRandomNumber(5));
   //sendKeys(By.xpath("//input[@name='first_name']"),"AutoFN"+generateRandomNumber(5));
       contact.setUnique_FirstName();
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
       // driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("AutoLN" + generateRandomNumber(5));
        contact.setUnique_LastName();
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        //driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("AutoEmail" + generateRandomNumber(10) + "@mail.com");
      contact.setUnique_Address();
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
       // driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("Hello world " + generateRandomString(20));
        contact.setUniqueComment();
    }
    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
    //  driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
        contact.setSpecific_FirstName(firstName);
    }
    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name_blogs(String lastName) {
    //driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys(lastName);
        contact.setSpecific_LastName(lastName);
    }

    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address_joe_blogs123_mail_com(String email) {
     //driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
     contact.setSpecific_Email(email);
    }

    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String string) {
     //driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys(string);
     contact.setSpecific_Comment(string);
    }


    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
       // driver.findElement(By.xpath("//input[@value=\"SUBMIT\"]")).click();
        contact.clickOn_SubmitButton();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
//        WebElement contactUs_Submission_Message = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
//        Assert.assertEquals(contactUs_Submission_Message.getText(), "Thank You for your Message!");
        contact.validate_Successful_SubmissionMessage_Text();
    }

}



