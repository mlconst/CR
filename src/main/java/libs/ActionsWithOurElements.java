package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithOurElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait wait10, wait15, wait1;

    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait10 = new WebDriverWait(webDriver, 10);
        wait15 = new WebDriverWait(webDriver, 15);
        wait1 = new WebDriverWait(webDriver, 0);
    }


    public void enterTextInToElement(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
            logger.info(text + " was input in to element");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }


    private void printErrorAndStopTest(Exception e) {
        logger.error("Cannot work with Element" + e);
        Assert.fail("Cannot work with element" + e);
    }

    public void clickOnElement(WebElement element) {
        try {
            wait10.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }


    public void clickOnLitecoinUntilSelected(WebElement dropdown) {
        try {
            dropdown.findElement(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[4]")).click();  //By.xpath("/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[2]"))
            logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void clickOnEthereumUntilSelected(WebElement dropdown) {
        try {
            dropdown.findElement(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[2]")).click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }


    public void clickOnIOTAUntilSelected(WebElement dropdown) {
        try {
            dropdown.findElement(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[8]")).click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }
    public void clickOnStellarUntilSelected(WebElement dropdown) {
        try {
            dropdown.findElement(By.xpath("/html[1]/body[1]/span[1]/span[1]/span[1]/ul[1]/li[10]")).click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public boolean isElementPresent(WebElement Element) {
        try {
            boolean isDisplayed = Element.isDisplayed();
            logger.info("Element is displayed - " + true);
            return isDisplayed;
        } catch (Exception e) {
            logger.info("Element is displayed - " + false);
            return false;
        }
    }

    public void selectIndexInDropdown(WebElement element, int index) {
        try {
            Select select = new Select(element);// org.openqa.selenium...
            select.selectByIndex(index);
            logger.info(index + " was selected in dropdown");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void selectTextInDropdown(WebElement element, String text) {
        try {
            Select select = new Select(element);// org.openqa.selenium...
            select.selectByVisibleText(text);
            logger.info(text + " was selected in dropdown");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void selectElementInDropdown(WebElement element) {
        try {
            Select select = new Select(element);// org.openqa.selenium...
            logger.info(element + " was selected in dropdown");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void selectValueInDropdown(WebElement element, String value) {
        try {
            Select select = new Select(element);// org.openqa.selenium...
            select.selectByValue(value);
            logger.info(value + " was selected in dropdown");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }

    }

    public boolean isElementPresent(By xpath) {
        try {
            return isElementPresent(webDriver.findElement(xpath));
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOnElement(By xpath) {
        try {

            clickOnElement(webDriver.findElement(xpath));
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void scrollToElement(String raceName) {
        //raceName = "Huina vse eto";
        //JavascriptExecutor jsx = (JavascriptExecutor)webDriver;
        WebElement element = webDriver.findElement(By.xpath("//td[contains(text(),\'" + raceName + "\')]"));
        logger.info("Element is displayed - " + true);
    }

    public void findandClickOnEditButton(String raceName) {
        WebElement element = webDriver.findElement(By.xpath("//td[contains(text(),\'" + raceName + "\')]"));
        logger.info(element.isDisplayed() + " was displayed");
        WebElement parent = (WebElement) ((JavascriptExecutor) webDriver).executeScript(
                "return arguments[0].parentNode;", element);
        logger.info(parent.isDisplayed() + " was displayed");
        WebElement editButton = webDriver.findElement(By.xpath(parent+"//div[@id='Created']"));
        logger.info(editButton.isDisplayed() + " was find");
        editButton.click();


    }

}
