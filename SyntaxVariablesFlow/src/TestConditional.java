import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class TestConditional {

    public static void main(String[] args) {

        System.out.println("Testing Conditionals.");

        int age = 16;
        int peopleCount = 3;

        if (age >= 18) {
            System.out.println("You are of legal age!");
            System.out.println("Welcome!");
        } else {
            if (peopleCount >= 2) {
                System.out.println("You are underage, but you are accompanied!");
                System.out.println("Welcome!");
            } else {
                System.out.println("You are underage!");
                System.out.println("Sorry! You are not allowed!");
            }

        }

    }

}
