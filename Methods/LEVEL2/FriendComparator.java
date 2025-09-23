import java.util.Scanner;

public class FriendComparator {

    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }
        return names[youngestIndex];
    }

    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }
        return names[tallestIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Height (e.g., 5.8): ");
            heights[i] = scanner.nextDouble();
        }

        String youngestFriend = findYoungest(names, ages);
        String tallestFriend = findTallest(names, heights);

        System.out.println("\nThe youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close();
    }
}