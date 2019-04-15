package login;

import libs.ExcelDriver;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

public class LoginToAdminPanel extends ParentTest {
    @Test
    public void validLoginToAdmin() throws IOException {
        ExcelDriver excelDriver = new ExcelDriver();
        Map dataForValidLogin = excelDriver.getData(configProperties.DATA_FILE(), "validLogOn");
        loginAdminPage.openPage ();
        loginAdminPage.enterTextIntoInputLogin (dataForValidLogin.get("loginAdmin").toString());
        loginAdminPage.enterTextIntoInputPassword(dataForValidLogin.get("password").toString());
        loginAdminPage.clickOnEnterButton();

        checkExpectedResult("Create button is not displayed", adminRacesPage.isLogOffButtonDisplayed());


    }

}
