public class CheckingAccount extends BankAccount {
    // Static constant representing the cost of clearing one check
    private static final double FEE = 0.15;

    // Constructor
    public CheckingAccount(String name, double amount) {
        super(name, amount);
        setAccountNumber(getAccountNumber() + "-10");
    }

    // Override withdraw method
    @Override
    public boolean withdraw(double amount) {
        // Add fee for check clearing
        amount += FEE;
        // Call withdraw method from superclass
        return super.withdraw(amount);
    }
}
