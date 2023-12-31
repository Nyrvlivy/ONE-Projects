public class BonusPaymentControl {

    private double total;

    public void register(Employee e) {
        double bonus = e.getBonusPayment();
        this.total += bonus;
    }

    public double getTotal() {
        return total;
    }
}
