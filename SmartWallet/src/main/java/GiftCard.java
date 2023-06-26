public class GiftCard extends Card implements IChargeable {

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

    public void charge(double amount) {
        balance -= amount;
    }
}
