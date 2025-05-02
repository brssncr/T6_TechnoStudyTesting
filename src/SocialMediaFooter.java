import pages.Footer_POM;
import Utility.BaseDriverParameter;
import Utility.MyFunc;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFooter extends BaseDriverParameter {

    @Test
    public void socialMediaIconsTest() {
        driver.get("https://techno.study/");

        Footer_POM footer = new Footer_POM(driver);

        MyFunc.wait(2);

        List<WebElement> icons = footer.socialMediaIcons;
        Assert.assertFalse(icons.isEmpty(), "Sosyal medya ikonları bulunamadı!");

        for (WebElement icon : icons) {
            wait.until(ExpectedConditions.visibilityOf(icon));
            Assert.assertTrue(icon.isDisplayed(), "Sosyal medya ikonu görünmüyor: " + icon.getAttribute("href"));

            String originalTab = driver.getWindowHandle();
            icon.click();

            wait.until(driver -> driver.getWindowHandles().size() > 1);
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            tabs.remove(originalTab);

            Assert.assertTrue(tabs.size() > 0, "Yeni sekme açılmadı!");
            driver.switchTo().window(tabs.get(0));

            wait.until(driver -> !driver.getCurrentUrl().equals("about:blank"));
            String currentUrl = driver.getCurrentUrl().toLowerCase();

            Assert.assertTrue(currentUrl.contains("facebook") ||
                            currentUrl.contains("instagram") ||
                            currentUrl.contains("youtube") ||
                            currentUrl.contains("linkedin"),
                    "Sosyal medya URL'si beklenenden farklı: " + currentUrl);

            driver.close();
            driver.switchTo().window(originalTab);
            MyFunc.wait(1);
        }
    }
}
