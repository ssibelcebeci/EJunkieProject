package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.SuccessPayPage;
import utils.ReusableMethods;

public class DownloadInvoiceSteps extends ReusableMethods {
    SuccessPayPage spp = new SuccessPayPage();

    @Given("User clicks on download button")
    public void userClicksOnDownloadButton() {
        myClick(spp.downloadBtn);
    }
}
