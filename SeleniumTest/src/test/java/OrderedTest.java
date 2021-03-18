import org.testng.annotations.Test;
/*
* Create class with 3 test methods that are executed
from the bottom to the top of the class
*/
public class OrderedTest {
    @Test(priority = 2)
    public void firstTest (){
        System.out.println("This is first test");
    }
    @Test(priority = 1)
    public void secondTest (){
        System.out.println("This is second test");
    }
    @Test(priority = 0)
    public void thirdTest (){
        System.out.println("This is third test");
    }
}
