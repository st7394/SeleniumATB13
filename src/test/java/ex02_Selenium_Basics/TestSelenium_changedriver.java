package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium_changedriver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver();
    }
}
