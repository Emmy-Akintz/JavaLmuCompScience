import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[][] arr = new int[2][10];
        Scanner input = new Scanner(System.in);

        // accept the user input
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter your value for index (" + i + ", " + j + "): ");
                arr[i][j] = input.nextInt();
            }
        }

        // print out the array
        System.out.println("The values are:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }
}