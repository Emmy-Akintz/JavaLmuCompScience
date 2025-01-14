import java.util.Scanner;

//! for HCF
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 values:");
        int val1 = input.nextInt();
        int val2 = input.nextInt();

        // a variable to hold my divisor
        int minimum = Math.min(val1, val2);

        for (int i = minimum; i >= 1; i--) {
            int remainder1 = val1 % i;
            int remainder2 = val2 % i;

            if (remainder1 == 0 && remainder2 == 0) {
                System.out.println("The HCF of " + val1 + " and " + val2 + " is " + i + ".");
                break; //! end the loop
            }
        }
    }
}