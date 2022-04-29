package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.Base_PO;
import pageObject.CheckBox_PO;

public class CheckBox extends Base_PO {
    private WebDriver driver = getDriver();

    private CheckBox_PO dropdown;

    public CheckBox(CheckBox_PO dropdown){
         this.dropdown=dropdown;
    }


    @Given("I access the webdriver university dropdown page")
    public void i_access_the_webdriver_university_dropdown_page() {
    dropdown.navigateTo_WebDriverUniversity_DropDown();
    }
    @When("I select first  dropdown menu")
    public void i_select_first_dropdown_menu() {
     dropdown.clickOnTheCheckBox();
    }

    @Then("I should be checked if element is clicked")
    public void i_should_be_checked_if_element_is_clicked() {
     dropdown.checkIfElementChecked();
    }
}
