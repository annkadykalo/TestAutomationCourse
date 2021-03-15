import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
* Create Test Class with 2 parameterized test methods: (TestWithParameters)
* parameters from testng.xml
* parameters from DataProvider
*/
public class TestWithParameters {

    @Test(dataProvider = "getNames")
    public void validateUsernameTest(String s){
        System.out.println("Data provider: " + s);
    }

    @DataProvider
    public Object[] getNames(){
        return new Object[] {
            "valid name",
            "inv@lid n@me"
        };
    }
}

