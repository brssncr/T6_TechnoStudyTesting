package Pages;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogDetails_POM extends BaseDriverParameter {

    public BlogDetails_POM() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(xpath = "//a[text()='Coding']")
    public WebElement codingLink;

    @FindBy(xpath = "//a[contains(text(),'How to Become a Coder')]")
    public WebElement articleLink;

    @FindBy(xpath = "//h1[contains(.,'How to Become a Coder')]")
    public WebElement articleTitle;
}
