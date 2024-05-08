public class SavingsAccount extends BankAccount {
    // New instance variable to hide the accountNumber variable from the superclass
    private String accountNumber;

    // Constructor
    public SavingsAccount(String owner, int amount) {
        super(owner, amount);
        this.accountNumber = generateUniqueAccountNumber();
    }

    // Constructor to create a new account based on an existing one
    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount.getOwner(), amount);
        this.accountNumber = generateUniqueAccountNumber();
    }
    
    // Method to generate a unique account number for SavingsAccount
    private String generateUniqueAccountNumber() {
        // You can implement your logic to generate a unique account number here
        // For example, concatenate a prefix or generate a random number
        return "SA-" + super.getAccountNumber();
    }

    // Method to post interest to the savings account balance
    public void postInterest() {
        // Add your logic to calculate and post interest here
        // For example:
        double interestRate = 0.05; // Example interest rate (5%)
        double interest = getBalance() * interestRate;
        deposit(interest); // Add the interest to the account balance
    }
}
