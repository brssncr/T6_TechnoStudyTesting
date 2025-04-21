import Pages.CourseDetails_POM;
import Utility.BaseDriverParameter;
import Utility.ReUsableMethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NavigationThroughCourseDetails extends BaseDriverParameter {
    ReUsableMethods usableMethods=new ReUsableMethods();

    @Test(priority = 1,groups = {"Regression"},dataProvider = "buttonsToClick")
    @Parameters("BrowserType")
    public void courseDetails(WebElement buttons,String urlPart,boolean status){
        CourseDetails_POM courseDetails=new CourseDetails_POM();
        driver.get("https://techno.study/");
        usableMethods.throughLearnMoreButtons(buttons,courseDetails.technoStudyLogo,urlPart);
    }

    @DataProvider
    Object[][] buttonsToClick() {
        CourseDetails_POM courseDetails=new CourseDetails_POM();
        Object[][] buttons = {
                {courseDetails.sdetButton,"sdet-bootcamp",true},
                {courseDetails.androidBootcampButton,"android-bootcamp",true},
                {courseDetails.dataScienceButton,"data-science-bootcamps",true}
        };
        return buttons;
    }
}