package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumProg_02 {

    @Test
    public void test_Selenium01() {

        // start and stop itself.
        //  If it was a Selenium 3, then we have to do this.

        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");




        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        // You need to setup the Driver(browser)

    }
}