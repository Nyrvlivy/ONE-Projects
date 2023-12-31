public class TestMethod {

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.balance = 100;
        account1.deposit(50);

        System.out.println("This account1 has $" + account1.balance + ".");

        boolean successfulWithdraw = account1.withdraw(20);

        System.out.println("Withdraw Result: " + successfulWithdraw + ".");
        System.out.println("New account1 balance: $" + account1.balance + ".");

        Account account2 = new Account();
        account2.balance = 1000;

        boolean statusTransfer = account2.transfer(300, account1);
        if (statusTransfer) {
            System.out.println("Successful Transfer! Now, your account has $" + account2.balance + ".");
        } else {
            System.out.println("Error! Unsuccessful transfer!");
        }

        System.out.println("New account1 balance 2: $" + account1.balance + ".");

        System.out.println("_______________________________________");

        account1.accountHolder = "Buna Bones Broker";

    }

}
