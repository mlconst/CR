package makeAWinBet;

import org.junit.Test;
import parentTest.ParentTest;

public class MakeABet extends ParentTest {

    public String quikBetValue = "2";

    @Test
    public void makeAWinBet() throws Exception {
        validLoginToFrontEndPageUser1();
        playPage.findAndClickOnAcceptingBets(newRaceName);
        particularRacePage.enterQuickBetValue(quikBetValue);
        particularRacePage.clickOnBetTypeDD();
//        particularRacePage.chooseWinBetType();     we'll use it when we want to choose this current Bet type
//        particularRacePage.choosePlaceBetType();
        particularRacePage.chooseShowBetType();
        particularRacePage.clickOnQuickBetButton();
//        particularRacePage.clickOnQuickBetButton();


        checkExpectedResult("Bet is not recorded/placed", particularRacePage.isPlacedBetdisplayed());



    }
}