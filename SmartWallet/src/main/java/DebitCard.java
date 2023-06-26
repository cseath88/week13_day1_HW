import java.util.ArrayList;

public class DebitCard extends PaymentCard implements IChargeable{

    private int accountNum;
    private String sortCode;

    private double balance;

    public DebitCard(String name, int cardNumber, String expiryDate, int securityNum, int accountNum, String sortCode, double balance){
        super(name, cardNumber, expiryDate, securityNum);
        this.accountNum = accountNum;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public void charge(double amount) {
        balance -= amount;
    }
}
