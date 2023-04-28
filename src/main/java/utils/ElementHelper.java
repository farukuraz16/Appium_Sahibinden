package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ElementHelper {

    private WebDriver driver;
    private WebDriverWait wait;


    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void yazdir(By element) {
        List<WebElement> elements = driver.findElements(element);
        for (WebElement elem : elements) {
            System.out.println(elem.getText());

        }
    }

    public WebElement findElement(By locator) {
      return  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
public List<WebElement> findElements(By locator) {
      return  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public void checkElement(By locator) {
        findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public String getText(By locator) {
        System.out.println("findElement().getText() = " + findElement(locator).getText());
        return findElement(locator).getText();
    }

    public void clickListElement(By locator, String text) {
        boolean check = false;
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        for (WebElement element : elements) {
            if (element.getAttribute("value").contains(text)) {
                element.click();
                check = true;
                break;
            }
        }
        Assert.assertTrue(check);
    }

    public void sendKeys(By locator, String text) {
        findElement(locator).sendKeys(text);
    }


    public void scroll(By locator, String text) {
/* cüneyt
 public void scroll(By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        RemoteWebElement element =(RemoteWebElement)driver.findElement(locator);
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        scrollObject.put("element", element.getId());
        js.executeScript("mobile: scroll", scrollObject);
    }
 */

        /* fatih
        while (true) {
            if (driver.findElements(vercitasLocate).size() > 0) {
                driver.findElement(vercitasLocate).click();
                break;
            } else {
                Dimension size = driver.manage().window().getSize();
                int startX = size.getWidth() / 2;
                int startY = size.getHeight() / 2;
                int endY = (int) (startY * 0.2); // Kaydırma işlemi sonrası 20% kadar yukarıya kaydır
                Duration duration = Duration.ofMillis(500); // Kaydırma süresi (ms)
                TouchAction action = new TouchAction(driver);
                action.press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(duration))
                        .moveTo(PointOption.point(startX, endY))
                        .release()
                        .perform();
                // Beklemek için biraz zaman tanı
                Thread.sleep(2000);
            }
         */
    }

    public void clickElementWithText(By locator, String text){
        boolean check = false;
        List<WebElement> elementList = findElements(locator);
        for (WebElement elem:elementList) {
            if (elem.getText().equals(text)){
                check = true;
                elem.click();
                break;
            }
        }

        Assert.assertTrue(check,"listede element yok!");
    }
}
