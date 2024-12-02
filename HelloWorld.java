import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        swapInput(1, 2);
        System.out.println("\n");
        sphereVolume();
    }

    public static void swapInput(int a, int b) {
        int temp;
        System.out.println("a is " + a + " and b is " + b + "\nTime to swap!");
        temp = a;
        a = b;
        b = temp;
        System.out.println("a and b successfully swapped!\na is now " + a + " and b is now " + b);
    }

    public static void sphereVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your radius:");
        int r = scanner.nextInt();
        scanner.close();
        double PI = Math.PI;
        double result = ((4/3) * PI * Math.pow(r, 3));
        System.out.println("the answer when radius is " + r + " is " + result);
    }
}