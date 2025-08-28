package ex02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProject2 {

    @Test
    public void test_vmo_invalid_login(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        //WebElement email_box = driver.findElement(By.id("login-username");
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("admin");
        WebElement email_name = driver.findElement(By.name("password"));
        email_name.sendKeys("12345");
        //driver.quit();

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
        driver.quit();



    }
}
