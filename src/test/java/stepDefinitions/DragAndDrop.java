package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObject.Base_PO;
import pageObject.DragAndDrop_PO;

public class DragAndDrop extends Base_PO {
    private WebDriver driver = getDriver();
    private DragAndDrop_PO drop;
    public DragAndDrop(DragAndDrop_PO drop){
        this.drop = drop;
    }





    @Given("I access the webdriver university DragAndDrope")
    public void i_access_the_webdriver_university_drag_and_drope() {
        drop.navigate_To_WebDriver_Drp_And_Down();
    }
    @Given("I have to go on Drag element")
    public void i_have_to_go_on_drag_element() {
 drop.drag_And_Drope_Element();
    }
    @Given("I have to double click on element")
    public void i_have_to_double_click_on_element() {

    drop.double_Click_On_An_Element();
    }
    @Then("I should be presented with a message {string}")
    public void i_should_be_presented_with_a_message(String string) {
     drop.validate_Drop_And_Down_Message();

    }


}
