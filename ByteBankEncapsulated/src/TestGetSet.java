public class TestGetSet {

    public static void main(String[] args) {

        Account account = new Account(1337, 24226);
        account.setAccountNumber(1337);
        System.out.println(account.getAccountNumber());

        Client fred = new Client();
        account.setAccountHolder(fred);
        account.getAccountHolder().setName("Frederico The Cat");

        System.out.println("Name: " + account.getAccountHolder().getName() + ".");


    }

}
