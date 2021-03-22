import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {
    private String myUrl = "http://www.leafground.com/pages/Button.html";

    @Test (enabled = true)
    public void goHomeTest(){
        page.open(myUrl);
        page.buttonsPage().goHome();

        Assert.assertEquals(page.getTitle(),
                "TestLeaf - Selenium Playground");
    }

    @Test (enabled = true)
    public void getPositionTest(){
        page.open(myUrl);
        page.buttonsPage().getButtonPosition();
    }

    @Test(enabled = true)
    public void getButtonColorTest(){
        page.open(myUrl);
        page.buttonsPage().getColor();
    }

    @Test
    public void getButtonSizeTest(){
        page.open(myUrl);
        page.buttonsPage().getSize();
    }

}
