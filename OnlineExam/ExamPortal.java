package OnlineExam;


import java.time.LocalDateTime;

public class ExamPortal {
 private static final LocalDateTime DEADLINE = LocalDateTime.now().minusMinutes(1); // sample

 public void submitExam(String fileName, LocalDateTime submissionTime)
         throws LateSubmissionException, InvalidFileFormatException {
     if (!fileName.toLowerCase().endsWith(".pdf"))
         throw new InvalidFileFormatException("Submission failed: invalid file format");
     if (submissionTime.isAfter(DEADLINE))
         throw new LateSubmissionException("Submission failed: late submission");
     System.out.println("Submission successful!");
 }
}

