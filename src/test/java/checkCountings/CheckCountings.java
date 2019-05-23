package checkCountings;

import org.junit.Test;
import parentTest.ParentTest;

public class CheckCountings extends ParentTest {
    @Test
    public void createNewRace() throws Exception {
        validLoginToAdmin();
        racesAdminPage.clickOnEditButtonOfTheParticularRaceWhenItsStarted(newRaceName);
        racesAdminPage.selectRaceAndWaitUntilRaceStatusIsFinished();

    }
}