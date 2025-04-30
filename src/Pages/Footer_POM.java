package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Footer_POM {
    WebDriver driver;

    public Footer_POM(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> socialMediaIcons() {
        WebElement footer = driver.findElement(By.tagName("footer"));
        return footer.findElements(By.cssSelector("a[aria-label]"));
    }
}
