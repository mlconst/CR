package pages;

import org.openqa.selenium.WebDriver;

public class PlayPage extends ParentFrontEndPage {
    public PlayPage(WebDriver webDriver) {
        super(webDriver);
    }

    private String parentXPath = "./..";

//    private String childXPath = ".//td";

 //   private int indexOfAcceptingBetsButton = 3;

    public String getParticularRaceName(String newRaceName){
        return "//span[contains(text(),\'" + newRaceName + "\')]";
    }

    public void findAndClickOnAcceptingBets(String newRaceName) {
        actionsWithOurElements.findAndClickNeededButton(getParticularRaceName(newRaceName) );
    }
}
