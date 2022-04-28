package pageObject;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        navigateTo_Url("https://www.webdriveruniversity.com/Login-Portal/index.html?");
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


}
