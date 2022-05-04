package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class Click_PO extends Base_PO {
    private @FindBy(xpath="//*[@id=\"button1\"]")
    WebElement clickOnButton;
    private @FindBy(xpath="//*[@id='myModalClick']/div/div/div[1]/h4")
    WebElement validateMessage;
    public Click_PO(){


        super();
    }

    public void navigate_To_WebDriver_ClickPage(){
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+"/Click-Buttons/index.html");
    }
    public void clickOnButtonAndSubmit(){
      waitForWebElementAndClick(clickOnButton);
    }
    public void validate_Successful_SubmissionMessage() {
      waitFor(validateMessage);
      Assert.assertEquals(validateMessage.getText(),"Congratulations!");

    }

}
