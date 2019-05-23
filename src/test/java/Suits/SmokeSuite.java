package Suits;

import checkCountings.CheckCountings;
import createRace.CreateRace;
import makeAWinBet.MakeABet;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
//                InvalidLoginToAdminPanel.class,
//                InvalidLoginToFrontEnd.class,
//                LoginToAdminPanel.class,
//                LoginToFrontEndUser1.class,
                CreateRace.class,
                MakeABet.class,
                CheckCountings.class
        }
)

public class SmokeSuite {


}
