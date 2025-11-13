package OnlineExam;


import java.time.LocalDateTime;

public class ExamMain {
 public static void main(String[] args) {
     ExamPortal portal = new ExamPortal();
     try {
         portal.submitExam("answers.pdf", LocalDateTime.now());
     } catch (LateSubmissionException | InvalidFileFormatException e) {
         System.out.println(e.getMessage());
     }
 }
}

