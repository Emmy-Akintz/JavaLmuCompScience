
public class HCFandLCM {

    // hcf function
    // public static int calculateHCF(int a, int b) {
    //     // find the multiples of a
    //     int[] multiplesOfA = new int[a];
    //     for (int i = 0; i < a; i++) {
    //         if (i == 0) {
    //             continue;
    //         }
    //         if (a % i == 0) {
    //             multiplesOfA[i] = i;
    //         }
    //     }
    //     // find multiples of b
    //     int[] multiplesOfB = new int[b];
    //     for (int i = 0; i < b; i++) {
    //         if (i == 0) {
    //             continue;
    //         }
    //         if (b % i == 0) {
    //             multiplesOfB[i] = i;
    //         }
    //     }
    //     // check for the highest common factor
    //     int hcf = 0;
    //     for (int i = multiplesOfA.length - 1; i >= 0; i--) {
    //         for (int j = multiplesOfB.length - 1; j >= 0; j--) {
    //             if (multiplesOfA[i] == multiplesOfB[j]) {
    //                 hcf = multiplesOfA[i];
    //                 break;
    //             }
    //         }
    //     }
    //     return hcf;
    // }
    public static int calculateHCF(int a, int b) {
        // find the multiples of a
        int[] multiplesOfA = new int[a + 1];
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                multiplesOfA[i] = i;
            }
        }

        // find multiples of b
        int[] multiplesOfB = new int[b + 1];
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                multiplesOfB[i] = i;
            }
        }

        // check for the highest common factor
        int hcf = 0;
        for (int i = multiplesOfA.length - 1; i > 0; i--) {
            for (int j = multiplesOfB.length - 1; j > 0; j--) {
                if (multiplesOfA[i] == multiplesOfB[j] && multiplesOfA[i] != 0) {
                    hcf = multiplesOfA[i];
                    break;
                }
            }
            if (hcf != 0) {
                break;
            }
        }

        return hcf;
    }

    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateHCF(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 16;

        // call the functions
        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // display
        System.out.println("HCF of " + num1 + " and " + num2 + " is:" + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is:" + lcm);
    }
}
