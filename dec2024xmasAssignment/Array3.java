// ! number 5
package dec2024xmasAssignment;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        // Assign elements to the array
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Print out the input entered by the user
        System.out.println("The values entered are:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
