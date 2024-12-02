import java.util.Scanner;

public class NumberFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value:");
        int val = input.nextInt();

        System.out.println("The factors of " + val + " are:");
        for (int i = 1; i <= val; i++) {
            // to prevent the last comma
            if (i == val) {
                System.out.print(i + ".");
                return;
            }

            int remainder = val % i;
            if (remainder == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}