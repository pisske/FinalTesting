package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class ToDo_PO extends Base_PO{

    String apple = "Apple";
    private @FindBy(xpath="//*[@id=\"container\"]/ul/li[1]")
    WebElement scratchElement;
    private @FindBy(xpath="//*[@id=\"container\"]/ul/li/span/i")
    WebElement deleteElement;
    private @FindBy(xpath="//*[@id=\"container\"]/input")

    WebElement addNewElement;
    private @FindBy(xpath="//*[@id=\"container\"]/ul/li[3]")
    WebElement validateNewElement;

   public ToDo_PO(){
       super();
   }
    public void navigate_To_WebDriver_ToDo_Page(){
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+"/To-Do-List/index.html");
    }
    public void scratchElement(){
       waitForWebElementAndClick(scratchElement);
    }

    public void deleteElement(){
       waitForWebElementAndClick(deleteElement);
    }
    public void addNewElements(String addElement) {
           sendKeys(addNewElement ,addElement);
           addNewElement.sendKeys(Keys.ENTER);

    }

   public void validateNewAddedElement(){
       waitFor(validateNewElement);
       Assert.assertEquals(validateNewElement.getText(),"apple");
   }


}
