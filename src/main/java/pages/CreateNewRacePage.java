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

    @FindBy(id="HoursMin")
    private WebElement inputRaceDuration;

    @FindBy(id="BettingHoursMin")
    private WebElement inputBettingDuration;

    @FindBy (xpath = "//ul[@class='select2-selection__rendered']") // "//input[@type='search']"
    private WebElement currencies;

    @FindBy (id = "select2-SelectedParticipants-results")
    private WebElement listOfCurrencies;

//    @FindBy (xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[1]")
    @FindBy(xpath = "//*[contains(text(), 'Bitcoin')]")
    private WebElement bitcoin;

    @FindBy (xpath = "//li[@title='Ethereum [ETH]']")
    private WebElement ethereum;

    @FindBy (xpath = "//li[@title='Litecoin [LTC]']")
    private WebElement litecoin;

    @FindBy (xpath = "//li[@title='XRP [XRP]']")
    private WebElement xpr;

    @FindBy (id = "IsBots")
    private WebElement isBotsCheckBox;

    @FindBy (id="MinBots")
    private WebElement minBots;

    @FindBy (id = "MaxBots")
    private WebElement maxBots;

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

    @FindBy(xpath = "//*[contains(text(), 'Searching...')]")
    private WebElement search;

    public void enterNewRaceNameInToInput(String raceName) {
        actionsWithOurElements.enterTextInToElement(inputRaceName, raceName);}

    public void enterRaceDurationTimeInToInput(String raceNameDurationTime) {
        actionsWithOurElements.enterTextInToElement(inputRaceDuration, raceNameDurationTime);}


    public void enterBettingDurationTimeInToInput(String bettingDuration) {
        actionsWithOurElements.enterTextInToElement(inputBettingDuration, bettingDuration);}


    public void clickOnCurrencies() {actionsWithOurElements.clickOnElement(currencies);}

    public void selectLitecoinFromDD() {actionsWithOurElements.clickOnLitecoinUntilSelected(listOfCurrencies);}
    public void selectEthereumFromDD() {actionsWithOurElements.clickOnEthereumUntilSelected(listOfCurrencies);}
    public void selectIOTAFromDD() {actionsWithOurElements.clickOnIOTAUntilSelected(listOfCurrencies); }
    public void selectStellarFromDD() {actionsWithOurElements.clickOnStellarUntilSelected(listOfCurrencies); }


    public void tickIsBotsCheckBox() {actionsWithOurElements.clickOnElement(isBotsCheckBox);
    }

    public void enterMinNumberOfBots(String minBotsValue) {actionsWithOurElements.enterTextInToElement(minBots, minBotsValue);
    }

    public void enterMaxNumberOfBots(String maxBotsValue) {actionsWithOurElements.enterTextInToElement(maxBots, maxBotsValue);
    }

    public void tickIsMinUsers() {actionsWithOurElements.clickOnElement(isMinUsersCheckBox);
    }
    public void enterMinWinNumberOfUsers(String winMinNumberOfUsers) {actionsWithOurElements.enterTextInToElement(winMinUsers, winMinNumberOfUsers);
    }

    public void enterMinPlaceNumberOfUsers(String placeWinMinNumberOfUsers) {actionsWithOurElements.enterTextInToElement(placeMinUsers, placeWinMinNumberOfUsers);
    }

    public void enterMinShowNumberOfUsers(String showWinMinNumberOfUsers) {actionsWithOurElements.enterTextInToElement(showMinUsers, showWinMinNumberOfUsers);
    }

    public void clickOnButtonCreateAtTheButtom (){actionsWithOurElements.clickOnElement(createButtonAtTeBottom);

    }

    public void clickOnStartButton() {actionsWithOurElements.clickOnElement(startButton);
    }




    //   public void clickOnBitcoin() {actionsWithOurElements.clickOnElement(bitcoin);}

}