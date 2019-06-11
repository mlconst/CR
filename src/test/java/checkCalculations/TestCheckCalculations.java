package checkCalculations;

import org.junit.Test;
import parentTest.ParentTest;

public class TestCheckCalculations extends ParentTest {
    @Test
    public void testCheckCalculations() throws Exception {

        validLoginToAdmin();
        racesAdminPage.clickOnEditButtonOfTheParticularRaceWhenItsStarted("Automation_Race_FZ89QZIQCF"); //(newRaceName);
        racesAdminPage.refreshUntilRaceIsFinished();

//        racePageWhenItsFinishedStatus.print();
//        racePageWhenItsFinishedStatus.getFourthCurrencyName();
        racePageWhenItsFinishedStatus.st ();

        racePageWhenItsFinishedStatus.getFirstCurrencyWholeString();
        racePageWhenItsFinishedStatus.getFirstCurrencyName();

       // racePageWhenItsFinishedStatus.lala2();

        racePageWhenItsFinishedStatus.getSecondCurrencyWholeString();
        racePageWhenItsFinishedStatus.getSecondCurrencyName();


        racePageWhenItsFinishedStatus.getThirdCurrencyWholeString();
        racePageWhenItsFinishedStatus.getThirdCurrencyName();


        racePageWhenItsFinishedStatus.getFourthCurrencyWholeString();
        racePageWhenItsFinishedStatus.getFourthCurrencyName();


        racePageWhenItsFinishedStatus.getWagerValueWithoutDollarIconUser1();


      //  racePageWhenItsFinishedStatus.lala();

    }
}