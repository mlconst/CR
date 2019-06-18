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

//    String firstCurrencyWholeString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[21]";
//    String secondCurrencyWholeString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[22]";
//    String thirdCurrencyWholeString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[23]";
//    String fourthCurrencyWholeString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[24]";
//
//    String firstCurrencyOnlyNameString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[21]/a[1]";
//    String secondCurrencyOnlyNameString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[22]/a[1]";
//    String thirdCurrencyOnlyNameString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[23]/a[1]";
//    String fourthCurrencyOnlyNameString = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[24]/a[1]";

    String xpathOfAllBetTableValues = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr";
    String xpathOfAllPlacementTableValues = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[contains(@class, 'dd-placement')]";
    String xpathBookmakerPercent = "/html[1]/body[1]/div[2]/form[1]/div[1]/dl[1]/dd[9]";

//    public void print(){
//        System.out.println(getCurrencyTextUser1 ());
//    }
//
//public String user4 (){
//        return actionsWithOurElements.getText(xpathOfUser4);
//}

//    public String getFirstCurrencyWholeString(){ return actionsWithOurElements.getText(firstCurrencyWholeString); }
//    public String getSecondCurrencyWholeString(){
//        return actionsWithOurElements.getText(secondCurrencyWholeString);
//    }
//    public String getThirdCurrencyWholeString(){ return actionsWithOurElements.getText(thirdCurrencyWholeString); }
//    public String getFourthCurrencyWholeString(){
//        return actionsWithOurElements.getText(fourthCurrencyWholeString);
//    }
//
//
//    public String getFirstCurrencyName(){
//        return actionsWithOurElements.getText(firstCurrencyOnlyNameString);
//    }
//    public String getSecondCurrencyName(){
//        return actionsWithOurElements.getText(secondCurrencyOnlyNameString);
//    }
//    public String getThirdCurrencyName(){ return actionsWithOurElements.getText(thirdCurrencyOnlyNameString);}
//    public String getFourthCurrencyName(){ return actionsWithOurElements.getText(fourthCurrencyOnlyNameString);}
//
//
//    public String getFirstCurrencyPlaceNumberBeforeName(){
//        String s = getFirstCurrencyWholeString();
//        return s.substring(1, Math.min(s.length(), 2));
//    }
//    public String getSecondCurrencyPlaceNumberBeforeName(){
//        String s = getSecondCurrencyWholeString();
//        return s.substring(1, Math.min(s.length(), 2));
//    }
//    public String getThirdCurrencyPlaceNumberBeforeName(){
//        String s = getThirdCurrencyWholeString();
//        return s.substring(1, Math.min(s.length(), 2));
//    }
//    public String getFourthCurrencyPlaceNumberBeforeName(){
//        String s = getFourthCurrencyWholeString();
//        return s.substring(1, Math.min(s.length(), 2));
//    }
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
//            logger.info("wager = " + betModel.WAGER);
//            logger.info("Payout = " + betModel.PAYOUT);
//            logger.info("BetType = " + betModel.BETTYPE);
//            logger.info("Currency = " + betModel.CURRENCYNAME);
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
//            logger.info("PLACE = " + currenciesModel.PLACE);
//            logger.info("SYMBOL = " + currenciesModel.SYMBOL);
        }
    }

    public boolean winBetsCalculations(){
        for ( BetModel bet : betModelList) {
            calculatePayout(bet);
            if (bet.PAYOUT!= bet.CHECKPAYOUT){
                logger.info("FAILED: " + bet.CURRENCYNAME + ", " + bet.BETTYPE +",  " + "WAGER:" + bet.WAGER + ", " + "PAYOUT:" + bet.PAYOUT + ", " + "CHECKPAYOUT:" + bet.CHECKPAYOUT );
                return false;
            }
        }
        return true;
    }

    public List<CurrenciesModel> getCurrenciesModelByPlace(List<CurrenciesModel> list, int skip, int take){
        List<CurrenciesModel> newList = new ArrayList<>();
        for ( CurrenciesModel item : list) {
            if (item.PLACE > skip && item.PLACE <= skip+take)
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

    public boolean checkBetMatch(List<CurrenciesModel> list, String betType){
        for ( BetModel bet : betModelList) {
            if (bet.BETTYPE.equals(betType)){
                for ( CurrenciesModel item : list) {
                    if (item.SYMBOL.equals(bet.CURRENCYNAME))
                        return true;
                }
            }
        }
        return false;
    }


    public void calculatePayout(BetModel bet) {
        int betTypeIndex = 1; // win
        if (bet.BETTYPE.equals("Win"))
            betTypeIndex = 1;
        else if (bet.BETTYPE.equals("Place"))
            betTypeIndex = 2;
        else if (bet.BETTYPE.equals("Show"))
            betTypeIndex = 3;

        List<CurrenciesModel> winners = getCurrenciesModelByPlace(currenciesModels, 0, betTypeIndex);
        List<CurrenciesModel> losers = getCurrenciesModelAfterPlace(currenciesModels,betTypeIndex);

        if (!checkBetMatch(winners, bet.BETTYPE)) {
            winners = getCurrenciesModelByPlace(currenciesModels, betTypeIndex, 1);
            losers = getCurrenciesModelAfterPlace(currenciesModels,betTypeIndex + 1);
        }

        if (bet.BETTYPE.equals("Win")) {
            if (!checkBetMatch(winners, bet.BETTYPE)) {
                winners = getCurrenciesModelByPlace(currenciesModels, betTypeIndex + 1, 1);
                losers = getCurrenciesModelAfterPlace(currenciesModels,betTypeIndex + 2);
            }
        }

        if (!checkBetMatch(winners, bet.BETTYPE) || !checkBetMatch(losers, bet.BETTYPE)) {
            bet.CHECKPAYOUT = (double)Math.floor(bet.WAGER * 100d) / 100d;
            logger.info("REFUND: " + bet.CURRENCYNAME + ", " + bet.BETTYPE +",  " + "WAGER:" + bet.WAGER + ", " + "PAYOUT:" + bet.PAYOUT + ", " + "CHECKPAYOUT:" + bet.CHECKPAYOUT );
        } else {
            double calculatedOdd = calculateOdds(winners, bet);
            if (calculatedOdd > 0) {
                bet.CHECKPAYOUT = (double)Math.floor((calculatedOdd * bet.WAGER + bet.WAGER) * 100d) / 100d;
            } else {
                bet.CHECKPAYOUT = 0;
            }
            logger.info("ODD: " + calculatedOdd + ", " + bet.CURRENCYNAME + ", " + bet.BETTYPE +",  " + "WAGER:" + bet.WAGER + ", " + "PAYOUT:" + bet.PAYOUT + ", " + "CHECKPAYOUT:" + bet.CHECKPAYOUT );
        }
    }

    public double calculateOdds(List<CurrenciesModel> winners, BetModel bet) {
        List<String> winnerSymbols = new ArrayList<>();
        for ( CurrenciesModel item : winners) {
            if (item.SYMBOL.equals(bet.CURRENCYNAME)){
                winnerSymbols.add(item.SYMBOL);
            }
        }

        int betCoef = 1; // win
        if (bet.BETTYPE.equals("Win"))
            betCoef = 1;
        else if (bet.BETTYPE.equals("Place"))
            betCoef = 2;
        else if (bet.BETTYPE.equals("Show"))
            betCoef = 3;

        if (winnerSymbols.size() > 0) {
            double bookPercent = Math.round((1 - bookmakerPercent / 100) * 100d) / 100d;
            double grossPool = getPool(bet.BETTYPE, null);
            double securityPool = getPool(bet.BETTYPE, winnerSymbols);
            double netPool = Math.round((grossPool * bookPercent - securityPool) * 100d) / 100d;
            //double odd = Math.round(netPool / securityPool * 100d) / 100d;
            double odd = netPool / securityPool;
            return odd / betCoef;
        }

        return 0;
    }

    public double getPool(String betType, List<String> currencySymbols){
        double result = 0;
        for ( BetModel bet : betModelList) {
            if (bet.BETTYPE.equals(betType) && (currencySymbols == null || currencySymbols.contains(bet.CURRENCYNAME))){
                result += bet.WAGER;
            }
        }

        return result;
    }


    public void getBookmakerPercent() {
        bookmakerPercent = Double.parseDouble(actionsWithOurElements.getText(xpathBookmakerPercent));
    }
}
