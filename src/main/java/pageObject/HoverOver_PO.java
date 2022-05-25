package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class HoverOver_PO extends Base_PO{
    private @FindBy (xpath="//*[@id=\"div-hover\"]/div[1]/button")
        WebElement hoverover;
    private @FindBy (xpath="//*[@id=\"div-hover\"]/div[1]/div/a")
    WebElement click;
    public HoverOver_PO(){
        super();
    }
    public void navigate_To_WebDriver_HoverOver(){
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+"/Actions/index.html");
    }

    public void hoverover_element_and_click(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(hoverover);
        actions.moveToElement(click);
        actions.click().build().perform();

    }

    public void validate_successful_message(){
        waitForAlert_And_Validate_Text("Well done you clicked on the link!");
    }
}
