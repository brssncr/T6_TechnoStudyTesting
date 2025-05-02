import Pages.DropdownMenu_POM;
import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownMenuTests extends BaseDriverParameter {

    @Test
    public void herKursSayfasiAciliyorMu() {
        driver.get("https://techno.study");
        DropdownMenu_POM menu = new DropdownMenu_POM(driver);

        // 1) Software Development Engineer in Test
        menu.hoverPrograms();
        wait.until(ExpectedConditions.visibilityOf(menu.sdetLink));
        String href1 = menu.sdetLink.getAttribute("href");
        menu.sdetLink.click();
        wait.until(ExpectedConditions.urlContains(href1));
        Assert.assertTrue(driver.getCurrentUrl().contains(href1),
                "URL beklendiği gibi değil: " + href1);
        menu.logo.click();

        // 2) Data Science Bootcamp
        menu.hoverPrograms();
        wait.until(ExpectedConditions.visibilityOf(menu.dataScienceLink));
        String href2 = menu.dataScienceLink.getAttribute("href");
        menu.dataScienceLink.click();
        wait.until(ExpectedConditions.urlContains(href2));
        Assert.assertTrue(driver.getCurrentUrl().contains(href2),
                "URL beklendiği gibi değil: " + href2);
        menu.logo.click();

        // 3) Artificial Intelligence
        menu.hoverPrograms();
        wait.until(ExpectedConditions.visibilityOf(menu.artificialLink));
        String href3 = menu.artificialLink.getAttribute("href");
        menu.artificialLink.click();
        wait.until(ExpectedConditions.urlContains(href3));
        Assert.assertTrue(driver.getCurrentUrl().contains(href3),
                "URL beklendiği gibi değil: " + href3);
        menu.logo.click();

        // 4) Android Developer Bootcamp
        menu.hoverPrograms();
        wait.until(ExpectedConditions.visibilityOf(menu.androidLink));
        String href4 = menu.androidLink.getAttribute("href");
        menu.androidLink.click();
        wait.until(ExpectedConditions.urlContains(href4));
        Assert.assertTrue(driver.getCurrentUrl().contains(href4),
                "URL beklendiği gibi değil: " + href4);
        menu.logo.click();

        // 5) Master's Program
        menu.hoverPrograms();
        wait.until(ExpectedConditions.visibilityOf(menu.mastersLink));
        String href5 = menu.mastersLink.getAttribute("href");
        menu.mastersLink.click();
        wait.until(ExpectedConditions.urlContains(href5));
        Assert.assertTrue(driver.getCurrentUrl().contains(href5),
                "URL beklendiği gibi değil: " + href5);
    }
}