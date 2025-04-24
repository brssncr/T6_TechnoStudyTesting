import Pages.LogoToHomepage_POM;
import Utility.BaseDriverParameter;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogoToHomepage extends BaseDriverParameter {
    @Test
    @Parameters("BrowserType")
    public void Test1() {
        LogoToHomepage_POM l = new LogoToHomepage_POM();
        Actions actions = new Actions(driver);
        driver.get("https://techno.study/");
        actions.moveToElement(l.programs).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(l.artificial)).click();
        wait.until(ExpectedConditions.elementToBeClickable(l.homepageButton)).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equals("https://techno.study/"), "The current URL does not match the expected URL");
    }
}
