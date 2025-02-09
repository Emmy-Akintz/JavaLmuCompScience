// for grade A, point is 5, B = 4, C = 3, D = 2, E = 1

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner yonda = new Scanner(System.in);
        System.out.println("Enter your grade");
        String grade = yonda.nextLine();

        switch (grade) {
            case "A":
                System.out.print("point awarded is 5");
                break;
            case "B":
                System.out.print("point awarded is 4");
                break;
            case "C":
                System.out.print("point awarded is 3");
                break;
            case "D":
                System.out.print("point awarded is 2");
                break;
            case "E":
                System.out.print("point awarded is 1");
                break;
            default:
                System.out.println("Enter a valid grade!!!");
                throw new AssertionError();
        }
    }
}
