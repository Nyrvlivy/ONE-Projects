import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestReferences {

    public static void main(String[] args) {

        Employee m1 = new Manager();
        m1.setName("Luck");
        m1.setSalary(5000.0);

        Employee e1 = new Employee();
        e1.setName("Atlas");
        e1.setSalary(2000.0);

        Employee c1 = new Cashier();
        c1.setName("Oreo");
        c1.setSalary(2500.0);

        BonusPaymentControl control = new BonusPaymentControl();
        control.register(m1);
        control.register(e1);
        control.register(c1);

        System.out.println(control.getTotal());


    }
}
