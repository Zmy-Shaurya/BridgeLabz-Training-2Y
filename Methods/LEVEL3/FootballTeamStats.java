import java.util.Arrays;

public class FootballTeamStats {

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
    
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // Random height between 150 and 250
        }

        System.out.println("Player Heights (cms): " + Arrays.toString(heights));
        
        int sumOfHeights = findSum(heights);
        System.out.println("Sum of all heights: " + sumOfHeights + " cms");

        double meanHeight = findMean(heights);
        System.out.printf("Mean height: %.2f cms%n", meanHeight);

        int shortestPlayer = findShortest(heights);
        System.out.println("Shortest player's height: " + shortestPlayer + " cms");

        int tallestPlayer = findTallest(heights);
        System.out.println("Tallest player's height: " + tallestPlayer + " cms");
    }
}