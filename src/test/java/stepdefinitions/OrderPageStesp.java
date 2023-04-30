package stepdefinitions;

import io.cucumber.java.en.When;
import pages.OrderPage;
import utils.DriverManager;

public class OrderPageStesp {
    OrderPage orderPage = new OrderPage(DriverManager.getDriver());

    @When("taps {string} button at Order Page")
    public void tapsButtonAtOrderPage(String arg0) {
orderPage.sirala();
    }

    @When("selects {string} button at Order Page")
    public void selectsButtonAtOrderPage(String arg0) {
    orderPage.siralaFiyatMax(arg0);
    }
}
