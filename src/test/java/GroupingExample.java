import org.testng.annotations.Test;

public class GroupingExample {

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test(groups = "sanity")
    public void test2(){
        System.out.println("test2: sanity");
    }

    @Test(groups = "regression")
    public void test3(){
        System.out.println("test3: regression");
    }

    @Test(groups = "regression")
    public void test4(){
        System.out.println("test4: regression");
    }

    @Test(groups = {"sanity", "regression"})
    public void test5(){
        System.out.println("test5: sanity, regression");
    }
}
