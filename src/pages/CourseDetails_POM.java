package pages;

import utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDetails_POM extends BaseDriverParameter {
    public CourseDetails_POM() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(xpath = "//a[contains(@href,'data-science')][normalize-space()='Learn more']")
    public WebElement dataScienceButton;

    @FindBy(xpath = "//a[contains(@href,'android')][normalize-space()='Learn more']")
    public WebElement androidBootcampButton;

    @FindBy(xpath = "//a[contains(@href,'sdet-bootcamp')][normalize-space()='Learn more']")
    public WebElement sdetButton;

    @FindBy(css = "img[alt='TechnoStudy']")
    public WebElement technoStudyLogo;
}