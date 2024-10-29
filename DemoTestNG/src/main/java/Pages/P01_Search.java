package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import static Utilities.Utility.*;

public class P01_Search {

    WebDriver driver;

    public P01_Search(WebDriver driver)
    {
        this.driver=driver;
    }

    //locate search field element
    final By search_txt_field=By.id("APjFqb");


    public void convert_loc_to_webelement()
    {
        findWebElement(driver,search_txt_field);
    }

    public void enterdatatosearch(String name)
    {
        sendData(driver,search_txt_field,name);
    }

    public void clciksearchfield()
    {
        clicking(driver,search_txt_field);
    }

   public WebElement clear_search_ele()
   {
       WebElement search=driver.findElement(search_txt_field);
       search.clear();
       return search;
   }
}
