package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closevquit {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
