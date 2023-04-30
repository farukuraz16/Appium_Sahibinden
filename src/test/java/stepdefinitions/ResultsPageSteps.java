package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ResultsPage;
import utils.DriverManager;

public class ResultsPageSteps {
    ResultsPage resultsPage = new ResultsPage(DriverManager.getDriver());

    @Then("should see results on Result Page")
    public void shouldSeeResultsOnResultPage() {
        resultsPage.checkShareIcon();
    }

    @When("taps {string} at Result Page")
    public void tapsAtResultPage(String arg0) {
        resultsPage.clickFilter();
    }

    @Then("should see the first car price is lower than or equals with {string} at Result Page")
    public void shouldSeeTheFirstCarPriceIsLowerThanOrEqualsWithAtResultPage(String arg0) {
    resultsPage.checkMaxArac(arg0);
    }
}
