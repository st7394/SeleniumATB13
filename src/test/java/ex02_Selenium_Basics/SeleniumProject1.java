package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProject1
{

        @Test
        public void test_verify_katalon()
         {

            WebDriver driver = new ChromeDriver();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
            System.out.println(driver.getPageSource());
            if(driver.getPageSource().contains("CURA")){
                System.out.println("Test Case Passed");
                Assert.assertTrue(true);
            }
            else{
                System.out.println("Test Case Failed");
                Assert.fail();
            }

            driver.quit();
        }
}

