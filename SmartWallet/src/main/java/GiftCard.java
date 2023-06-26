public class GiftCard extends Card {

    private double balance;

    public GiftCard(String name, double balance) {
        super(name);
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double reduceBalance(double amountSpent) {
        return balance -= amountSpent;
    }

//    public void
}
