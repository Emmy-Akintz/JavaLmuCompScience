//! number 3
package dec2024xmasAssignment;

public class Array {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12 };
        System.out.println("Median: " + calculateMedian(arr));
        System.out.println("Mean: " + calculateMean(arr));
        System.out.println("Standard Deviation: " + standardDeviation(arr));
    }

    public static double calculateMean(int[] arr) {
        int length = arr.length;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / length;
    }

    public static double calculateMedian(int[] arr) {
        java.util.Arrays.sort(arr);
        int length = arr.length;
        if (length % 2 == 0) {
            return (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        } else {
            return arr[length / 2];
        }
    }

    public static double standardDeviation(int[] arr) {
        int length = arr.length;
        double mean = calculateMean(arr);
        double sum = 0;
        for (int num : arr) {
            sum += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sum / length);
    }
}
