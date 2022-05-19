package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class UploadFile_PO extends Base_PO{
    private @FindBy(xpath="//*[@id=\"myFile\"]")
    WebElement clickChoose;
    private @FindBy(xpath="//*[@id=\"submit-button\"]")
    WebElement clickSubmit;

    public UploadFile_PO(){
        super();
    }

    public void navigate_To_WebDriver_UploadFile(){
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+"/File-Upload/index.html");
    }
    public void click_on_choose_file(){
      WebElement UploadImg = clickChoose;
       UploadImg.sendKeys("/home/vladimir/Desktop/token.txt");

    }
    public void click_on_submit_button(){
        waitForWebElementAndClick(clickSubmit);
    }
    public void validate_Successful_Upload_Message(){
        waitForAlert_And_Validate_Text("Your file has now been uploaded!");
    }

}
