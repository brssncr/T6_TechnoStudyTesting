package xml;

import utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Booking extends BaseDriverParameter {

    @Test()
    @Parameters("Browser Type")
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

        WebElement arrowElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='t-input-phonemask__select-flag']")));
        actions.moveToElement(arrowElement).click().perform();

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");

        WebElement andorraOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='t-input-phonemask__options-item' and @data-phonemask-country-code='ad']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", andorraOption);
        wait.until(ExpectedConditions.elementToBeClickable(andorraOption));
        actions.moveToElement(andorraOption).click().perform();

        WebElement phoneNumber =driver.findElement(By.xpath("//input[@id='input_1661174990146']"));
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumber));
        phoneNumber.sendKeys("999999");

        WebElement chooseCountryDropdown = driver.findElement(By.xpath("//select[@name='country']"));
        wait.until(ExpectedConditions.elementToBeClickable(chooseCountryDropdown));
        chooseCountryDropdown.click();

        WebElement countryOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='Andorra']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", countryOption);
        wait.until(ExpectedConditions.elementToBeClickable(countryOption)).click();

        WebElement course = driver.findElement(By.xpath("//select[@name='course']"));
        wait.until(ExpectedConditions.elementToBeClickable(course));
        course.click();

        WebElement sdetOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='SDET']")));
        wait.until(ExpectedConditions.elementToBeClickable(sdetOption));
        sdetOption.click();

        WebElement checkBox = driver.findElement(By.xpath("//label[contains(@class,'checkbox__control')]"));
        wait.until(ExpectedConditions.elementToBeClickable(checkBox));
        checkBox.click();

        WebElement bookCallBtn = driver.findElement(By.xpath("//button[text()='Book a Call']"));
        wait.until(ExpectedConditions.elementToBeClickable(bookCallBtn));
        bookCallBtn.click();
    }
}







