import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    public void setup(){
        System.out.println("setup");
    }

    @Test(priority = 2)
    public void searchCustomer(){
        System.out.println("searchCustomer");
        Assert.assertEquals(1, 1);
    }

    @Test(priority = 3)
    public void addCustomer(){
        System.out.println("addCustomer");
    }
}
