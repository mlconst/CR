package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAdminPage extends ParentAdminPage {
    Logger logger = Logger.getLogger(getClass());
    public LoginAdminPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = ".//input[@name='UserName']")
    private WebElement inputLogin;

    @FindBy(xpath = ".//input[@id='Password']")
    private WebElement inputPass;

    @FindBy(xpath = ".//input[@value='Log in']")
    private WebElement button;



    public void openPage() {

        try{
            webDriver.get("http://176.9.152.43:8003/Account/Login");
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
