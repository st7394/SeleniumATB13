package ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium13_Nohttp {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("bing.com"); // HTTPs is important.
        driver.get("https://bing.com"); // HTTPs is important.
        driver.quit();
    }
}
