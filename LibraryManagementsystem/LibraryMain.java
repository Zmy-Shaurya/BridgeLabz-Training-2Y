package LibraryManagementsystem;

public class LibraryMain {
 public static void main(String[] args) {
     Library lib = new Library();
     try {
         lib.borrow("ayush", "Clean Code");
         lib.borrow("ayush", "Java Concurrency"); // will throw
     } catch (BookNotAvailableException | UserLimitExceededException e) {
         System.out.println("Borrow failed: " + e.getMessage());
     }

     try {
         lib.returnBook("ayush", "Design Patterns"); // invalid return
     } catch (InvalidReturnException e) {
         System.out.println("Return failed: " + e.getMessage());
     }
 }
}
