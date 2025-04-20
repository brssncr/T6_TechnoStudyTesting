package Utility;

import Pages.CourseDetails_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReUsableMethods extends BaseDriverParameter{
    CourseDetails_POM courseDetails = new CourseDetails_POM();

    public void throughLearnMoreButtons(WebElement element,WebElement element2){
        action.scrollToElement(element).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        wait.until(ExpectedConditions.visibilityOf(element2));
        Assert.assertTrue(element2.isDisplayed(),"Logo Bulundu");
        driver.navigate().back();
    }
}
