package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.AddToCartPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class AddToCartSteps extends ReusableMethods {

    HomePage hp=new HomePage();
    AddToCartPage atcp=new AddToCartPage();

    @Given("Navigate to the website")
    public void navigate_to_the_website() {
        driver.get(ConfigReader.getProperty("url"));
    }

    @When("Click add to cart for the demo e book option")
    public void click_add_to_cart_for_the_demo_e_book_option() {
        hp.myClick(hp.demoEBook.get(1));
    }

    @When("Verify that e book successfully added to cart")
    public void verify_that_e_book_successfully_added_to_cart() {
        wait.until(ExpectedConditions.visibilityOf(atcp.cartProductText));
        verifyContainsText(atcp.cartProductText, "Demo");
    }

    @When("Click on the add promo code button")
    public void click_on_the_add_promo_code_button() {
    }

    @When("Enter an invalid \\(random) promo code into the specified field.")
    public void enterAnInvalidRandomPromoCodeIntoTheSpecifiedField() {
    }

    @When("Click on the Apply button.")
    public void click_on_the_apply_button() {

    }

    @Then("Verify that the invalid promo code warning message is displayed.")
    public void verifyThatTheInvalidPromoCodeWarningMessageIsDisplayed() {
    }
}
