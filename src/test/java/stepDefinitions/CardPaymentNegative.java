package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.PayWithCartPage;
import utils.ReusableMethods;

public class CardPaymentNegative extends ReusableMethods {
    PayWithCartPage pwcp = new PayWithCartPage();
    String email = "testuser@mail.com";
    String nameOnCard = "test user";
    String cardNo = "1111111111111111";

    @Then("Fill in the billing details")
    public void fill_in_the_billing_details() {
        mySendKeys(pwcp.emailInput, email);
        mySendKeys(pwcp.emailVerifyInput, email);
        mySendKeys(pwcp.nameOnCardInput, nameOnCard);
    }

    @Then("Fill in the card number")
    public void fillInTheCardNumber() {
        WebElement cardInputs = wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//*[@id='Stripe-Element']/div/iframe")));
        driver.switchTo().frame(cardInputs);
        mySendKeys(pwcp.cardNoInput, cardNo);
    }


    @Then("Verify invalid card number error")
    public void verifyInvalidCardNumberError() {
        driver.switchTo().parentFrame();
        myClick(pwcp.payBtn);
        verifyContainsText(pwcp.invalidCardError, "invalid");
    }
}
