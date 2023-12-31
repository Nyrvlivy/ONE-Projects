public class TestLoops {

    public static void main(String[] args) {

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println("Table of " + multiplier);
            for (int count = 0; count <= 10; count++) {
                System.out.print(multiplier * count);
                System.out.print(" ");
            }
            System.out.println();
            System.out.println("___");
        }

    }

}
