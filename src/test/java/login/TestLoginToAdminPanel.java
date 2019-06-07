package login;

import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;

public class TestLoginToAdminPanel extends ParentTest {

    @Test
    public void loginToAdmin() throws IOException {
        validLoginToAdmin();
//        ExcelDriver excelDriver = new ExcelDriver();
//        Map dataForValidLogin = excelDriver.getData(configProperties.DATA_FILE(), "validLogOn");
//        loginAdminPage.openPage ();
//        loginAdminPage.enterTextIntoInputLogin (dataForValidLogin.get("loginAdmin").toString());
//        loginAdminPage.enterTextIntoInputPassword(dataForValidLogin.get("password").toString());
//        loginAdminPage.clickOnEnterButton();
//
//        checkExpectedResult("Create button is not displayed", racesAdminPage.isLogOffButtonDisplayed());

    }

}
