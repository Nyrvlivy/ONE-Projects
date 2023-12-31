public class TestReference {

    public static void main(String[] args) {

        Account firstAccount = new Account();
        firstAccount.balance = 300;

        System.out.println("Balance of first account: " + firstAccount.balance  + ".");

        Account secondAccount = firstAccount;

        System.out.println("Balance of second account: " + secondAccount.balance  + ".");

        secondAccount.balance += 100;

        System.out.println("New balance of first account: " + firstAccount.balance  + ".");

        if(firstAccount == secondAccount){

            System.out.println("Are the same!");
        }

        System.out.println(firstAccount);
        System.out.println(secondAccount);

    }

}
