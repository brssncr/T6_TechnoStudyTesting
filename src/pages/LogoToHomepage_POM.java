package pages;

import utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoToHomepage_POM extends BaseDriverParameter {
    public LogoToHomepage_POM(){
        PageFactory.initElements(BaseDriverParameter.driver,this);
    }
    @FindBy(xpath = "//a[@class='t-menu__link-item t966__tm-link']")
    public WebElement programs;

    @FindBy(xpath = "(//*[text()='Artificial Intelligence'])[1]")
    public WebElement artificial;

    @FindBy(xpath = "//a[@class='t228__imgwrapper']/img")
    public WebElement homepageButton;

}