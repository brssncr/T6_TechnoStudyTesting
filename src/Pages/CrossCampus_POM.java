package Pages;

import Utility.BaseDriverParameter;
import org.openqa.selenium.support.PageFactory;

public class CrossCampus_POM extends BaseDriverParameter {
    public CrossCampus_POM() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

}
