package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CategoiresPage;
import utils.DriverManager;

public class CategoriesPageSteps {
CategoiresPage categoiresPage = new CategoiresPage(DriverManager.getDriver());
    @When("taps {string} at Categories Page")
    public void tapsAtCategoriesPage(String tab) {
        categoiresPage.clickTab(tab);
    }


    @When("cancel the search with photo")
    public void cancelTheSearchWithPhoto() {
        categoiresPage.clickCancel();
    }
}
