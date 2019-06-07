package checkCalculations;

import org.junit.Test;
import parentTest.ParentTest;

public class TestCheckCalculations extends ParentTest {
    @Test
    public void testCheckCalculations() throws Exception {

        validLoginToAdmin();
        racesAdminPage.clickOnEditButtonOfTheParticularRaceWhenItsStarted("only bulls"); //(newRaceName);
        racesAdminPage.refreshUntilRaceIsFinished();
        racePageWhenItsFinishedStatus.getFirstCurrencyNameFromXpath();
        racePageWhenItsFinishedStatus.getSecondCurrencyNameFromXpath();
        racePageWhenItsFinishedStatus.getThirdCurrencyNameFromXpath();
        racePageWhenItsFinishedStatus.getFourthCurrencyNameFromXpath();
      //  racePageWhenItsFinishedStatus.print();



    }
}