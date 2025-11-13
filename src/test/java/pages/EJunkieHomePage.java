package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class EJunkieHomePage extends ReusableMethods {
    public EJunkieHomePage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//a[@class='blue_btn']")
    public WebElement howItWorksBtn;
}
