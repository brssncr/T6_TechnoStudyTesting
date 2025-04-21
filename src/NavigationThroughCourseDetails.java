import Pages.CourseDetails_POM;
import Utility.BaseDriverParameter;
import Utility.ReUsableMethods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NavigationThroughCourseDetails extends BaseDriverParameter {
    ReUsableMethods usableMethods=new ReUsableMethods();

    @Test(priority = 1,groups = {"Regression"})
    @Parameters("BrowserType")
    public void courseDetails(){
        CourseDetails_POM courseDetails=new CourseDetails_POM();
        driver.get("https://techno.study/");
        usableMethods.throughLearnMoreButtons(courseDetails.sdetButton,courseDetails.technoStudyLogo);
        usableMethods.throughLearnMoreButtons(courseDetails.androidBootcampButton, courseDetails.technoStudyLogo);
        usableMethods.throughLearnMoreButtons(courseDetails.dataScienceButton,courseDetails.technoStudyLogo);
    }
}