public class Manager extends Employee {
    //Attributes
    private int password;
    // Constructors
    public Manager() {
    }
    // Methods
    public boolean authenticate(int password){
        //return this.password == password;
        if (this.password == password){
            return true;
        } return false;
    }
    public double getBonusPayment(){
        return super.getBonusPayment() + super.getSalary();
    }

    // Methods Getter and Setter
    public void setPassword(int password) {
        this.password = password;
    }
}

