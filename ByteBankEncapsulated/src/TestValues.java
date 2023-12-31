public class TestValues {

    public static void main(String[] args) {

        Account x = new Account(1337, 24226);
        x.setBranchNumber(-50);
        x.setAccountNumber(-330);

        System.out.println(x.getBranchNumber());

        Account y = new Account(1337, 16549);

        System.out.println("Total Accounts: " + Account.getTotal());



    }

}
