package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EJunkieHomePage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class AccessToInfoVideoSteps extends ReusableMethods {

    EJunkieHomePage ejhp=new EJunkieHomePage();

    @Given("Navigate to the main webpage")
    public void navigate_to_the_main_webpage() {
        driver.get(ConfigReader.getProperty("homePageUrl"));
    }

    @When("Click the see how it works button")
    public void click_the_see_how_it_works_button() {
        myClick(ejhp.howItWorksBtn);
    }

    @When("Play the information video")
    public void play_the_information_video() {
        driver.switchTo().frame(0);
        myClick(ejhp.playBtn);
    }

    @Then("Close the video window")
    public void close_the_video_window() {
        threadWait(10);
        driver.switchTo().defaultContent();
        jsClick(ejhp.close);
    }
}