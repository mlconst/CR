package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RacePageWhenItsFinishedStatus extends ParentAdminPage{
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

    String xpathOfNameUser1 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[1]";
    String xpathOfNameUser2 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]";
    String xpathOfNameUser3 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[1]";
    String xpathOfNameUser4 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[4]/td[1]";
    String xpathOfNameUser5 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[5]/td[1]";
    String xpathOfNameUser6 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[6]/td[1]";
    String xpathOfNameUser7 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[7]/td[1]";
    String xpathOfNameUser8 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[8]/td[1]";
    String xpathOfNameUser9 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[9]/td[1]";
    String xpathOfNameUser10 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[10]/td[1]";


    String xpathOfWagerUser1 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[2]";
    String xpathOfWagerUser2 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]";
    String xpathOfWagerUser3 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[2]";
    String xpathOfWagerUser4 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[4]/td[2]";
    String xpathOfWagerUser5 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[5]/td[2]";
    String xpathOfWagerUser6 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[6]/td[2]";
    String xpathOfWagerUser7 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[7]/td[2]";
    String xpathOfWagerUser8 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[8]/td[2]";
    String xpathOfWagerUser9 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[9]/td[2]";
    String xpathOfWagerUser10 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[10]/td[2]";


    String xpathOfAllTableValues = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr";

    String xpathOfBetTypeUser1 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[3]";
    String xpathOfBetTypeUser2 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]";
    String xpathOfBetTypeUser3 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[3]";
    String xpathOfBetTypeUser4 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[4]/td[3]";
    String xpathOfBetTypeUser5 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[5]/td[3]";
    String xpathOfBetTypeUser6 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[6]/td[3]";
    String xpathOfBetTypeUser7 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[7]/td[3]";
    String xpathOfBetTypeUser8 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[8]/td[3]";
    String xpathOfBetTypeUser9 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[9]/td[3]";
    String xpathOfBetTypeUser10 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[10]/td[3]";


    String xpathOfPayoutUser1 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[4]";
    String xpathOfPayoutUser2 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[4]";
    String xpathOfPayoutUser3 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[4]";
    String xpathOfPayoutUser4 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[4]/td[4]";
    String xpathOfPayoutUser5 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[5]/td[4]";
    String xpathOfPayoutUser6 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[6]/td[4]";
    String xpathOfPayoutUser7 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[7]/td[4]";
    String xpathOfPayoutUser8 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[8]/td[4]";
    String xpathOfPayoutUser9 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[9]/td[4]";
    String xpathOfPayoutUser10 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[10]/td[4]";

    String xpathOfCurrencyUser1 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]";
    String xpathOfCurrencyUser2 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[5]/a[1]";
    String xpathOfCurrencyUser3 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[5]/a[1]";
    String xpathOfCurrencyUser4 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[4]/td[5]/a[1]";
    String xpathOfCurrencyUser5 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[5]/td[5]/a[1]";
    String xpathOfCurrencyUser6 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[6]/td[5]/a[1]";
    String xpathOfCurrencyUser7 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[7]/td[5]/a[1]";
    String xpathOfCurrencyUser8 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[8]/td[5]/a[1]";
    String xpathOfCurrencyUser9 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[9]/td[5]/a[1]";
    String xpathOfCurrencyUser10 = "/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[10]/td[5]/a[1]";







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


    public String getNameOfUser1(){return actionsWithOurElements.getText(xpathOfNameUser1); }
    public String getNameOfUser2(){return actionsWithOurElements.getText(xpathOfNameUser2); }
    public String getNameOfUser3(){return actionsWithOurElements.getText(xpathOfNameUser3); }
    public String getNameOfUser4(){return actionsWithOurElements.getText(xpathOfNameUser4); }
    public String getNameOfUser5(){return actionsWithOurElements.getText(xpathOfNameUser5); }
    public String getNameOfUser6(){return actionsWithOurElements.getText(xpathOfNameUser6); }


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



    public String getWagerValueUser1(){ return actionsWithOurElements.getText(xpathOfWagerUser1); }
    public String getWagerValueWithoutDollarIconUser1(){
        String s = getWagerValueUser1();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getWagerValueUser2(){ return actionsWithOurElements.getText(xpathOfWagerUser2); }
    public String getWagerValueWithoutDollarIconUser2(){
        String s = getWagerValueUser2();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getWagerValueUser3(){ return actionsWithOurElements.getText(xpathOfWagerUser3); }
    public String getWagerValueWithoutDollarIconUser3(){
        String s = getWagerValueUser3();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getWagerValueUser4(){ return actionsWithOurElements.getText(xpathOfWagerUser4); }
    public String getWagerValueWithoutDollarIconUser4(){
        String s = getWagerValueUser4();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getWagerValueUser5(){ return actionsWithOurElements.getText(xpathOfWagerUser5); }
    public String getWagerValueWithoutDollarIconUser5(){
        String s = getWagerValueUser5();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getWagerValueUser6(){ return actionsWithOurElements.getText(xpathOfWagerUser6); }
    public String getWagerValueWithoutDollarIconUser6(){
        String s = getWagerValueUser6();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getWagerValueUser7(){ return actionsWithOurElements.getText(xpathOfWagerUser7); }
    public String getWagerValueWithoutDollarIconUser7(){
        String s = getWagerValueUser7();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getWagerValueUser8(){ return actionsWithOurElements.getText(xpathOfWagerUser8); }
    public String getWagerValueWithoutDollarIconUser8(){
        String s = getWagerValueUser8();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getWagerValueUser9(){ return actionsWithOurElements.getText(xpathOfWagerUser9); }
    public String getWagerValueWithoutDollarIconUser9(){
        String s = getWagerValueUser9();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getWagerValueUser10(){ return actionsWithOurElements.getText(xpathOfWagerUser10); }
    public String getWagerValueWithoutDollarIconUser10(){
        String s = getWagerValueUser10();
        return s.substring(s.lastIndexOf("$") + 1);
    }





    public String getPayoutValueUser1(){ return actionsWithOurElements.getText(xpathOfPayoutUser1); }
    public String getPayoutValueWithoutDollarIconUser1(){
        String s = getPayoutValueUser1();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getPayoutValueUser2(){ return actionsWithOurElements.getText(xpathOfPayoutUser2); }
    public String getPayoutValueWithoutDollarIconUser2(){
        String s = getPayoutValueUser2();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getPayoutValueUser3(){ return actionsWithOurElements.getText(xpathOfPayoutUser3); }
    public String getPayoutValueWithoutDollarIconUser3(){
        String s = getPayoutValueUser3();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getPayoutValueUser4(){ return actionsWithOurElements.getText(xpathOfPayoutUser4); }
    public String getPayoutValueWithoutDollarIconUser4(){
        String s = getPayoutValueUser4();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getPayoutValueUser5(){ return actionsWithOurElements.getText(xpathOfPayoutUser5); }
    public String getPayoutValueWithoutDollarIconUser5(){
        String s = getPayoutValueUser5();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getPayoutValueUser6(){ return actionsWithOurElements.getText(xpathOfPayoutUser6); }
    public String getPayoutValueWithoutDollarIconUser6(){
        String s = getPayoutValueUser6();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getPayoutValueUser7(){ return actionsWithOurElements.getText(xpathOfPayoutUser7); }
    public String getPayoutValueWithoutDollarIconUser7(){
        String s = getPayoutValueUser7();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getPayoutValueUser8(){ return actionsWithOurElements.getText(xpathOfPayoutUser8); }
    public String getPayoutValueWithoutDollarIconUser8(){
        String s = getPayoutValueUser8();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getPayoutValueUser9(){ return actionsWithOurElements.getText(xpathOfPayoutUser9); }
    public String getPayoutValueWithoutDollarIconUser9(){
        String s = getPayoutValueUser9();
        return s.substring(s.lastIndexOf("$") + 1);
    }
    public String getPayoutValueUser10(){ return actionsWithOurElements.getText(xpathOfPayoutUser10); }
    public String getPayoutValueWithoutDollarIconUser10(){
        String s = getPayoutValueUser10();
        return s.substring(s.lastIndexOf("$") + 1);
    }


//    public void print(){
//        System.out.println(getPayoutValueWithoutDollarIconUser6());
//    }
    // String str = getFirstCurrencyPercents.substring(getFirstCurrencyPercents.lastIndexOf("(") + 1, getFirstCurrencyPercents.indexOf(")"));

    public String getBetTypeTextUser1(){ return actionsWithOurElements.getText(xpathOfBetTypeUser1); }
    public String getBetTypeTextUser2(){ return actionsWithOurElements.getText(xpathOfBetTypeUser2); }
    public String getBetTypeTextUser3(){ return actionsWithOurElements.getText(xpathOfBetTypeUser3); }
    public String getBetTypeTextUser4(){ return actionsWithOurElements.getText(xpathOfBetTypeUser4); }
    public String getBetTypeTextUser5(){ return actionsWithOurElements.getText(xpathOfBetTypeUser5); }
    public String getBetTypeTextUser6(){ return actionsWithOurElements.getText(xpathOfBetTypeUser6); }
    public String getBetTypeTextUser7(){ return actionsWithOurElements.getText(xpathOfBetTypeUser7); }
    public String getBetTypeTextUser8(){ return actionsWithOurElements.getText(xpathOfBetTypeUser8); }
    public String getBetTypeTextUser9(){ return actionsWithOurElements.getText(xpathOfBetTypeUser9); }
    public String getBetTypeTextUser10(){ return actionsWithOurElements.getText(xpathOfBetTypeUser10); }


    public void getAllTableValues(){
        List<WebElement> ListOfAllTableValues = actionsWithOurElements.getElements(xpathOfAllTableValues);


        for ( WebElement element : ListOfAllTableValues) {

            BetModel betModel = new BetModel();
//            betModel.WAGER = Double.parseDouble(element.findElement(By.xpath(".//td[2]")).getText());
//            betModel.PAYOUT = Double.parseDouble(element.findElement(By.xpath(".//td[4]")).getText());
            betModel.WAGER = element.findElement(By.xpath(".//td[2]")).getText();
            betModel.PAYOUT = element.findElement(By.xpath(".//td[4]")).getText();
            betModel.BETTYPE = element.findElement(By.xpath(".//td[3]")).getText();
            betModel.CURRENCYNAME = element.findElement(By.xpath(".//td[5]/a[1]")).getText();
            logger.info("wager = " + betModel.WAGER);
            logger.info("Payout = " + betModel.PAYOUT);
            logger.info("BetType = " + betModel.BETTYPE);
            logger.info("Currency = " + betModel.CURRENCYNAME);

        } {

        }
    }




    public String getCurrencyTextNameUser1(){ return actionsWithOurElements.getText(xpathOfCurrencyUser1); }
    public String getCurrencyTextNameUser2(){ return actionsWithOurElements.getText(xpathOfCurrencyUser2); }
    public String getCurrencyTextNameUser3(){ return actionsWithOurElements.getText(xpathOfCurrencyUser3); }
    public String getCurrencyTextNameUser4(){ return actionsWithOurElements.getText(xpathOfCurrencyUser4); }
    public String getCurrencyTextNameUser5(){ return actionsWithOurElements.getText(xpathOfCurrencyUser5); }
    public String getCurrencyTextNameUser6(){ return actionsWithOurElements.getText(xpathOfCurrencyUser6); }
    public String getCurrencyTextNameUser7(){ return actionsWithOurElements.getText(xpathOfCurrencyUser7); }
    public String getCurrencyTextNameUser8(){ return actionsWithOurElements.getText(xpathOfCurrencyUser8); }
    public String getCurrencyTextNameUser9(){ return actionsWithOurElements.getText(xpathOfCurrencyUser9); }
    public String getCurrencyTextNameUser10(){ return actionsWithOurElements.getText(xpathOfCurrencyUser10); }


    public void st (){
//        System.out.println(getPayoutValueUser101());
    }
//    public String getPayoutValueWithoutDollarIconUser10(){
//        String s = getPayoutValueUser10();
//        return s.substring(s.lastIndexOf("$") + 1);
//    }





    public String getTextNameCurrencyOfUser1(){return actionsWithOurElements.getText(xpathOfCurrencyUser1);
    }

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
