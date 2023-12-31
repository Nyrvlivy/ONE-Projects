public class TestSummation {

    public static void main(String[] args) {
        int count = 0;
        int total = 0;

        while (count <= 10) {
            total += count;
            count += 1;
        }
        System.out.println(total);
    }

}
