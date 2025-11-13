package OES;


public class ExamSystemMain {
 public static void main(String[] args) {
     ExamSystem es = new ExamSystem();
     try {
         es.submitExam("STU123");
     } catch (InvalidStudentException e) {
         System.out.println("Submission failed: " + e.getMessage());
     } catch (java.io.IOException e) {
         System.out.println("Submission failed due to a system error: " + e.getMessage());
     } finally {
         System.out.println("Exam submission process completed.");
     }
 }
}
