package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class ContactPage extends ReusableMethods {
    public ContactPage(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//p[text()='Contact ']")
    public WebElement contactText;

    @FindBy(xpath = "//input[@name='sender_name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@name='sender_email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='sender_subject']")
    public WebElement subjectInput;

    @FindBy(xpath = "//textarea[@name='sender_message']")
    public WebElement messageInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendMessageBtn;
}
