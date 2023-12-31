public class Account {
    // Attributes
    private double balance;
    private int branchNumber;
    private int accountNumber;
    private Client accountHolder;
    private static int total;

    // Constructor
    public Account(int branchNumber, int accountNumber) {
        Account.total++;
        //System.out.println("Total Accounts: " + Account.total);
        this.branchNumber = branchNumber;
        this.accountNumber = accountNumber;
        //System.out.println("I'm creating an account!");
    }

    // Methods Getter and Setter
    public double getBalance() {
        return this.balance;
    }

    public int getBranchNumber() {
        return this.branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        if (branchNumber <= 0) {
            System.out.println("Error: Branch number less than 0.");
            return;
        }
        this.branchNumber = branchNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            System.out.println("Error: Account number less than 0.");
            return;
        }
        this.accountNumber = accountNumber;
    }

    public Client getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(Client accountHolder) {
        this.accountHolder = accountHolder;
    }

    public static int getTotal() {
        return Account.total;
    }

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
