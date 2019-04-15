package login;

import libs.ExcelDriver;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

public class LoginToFrontEnd extends ParentTest {
    @Test
    public void validLogin() throws IOException {
        ExcelDriver excelDriver = new ExcelDriver();
        Map dataForValidLogin = excelDriver.getData(configProperties.DATA_FILE(), "validLogOn");
        loginPage.openPage ();
        loginPage.enterTextIntoInputLogin (dataForValidLogin.get("login").toString());
        loginPage.enterTextIntoInputPassword(dataForValidLogin.get("pass").toString());
        loginPage.clickOnEnterButton();

        checkExpectedResult(
                "Profile name is not Arbuzov",
                racesPage.isProfileNameArbuzov()
        );


    }
}
