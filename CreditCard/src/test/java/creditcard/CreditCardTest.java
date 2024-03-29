package creditcard;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CreditCardTest {

    @Test
    void itAssignCredit(){
        //Arrange
        var card  = new CreditCard();


        //Act
        card.assignCredit(BigDecimal.valueOf(1000));


        //Assert

        assert BigDecimal.valueOf(1000).equals(card.getBalance());
    }
    @Test
    void itAssignCreditV2(){
        //Arrange
        var card  = new CreditCard();


        //Act
        card.assignCredit(BigDecimal.valueOf(1500));


        //Assert

        assert BigDecimal.valueOf(1500).equals(card.getBalance());
    }

    @Test
    void itDenyCreditBelowThreshold() throws CreditBellowThresholdException {
        var card = new CreditCard();
        card.assignCredit(BigDecimal.valueOf(50));
        if (true) throw new AssertionError();
    }

}
