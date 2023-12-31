public class TestBank {

    public static void main(String[] args) {

        Client buna = new Client();
        buna.name = "Bruna Massi Paiva";
        buna.cpf = "438.644.668-06";
        buna.profession = "Junior Java Back-End Developer";

        Account bunaAccount = new Account();
        bunaAccount.deposit(100);

        bunaAccount.accountHolder = buna;

        System.out.println("The Account Holder is " + bunaAccount.accountHolder.name + ".");
    }

}
