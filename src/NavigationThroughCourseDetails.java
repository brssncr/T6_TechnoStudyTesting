import Utility.BaseDriverParameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NavigationThroughCourseDetails extends BaseDriverParameter {
    @Test(priority = 1)
    @Parameters("BrowserType")
    public void courseDetails(){
        driver.get("https://techno.study/");
    }
}
