package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminRacesPage extends ParentPage {
    public AdminRacesPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[contains(text(),'Log off')]")
    private WebElement logOff;

    @FindBy (xpath = "//a[@class='btn btn-success']")
    private  WebElement createButton;

    public boolean isLogOffButtonDisplayed() {
        return actionsWithOurElements.isElementPresent(logOff);
    }
}
