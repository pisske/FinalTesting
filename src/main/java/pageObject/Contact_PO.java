package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_PO extends Base_PO{
    private  @FindBy(xpath="//input[@name='first_name']")
    WebElement firstName_Text;
    private @FindBy(xpath="//input[@name=\"last_name\"]")

    WebElement lastName_Text;
    private @FindBy(xpath="//input[@name=\"email\"]")
    WebElement email_Address;
    private @FindBy(xpath="//textarea[@name=\"message\"]")
    WebElement specific_Comment;
    public Contact_PO(){
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_Page(){
        navigateTo_Url("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }
   public void setUnique_FirstName(){
        sendKeys(firstName_Text,"AutoFN"+generateRandomNumber(5));
   }
   public void setUnique_LastName(){
       sendKeys(lastName_Text,"AutoLN"+ generateRandomNumber(7));
   }
   public void setUnique_Address(){
        sendKeys(email_Address, "AutoEmail"+generateRandomNumber(10)+"@gmail.com");
   }
   public void setUniqueComment(){
        sendKeys(specific_Comment,"Hello world"+generateRandomString(20));
   }

}


