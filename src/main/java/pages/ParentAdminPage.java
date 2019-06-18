package pages;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ParentAdminPage {
    WebDriver webDriver;
    ActionsWithOurElements actionsWithOurElements;
    Logger logger = Logger.getLogger(getClass());


    protected List<CurrenciesModel> currenciesModels;
    protected List<BetModel> betModelList;
    Double bookmakerPercent;

    public ParentAdminPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        currenciesModels = new ArrayList<>();
        betModelList = new ArrayList<>();

    }
}

