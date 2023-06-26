import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;

    private double transaction1;

    @Before
    public void setUp(){
        creditCard = new CreditCard("MasterCard", 13145, "Oct2026", 678,  6543);

    }

    @Test
    public void canAddPercentage() {
        double transaction1 = 10.00;
        assertEquals(10.10, creditCard.addPercentage(transaction1, 1), 0.0);
    }

    @Test
    public void canLogTransactions(){
        double transaction1 = 10.00;
        creditCard.logTransactions(transaction1);
        assertEquals(1, creditCard.getTransactions().size());
    }

    @Test
    public void canReduceCredit() {
        creditCard.charge(10.00);
        assertEquals(6533, creditCard.getAvailableCredit(), 0.0);
    }
}
