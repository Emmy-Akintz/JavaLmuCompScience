public class HCFandLCM {

    // hcf function
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            a = a % b;
            a = temp;
        }
        return a;
    }

    // calculate lcm
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateHCF(a, b);
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;

        // call the functions
        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // display
        System.out.println("HCF of " + num1 + " and " + num2 + " is:" + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is:" + lcm);
    }
}