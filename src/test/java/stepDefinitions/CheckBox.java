package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.Base_PO;
import pageObject.CheckBox_PO;

public class CheckBox extends Base_PO {
    private WebDriver driver = getDriver();

    public CheckBox_PO check;

    public CheckBox(CheckBox_PO check){
        this.check = check;
    }
    @Given("I access the webdriver university DropDown,CheckBox&RadioButton page")
    public void i_access_the_webdriver_university_drop_down_check_box_radio_button_page() {
       check.navigate_To_WebDriver_CheckBoxPage();
    }
    @When("I click on checkbox element option2")
    public void i_click_on_checkbox_element_option2() {
     check.clickOnCheckBox();
    }

    @Then("I should be checked all check box elements")
    public void i_should_be_checked_all_check_box_elements() {

    }
}
