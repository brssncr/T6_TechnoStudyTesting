package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ReusableMethods extends BaseDriverParameter {

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int RandomSayiVer(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static int RandomSayiVer(int max) {
        return (int) (Math.random() * max);
    }
    public static void myClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void mySendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    public void throughLearnMoreButtons(WebElement element, WebElement logoElement, String urlPart) {
        action.scrollToElement(element).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        wait.until(ExpectedConditions.urlContains(urlPart));
        Assert.assertTrue(driver.getCurrentUrl().contains(urlPart), "Sayfaya geçiş yapılamadı.");

        wait.until(ExpectedConditions.visibilityOf(logoElement));
        Assert.assertTrue(logoElement.isDisplayed(), "Logo Bulundu");
        wait.until(ExpectedConditions.elementToBeClickable(logoElement));
        logoElement.click();
    }
}