package Utility;

import Pages.CourseDetails_POM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ReUsableMethods extends BaseDriverParameter{
    CourseDetails_POM courseDetails = new CourseDetails_POM();

    public void throughLearnMoreButtons(WebElement element,WebElement logoElement){
        action.scrollToElement(element).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        wait.until(ExpectedConditions.visibilityOf(logoElement));
        Assert.assertTrue(logoElement.isDisplayed(),"Logo Bulundu");
        logoElement.click();
    }
}
