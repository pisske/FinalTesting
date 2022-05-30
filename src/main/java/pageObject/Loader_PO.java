package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class Loader_PO extends Base_PO{
 private @FindBy(xpath="//*[@id=\"button1\"]/p")
    WebElement loader;

 private @FindBy(xpath="//*[@id=\"myModalClick\"]/div/div/div[1]/h4")
 WebElement loader_message;

    public Loader_PO(){
        super();
    }
    public void navigate_To_Loading_Page(){
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+"/Ajax-Loader/index.html");
    }
    public void click_On_The_Button(){
        waitForWebElementAndClick(loader);
    }

    public void validate_right_message(){
        Assert.assertEquals(loader_message.getText(), "Well Done For Waiting....!!!");
    }
}
