import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value to get the multiplication table!");
        int table = scanner.nextInt();

        for (int i = 1; i <= 12; i++) {
            int result = table * i;
            System.out.println(table + " * " + i + " = " + result);
        }

        scanner.close();
    }

    // public static String multiplicationTable(int value) {
    //     for (int i = 1; i <= 12; i++) {
    //         int result = value * i;
    //         return value + " * " + i + " = " + result;
    //     }
    //     return "";
    // }
}