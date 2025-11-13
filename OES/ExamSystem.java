package OES;


import java.io.IOException;

public class ExamSystem {
 public void validateStudent(String rollNo) throws InvalidStudentException {
     if (rollNo == null || !rollNo.matches("STU\\d{3}")) {
         throw new InvalidStudentException("Invalid student credentials.");
     }
 }

 public void submitExam(String rollNo) throws InvalidStudentException, IOException {
     validateStudent(rollNo);
     // optionally throw IO issues
     if (Math.random() < 0.5) throw new IOException("I/O problem while saving the submission.");
     System.out.println("Exam submitted successfully!");
 }
}
