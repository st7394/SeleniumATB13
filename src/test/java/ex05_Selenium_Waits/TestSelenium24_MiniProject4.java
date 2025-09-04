package ex05_Selenium_Waits;

import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import com.thetestingacademy.utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium24_MiniProject4 extends CommonToAll {

    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        new WaitHelpers().waitForVisibility(driver,5,"//span[@data-cy=\"closeModal\"]");

        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModel.click();


        closeBrowser(driver);




    }
}
