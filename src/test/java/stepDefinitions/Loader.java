package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.Base_PO;
import pageObject.Loader_PO;

public class Loader extends Base_PO {
    private WebDriver driver = getDriver();

    private Loader_PO loader;
    public Loader(Loader_PO loader){
        this.loader = loader;
    }


    @Given("I access the webdriver university Loading page")
    public void i_access_the_webdriver_university_loading_page() {
      loader.navigate_To_Loading_Page();
    }
    @When("After Spinner finished I have to click on the element")
    public void after_spinner_finished_i_have_to_click_on_the_element() {
      loader.click_On_The_Button();
    }
    @Then("I should be presente with a message {string}")
    public void i_should_be_presente_with_a_message(String string) {
      System.out.println("test2");
    }

}
