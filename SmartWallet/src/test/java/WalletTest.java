import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;
    CreditCard creditCard;
    GiftCard giftCard;

    @Before
    public void setUp(){
        wallet = new Wallet();
        creditCard = new CreditCard("MasterCard", 13145, "Oct2026", 678,  6543);
        giftCard = new GiftCard("WHSMith", 10.00);
    }

    @Test
    public void canSelectIChargeable(){
        wallet.chooseChargeable(creditCard);
        assertEquals(creditCard, wallet.getSelectedChargeable());
    }

    @Test
    public void canPayWithSelectedIChargeable() {
        wallet.pay(10.00, giftCard);
        assertEquals(0.00, giftCard.getBalance(), 0.0);
    }

    @Test
    public void canAddNewIChargeable() {
        wallet.addNewIChargeable(giftCard);
        assertEquals(1, wallet.getIChargeables());
    }
}
