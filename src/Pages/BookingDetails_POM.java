package Pages;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingDetails_POM extends BaseDriverParameter {

    public BookingDetails_POM() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(xpath = "//a[@class='tn-atom js-click-zero-stat']")
    public WebElement applyNowButton;

    @FindBy(css ="[aria-label='name']" )
    public WebElement nameButton;

    @FindBy(css = "[aria-label='email']")
    public WebElement emailButton;

    @FindBy(css = ".flag-dropdown.selected-flag")
    public WebElement flagDropdown;

    @FindBy(css = ".PhoneInputInput")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[contains(text(), 'Choose your country')]" )
    public WebElement chooseCountryDropdown;

    @FindBy(xpath = "//div[contains(text(), 'Choose your course')]")
    public WebElement course;

    @FindBy(css = "input[type='checkbox']")
    public WebElement termsCheckbox;

    @FindBy(xpath = "//button[contains(text(), 'Book a Call')]")
    public WebElement bookCallButton;



















}
