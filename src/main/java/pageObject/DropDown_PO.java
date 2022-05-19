package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.Global_Vars;

import java.util.List;

public class DropDown_PO extends Base_PO{
    private @FindBy(id="dropdowm-menu-1")
    WebElement clickOnDropDown ;


    public DropDown_PO(){
        super();
    }

    public void navigate_To_WebDriver_DopDown(){
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+"/Dropdown-Checkboxes-RadioButtons/index.html");
    }
    public void clickOnTheFirstDropDown(){
        waitForWebElementAndClick(clickOnDropDown);
    }
//    public  void selectFromDropDown() {
//        Select drop = new Select(clickOnDropDown);
//        drop.selectByIndex(1);
//    }

    public void selectAllFromDropDown(){
        Select drop = new Select(clickOnDropDown);
        List<WebElement> allItems = drop.getAllSelectedOptions();
        System.out.println(allItems.size());
        for(int j=0;j<allItems.size();j++){
            System.out.println(allItems.get(j).getText());
        }
    }
}
