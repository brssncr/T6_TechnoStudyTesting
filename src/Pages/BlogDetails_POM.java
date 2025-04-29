package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogDetails_POM {
    WebDriver driver;

    public BlogDetails_POM(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement blogsMenu() {
        return driver.findElement(By.xpath("//a[contains(text(),'Blog')]"));
    }

    public WebElement blogArticle(int index) {
        return driver.findElement(By.xpath("(//h2//a)[" + index + "]"));
    }

    public WebElement blogHeaderTitle() {
        return driver.findElement(By.tagName("h1"));
    }
}
