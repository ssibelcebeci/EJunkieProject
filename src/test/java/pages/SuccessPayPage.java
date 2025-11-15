package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class SuccessPayPage extends ReusableMethods {
    public SuccessPayPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(css = "//div[2]/div/div/p/span")
    public WebElement orderConfirmedText;

    @FindBy(xpath = "//div[2]/div/div/p/span")
    public WebElement downloadBtn;
}
