public class Employee {
    //Attributes
    private String name;
    private String cpf;
    private double salary;
    // Constructors
    public Employee() {
    }
    // Methods
    public double getBonusPayment(){
        return this.salary * 0.05;
    }
    // Methods Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

