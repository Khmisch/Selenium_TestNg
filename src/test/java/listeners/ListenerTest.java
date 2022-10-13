package listeners;

import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.CustomListeners.class)
public class ListenerTest {

    @Test
    public void test1(){
        System.out.println("test1");
        Assert.assertEquals("A", "A");
    }

    @Test
    public void test2(){
        System.out.println("test2");
        Assert.assertEquals("A", "B");

    }

    @Test
    public void test3(){
        System.out.println("test3");
        throw new SkipException("this is skip exception");
    }

}
