//his means that you should include
// a BankAccount class that has both
// withdraw and deposit methods. We also need to include debt.

public class BankAccount implements Valuable {
    private double balance;

    public  void deposit (double amount) {
        balance = balance + amount;

    }

    public  void withdraw (double amount) {
        balance = balance - amount;

    }

    @Override
   public double getValue () {
        return this.balance;

    }

}
