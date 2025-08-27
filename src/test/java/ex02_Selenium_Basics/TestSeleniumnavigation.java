package ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSeleniumnavigation {
    @Description("Open url")
    @Test
    public void Testseleniumone(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        driver.navigate().to("https://www.bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();

    }
}
