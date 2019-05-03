package Suits;

import createRace.CreateRace;
import makeAWinBet.MakeABet;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                CreateRace.class,
                MakeABet.class
        }
)

public class SmokeSuite {


}
