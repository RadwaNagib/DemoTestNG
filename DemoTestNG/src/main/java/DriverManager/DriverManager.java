package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    static WebDriver driver;

    public static WebDriver getchromdriver()
    {
        driver=new ChromeDriver();
        return driver;
    }

    public static WebDriver getfirefoxDriver()
    {
        driver=new FirefoxDriver();
        return driver;
    }
    public static  void quitmydriver()
    {
        driver.quit();
    }
}
