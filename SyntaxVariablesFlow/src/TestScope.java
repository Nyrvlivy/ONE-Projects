public class TestScope {

    public static void main(String[] args) {

        System.out.println("Testing Conditionals.");

        int age = 16;
        int peopleCount = 3;
        // boolean accompanied = peopleCount >= 2;
        boolean accompanied;

        if(peopleCount >= 2){
            accompanied = true;
        } else {
            accompanied = false;
        }

        if (age >= 18 || accompanied) {
            System.out.println("Value of field 'accompanied': " + accompanied + ".");
            System.out.println("You are Welcome!");
        } else {
            System.out.println("You are underage and not accompanied!");
            System.out.println("Sorry! You are not allowed!");
        }

    }

}
