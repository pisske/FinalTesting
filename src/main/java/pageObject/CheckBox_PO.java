package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class CheckBox_PO extends Base_PO{

    private @FindBy(xpath="//*[@id=\"checkboxes\"]/label[2]/input")
    WebElement checkBox;
    private @FindBy(xpath="//input[@type='checkbox']")
    WebElement allCheckBoxes;

    public CheckBox_PO(){
        super();
    }
    public void navigate_To_WebDriver_CheckBoxPage(){
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+"/Dropdown-Checkboxes-RadioButtons/index.html");
    }
    public void clickOnCheckBox(){
        waitForWebElementAndClick(checkBox);
    }
    public void check_all_checkbox_elements(){
        waitFor(allCheckBoxes);
    }
}
