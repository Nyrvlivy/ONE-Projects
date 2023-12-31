public class TestNegativeWithdrawal {

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(100);
        account.withdraw(200);
        // System.out.println(account.withdraw(200));

        // System.out.println("Account Balance: $" + account.balance);

        // Not allowed
        //account.balance -= 101;

        System.out.println(account.getBalance());

    }

}
