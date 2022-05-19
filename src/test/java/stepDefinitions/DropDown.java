package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObject.Base_PO;
import pageObject.Click_PO;
import pageObject.Contact_PO;
import pageObject.DropDown_PO;

public class DropDown extends Base_PO {

    private WebDriver driver = getDriver();

    private DropDown_PO down;

    public DropDown(DropDown_PO down){
        this.down= down;
    }

    @Given("I access the webdriver university DropDown")
    public void i_access_the_webdriver_university_drop_down() {
      down.navigate_To_WebDriver_DopDown();
    }
    @When("I click on  first dropdown menu")
    public void i_click_on_first_dropdown_menu() {
     down.clickOnTheFirstDropDown();


    }
    @Then("I should be presented with four element")
    public void i_should_be_presented_with_four_element() {
     down.selectAllFromDropDown();
    }

}
