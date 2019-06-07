package Suits;

import checkCalculations.TestCheckCalculations;
import createRace.TestCreateRace;
import makeAWinBet.TestMakeABet;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
//                TestInvalidLoginToAdminPanel.class,
//                TestInvalidLoginToFrontEnd.class,
//                TestLoginToAdminPanel.class,
//                TestLoginToFrontEndUser1.class,
                TestCreateRace.class,
                TestMakeABet.class,
                TestCheckCalculations.class
        }
)

public class SmokeSuite {


}
