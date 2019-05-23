package createRace;

import org.junit.Test;
import parentTest.ParentTest;

public class CreateRace extends ParentTest {


    final String raceDuration = "00:01";
    final String bettingDuration = "00:01";
    final String minBotsValue = "2";
    final String minMaxValue = "3";
    final String MinNumberOfUsers = "1";
    final String poolValue = "2";
    @Test
    public void createNewRace() throws Exception {
        validLoginToAdmin();
        racesAdminPage.clickOnCreateButtoninTheTop();
        createNewRacePage.enterNewRaceNameInToInput(newRaceName);
        createNewRacePage.enterRaceDurationTimeInToInput(raceDuration);
        createNewRacePage.enterBettingDurationTimeInToInput(bettingDuration);

        createNewRacePage.clickOnCurrencies();
        createNewRacePage.selectEthereumFromDD();
        createNewRacePage.clickOnCurrencies();
        createNewRacePage.selectLitecoinFromDD();
        createNewRacePage.clickOnCurrencies();
        createNewRacePage.selectStellarFromDD();
        createNewRacePage.clickOnCurrencies();
        createNewRacePage.selectZCashFromDD();

        createNewRacePage.enterWinPoolValue(poolValue);
        createNewRacePage.enterPlacePoolValue(poolValue);
        createNewRacePage.enterShowPoolValue(poolValue);
        createNewRacePage.tickIsBotsCheckBox();
        createNewRacePage.enterMinNumberOfBots(minBotsValue);
        createNewRacePage.enterMaxNumberOfBots(minMaxValue);
        createNewRacePage.tickIsMinUsers();
        createNewRacePage.enterMinWinNumberOfUsers(MinNumberOfUsers);
        createNewRacePage.enterMinPlaceNumberOfUsers(MinNumberOfUsers);
        createNewRacePage.enterMinShowNumberOfUsers(MinNumberOfUsers);
        createNewRacePage.clickOnButtonCreateAtTheButtom();

        checkExpectedResult("Create button is not displayed", racesAdminPage.isCreateButtonInTheTopDisplayed());

        racesAdminPage.clickOnEditButtonOfTheParticularRace(newRaceName);
        createNewRacePage.clickOnStartButton(); // start the Race

    }
}
