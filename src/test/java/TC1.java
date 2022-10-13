import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    void afterClass(){
        System.out.println("afterClass");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("afterMethod");
    }

    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    void afterTest(){
        System.out.println("afterTest");
    }


}
