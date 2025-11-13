package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class HomePage extends ReusableMethods {
    public HomePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
    @FindBy(linkText = "wiki/user/themes/Wiki/images/logo.svg?12")
    public WebElement eJunkieLinkText;

    @FindBy(linkText = "//a[@onclick='toggleYoutubeModal(true)']")
    public WebElement seeHowItWorksBtn;

    @FindBy(linkText = "https://www.youtube.com/embed/kODFTdj9Ifc")
    public WebElement iFrameYouTube;

    @FindBy(xpath= "//button[@class='modal-close is-large']")
    public WebElement windowCloseBtn;

    @FindBy(xpath = "//button[@class='view_product']")
    public List<WebElement> demoEBook;

    @FindBy(xpath = "//a[@class='contact']")
    public WebElement contactUsBtn;
}
