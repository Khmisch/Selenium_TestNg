import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    public void loginApplication(){
        System.out.println("loginApplication");
    }

    @Test(priority = 2)
    public void selectItems(){
        System.out.println("selectItems");
    }

    @Test(priority = 3)
    public void checkout(){
        System.out.println("selectItems");
    }
}
