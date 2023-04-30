package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class ResultsPage {

    ElementHelper elementHelper;

    By shareIcon = By.id("com.sahibinden:id/action_share");
    By searchImage = By.id("com.sahibinden:id/showcase");
    By locationContinue = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]");
    By filterButton = By.id("com.sahibinden:id/tvFilter") ;
    By maxFiyatAracButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView") ;


    public ResultsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }



    public void checkShareIcon(){
        elementHelper.click(searchImage);
        elementHelper.click(locationContinue);
        elementHelper.checkElement(shareIcon);
    }

    public void clickFilter(){
        elementHelper.click(searchImage);
        elementHelper.click(locationContinue);
        elementHelper.click(filterButton);
    }
    public void checkMaxArac(String max){
      String actual = elementHelper.getText(maxFiyatAracButton);
      Assert.assertEquals(actual,max);
    }
}
