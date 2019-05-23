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

    private String parentXPath = "./..";

    private String childXPath = ".//a";

    private String childXPath2 = ".//td";

    private int indexOfEditButton = 0;

    public String getParticularRaceName (String newRaceName){
    return "//td[contains(text(),\'" + newRaceName + "\')]";
    }

    public boolean isLogOffButtonDisplayed() {
        return actionsWithOurElements.isElementPresent(logOff);
    }

    public boolean isCreateButtonInTheTopDisplayed() {
        return actionsWithOurElements.isElementPresent(createButton);
    }

    public void clickOnCreateButtoninTheTop() {
        actionsWithOurElements.clickOnElement(createButton);
    }

    public void clickOnEditButtonOfTheParticularRace(String raceName) {
    actionsWithOurElements.findAndClickNeededButton(getParticularRaceName(raceName), parentXPath, childXPath, indexOfEditButton); }

    public void clickOnEditButtonOfTheParticularRaceWhenItsStarted(String raceName) {
        actionsWithOurElements.findAndClickNeededButtonWhenRaceIsStarted(getParticularRaceName(raceName), parentXPath, childXPath2); }

    public void selectRaceAndWaitUntilRaceStatusIsFinished() {actionsWithOurElements.refreshAdminPageUntilTheRaceGetsFinishedStatus();
    }
}
