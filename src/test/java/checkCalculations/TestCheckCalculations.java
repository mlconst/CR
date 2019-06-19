package checkCalculations;

import org.junit.Test;
import parentTest.ParentTest;


public class TestCheckCalculations extends ParentTest {
    @Test
    public void testCheckCalculations() throws Exception {

        validLoginToAdmin();
      //  openRaceByID(25002);
        racesAdminPage.clickOnEditButtonOfTheParticularRaceWhenItsStarted(newRaceName); //(newRaceName);
        racesAdminPage.refreshUntilRaceIsFinished();

//        racePageWhenItsFinishedStatus.print();
//        racePageWhenItsFinishedStatus.getFourthCurrencyName();

        racePageWhenItsFinishedStatus.getBookmakerPercent();
        racePageWhenItsFinishedStatus.getBetModelList();
        racePageWhenItsFinishedStatus.getPlacementList();
//        racePageWhenItsFinishedStatus.winBetsCalculations();
        checkExpectedResult("Calculations for win bets are failed ", racePageWhenItsFinishedStatus.winBetsCalculations());

//
//        racePageWhenItsFinishedStatus.getFirstCurrencyWholeString();
//        racePageWhenItsFinishedStatus.getFirstCurrencyName();
//
//       // racePageWhenItsFinishedStatus.lala2();
//
//        racePageWhenItsFinishedStatus.getSecondCurrencyWholeString();
//        racePageWhenItsFinishedStatus.getSecondCurrencyName();
//
//
//        racePageWhenItsFinishedStatus.getThirdCurrencyWholeString();
//        racePageWhenItsFinishedStatus.getThirdCurrencyName();
//
//
//        racePageWhenItsFinishedStatus.getFourthCurrencyWholeString();
//        racePageWhenItsFinishedStatus.getFourthCurrencyName();
//
//
//        racePageWhenItsFinishedStatus.getWagerValueWithoutDollarIconUser1();


      //  racePageWhenItsFinishedStatus.lala();

   //     Процедура по какой мы определяем все места из участников, которые поставили Вин бет тайп



    }
}