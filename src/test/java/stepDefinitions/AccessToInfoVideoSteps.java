package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.ReusableMethods;

public class AccessToInfoVideoSteps extends ReusableMethods {

    @Given("Navigate to the main webpage")
    public void navigate_to_the_main_webpage() {
        driver.get("https://www.e-junkie.com/");
    }

    @When("Click the see how it works button")
    public void click_the_see_how_it_works_button() {
        WebElement howItWorks= driver.findElement(By.xpath("//a[@class='blue_btn']"));
        howItWorks.click();
    }

    @When("Play the information video")
    public void play_the_information_video() {
        Actions actions =new Actions(driver);
        for (int i = 0; i <17 ; i++) {
            actions.sendKeys(Keys.TAB).perform();
        }
        actions.sendKeys(Keys.SPACE).perform();
    }

    @Then("Close the video window")
    public void close_the_video_window() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        threadWait(10);
        js.executeScript("toggleYoutubeModal(false)");
    }
}