package pages;

import org.openqa.selenium.WebDriver;

public class RacePageWhenItsFinishedStatus extends ParentAdminPage{
    public RacePageWhenItsFinishedStatus(WebDriver webDriver) {
        super(webDriver);
    }

//    @FindBy (xpath = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[21]/a[1]")
//    private WebElement firstCurrency;

    String firstCurrency = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[21]";
    String secondCurrency = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[22]/a[1]";
    String thirdCurrency = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[23]/a[1]";
    String fourthCurrency = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[24]/a[1]";

    public String getFirstCurrencyNameFromXpath(){
       // actionsWithOurElements.getText(firstCurrency);
        return actionsWithOurElements.getText(firstCurrency);

    }
    public void getSecondCurrencyNameFromXpath(){
        actionsWithOurElements.getText(secondCurrency);
    }
    public void getThirdCurrencyNameFromXpath(){
        actionsWithOurElements.getText(thirdCurrency);
    }
    public void getFourthCurrencyNameFromXpath(){
        actionsWithOurElements.getText(fourthCurrency);
    }



    public String firstCurrencyPercents(){
        return getFirstCurrencyNameFromXpath().substring(getFirstCurrencyNameFromXpath().lastIndexOf("(") + 1, getFirstCurrencyNameFromXpath().indexOf(")"));
    }

    public void lala (){
        System.out.println(firstCurrencyPercents());
    }
   // String firstCurrencyPercents = getFirstCurrencyNameFromXpath();
    // String str = firstCurrencyPercents.substring(firstCurrencyPercents.lastIndexOf("(") + 1, firstCurrencyPercents.indexOf(")"));
}
