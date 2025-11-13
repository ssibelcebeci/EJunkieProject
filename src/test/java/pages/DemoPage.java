package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class DemoPage extends ReusableMethods {
    public DemoPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(linkText = "E-commerce by E-junkie")
    public WebElement eCommerceLinkText;
}
