package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class DragAndDrop_PO extends Base_PO{
    private @FindBy(xpath="//*[@id=\"draggable\"]/p/b")
    WebElement dragElement;
    private @FindBy(xpath="//*[@id=\"droppable\"]/p")
    WebElement dropElement;
    private @FindBy(xpath="/html/body/div/div[2]/div/div[2]/p")
    WebElement successfulMessage;
    private @FindBy(xpath="/html/body/div/div[3]/div/div/h2")
    WebElement doubleClick;

    public DragAndDrop_PO(){
        super();
    }

    public void navigate_To_WebDriver_Drp_And_Down(){
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+"/Actions/index.html");
    }
    public void drag_And_Drope_Element(){
        Actions action = new Actions(getDriver());
        action.dragAndDrop(dragElement,dropElement).perform();
    }
    public void validate_Drop_And_Down_Message(){
        waitFor(successfulMessage);
     Assert.assertEquals(successfulMessage.getText(), "Dropped!");

    }

    public void double_Click_On_An_Element(){
        Actions action = new Actions(getDriver());
        action.doubleClick(doubleClick).perform();
    }
}
