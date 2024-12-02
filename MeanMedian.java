import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[20];

        System.out.println("Enter 20 numbers:");

        // collecting 20 inputs from the user
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // calculating the mean
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double mean = sum / numbers.length;

        // sorting the array manually (bubble sort)
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[i] + 1) {
                    // swap numbers[j] and numbers[j + 1]
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // calculating the median
        double median;
        if (numbers.length % 2 == 0) {
            // if even, median is the average of the two middle numbers
            median = (numbers[numbers.length / 2 - 1]) + numbers[numbers.length / 2] / 2.0;
        } else {
            // if odd, median is the middle number
            median = numbers[numbers.length / 2];
        }

        // display
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);

        scanner.close();
    }
}