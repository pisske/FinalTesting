package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;
import org.testng.Assert;

public class Contact_PO extends Base_PO {
    private @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstName_Text;
    private @FindBy(xpath = "//input[@name=\"last_name\"]")

    WebElement lastName_Text;
    private @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement email_Address;
    private @FindBy(xpath = "//textarea[@name=\"message\"]")
    WebElement specific_Comment;
    private @FindBy(xpath = "//input[@value=\"SUBMIT\"]")
    WebElement click_on_button;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmission_Message_Text;

    public Contact_PO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_Page() {
        navigateTo_Url(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }

    public void setUnique_FirstName() {
        sendKeys(firstName_Text, "AutoFN" + generateRandomNumber(5));
    }

    public void setUnique_LastName() {
        sendKeys(lastName_Text, "AutoLN" + generateRandomNumber(7));
    }

    public void setUnique_Address() {
        sendKeys(email_Address, "AutoEmail" + generateRandomNumber(10) + "@gmail.com");
    }

    public void setUniqueComment() {
        sendKeys(specific_Comment, "Hello world" + generateRandomString(20));
    }

    public void setSpecific_FirstName(String firstName) {

        sendKeys(firstName_Text, firstName);
    }

    public void setSpecific_LastName(String lastName) {
        sendKeys(lastName_Text, lastName);
    }

    public void setSpecific_Email(String email) {
        sendKeys(email_Address, email);
    }

    public void setSpecific_Comment(String string) {
        sendKeys(specific_Comment, string);
    }

    public void clickOn_SubmitButton() {
        waitForWebElementAndClick(click_on_button);
    }

   public void validate_Successful_SubmissionMessage_Text() {
       waitFor(successfulSubmission_Message_Text);
     Assert.assertEquals(successfulSubmission_Message_Text.getText(), "Thank You for your Message!");

  }
}
