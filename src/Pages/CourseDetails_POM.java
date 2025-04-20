package Pages;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDetails_POM extends BaseDriverParameter {
    public CourseDetails_POM() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(css = "a[class='tn-atom'][href='https://techno.study/data-science-bootcamps']")
    public WebElement dataScienceButton;

    @FindBy(css = "a[class='tn-atom'][href='https://techno.study/android-bootcamp']")
    public WebElement androidBootcampButton;

    @FindBy(css = "a[class='tn-atom'][href='https://techno.study/sdet-bootcamp']")
    public WebElement sdetButton;

    @FindBy(css = "img[imgfield='img']")
    public WebElement technoStudyLogo;
}
