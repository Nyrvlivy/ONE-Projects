public class AccountCreator {

    public static void main(String[] args) {

        Account firstAccount = new Account();
        firstAccount.balance = 200;

        System.out.println(firstAccount.balance);

        firstAccount.balance += 100;

        System.out.println(firstAccount.balance);

        Account secondAccount = new Account();
        secondAccount.balance = 300;

        System.out.println("The first account has $" + firstAccount.balance + ".");
        System.out.println("The second account has $" + secondAccount.balance + ".");

        System.out.println(firstAccount.branchNumber);
        System.out.println(firstAccount.accountNumber);

        /*
        if(firstAccount == secondAccount){

            System.out.println("Are the same!");
        }
        */

        System.out.println(firstAccount);
        System.out.println(secondAccount);

    }
}
