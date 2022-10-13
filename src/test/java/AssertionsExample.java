import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AssertionsExample {

    WebDriver driver;

    @BeforeClass
    void setUp(){
        System.setProperty("webdriver.chrome.driver","C:/Users/User/IdeaProject/Selenium_TestNg/recources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
    }

    @Test(priority = 2)
    void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title, "Title is not matched");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
