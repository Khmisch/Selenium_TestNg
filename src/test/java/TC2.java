import org.testng.annotations.*;

public class TC2 {

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
    void test3(){
        System.out.println("test3");
    }

    @Test
    void test4(){
        System.out.println("test4");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("afterSuite");
    }


}
