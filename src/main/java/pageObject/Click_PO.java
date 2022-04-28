package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Click_PO extends Base_PO {
    private @FindBy(xpath="//*[@id=\"button1\"]")
    WebElement clickOnButton;

    public Click_PO(){


        super();
    }

    public void navigate_To_WebDriver_ClickPage(){
        navigateTo_Url("https://webdriveruniversity.com/Click-Buttons/index.html");
    }
    public void clickOnButtonAndSubmit(){
      waitForWebElementAndClick(clickOnButton);
    }


}
