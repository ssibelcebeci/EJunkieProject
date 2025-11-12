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

    @FindBy(xpath = "//div[1]/p[1]/input")
    public WebElement emailInput;

    @FindBy(xpath = "//div[1]/p[2]/input")
    public WebElement emailVerifyInput;

    @FindBy(xpath = "//div[1]/p[3]/input")
    public WebElement nameOnCardInput;

    @FindBy(xpath = "//div/span/input")
    public WebElement cardNoInput;

    @FindBy(xpath = "//div[@id='SnackBar']/span")
    public WebElement invalidCardError;

    @FindBy(xpath = "//span[1]/span/span/input")
    public WebElement cardExpDateInput;

    @FindBy(xpath = "//span[2]/span/span/input")
    public WebElement cardCVVInput;

    @FindBy(css = "div[role='checkbox']")
    public WebElement checkBoxBtn;
}
