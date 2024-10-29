package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestNGExtentReportDemo {

//    ExtentReports extent;
//    ExtentTest test;
//    @BeforeSuite
//    public void setup()
//    {
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//        Properties properties = new Properties();
//        try {
//            FileInputStream input = new FileInputStream("env.properties");
//            properties.load(input);
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        // Add environment information to the report
//         extent.setSystemInfo("OS", properties.getProperty("OS"));
//         extent.setSystemInfo("Browser", properties.getProperty("Browser"));
//         extent.setSystemInfo("Browser Version", properties.getProperty("BrowserVersion"));
//         extent.setSystemInfo("Java Version", properties.getProperty("JavaVersion"));
//         extent.setSystemInfo("Tester Name", properties.getProperty("TesterName"));
//         extent.setSystemInfo("Automation Package", properties.getProperty("AutomationPackage"));
         }
//         @Test
//         public void enterdataonsaerchfield()
//         {
//             test = extent.createTest("Tc01_searchTest", "Sample test");
//             test.pass("Test Passed");
//         }
//         @Test
//         public void testMethod2()
//         {
//             test = extent.createTest("Tc01_searchTest", "Sample test");
//             test.fail("Test Failed");
//         }
//         @AfterSuite
//         public void tearDown()
//         {
//             extent.flush();
//         }

//}
