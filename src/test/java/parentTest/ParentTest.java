package parentTest;

import libs.ConfigProperties;
import libs.ExcelDriver;
import org.aeonbits.owner.ConfigFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;
    protected static ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);
    protected LoginFrontEndPage loginFrontEndPage;
    protected RacesFrontEndPage racesFrontEndPage;
    protected LoginAdminPage loginAdminPage;
    protected RacesAdminPage racesAdminPage;
    protected CreateNewRacePage createNewRacePage;
    protected PlayPage playPage;
    protected ParticularRacePage particularRacePage;

    @Before
    public void setUP() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        loginFrontEndPage = new LoginFrontEndPage(webDriver);
        racesFrontEndPage = new RacesFrontEndPage(webDriver);
        loginAdminPage = new LoginAdminPage(webDriver);
        racesAdminPage = new RacesAdminPage(webDriver);
        createNewRacePage = new CreateNewRacePage(webDriver);
        playPage = new PlayPage(webDriver);
        particularRacePage = new ParticularRacePage(webDriver);

    }




    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(message, true, actualResult);
    }

    protected void validLoginToAdmin() throws IOException {
        ExcelDriver excelDriver = new ExcelDriver();
        Map dataForValidLogin = excelDriver.getData(configProperties.DATA_FILE(), "validLogOn");
        loginAdminPage.openPage ();
        loginAdminPage.enterTextIntoInputLogin (dataForValidLogin.get("loginAdmin").toString());
        loginAdminPage.enterTextIntoInputPassword(dataForValidLogin.get("password").toString());
        loginAdminPage.clickOnEnterButton();

        checkExpectedResult("Log Off button is not displayed", racesAdminPage.isLogOffButtonDisplayed());

    }

    protected void validLoginToFrontEndPageUser1() throws IOException {
        ExcelDriver excelDriver = new ExcelDriver();
        Map dataForValidLogin = excelDriver.getData(configProperties.DATA_FILE(), "validLogOn");
        loginFrontEndPage.openPage();
        loginFrontEndPage.enterTextIntoInputLogin(dataForValidLogin.get("login").toString());
        loginFrontEndPage.enterTextIntoInputPassword(dataForValidLogin.get("pass").toString());
        loginFrontEndPage.clickOnEnterButton();

        checkExpectedResult(
                "Profile name is not Arbuzov",
                racesFrontEndPage.isProfileNameArbuzov()
        );
    }

    protected void validLoginToFrontEndPageUser2() throws IOException {
        ExcelDriver excelDriver = new ExcelDriver();
        Map dataForValidLogin = excelDriver.getData(configProperties.DATA_FILE(), "validLogOn");
        loginFrontEndPage.openPage();
        loginFrontEndPage.enterTextIntoInputLogin(dataForValidLogin.get("login").toString());
        loginFrontEndPage.enterTextIntoInputPassword(dataForValidLogin.get("pass").toString());
        loginFrontEndPage.clickOnEnterButton();

        checkExpectedResult(
                "Profile name is not Arbuzov",
                racesFrontEndPage.isProfileNameArbuzov()
        );
    }

    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();
    public static final String newRaceName = "Automation_Race_"+randomString();
    private static String randomString() {
        return RandomStringUtils.randomAlphanumeric(10).toUpperCase();
    }



    @After
    public void quit() {
        webDriver.quit();

    }

}