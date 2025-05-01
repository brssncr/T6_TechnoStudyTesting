package XML;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Booking extends BaseDriverParameter {

    @Test()
    public void BookingTest() {
        Actions actions = new Actions(driver);
        driver.get("https://techno.study/");

        WebElement applyNowButton = driver.findElement(By.xpath("//a[@class='tn-atom js-click-zero-stat']"));
        wait.until(ExpectedConditions.visibilityOf(applyNowButton));
        applyNowButton.click();

        WebElement nameButton = driver.findElement(By.cssSelector("[aria-label='name']"));
        wait.until(ExpectedConditions.visibilityOf(nameButton));
        nameButton.sendKeys("test");

        WebElement emailButton = driver.findElement(By.cssSelector("[aria-label='email']"));
        wait.until(ExpectedConditions.visibilityOf(emailButton));
        emailButton.sendKeys("test@gmail.com");

        WebElement flagDropdown = driver.findElement(By.cssSelector(".flag-dropdown.selected-flag"));
        wait.until(ExpectedConditions.visibilityOf(flagDropdown));
        flagDropdown.click();

        WebElement andorraOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-country-code='ad']")));
        actions.moveToElement(andorraOption).click().perform();

        WebElement phoneNumber = driver.findElement(By.cssSelector(".PhoneInputInput"));
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumber));
        phoneNumber.sendKeys("999999");

        WebElement chooseCountryDropdown = driver.findElement(By.xpath("//div[contains(text(), 'Choose your country')]"));
        wait.until(ExpectedConditions.elementToBeClickable(chooseCountryDropdown));
        chooseCountryDropdown.click();

        WebElement countryOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='t-select__option' and text()='Andorra']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", countryOption);
        wait.until(ExpectedConditions.elementToBeClickable(countryOption)).click();

        WebElement course = driver.findElement(By.xpath("//div[contains(text(), 'Choose your course')]"));
        wait.until(ExpectedConditions.elementToBeClickable(course));
        course.click();

        WebElement sdetOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='t-select__option' and text()='SDET']")));
        wait.until(ExpectedConditions.elementToBeClickable(sdetOption));
        sdetOption.click();

        WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        wait.until(ExpectedConditions.elementToBeClickable(checkBox));
        checkBox.click();

        WebElement bookCallBtn = driver.findElement(By.xpath("//button[countains(text),'Book a Call']"));
        wait.until(ExpectedConditions.elementToBeClickable(bookCallBtn));
        bookCallBtn.click();
    }
}







