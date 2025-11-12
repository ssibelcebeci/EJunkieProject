package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.PayWithCartPage;
import pages.SuccessPayPage;
import utils.ReusableMethods;

public class CardPayment extends ReusableMethods {
    PayWithCartPage pwcp = new PayWithCartPage();
    SuccessPayPage spp = new SuccessPayPage();
    String cardNo = "4242424242424242";
    String cardExp = "1226";
    String cardCVV = "000";
    WebElement cardInputs;
    WebElement capthcaBox;

    @Then("Fill valid card details")
    public void fill_valid_card_details() {
        cardInputs = wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//*[@id='Stripe-Element']/div/iframe")));
        driver.switchTo().frame(cardInputs);
        mySendKeys(pwcp.cardNoInput, cardNo);
        mySendKeys(pwcp.cardExpDateInput,cardExp);
        mySendKeys(pwcp.cardCVVInput,cardCVV);
        driver.switchTo().parentFrame();

        capthcaBox = wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//*[@id='h-captcha-ele']/iframe")));
        driver.switchTo().frame(capthcaBox);
        myClick(pwcp.checkBoxBtn);

        threadWait(8);
        driver.switchTo().parentFrame();
    }

    @When("CLick pay button")
    public void clickPayButton() {
        myClick(pwcp.payBtn);
    }

    @Then("Verify successful payment text")
    public void verify_successful_payment_text() {
        threadWait(5);
        verifyContainsText(spp.orderConfirmedText, "order");
    }
}
