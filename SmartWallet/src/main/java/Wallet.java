import java.util.ArrayList;
import java.util.List;

public class Wallet{
    private List<IChargeable> chargeables;
    private IChargeable selectedChargeable;

    public Wallet() {
        chargeables = new ArrayList<>();
        selectedChargeable = null;
    }

    public void chooseChargeable(IChargeable chargeable) {
        selectedChargeable = chargeable;
    }

    public IChargeable getSelectedChargeable(){
        return selectedChargeable;
    }

    public int getIChargeables() {
        return chargeables.size();
    }

    public void pay(double amount, IChargeable chargeable) {
        chooseChargeable(chargeable);
        chargeable.charge(amount);
    }

    public void addNewIChargeable(IChargeable chargeable) {
        chargeables.add(chargeable);
    }
}
