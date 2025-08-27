package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium07_Commands {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
