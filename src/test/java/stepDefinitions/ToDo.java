package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.Base_PO;
import pageObject.ToDo_PO;

public class ToDo extends Base_PO {
    private WebDriver driver = getDriver();

    private ToDo_PO todo;
    public ToDo(ToDo_PO todo){
        this.todo=todo;
    }
    @Given("I access the webdriver university ToDo List page")
    public void i_access_the_webdriver_university_to_do_list_page() {
     todo.navigate_To_WebDriver_ToDo_Page();
    }
    @When("I click on element I have to scratch element")
    public void i_click_on_element_i_have_to_scratch_element_and_delete_element_on_bin_icon() {
     todo.scratchElement();
    }
    @When("I have to delete element on bin icon")
    public void i_have_to_delete_element_on_bin_icon() {
   todo.deleteElement();
    }
    @When("I have to add new element {string}")
    public void i_have_to_add_new_element(String addElement) throws InterruptedException {
     todo.addNewElements(addElement);
    }

    @Then("I have to be presented with the same name of element which I added")
    public void i_have_to_be_presented_with_the_same_name_of_element_which_i_added() {
        System.out.println("test3");
    }
}
