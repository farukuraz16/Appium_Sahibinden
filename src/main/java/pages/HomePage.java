package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {

    ElementHelper elementHelper;

    By loginLogo = By.id("com.sahibinden:id/action_account");
    By tabs = By.id("com.sahibinden:id/main_page_category_name");
    By allowButton = By.id("com.android.permissioncontroller:id/permission_allow_button");


    public HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickAllow(){
        elementHelper.click(allowButton);
    }
    public void checkLoginLogo(){
        elementHelper.checkElement(loginLogo);
    }

    public void clickTab (String tab){
        elementHelper.clickElementWithText(tabs, tab);
    }
}
