public class CreditCard extends PaymentCard implements IChargeable{

    private double availableCredit;

    public CreditCard(String name, int cardNumber, String expiryDate, int securityNum, double availableCredit) {
        super(name, cardNumber, expiryDate, securityNum);
        this.availableCredit = availableCredit;
    }

    public double addPercentage(double transaction, int percentage) {
        return transaction + (percentage / 100.0) * transaction;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public void charge(double amount) {
        availableCredit -= amount;
    }

}
