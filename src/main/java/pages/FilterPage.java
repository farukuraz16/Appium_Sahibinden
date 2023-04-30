package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class FilterPage {

    ElementHelper elementHelper;
    By fiyatButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView[1]") ;
    By maxFiyat = By.id("com.sahibinden:id/maxAmountEditText") ;
    By tamamButton = By.id("android:id/button1") ;
    By sonucGoster = By.id("com.sahibinden:id/search_button") ;


    public FilterPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void clickFiyat(){
        elementHelper.click(fiyatButton);
    }

    public void sendMaxFiyat(String max){
        elementHelper.sendKeys(maxFiyat,max);
        elementHelper.click(tamamButton);
    }

    public void sonucGoster(){
        elementHelper.click(sonucGoster);
    }
}
