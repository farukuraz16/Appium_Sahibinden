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
}
