package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;

    @Test
    void loginTest() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/User/IdeaProject/Selenium_TestNg/recources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        Assert.assertEquals("OrangeHRM", driver.getTitle(), "Title is not matched");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
