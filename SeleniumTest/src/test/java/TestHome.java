import org.testng.annotations.*;

public class TestHome {

    @BeforeClass
    public void beforeClass (){
        System.out.println("Before class");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before suit");
    }

    @BeforeSuite
    public void beforeTest(){
        System.out.println("Before test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }

    @Test
    public void sayHiTest(){
        System.out.println("Hi!");
    }

    @AfterTest
    public void afterTest (){
        System.out.println("After test");
    }

    @AfterMethod
    public void afterMethodTest (){
        System.out.println("After method");
    }

    @AfterMethod
    public void afterGroupTest (){
        System.out.println("After group");
    }

    @AfterClass
    public static void afterClassTest(){
        System.out.println("After class");
    }

}
