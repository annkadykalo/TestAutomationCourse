import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/*
Create Test Class with several test groups: (GroupsDependencies)
group dependency
group-specific setup/teardown methods
exclude one from test execution
*/

public class GroupsDependencies {

    @BeforeGroups (groups = "Fruits")
    public void beforeFruits(){
        System.out.println("Wash the fruit before eating");
    }

    @BeforeGroups (groups = "Birds")
    public void beforeBirds(){
        System.out.println("Lock down the cat before playing with a bird");
    }

    @Test(groups = {"Fruits"})
    public void appleTest (){
        System.out.println("I am apple");
    }

    @Test(groups = {"Fruits", "Birds"})
    public void kiwiTest (){
        System.out.println("I am kiwi");
    }

    @Test(groups = {"Birds"}, dependsOnGroups = {"Fruits"})
    public void penguinTest (){
        System.out.println("I am penguin");
    }

    @Test(groups = {"Birds"}, enabled = false)
    public void swanTest (){
        System.out.println("I am swan");
    }

    @AfterGroups(groups = "Fruits")
    public void afterFruits(){
        System.out.println("Plant a seed after eating fruits");
    }

    @AfterGroups (groups = "Birds")
    public void afterBirds(){
        System.out.println("Release the cat after playing with a bird");
    }
}
