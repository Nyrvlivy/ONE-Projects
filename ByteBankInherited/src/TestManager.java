public class TestManager {

    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.setName("Fred");
        m1.setCpf("456.789.123-05");
        m1.setSalary(12000.00);

        System.out.println(m1.getName());
        System.out.println(m1.getCpf());
        System.out.println(m1.getSalary());

        m1.setPassword(1010);
        boolean authenticated = m1.authenticate(1010);
        System.out.println(authenticated);

        System.out.println(m1.getBonusPayment());


    }

}
