package ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProjectHW {


    @Test
    public void testhyperlink(){

        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement hlink = driver.findElement(By.linkText("Start a free trial"));
        hlink.click();
        WebElement bemail = driver.findElement(By.id("page-v1-step1-email"));
        bemail.sendKeys("admin");
        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }


        WebElement error_mssg = driver.findElement(By.xpath("//*[@id=\"page-free-trial-signup-form-step1\"]/div[1]/div"));
        System.out.println(error_mssg.getText());
        Assert.assertEquals(error_mssg.getText(),"The email address you entered is incorrect.");
        driver.quit();


    }
}
