import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a matrix , output the diagonal
        int val[][] = new int[3][3];
        // take input from user
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Enter value for index [" + (r+1) + ", " + (c+1) + "]:");
                val[r][c] = scanner.nextInt();
            }
        }
        // output in matrix format
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(val[r][c]);
            }
            System.out.println();
            // System.out.print("\n");
        }
        // output the diagonal
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (r == c) {
                    System.out.print(val[r][c] + ", ");
                }
            }
        }
    }
}