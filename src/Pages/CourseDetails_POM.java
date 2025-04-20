package Pages;

import Utility.BaseDriverParameter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDetails_POM extends BaseDriverParameter {
    public CourseDetails_POM() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

}
