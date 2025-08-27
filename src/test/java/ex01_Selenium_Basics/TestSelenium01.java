package ex01_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
    
    @Test
    public void testSelenium02(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

    }
}

