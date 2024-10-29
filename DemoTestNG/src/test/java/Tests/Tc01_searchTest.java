package Tests;
import DriverManager.DriverManager;
import Pages.P01_Search;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static Utilities.Utility.*;
import Listeners.*;

import java.io.IOException;

//using custom listeners class
@Listeners(customListners.class)


public class Tc01_searchTest extends DriverManager  {

    //define driver
    WebDriver driver;

    //An instance of the ExtentReports library, which is used to generate detailed reports of your test execution.
    ExtentReports extent;

    //This represents a single test case in ExtentReports. It allows you to log steps, pass/fail status,
    // and other details related to each test.
    ExtentTest test;

    P01_Search p01Search;

    @BeforeSuite
    public void setup()
    {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }
    @BeforeClass
    public void openBrowser()
    {
        //open driver
        driver= DriverManager.getchromdriver();//Initialize driver
        driver.navigate().to("https://www.google.com/");

        //Initialize P01_search after the web driver is properly initialized
        p01Search=new P01_Search(driver);

        driver.manage().window().maximize();

    }

        //using data from data provider in parallel
        @DataProvider(name = "testData" )
        public Object[][] getData(){
        return new Object[][]{
                {"selenium web driver"},
                {"TextNG"},
                {"Page object module"},
                {"OOP"}
        };
    }

    @Test(dataProvider = "testData")
    public void enterdataonsaerchfield(String name)
    {
        p01Search.enterdatatosearch(name);
        p01Search.clciksearchfield();
        p01Search.clear_search_ele();
        test = extent.createTest("enterdataonsaerchfield", "Sample test");
        test.pass("Test Passed");
    }

    @Test
    public void testMethod2() throws IOException
    {

        System.out.println("Hello test method2");
        test = extent.createTest("testMethod2", "Sample test");
        test.pass("Test Passed");
       // test.addScreenCaptureFromPath("good_job_logo.png","testmethod2image");
    }

    @AfterClass
    public void closebrowser()
    {
        driver.quit();
    }
    @AfterSuite
       public void tearDown()
        {
            //Finalize the Extent report and write it to the file
              extent.flush();
        }

}
