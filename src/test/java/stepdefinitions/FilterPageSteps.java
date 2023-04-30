package stepdefinitions;

import io.cucumber.java.en.When;
import pages.FilterPage;
import utils.DriverManager;

public class FilterPageSteps {
    FilterPage filterPage = new FilterPage(DriverManager.getDriver());

    @When("taps {string} at Filter Page")
    public void tapsAtFilterPage(String arg0) {
        filterPage.clickFiyat();
    }

    @When("send keys Max Price {string} at Filter Page")
    public void sendKeysMaxPriceAtFilterPage(String max) {
        filterPage.sendMaxFiyat(max);
    }

    @When("taps {string} button at Filter Page")
    public void tapsButtonAtFilterPage(String arg0) {
        filterPage.sonucGoster();
    }
}
