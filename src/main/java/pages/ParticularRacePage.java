package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParticularRacePage extends ParentFrontEndPage {
    public ParticularRacePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (xpath = "//div[@class='bet-button main']")
    private WebElement quickBet;

    @FindBy (xpath = "//input[@placeholder='1 CRT']")
    private WebElement quickBetInput;

    @FindBy (xpath = "//div[contains(@class,'selected-items-box default-input')]//div") //div[contains(@class,'selected-items-box default-input')]//div
    private WebElement betTypeDD;

    @FindBy (xpath = "//div[contains(@class,'race-toolbar-wrapper')]")
    private WebElement listOfBetTypes;

    private String win = "//span[contains(text(),'Win')]";

    private String place = "//span[contains(text(),'Place')]";

    private String show = "//span[contains(text(),'Show')]";


//    public String placedBetValue (String quickBetValue){
//        return "//tr[@class='play-bet']//span[contains(text(),'+quickBetValue+')]";
//    }
    @FindBy (xpath = " //tr[@class='play-bet']//span[contains(text(),'2')]")
    private WebElement placedBetValue;


    public void enterQuickBetValue(String quickBetValue){
        actionsWithOurElements.enterTextInToElement(quickBetInput, quickBetValue);
    }

    public void clickOnBetTypeDD(){actionsWithOurElements.clickOnElement(betTypeDD);

    }

    public void chooseWinBetType(){actionsWithOurElements.clickOnElementInDD(listOfBetTypes, win);

    }
    public void choosePlaceBetType(){actionsWithOurElements.clickOnElementInDD(listOfBetTypes, place);

    }
    public void chooseShowBetType(){actionsWithOurElements.clickOnElementInDD(listOfBetTypes, show);

    }

    public void clickOnQuickBetButton(){
        actionsWithOurElements.clickOnElement(quickBet);
    }
    public boolean isPlacedBetdisplayed() {
        return actionsWithOurElements.isElementPresent(placedBetValue);
    }


}
