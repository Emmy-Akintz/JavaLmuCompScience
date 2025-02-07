
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter for index [" + i + ", " + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // print the prime numbers
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (isPrimeNumber(arr[i][j])) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
