package pages;

import utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrossCampus_POM extends BaseDriverParameter {
    public CrossCampus_POM() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(xpath = "//a[text()='SIGN IN']")
    public WebElement signInButton;

    @FindBy(css = "div[id='login']")
    public WebElement loginPanel;


}
