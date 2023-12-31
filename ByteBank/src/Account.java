public class Account {
    // Attributes
    double balance;
    int branchNumber;
    int accountNumber;
    String accountHolder;

    // Methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;

    }

    public boolean transfer(double amount, Account destination) {
        if (this.balance >= amount) {
            if (this.withdraw(amount)) {
                destination.deposit(amount);
                return true;
            }
        }
        return false;
    }


}
