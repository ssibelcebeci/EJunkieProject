package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

import java.util.List;

public class HomePage extends ReusableMethods {
    public HomePage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//button[@class='view_product']")
    public List<WebElement> demoEBook;

    @FindBy(xpath = "//a[@class='contact']")
    public WebElement contactUsBtn;
}
