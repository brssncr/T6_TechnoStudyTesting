package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DropdownMenu_POM {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    @FindBy(css = "#nav474850393 > div > div.t228__centerside.t228__menualign_left > nav > ul > li:nth-child(1) > a")
    public WebElement programsLink;

    @FindBy(css = "#rec474856319 .t966__menu-link[data-menu-item-number='1']")
    public WebElement sdetLink;

    @FindBy(css = "#rec474856319 .t966__menu-link[data-menu-item-number='2']")
    public WebElement dataScienceLink;

    @FindBy(css = "#rec474856319 .t966__menu-link[data-menu-item-number='3']")
    public WebElement artificialLink;

    @FindBy(css = "#rec474856319 .t966__menu-link[data-menu-item-number='4']")
    public WebElement androidLink;

    @FindBy(css = "#rec474856319 .t966__menu-link[data-menu-item-number='5']")
    public WebElement mastersLink;

    @FindBy(css = "#nav474850393 > div > div.t228__leftside > div > a > img")
    public WebElement logo;

    public DropdownMenu_POM(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void hoverPrograms() {
        action.moveToElement(programsLink).perform();
    }
}