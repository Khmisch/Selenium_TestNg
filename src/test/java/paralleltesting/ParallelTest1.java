package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest1 {
    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/User/IdeaProject/Selenium_TestNg/recources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");
        Thread.sleep(3000);
    }

    @Test
    void homePageTitle() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/User/IdeaProject/Selenium_TestNg/recources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");


        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title, "Title is not matched");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
