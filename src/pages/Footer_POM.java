package pages;

import utility.BaseDriverParameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Footer_POM extends BaseDriverParameter {

    public Footer_POM(WebDriver driver) {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(css = "footer a[aria-label]")
    public List<WebElement> socialMediaIcons;
}
