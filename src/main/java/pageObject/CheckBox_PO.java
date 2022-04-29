package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class CheckBox_PO extends Base_PO {
    private @FindBy(xpath = "//*[@id=\"checkboxes\"]/label[1]/input")
    WebElement clickCheckBox;
    private @FindBy(xpath = "//*[@id=\"checkboxes\"]/label[1]/input")
    WebElement getClickCheckBox;
    public CheckBox_PO(){
        super();
    }
    public void navigateTo_WebDriverUniversity_DropDown() {
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Dropdown-Checkboxes-RadioButtons/index.html");
    }

    public void clickOnTheCheckBox(){
        waitForWebElementAndClick(clickCheckBox);
    }

    public void checkIfElementChecked(){
        waitForWebElementAndCheck(getClickCheckBox);
    }
}
