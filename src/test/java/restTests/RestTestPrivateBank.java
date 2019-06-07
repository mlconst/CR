package restTests;

import org.junit.Test;
import restSteps.privateBank.Get;
import restSteps.privateBank.CurrencyValues;

public class RestTestPrivateBank {

    @Test
    public void getCursDetails(){
        Get apiPrivateBank = new Get();

        CurrencyValues[] responseStructure = apiPrivateBank.getRequestToPrivateBankApi(5);

        for (CurrencyValues currencyElement : responseStructure ) {
            System.out.println("Cur " + currencyElement.ccy + " to " + currencyElement.base_ccy + " has for buy " + currencyElement.buy + " and for sale " + currencyElement.sale);
        }
    }
}

