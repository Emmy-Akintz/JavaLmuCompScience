// ! number 4
package dec2024xmasAssignment;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number for index " + i + ":");
            array[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int num : array) {
            System.out.println(num);
        }

        scanner.close();
    }
}
