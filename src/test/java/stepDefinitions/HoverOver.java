package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObject.Base_PO;
import pageObject.HoverOver_PO;

public class HoverOver extends Base_PO {
    private WebDriver driver = getDriver();

    private HoverOver_PO hover;

    public HoverOver(HoverOver_PO hover){
        this.hover=hover;
    }
    @Given("I access the webdriver university Actions page")
    public void i_access_the_webdriver_university_actions_page() {
         hover.navigate_To_WebDriver_HoverOver();
    }
    @Given("I have to hover over on element and click on a link below")
    public void i_have_to_hover_over_on_element_and_click_on_a_link_below() {
     hover.hoverover_element_and_click();
    }
    @Then("I should be presented with message {string}")
    public void i_should_be_presented_with_message(String string) {
       hover.validate_successful_message();
    }
}
