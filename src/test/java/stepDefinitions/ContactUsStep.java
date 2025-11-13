package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import pages.ContactPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class ContactUsStep extends ReusableMethods {

    HomePage hp = new HomePage();
    ContactPage cp = new ContactPage();

    @Given("Navigate to the Homepage")
    public void navigate_to_the_homepage() {
      driver.get(ConfigReader.getProperty("url"));
    }
    @Then("Click on the Contact Us button")
    public void click_on_the_contact_us_button() {
       myClick(hp.contactUsBtn);
    }
    @Then("Verify Contact text")
    public void verify_contact_text() {
        verifyContainsText(cp.contactText, "Contact ");
    }
    @Then("Enter name {string}")
    public void enterName(String name) {
        mySendKeys(cp.nameInput, name);
    }
    @Then("Enter email {string}")
    public void enterEmail(String email) {
        mySendKeys(cp.emailInput, email);
    }
    @Then("Enter subject {string}")
    public void enterSubject(String subject) {
        mySendKeys(cp.subjectInput, subject);
    }
    @Then("Enter message {string}")
    public void enterMessage(String message) {
        mySendKeys(cp.messageInput, message);
    }
    @Then("Click on the Send Message Button")
    public void click_on_the_send_message_button() {
        myClick(cp.sendMessageBtn);
    }
    @Then("Click on the Alert Button")
    public void click_on_the_alert_button() {
        threadWait(2);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
