package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsUtils {

    //TODO:  Explicit Wait For Clickability
   public static void explicitlyWaitForClickability(WebDriver driver, By locator) {
       new WebDriverWait(driver, Duration.ofSeconds(5))
               .until(ExpectedConditions.elementToBeClickable(locator));
   }

   //TODO:  Explicit Wait For Visibility
    public static void explicitlyWaitForVisibility(WebDriver driver, By locator) {
     new WebDriverWait(driver, Duration.ofSeconds(5))
             .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //TODO: General Explicit Wait
    public static WebDriverWait generalWait(WebDriver driver, int timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }
}
