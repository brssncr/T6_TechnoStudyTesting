import Utility.BaseDriverParameter;
import Utility.MyFunc;
import Utility.ReUsableMethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BlogPages extends BaseDriverParameter {
    ReUsableMethods reusable = new ReUsableMethods();

    @Test(priority = 1, groups = {"Regression"})
    @Parameters("BrowserType")
    public void blogTest(WebElement blogMenu, WebElement blogItem, String expectedUrlPart) {
        driver.get("https://techno.study/");
        MyFunc.wait(2);

        blogMenu.click();
        MyFunc.wait(2);
    }
}
