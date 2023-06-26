import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;
    private double transaction1;
    private double transaction2;

    @Before
    public void setUp(){
        debitCard = new DebitCard("RBSDebit", 12345, "Sep2025", 987,  76543,"20-45-30", 1500);
    }

    @Test
    public void canLogTransactions(){
        double transaction1 = 10.00;
        double transaction2 = 30.00;
        debitCard.logTransactions(transaction1);
        debitCard.logTransactions(transaction2);
        assertEquals(2, debitCard.getTransactions().size());
    }
}
