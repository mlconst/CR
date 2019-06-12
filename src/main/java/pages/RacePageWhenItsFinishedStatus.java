package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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



    public double calculateOdds(CurrenciesModel winner, BetModel bet)
    {
//        var winnerIds = winners.Select(x => (int?)x.Id);
//        if (winnerIds.Contains(Participant?.Id))
//        {
//            var bookmakerPercent = (1 - race.BookmakerPercent / 100);
//            var grossPool = race.GetPool(betType);
//            var securityPool = raceBets.Where(b => b.Type == betType && winnerIds.Contains(b.Participant?.Id)).Sum(b => b.Wager);
//            var netPool = grossPool * bookmakerPercent - securityPool;
//            var odd = netPool / securityPool;
//            return odd / ((int)betType + 1);
//        }

        return 0;
    }


    public void calculatePayout(BetModel bet) {
        List<CurrenciesModel> winners = currenciesModels.subList(0, 0);
        List<CurrenciesModel> losers = currenciesModels.subList(1, currenciesModels.size() - 1);
        Object string;
//        if (Stream.of(winners).anyMatch(string::contains));


        for (CurrenciesModel winner : winners) {


//        if ((!winners.anyMatch(g => g.anyMatch(x => x.RaceBets.anyMatch(b => b.Type == this.Type))))
//               && groupedParticipants.Count() > ((int)this.Type + 1))
            if (checkBet(winner, bet)) {

                winners = currenciesModels.subList(1, 1);
                losers = currenciesModels.subList(2, currenciesModels.size() - 1);

            }
            if (bet.BETTYPE == "Win") {
//            if ((!winners.Any(g => g.Any(x => x.RaceBets.Any(b => b.Type == this.Type))))
//                   && groupedParticipants.Count() > ((int)this.Type + 2))
                if (checkBet(winner, bet)) {
                    {
                        winners = currenciesModels.subList(2, 2);
                        losers = currenciesModels.subList(3, currenciesModels.size() - 1);
                    }
                }


//        var groupedParticipants = orderedParticipants
//                .GroupBy(x => x.Place)
//               .OrderBy(g => g.Key);

//        var winnersGroup = groupedParticipants.Take((int)this.Type + 1);
//        var losersGroup = groupedParticipants.Skip((int)this.Type + 1);


                if (true)

//        if ((!winners.Any(g => g.Any(x => x.RaceBets.Any(b => b.Type == this.Type)))) || // no winning bet or
//        (losers.Count() == 0) ||
//                (!losers.Any(g => g.Any(x => x.RaceBets.Any(b => b.Type == this.Type)))))// no losing bet
                {
                    bet.CHECKPAYOUT = bet.WAGER;
                } else {
//            var winners = winners.SelectMany(g => g.ToList());
                    double calculatedOdd = calculateOdds(winner, bet);

                    if (calculatedOdd > 0) {
                        bet.CHECKPAYOUT = calculatedOdd * bet.WAGER + bet.WAGER;


                    } else {

                        bet.CHECKPAYOUT = 0;
                    }
                }

            }


//        System.out.println(getPayoutValueUser101());

//    public String getPayoutValueWithoutDollarIconUser10(){
//        String s = getPayoutValueUser10();
//        return s.substring(s.lastIndexOf("$") + 1);
//    }


            //public String getTextNameCurrencyOfUser1(){return actionsWithOurElements.getText(xpathOfCurrencyUser1);

//    public void lala2 (){
//        System.out.println(getFirstCurrencyPercents());
//    }

//    public String percents [] = {getFourthCurrencyPercents(), getSecondCurrencyPercents(), getThirdCurrencyPercents(), getFourthCurrencyName()};
//0
//    public void lala (){
//        System.out.println(percents);
//    }


            // String getFirstCurrencyPercentsrtr = getFirstCurrencyWholeString();
            // String str = getFirstCurrencyPercents.substring(getFirstCurrencyPercents.lastIndexOf("(") + 1, getFirstCurrencyPercents.indexOf(")"));
        }
    }
}
