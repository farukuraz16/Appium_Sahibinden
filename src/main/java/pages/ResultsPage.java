package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ResultsPage {

    ElementHelper elementHelper;

    By shareIcon = By.id("com.sahibinden:id/action_share");
    By searchImage = By.id("com.sahibinden:id/showcase");
    By locationContinue = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]");


    public ResultsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }



    public void checkShareIcon(){
        elementHelper.click(searchImage);
        elementHelper.click(locationContinue);
        elementHelper.checkElement(shareIcon);
    }


}
