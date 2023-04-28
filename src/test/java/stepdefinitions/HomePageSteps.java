package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverManager;

public class HomePageSteps {

    HomePage homePage = new HomePage(DriverManager.getDriver());
    @Given("user should see the Home Page")
    public void userShouldSeeTheHomePage() {
        homePage.clickAllow();
        homePage.checkLoginLogo();
    }

    @When("taps {string} at Home Page")
    public void tapsAtHomePage(String tab) {

        homePage.clickTab(tab);
    }

}
