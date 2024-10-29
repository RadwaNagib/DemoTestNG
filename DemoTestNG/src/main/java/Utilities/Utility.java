package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static Utilities.WaitsUtils.explicitlyWaitForClickability;
import static Utilities.WaitsUtils.explicitlyWaitForVisibility;

public class Utility {

    //TODO: Clicking on element after checking clickability
    public static void clicking(WebDriver driver, By locator) {
        explicitlyWaitForClickability(driver, locator);
        findWebElement(driver, locator).click();
    }

    //TODO: Send data to element after checking visibility
    public static void sendData(WebDriver driver, By locator, String data) {
        explicitlyWaitForVisibility(driver, locator);
        findWebElement(driver, locator).sendKeys(data);
    }

    //ToDo: Convert Locator to Web Element
    public static WebElement findWebElement(WebDriver driver, By locator)
    {
        return driver.findElement(locator);
    }
}
