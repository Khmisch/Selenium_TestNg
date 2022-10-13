import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    public void startCar(){
        System.out.println("Car start");
//        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    public void driveCar(){
        System.out.println("Car drive");
    }

    @Test(dependsOnMethods = {"driveCar"}, alwaysRun = true)
    public void stopCar(){
        System.out.println("Car stop");
    }

    @Test(dependsOnMethods = {"driveCar", "stopCar"})
    public void parkCar(){
        System.out.println("Car park");
    }
}
