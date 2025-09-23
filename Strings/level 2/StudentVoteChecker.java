public class StudentVoteChecker {

    public static int[] generateAges(int numStudents) {
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = 10 + (int)(Math.random() * 90); // Random 2-digit age
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            results[i][0] = String.valueOf(age);
            if (age >= 18) {
                results[i][1] = "Yes";
            } else {
                results[i][1] = "No";
            }
        }
        return results;
    }

    public static void displayReport(String[][] results) {
        System.out.println("--- Student Voting Eligibility Report ---");
        System.out.printf("%-10s | %-5s | %s%n", "Student", "Age", "Can Vote?");
        System.out.println("---------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10d | %-5s | %s%n", (i + 1), results[i][0], results[i][1]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;
        int[] ages = generateAges(numberOfStudents);
        String[][] reportData = checkVotingEligibility(ages);
        displayReport(reportData);
    }
}