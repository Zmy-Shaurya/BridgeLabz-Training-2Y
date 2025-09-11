import java.util.Scanner;


public class Reportcard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Maths: ");
        int maths = scanner.nextInt();

        float total = physics + chemistry + maths;
        float percentage = (total / 300) * 100;
        String grade;
        String remark;
        if (percentage >= 80) {
            grade = "A";
            remark = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remark = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remark = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remark = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remark = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remark = "Remedial standards";
        }

        System.out.println("Average: " + (total / 3));
        System.out.println("grade: " + grade);
        System.out.println("Remark: " + remark);
        scanner.close();
    }
}
