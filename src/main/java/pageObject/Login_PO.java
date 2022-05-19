package pageObject;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Global_Vars;

import java.time.Duration;

public class Login_PO extends Base_PO{
    private @FindBy(id="text")
    WebElement username_TextField;
    private @FindBy(id="password")
    WebElement password_TextField;
    private @FindBy(id="login-button")
    WebElement login_Button;


    public Login_PO(){
        super();
    }

    public void navigateTo_WebDriverUniversity_Login_Page(){
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+"/Login-Portal/index.html?");
    }
    public void setUsername(String username){
        sendKeys(username_TextField,username);
    }
    public void setPassword(String password){
        sendKeys(password_TextField,password);
    }
    public void buttonClick(){
        waitForWebElementAndClick(login_Button);
    }

     public void validate_SuccessfulLogin_Message(){
        waitForAlert_And_Validate_Text("validation succeeded");
     }

     public void validate_UnsuccessfullLogin_Message(){
        waitForAlert_And_Validate_Text("validation failed");
     }
}
