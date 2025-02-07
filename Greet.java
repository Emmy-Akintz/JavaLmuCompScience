
import java.util.Scanner;

public class Greet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = in.nextLine();
        System.out.println(Greet(userName));
    }

    public static String Greet(String name) {
        return "Hello, " + name + "!";
    }
}
