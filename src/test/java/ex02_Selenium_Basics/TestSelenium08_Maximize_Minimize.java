package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium08_Maximize_Minimize {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();
        driver.quit();
    }
}
