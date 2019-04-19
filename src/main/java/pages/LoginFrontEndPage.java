package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFrontEndPage extends ParentFrontEndPage {
    Logger logger = Logger.getLogger(getClass());
    public LoginFrontEndPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(xpath = ".//input[@placeholder='Email']")
    private WebElement inputLogin;

    @FindBy(xpath = ".//input[@placeholder='Password']")
    private WebElement inputPass;

    @FindBy(xpath = ".//a[@class='cr-authorization-btn blue']")
    private WebElement button;


    public void openPage() {

        try{
            webDriver.get("http://beta.cryptorun.live/auth");
            System.out.println("Login page was opened");
        } catch (Exception e) {
            logger.error("Can not open login page + " + e);
            Assert.fail("Can not open login page + " + e);
        }

    }

    public void enterTextIntoInputLogin(String login) {
        actionsWithOurElements.enterTextInToElement(inputLogin, login);

    }

    public void enterTextIntoInputPassword(String password) {
        actionsWithOurElements.enterTextInToElement(inputPass, password);
    }

    public void clickOnEnterButton() {
        actionsWithOurElements.clickOnElement(button);
    }

    public void login (String login, String password) {
        openPage();
        enterTextIntoInputLogin(login);
        enterTextIntoInputPassword(password);
        clickOnEnterButton();
    }
}
