package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.Base_PO;
import pageObject.Click_PO;
import pageObject.UploadFile_PO;

public class UploadFile extends Base_PO {
    private WebDriver driver = getDriver();
    private UploadFile_PO upload;

    public UploadFile(UploadFile_PO upload ){
      this.upload = upload;
    }

    @Given("I access the webdriver university Upload button page")
    public void i_access_the_webdriver_university_upload_button_page() {
      upload.navigate_To_WebDriver_UploadFile();

    }
    @When("I click on choose File I have to pick up a file")
    public void i_click_on_choose_file_i_have_to_pick_up_a_file()  {
     upload.click_on_choose_file();


    }
    @When("I click on submit button")
    public void i_click_on_submit_button()  {
       upload.click_on_submit_button();

    }
    @Then("I should be presented with a successful upload file mesesage")
    public void i_should_be_presented_with_a_successful_upload_file_mesesage() {
    upload.validate_Successful_Upload_Message();
    }

}
