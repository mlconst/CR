package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RacesAdminPage extends ParentAdminPage {


    public RacesAdminPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[contains(text(),'Log off')]")
    private WebElement logOff;

    @FindBy (xpath = "//a[@class='btn btn-success']")
    private  WebElement createButton;

    @FindBy(xpath = "//div[@id='Created']//tr[11]//td[7]//a[1]") //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! need to identify the element
    private WebElement editButton;


    public boolean isLogOffButtonDisplayed() {
        return actionsWithOurElements.isElementPresent(logOff);
    }

    public boolean isCreateButtonInTheTopDisplayed() {
        return actionsWithOurElements.isElementPresent(createButton);
    }

    public void clickOnCreateButtoninTheTop() {
        actionsWithOurElements.clickOnElement(createButton);
    }

    public void clickOnEditTheParticularRace() {actionsWithOurElements.clickOnElement(editButton);
    }

    public void checkCreatedRace(String newRaceName) {actionsWithOurElements.findandClickOnEditButton(newRaceName);
    }
}
