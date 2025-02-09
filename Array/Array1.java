import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        // single dimension
        int ages[] = new int[3];
        ages[0] = 20;
        ages[1] = 20;
        ages[2] = 30;
        System.out.print(ages[2]);

        // take 20 inputs from a user
        Scanner piano = new Scanner(System.in);
        int values[] = new int[20];
        // take values from user
        for (int p = 0; p < 20; p++) {
            System.out.println("Enter value for position " + (p+1));
            values[p] = piano.nextInt();
        }
        // output values
        for (int x = 0; x < 20; x++) {
            System.out.print(values[x] + ", ");
        }
        System.out.println();
    }
}