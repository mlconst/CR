package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ActionsWithOurElements {
    WebDriver webDriver;
    WebDriver.Navigation navigation;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait wait10, wait15, wait1, wait60, wait240;

    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait10 = new WebDriverWait(webDriver, 10);
        wait15 = new WebDriverWait(webDriver, 15);
        wait1 = new WebDriverWait(webDriver, 0);
        wait60 = new WebDriverWait(webDriver, 60);
        wait240 = new WebDriverWait(webDriver, 240);
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
            wait15.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            logger.info(element + " Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void clickOnElementInDD(WebElement dropdownList, String element) {
        try {
            wait60.until(ExpectedConditions.elementToBeClickable(dropdownList));
            dropdownList.findElement(By.xpath(element)).click();
            logger.info(element + " this element was clicked");

        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void selectCurrencyInDD(WebElement dropdownList, String element, WebElement search) {
        try {
            wait60.until(ExpectedConditions.invisibilityOf(search));
            wait60.until(ExpectedConditions.elementToBeClickable(dropdownList));
            dropdownList.findElement(By.xpath(element)).click();
            logger.info(element + " this element was clicked");

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

    public void selectTextInDropdown(WebElement element, String text) {
        try {
            Select select = new Select(element);
            select.selectByVisibleText(text);
            logger.info(text + " was selected in dropdown");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void selectValueInDropdown(WebElement element, String value) {
        try {
            Select select = new Select(element);
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
        WebElement element = webDriver.findElement(By.xpath("//td[contains(text(),\'" + raceName + "\')]"));
        logger.info("Element is displayed - " + true);
    }

//    public void findAndClickOnEditButton(String raceName) {
//        WebElement element = webDriver.findElement(By.xpath("//td[contains(text(),\'" + raceName + "\')]"));
//        logger.info(element.isDisplayed() + " was displayed");
//        WebElement parent = element.findElement(By.xpath("./.."));
//        logger.info(parent.getAttribute("innerHTML"));
//
//        List<WebElement> editButtons = parent.findElements(By.xpath(".//a"));
//        logger.info(editButtons);
//
//        editButtons.get(0).click();
//        logger.info(editButtons.get(0) + "editButton is clicked");
//    }
public void refresh(){
        navigation.refresh();
}

    public void findAndClickNeededButton(String particularRaceXPath, String parentXPath, String childXPath, int index) {

        wait60.until(ExpectedConditions.elementToBeClickable(By.xpath(particularRaceXPath))) ;
        WebElement element = webDriver.findElement(By.xpath(particularRaceXPath));
        logger.info(element.isDisplayed() + " was displayed");
        WebElement parent = element.findElement(By.xpath(parentXPath));
        logger.info(parent.getAttribute("innerHTML"));


        List<WebElement> neededButton = parent.findElements(By.xpath(childXPath));
        logger.info(neededButton);

        neededButton.get(index).click();

    }

    public void findAndClickNeededButtonWhenRaceIsStarted(String particularRaceXPath, String parentXPath, String childXPath) {

        wait60.until(ExpectedConditions.elementToBeClickable(By.xpath(particularRaceXPath))) ;
        WebElement element = webDriver.findElement(By.xpath(particularRaceXPath));
        logger.info(element.isDisplayed() + " was displayed");
        WebElement parent = element.findElement(By.xpath(parentXPath));
        logger.info(parent.getAttribute("innerHTML"));
        parent.click();

    }

    public void findAndClickNeededButton(String particularRaceXPath) {

        wait60.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(particularRaceXPath))) ;
        WebElement element = webDriver.findElement(By.xpath(particularRaceXPath));
        logger.info(element.isDisplayed() + " was displayed");
        element.click();

    }


    public void refreshAdminPageUntilTheRaceGetsFinishedStatus() {
        boolean displayed = false;
        do{
            try{
                displayed = webDriver.findElement(By.xpath("//dd[contains(text(),'Finished')]")).isDisplayed();
            } catch (Exception e){
                webDriver.navigate().refresh();
            }
        } while(!displayed);
    }

    public void selectRaceWhenitsStatusIsFinished(){

    }
}
