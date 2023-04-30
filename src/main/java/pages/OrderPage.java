package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class OrderPage {

    ElementHelper elementHelper;

    By siralaButton = By.id("com.sahibinden:id/layout_options_menu_view_relative_layout_sort");
    By siralaOptions = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");


    public OrderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void sirala() {
        elementHelper.click(siralaButton);
    }

    public void siralaFiyatMax(String str){
        elementHelper.click(siralaOptions);
    }
}
