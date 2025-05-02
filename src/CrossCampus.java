import Pages.CrossCampus_POM;
import Utility.BaseDriverParameter;
import Utility.ReUsableMethods;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossCampus extends BaseDriverParameter {
    @Test
    public void crossCampus() {
        CrossCampus_POM crossCampus = new CrossCampus_POM();

        driver.get("https://techno.study/");
        wait.until(ExpectedConditions.elementToBeClickable(crossCampus.signInButton));
        crossCampus.signInButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("campus"), "URL 'dashboard' içermiyor!");
        wait.until(ExpectedConditions.visibilityOf(crossCampus.loginPanel));
        Assert.assertTrue(crossCampus.loginPanel.isDisplayed(),"Login paneli görünmüyor.");




    }
}
