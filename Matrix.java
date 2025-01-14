import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        // accept input from user
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter input for index [" + i + "][" + j + "]:");
                matrix[i][j] = in.nextInt();
            }
        }

        // print out the values
        System.out.println("The values are:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // the diagonal values are
        System.out.println("The diagonal values are:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j]);
                }
            }
        }
        System.out.println();

        in.close();
    }
}