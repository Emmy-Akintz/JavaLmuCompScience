
public class EvenNumber {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                // sum = sum + i;
                sum += i;
            }
        }

        System.out.println("The sum is " + sum);
    }
}
