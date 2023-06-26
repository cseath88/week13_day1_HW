import java.util.ArrayList;

public class PaymentCard extends Card{

    private int cardNumber;
    private String expiryDate;
    private int securityNum;
    private ArrayList<Double> transactions;

    public PaymentCard(String name, int cardNumber, String expiryDate, int securityNum){
        super(name);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNum = securityNum;
        this.transactions = new ArrayList<Double>();
    }

    public void logTransactions(double transaction){
        transactions.add(transaction);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
