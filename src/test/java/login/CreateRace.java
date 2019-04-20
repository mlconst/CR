package login;

import org.junit.Test;
import parentTest.ParentTest;

public class CreateRace extends ParentTest {
    final String newRaceName = "Automation_Race_"+randomString();
    final String raceDuration = "00:02";
    final String bettingDuration = "00:03";
    final String minBotsValue = "2";
    final String minMaxValue = "3";
    final String MinNumberOfUsers = "1";
    final String bitcoinTitle = "Bitcoin [BTC] (557192 points, 113 per last hour)";
    final String editBtn = "Edit";
  //  final String BITCOIN_TITLE = "Bitcoin [BTC] (557192 points, 113 per last hour)";

    @Test
    public void createNewRace() throws Exception {
        validLoginToAdmin();
        racesAdminPage.clickOnCreateButtoninTheTop();
        createNewRacePage.enterNewRaceNameInToInput(newRaceName);
        createNewRacePage.enterRaceDurationTimeInToInput(raceDuration);
        createNewRacePage.enterBettingDurationTimeInToInput(bettingDuration);
        createNewRacePage.clickOnCurrencies();
//        createNewRacePage.wait10Sec();
   //
        createNewRacePage.selectEthereumFromDD();
        createNewRacePage.clickOnCurrencies();
        createNewRacePage.selectLitecoinFromDD();
        createNewRacePage.clickOnCurrencies();
        createNewRacePage.selectIOTAFromDD();
        createNewRacePage.clickOnCurrencies();
        createNewRacePage.selectStellarFromDD();
        createNewRacePage.tickIsBotsCheckBox();
        createNewRacePage.enterMinNumberOfBots(minBotsValue);
        createNewRacePage.enterMaxNumberOfBots(minMaxValue);
        createNewRacePage.tickIsMinUsers();
        createNewRacePage.enterMinWinNumberOfUsers(MinNumberOfUsers);
        createNewRacePage.enterMinPlaceNumberOfUsers(MinNumberOfUsers);
        createNewRacePage.enterMinShowNumberOfUsers(MinNumberOfUsers);
        createNewRacePage.clickOnButtonCreateAtTheButtom();

        checkExpectedResult("Create button is not displayed", racesAdminPage.isCreateButtonInTheTopDisplayed());

        racesAdminPage.checkCreatedRace(newRaceName);
     //   racesAdminPage.clickOnEditTheParticularRace();
        createNewRacePage.clickOnStartButton();

    }
}
