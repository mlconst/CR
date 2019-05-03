package Suits;

import createRace.CreateRace;
import login.InvalidLoginToAdminPanel;
import login.InvalidLoginToFrontEnd;
import login.LoginToAdminPanel;
import login.LoginToFrontEnd;
import makeAWinBet.MakeABet;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                InvalidLoginToAdminPanel.class,
                InvalidLoginToFrontEnd.class,
                LoginToAdminPanel.class,
                LoginToFrontEnd.class,
                CreateRace.class,
                MakeABet.class
        }
)

public class SmokeSuite {


}
