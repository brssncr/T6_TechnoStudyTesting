import utility.BaseDriverParameter;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utility.ConfigReader;

public class BlogPages extends BaseDriverParameter {
    @Test
    public void blogTest() {
        driver.get(ConfigReader.getProperty("URL"));
        wait.until(ExpectedConditions.urlToBe(ConfigReader.getProperty("URL")));

        WebElement codingLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Coding']")));
        codingLink.click();

        WebElement articleLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(text(),'How to Become a Coder')]")));
        articleLink.click();

        WebElement articleTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h1[contains(.,'How to Become a Coder')]")));

        Assert.assertTrue(articleTitle.getText().contains("How to Become a Coder"),
                "Makale başlığı beklenen ifadeyi içermiyor!");
    }
}