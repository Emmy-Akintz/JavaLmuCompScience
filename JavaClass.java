// a code to understand class, objects, attributes and methods
import java.util.Scanner;

public class JavaClass {
    // attribute
    String name = "Dominion";

    // method that accepts argument of (String name)
    public static String greet(String name) {
        return "Hi " + name;
    }

    public static void main(String[] args) {
        // initialize scanner as an object named (mercy)
        Scanner mercy = new Scanner(System.in);

        // initialize scanner as an object named (stephanie)
        JavaClass stephanie = new JavaClass();

        // print the name attribute from the stephanie object which is an instance of the JavaClass class
        System.out.println(stephanie.name);

        // take the user's name
        System.out.println("Enter your name:");
        String oruko = mercy.nextLine();

        // call the greet method from the the stephanie object which is an instance of the JavaClass class and supply the received name as an argument and assign the return value to a variable (nameFromClass)
        String nameFromClass = stephanie.greet(oruko);

        // output the value from the greet method
        System.out.print(nameFromClass);
    }
}