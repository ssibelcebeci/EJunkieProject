package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class PayWithCartPage extends ReusableMethods {
    public PayWithCartPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//button[@class='Pay-Button']")
    public WebElement payBtn;

    @FindBy(xpath = "//div[@id=\"SnackBar\"]/span")
    public WebElement invalidErrors;
}
