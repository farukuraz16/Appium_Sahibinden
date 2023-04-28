package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CategoiresPage {

    ElementHelper elementHelper;

    By tabs = By.id("com.sahibinden:id/util_primary_text");

    public CategoiresPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }



    public void clickTab(String tab){

        elementHelper.clickElementWithText(tabs, tab);
    }


}
