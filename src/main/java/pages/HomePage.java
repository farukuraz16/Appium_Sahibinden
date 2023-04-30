package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {

    ElementHelper elementHelper;

    By loginLogo = By.id("com.sahibinden:id/action_account");
    By tabs = By.id("com.sahibinden:id/main_page_category_name");
    By allowButton = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By acilAcil = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.ImageView");


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
        //elementHelper.click(tabs);
        //elementHelper.scrollDown();
        elementHelper.clickElementWithText(tabs, tab);
       //elementHelper.click(acilAcil);

    }
}
