package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AddToCartPage;
import pages.HomePage;
import pages.PayWithCartPage;
import utils.ReusableMethods;

public class FaultyPaymentSteps extends ReusableMethods {

    HomePage hp=new HomePage();
    AddToCartPage adcp=new AddToCartPage();
    PayWithCartPage pwcp=new PayWithCartPage();

    @When("Click the “Pay with Debit Card” option on the cart page")
    public void click_the_pay_with_debit_card_option_on_the_cart_page() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']")));
        WebElement iframeYourCart = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframeYourCart);
        myClick(adcp.payWithCartOpt);
    }

    @When("Click the “Pay” button to complete the payment process")
    public void click_the_pay_button_to_complete_the_payment_process() {
        myClick(pwcp.payBtn);
    }

    @Then("Verify “Invalid Email” and “Invalid Billing Name” errors")
    public void verifyInvalidEmailAndInvalidBillingNameErrors() {
        verifyContainsText(pwcp.invalidErrors, "Invalid");
    }
}
