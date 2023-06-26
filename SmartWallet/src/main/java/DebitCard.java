import java.util.ArrayList;

public class DebitCard extends PaymentCard{

    private int accountNum;
    private String sortCode;

    public DebitCard(String name, int cardNumber, String expiryDate, int securityNum, int accountNum, String sortCode){
        super(name, cardNumber, expiryDate, securityNum);
        this.accountNum = accountNum;
        this.sortCode = sortCode;
    }


}
