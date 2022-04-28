package stepDefinitions;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObject.Base_PO;

public class Click extends Base_PO {

    private WebDriver driver = getDriver();

    @Given("I access the webdriver university Click button page")
    public void i_access_the_webdriver_university_click_button_page() {
    navigateTo_Url("https://webdriveruniversity.com/Click-Buttons/index.html");
    }
    @When("I click on button")
    public void i_click_on_button() {
      driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
    }
    @Then("I should be presented with a successful click message")
    public void i_should_be_presented_with_a_successful_click_message() throws InterruptedException {

        WebElement contactUs_Submission_Message = driver.findElement(By.xpath("//*[@id='myModalClick']/div/div/div[1]/h4"));
        Thread.sleep(2000);
        Assert.assertEquals(contactUs_Submission_Message.getText(), "Congratulations!");
    }
}
