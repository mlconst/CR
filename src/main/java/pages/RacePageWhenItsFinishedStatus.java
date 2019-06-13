package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ArrayList;

public class RacePageWhenItsFinishedStatus<winner> extends ParentAdminPage{
    public RacePageWhenItsFinishedStatus(WebDriver webDriver) {
        super(webDriver);
    }
    Logger logger = Logger.getLogger(getClass());

    String firstCurrencyWholeString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[21]";
    String secondCurrencyWholeString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[22]";
    String thirdCurrencyWholeString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[23]";
    String fourthCurrencyWholeString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[24]";

    String firstCurrencyOnlyNameString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[21]/a[1]";
    String secondCurrencyOnlyNameString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[22]/a[1]";
    String thirdCurrencyOnlyNameString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[23]/a[1]";
    String fourthCurrencyOnlyNameString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[24]/a[1]";

    String xpathOfAllBetTableValues = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr";
    String xpathOfAllPlacementTableValues = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[contains(@class, 'dd-placement')]";

//    public void print(){
//        System.out.println(getCurrencyTextUser1 ());
//    }
//
//public String user4 (){
//        return actionsWithOurElements.getText(xpathOfUser4);
//}

    public String getFirstCurrencyWholeString(){ return actionsWithOurElements.getText(firstCurrencyWholeString); }
    public String getSecondCurrencyWholeString(){
        return actionsWithOurElements.getText(secondCurrencyWholeString);
    }
    public String getThirdCurrencyWholeString(){ return actionsWithOurElements.getText(thirdCurrencyWholeString); }
    public String getFourthCurrencyWholeString(){
        return actionsWithOurElements.getText(fourthCurrencyWholeString);
    }


    public String getFirstCurrencyName(){
        return actionsWithOurElements.getText(firstCurrencyOnlyNameString);
    }
    public String getSecondCurrencyName(){
        return actionsWithOurElements.getText(secondCurrencyOnlyNameString);
    }
    public String getThirdCurrencyName(){ return actionsWithOurElements.getText(thirdCurrencyOnlyNameString);}
    public String getFourthCurrencyName(){ return actionsWithOurElements.getText(fourthCurrencyOnlyNameString);}


    public String getFirstCurrencyPlaceNumberBeforeName(){
        String s = getFirstCurrencyWholeString();
        return s.substring(1, Math.min(s.length(), 2));
    }
    public String getSecondCurrencyPlaceNumberBeforeName(){
        String s = getSecondCurrencyWholeString();
        return s.substring(1, Math.min(s.length(), 2));
    }
    public String getThirdCurrencyPlaceNumberBeforeName(){
        String s = getThirdCurrencyWholeString();
        return s.substring(1, Math.min(s.length(), 2));
    }
    public String getFourthCurrencyPlaceNumberBeforeName(){
        String s = getFourthCurrencyWholeString();
        return s.substring(1, Math.min(s.length(), 2));
    }
//    public String getFifthCurrencyPlaceNumberBeforeName(){
//        String s = getFifthCurrencyWholeString();
//        return s.substring(1, Math.min(s.length(), 2));
//    }

//    public void print(){
//        System.out.println(getPayoutValueWithoutDollarIconUser6());
//    }
    // String str = getFirstCurrencyPercents.substring(getFirstCurrencyPercents.lastIndexOf("(") + 1, getFirstCurrencyPercents.indexOf(")"));


    public void getBetModelList(){
        List<WebElement> ListOfAllTableValues = actionsWithOurElements.getElements(xpathOfAllBetTableValues);


        for ( WebElement element : ListOfAllTableValues) {
            BetModel betModel = new BetModel();
            betModel.WAGER = Double.parseDouble(element.findElement(By.xpath(".//td[2]")).getText().replaceAll("\\$",""));
            betModel.PAYOUT = Double.parseDouble(element.findElement(By.xpath(".//td[4]")).getText().replaceAll("\\$",""));
            betModel.BETTYPE = element.findElement(By.xpath(".//td[3]")).getText();
            betModel.CURRENCYNAME = element.findElement(By.xpath(".//td[5]/a[1]")).getText();
            betModelList.add(betModel);
            logger.info("wager = " + betModel.WAGER);
            logger.info("Payout = " + betModel.PAYOUT);
            logger.info("BetType = " + betModel.BETTYPE);
            logger.info("Currency = " + betModel.CURRENCYNAME);
        }
    }

    public void getPlacementList(){
        List<WebElement> ListOfPlacementElements = actionsWithOurElements.getElements(xpathOfAllPlacementTableValues);

        for ( WebElement element : ListOfPlacementElements) {
            CurrenciesModel currenciesModel = new CurrenciesModel();
            String getString = element.findElement(By.xpath(".//span[contains(@class, 'placement-place')]")).getText();
            currenciesModel.PLACE = Integer.parseInt(getString.replaceAll("\\# ",""));
            currenciesModel.SYMBOL = element.findElement(By.xpath(".//a[1]")).getText();
            currenciesModels.add(currenciesModel);

            logger.info("PLACE = " + currenciesModel.PLACE);
            logger.info("SYMBOL = " + currenciesModel.SYMBOL);
        }
    }

    public boolean winBetsCalculations(){
        for ( BetModel bet : betModelList) {
            calculatePayout(bet);
            if (bet.PAYOUT!= bet.CHECKPAYOUT){
                return false;
            }
        }

        return true;
    }

    
    public boolean checkBet(CurrenciesModel winner, BetModel bet){
        return false;
    }

    public List<CurrenciesModel> getCurrenciesModelByPlace(List<CurrenciesModel> list, int place){
        List<CurrenciesModel> newList = new ArrayList<>();
        for ( CurrenciesModel item : list) {
            if (item.PLACE == place)
                newList.add(item);
        }

        return newList;
    }

    public List<CurrenciesModel> getCurrenciesModelAfterPlace(List<CurrenciesModel> list, int place){
        List<CurrenciesModel> newList = new ArrayList<>();
        for ( CurrenciesModel item : list) {
            if (item.PLACE > place)
                newList.add(item);
        }

        return newList;
    }

    public boolean checkBetMath(List<CurrenciesModel> list, String betType){
        for ( BetModel bet : betModelList) {
            if (bet.BETTYPE ==  betType){
                for ( CurrenciesModel item : list) {
                    if (item.SYMBOL == bet.CURRENCYNAME)
                        return true;
                }
            }
        }

        return false;
    }


    public void calculatePayout(BetModel bet) {
        List<CurrenciesModel> winners = getCurrenciesModelByPlace(currenciesModels, 1);
        List<CurrenciesModel> losers = getCurrenciesModelAfterPlace(currenciesModels,1);

        if (!checkBetMath(winners, bet.BETTYPE)) {
            winners = getCurrenciesModelByPlace(currenciesModels, 2);
            losers = getCurrenciesModelAfterPlace(currenciesModels,2);
        }

        if (bet.BETTYPE == "Win") {
            if (!checkBetMath(winners, bet.BETTYPE)) {
                winners = getCurrenciesModelByPlace(currenciesModels, 3);
                losers = getCurrenciesModelAfterPlace(currenciesModels,3);
            }
        }

        if (!checkBetMath(winners, bet.BETTYPE) || !checkBetMath(losers, bet.BETTYPE)) {
            bet.CHECKPAYOUT = bet.WAGER;
        } else {
            double calculatedOdd = calculateOdds(winners, bet);

            if (calculatedOdd > 0) {
                bet.CHECKPAYOUT = calculatedOdd * bet.WAGER + bet.WAGER;
            } else {
                bet.CHECKPAYOUT = 0;
            }
        }
    }

    public double calculateOdds(List<CurrenciesModel> winners, BetModel bet) {
        List<String> winnerSymbols = new ArrayList<>();
        for ( CurrenciesModel item : winners) {
            if (item.SYMBOL == bet.BETTYPE){
                winnerSymbols.add(item.SYMBOL);
            }
        }

        double bookmakerPercent = 0;

        int betCoef = 1; // win
        if (bet.BETTYPE == "Win")
            betCoef = 1;
        else if (bet.BETTYPE == "Place")
            betCoef = 2;
        else if (bet.BETTYPE == "Show")
            betCoef = 3;

        if (winnerSymbols.size() > 0) {
            double bookPercent = (1 - bookmakerPercent / 100);
            double grossPool = getPool(bet.BETTYPE, null);
            double securityPool = getPool(bet.BETTYPE, winnerSymbols);
            double netPool = grossPool * bookPercent - securityPool;
            double odd = netPool / securityPool;
            return odd / betCoef;
        }

        return 0;
    }

    public double getPool(String betType, List<String> currencySymbols){
        double result = 0;
        for ( BetModel bet : betModelList) {
            if (bet.BETTYPE == betType && (currencySymbols == null || currencySymbols.contains(bet.CURRENCYNAME))){
                result += bet.WAGER;
            }
        }

        return result;
    }
}
