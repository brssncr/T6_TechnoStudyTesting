package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ReUsableMethods extends BaseDriverParameter {

    public void throughLearnMoreButtons(WebElement element, WebElement logoElement,String urlPart) {
        action.scrollToElement(element).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        wait.until(ExpectedConditions.urlContains(urlPart));
        Assert.assertTrue(driver.getCurrentUrl().contains(urlPart),"Sayfaya geçiş yapılamadı.");

        wait.until(ExpectedConditions.visibilityOf(logoElement));
        Assert.assertTrue(logoElement.isDisplayed(), "Logo Bulundu");
        wait.until(ExpectedConditions.elementToBeClickable(logoElement));
        logoElement.click();
    }
}