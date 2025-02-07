
import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value to check whether is it positive, negative or zero...");
        double value = in.nextDouble();

        if (value > 0) {
            System.out.println(value + " is positive");
        } else if (value < 0) {
            System.out.println(value + " is negative");
        } else if (value == 0) {
            System.out.println(value + " is zero");
        }
    }
}
