import java.util.Scanner;

public class ListNumberLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value:");
        String val = input.nextLine();

        // 6 rows and 4 columns
        // for (int row = 1; row <= 6; row++) {
        //     for (int col = 1; col <= 4; col++) {
        //         System.out.print(val);
        //     }
        //     System.out.print("\n");
        // }

        // 6 rows and 4 columns with space between
        for (int row = 1; row <= 6; row++) {
            for (int col = 1; col <= 4; col++) {
                if (row == 1 || row == 6) {
                    System.out.print(val);
                } else if (col == 1 || col == 4) {
                    System.out.print(val);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        // 6 rows and 4 columns
        // for (int i = 1; i <= 6; i++) {
        // System.out.println(val + val + val + val);
        // }
    }
}