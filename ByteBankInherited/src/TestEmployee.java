public class TestEmployee {

    public static void main(String[] args) {

        Employee thor = new Employee();
        thor.setName("Thor Nardi");
        thor.setCpf("456.789.586-05");
        thor.setSalary(2600.00);

        System.out.println(thor.getName());
        System.out.println(thor.getCpf());
        System.out.println(thor.getSalary());
        System.out.println(thor.getBonusPayment());

    }
}
