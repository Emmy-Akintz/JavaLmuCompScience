//! number 1
package dec2024xmasAssignment;

public class NigeriaFlag {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                if (j >= 4 && j <= 7) {
                    System.out.print("="); // Middle Green Stripe
                } else {
                    System.out.print("*"); // White Stripe
                }
            }
            System.out.println();
        }
    }
}
