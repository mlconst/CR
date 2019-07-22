package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewRacePage extends ParentAdminPage{
    public CreateNewRacePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(name="Name")
    private WebElement inputRaceName;

    @FindBy (id="BookmakerPercent")
    private WebElement inputBookmakerPercent;

    @FindBy(id="HoursMin")
    private WebElement inputRaceDuration;

    @FindBy(id="BettingHoursMin")
    private WebElement inputBettingDuration;

    @FindBy (xpath = "//ul[@class='select2-selection__rendered']") // "//input[@type='search']"
    private WebElement currencies;

    @FindBy (id = "select2-SelectedParticipants-results")
    private WebElement listOfCurrencies;

//    @FindBy (xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[2]")
//    private WebElement ethereum;
    private String ethereum = "/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[2]";

    private String litecoin = "/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[4]";

    private String IOTA = "/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[8]";

    private String stellar = "/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[10]";


    @FindBy (id = "IsBots")
    private WebElement isBotsCheckBox;

    @FindBy (id="MinBots")
    private WebElement minBots;

    @FindBy (id = "MaxBots")
    private WebElement maxBots;

    @FindBy (id= "WinPool")
    private WebElement winPoolInput;

    @FindBy (id= "PlacePool")
    private WebElement placePoolInput;

    @FindBy (id= "ShowPool")
    private WebElement showPoolInput;

    @FindBy (id = "IsMinUsers")
    private WebElement isMinUsersCheckBox;

    @FindBy (id="WinMinUsers")
    private WebElement winMinUsers;

    @FindBy (id="PlaceMinUsers")
    private WebElement placeMinUsers;

    @FindBy (id="ShowMinUsers")
    private WebElement showMinUsers;

    @FindBy (xpath = "//input[@value='Create']")
    private WebElement createButtonAtTeBottom;

    @FindBy (xpath = "//input[@value='Start']")
    private  WebElement startButton;

    @FindBy(xpath = "//li[@class='select2-results__option loading-results']") ///html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[1]

    private WebElement search;

    public void enterNewRaceNameInToInput(String raceName) {
        actionsWithOurElements.enterTextInToElement(inputRaceName, raceName);
    }

    public void enterBookmakerPercentInToInput(String bookmakerPercent) {
        actionsWithOurElements.enterTextInToElement(inputBookmakerPercent, bookmakerPercent);
    }

    public void enterRaceDurationTimeInToInput(String raceNameDurationTime) {
        actionsWithOurElements.enterTextInToElement(inputRaceDuration, raceNameDurationTime);
    }


    public void enterBettingDurationTimeInToInput(String bettingDuration) {
        actionsWithOurElements.enterTextInToElement(inputBettingDuration, bettingDuration);
    }


    public void clickOnCurrencies() {actionsWithOurElements.clickOnElement(currencies);}

    public void selectEthereumFromDD() {actionsWithOurElements.clickOnElementInDD(listOfCurrencies, ethereum); }
    public void selectLitecoinFromDD() {actionsWithOurElements.clickOnElementInDD(listOfCurrencies, litecoin); }
    public void selectStellarFromDD() {actionsWithOurElements.clickOnElementInDD(listOfCurrencies, IOTA); }
    public void selectZCashFromDD() {actionsWithOurElements.clickOnElementInDD(listOfCurrencies, stellar); }

    public void enterWinPoolValue(String winPoolValue){
        actionsWithOurElements.enterTextInToElement(winPoolInput, winPoolValue);
    }

    public void enterPlacePoolValue(String placePoolValue){
        actionsWithOurElements.enterTextInToElement(placePoolInput, placePoolValue);
    }

    public void enterShowPoolValue(String showPoolValue){
        actionsWithOurElements.enterTextInToElement(showPoolInput, showPoolValue);
    }

    public void tickIsBotsCheckBox() {
        actionsWithOurElements.clickOnElement(isBotsCheckBox);
    }

    public void enterMinNumberOfBots(String minBotsValue) {
        actionsWithOurElements.enterTextInToElement(minBots, minBotsValue);
    }

    public void enterMaxNumberOfBots(String maxBotsValue) {
        actionsWithOurElements.enterTextInToElement(maxBots, maxBotsValue);
    }

    public void tickIsMinUsers() {
        actionsWithOurElements.clickOnElement(isMinUsersCheckBox);
    }
    public void enterMinWinNumberOfUsers(String winMinNumberOfUsers) {
        actionsWithOurElements.enterTextInToElement(winMinUsers, winMinNumberOfUsers);
    }

    public void enterMinPlaceNumberOfUsers(String placeWinMinNumberOfUsers) {
        actionsWithOurElements.enterTextInToElement(placeMinUsers, placeWinMinNumberOfUsers);
    }

    public void enterMinShowNumberOfUsers(String showWinMinNumberOfUsers) {
        actionsWithOurElements.enterTextInToElement(showMinUsers, showWinMinNumberOfUsers);
    }

    public void clickOnButtonCreateAtTheButtom (){
        actionsWithOurElements.clickOnElement(createButtonAtTeBottom);

    }

    public void clickOnStartButton() {
        actionsWithOurElements.clickOnElement(startButton);
    }


}