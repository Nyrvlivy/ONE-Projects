public class TestAccountWithoutClient {

    public static void main(String[] args) {

        Account atlasAccount = new Account();
        System.out.println(atlasAccount.getBalance());

        atlasAccount.accountHolder = new Client();
        System.out.println(atlasAccount.accountHolder);

        atlasAccount.accountHolder.name = "Atlas";
        System.out.println(atlasAccount.accountHolder.name);

    }

}
