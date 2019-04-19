package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RacesFrontEndPage extends ParentFrontEndPage {
    public RacesFrontEndPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[contains(text(),'Arbuzov')]")
    private WebElement profileNameArbuzov;

    public boolean isProfileNameArbuzov(){return actionsWithOurElements.isElementPresent(profileNameArbuzov);}


}
