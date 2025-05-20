public class CreditCard implements Valuable {
    private double balance; // amount owed

    public void charge(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return -balance;
    }
}
