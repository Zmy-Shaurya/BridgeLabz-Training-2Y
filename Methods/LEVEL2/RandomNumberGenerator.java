import java.util.Arrays;

public class RandomNumberGenerator {

    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[3];
        }

        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int num : numbers) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        double average = sum / numbers.length;
        return new double[]{average, (double)min, (double)max};
    }

    public static void main(String[] args) {
        int[] randomValues = generate4DigitRandomArray(5);
        System.out.println("Generated 4-digit random values: " + Arrays.toString(randomValues));

        double[] stats = findAverageMinMax(randomValues);
        System.out.printf("Average: %.2f%n", stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }
}