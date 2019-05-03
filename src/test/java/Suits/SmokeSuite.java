package Suits;

import createRace.CreateRace;
import makeAWinBet.MakeAWinBet;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                CreateRace.class,
                MakeAWinBet.class
        }
)

public class SmokeSuite {


}
