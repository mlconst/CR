package parentTest;

import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AdminRacesPage;
import pages.LoginAdminPage;
import pages.LoginPage;
import pages.RacesPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;
    protected static ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);
    protected LoginPage loginPage;
    protected RacesPage racesPage;
    protected LoginAdminPage loginAdminPage;
    protected AdminRacesPage adminRacesPage;



    @Before
    public void setUP() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver);
        racesPage = new RacesPage(webDriver);
        loginAdminPage = new LoginAdminPage(webDriver);
        adminRacesPage = new AdminRacesPage(webDriver);

    }

    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(message, true, actualResult);
    }


    @After
    public void quit() {
        webDriver.quit();

    }

}