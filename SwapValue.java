public class SwapValue {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int temp;

        // swap values
        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " b = " + b);
    }
}