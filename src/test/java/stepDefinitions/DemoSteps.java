package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class DemoSteps extends ReusableMethods {
DemoPage dp;
HomePage hp;
@Given("Navigate to the demopage")
    public void Navigate_to_the_demopage(){
dp=new DemoPage();
hp=new HomePage();
    driver.get(ConfigReader.getProperty("url"));
}
@When("E-commerce link visible")
    public void eCommerceLinkVisible() {
verifyContainsText(dp.eCommerceLinkText, "E-commerce by E-junkie");
    }
    @When("Click e-commerce link")
    public void clickECommerceLink() {
myClick(dp.eCommerceLinkText);
}
@Then("Verify home page opened")
    public void verifyHomePageOpened() {
verifyContainsText(hp.eJunkieLinkText, "EJUNKIE");
    }
}
